package com.bank.web.daos;

import com.bank.web.domains.CustomerBean;

public interface CustomerDao {
	public void insertMember(CustomerBean param);
	public CustomerBean getCustomer();
}
