package com.monit.core;

public class InvokeOperFactory {

	private static final InvokeOper invokeOper = new InvokeOperImpl();

	public static InvokeOper getInvokeOper() {
		return invokeOper;
	}

}
