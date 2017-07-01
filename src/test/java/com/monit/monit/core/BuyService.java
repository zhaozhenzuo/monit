package com.monit.monit.core;

import java.math.BigDecimal;

public interface BuyService {

	public boolean buy(String userId, BigDecimal amount, String productId);

}
