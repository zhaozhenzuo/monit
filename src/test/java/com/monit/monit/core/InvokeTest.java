package com.monit.monit.core;

import com.monit.core.InvokeInfo;
import com.monit.core.InvokeOper;
import com.monit.core.InvokeOperFactory;
import com.monit.core.InvokeParam;

public class InvokeTest {

	public static void main(String[] args) {

		InvokeOper invokeOper = InvokeOperFactory.getInvokeOper();

		InvokeInfo invokeInfo = invokeOper.getInvokerInfoCurThreadForAcceptor(null);
		
		System.out.println(invokeInfo);

		InvokeParam invokeParam = invokeOper.composeInvokeParamAndIncreaseCurInvokeSeqForInvoker(null);
		
		System.out.println(invokeParam);

	}

}
