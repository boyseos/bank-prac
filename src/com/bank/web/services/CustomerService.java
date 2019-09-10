package com.bank.web.services;

import com.bank.web.domains.CustomerBean;

public interface CustomerService {
	public void join(CustomerBean param);
	public CustomerBean login(CustomerBean param);
}
