package com.bank.web.serviceimpls;

import com.bank.web.daoimpls.CustomerDaoImpl;
import com.bank.web.daos.CustomerDao;
import com.bank.web.domains.CustomerBean;
import com.bank.web.services.CustomerService;

public class CustomerServiceImpl implements CustomerService{
	public CustomerDao dao;
	
	public CustomerServiceImpl() {
		dao = new CustomerDaoImpl();
	}
	@Override
	public void join(CustomerBean param) {
		dao.insertMember(param);
	}

	@Override
	public CustomerBean login(CustomerBean param) {
		CustomerBean temp = dao.getCustomer();
		if(!(param.getId().equals(temp.getId())
				&& param.getPass().equals(temp.getPass()))) {
			temp = null;
		}
		return temp;
	}

}
