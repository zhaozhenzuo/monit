package com.monit.monit.core;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.monit.core.InvokeInfo;
import com.monit.core.InvokeOper;
import com.monit.core.InvokeOperFactory;

public class BuyServiceImpl implements BuyService {

	private static final Logger logger = LoggerFactory.getLogger(BuyServiceImpl.class);

	public boolean buy(String userId, BigDecimal amount, String productId) {

		logger.info(">buy begin,userId[" + userId + "],amount[" + amount + "],poroductId[" + productId + "]");

		InvokeOper invokeOper = InvokeOperFactory.getInvokeOper();

		InvokeInfo invokeInfo = invokeOper.getInvokerInfoCurThreadForAcceptor(null);
		
		

		logger.info(">buy end,userId[" + userId + "],amount[" + amount + "],poroductId[" + productId + "]");

		return false;
	}

}
