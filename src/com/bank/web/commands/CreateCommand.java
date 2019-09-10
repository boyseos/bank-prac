package com.bank.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.bank.web.domains.CustomerBean;
import com.bank.web.serviceimpls.CustomerServiceImpl;
import com.bank.web.services.CustomerService;

public class CreateCommand extends MoveCommand{
	public CreateCommand(HttpServletRequest request)throws Exception {
		super(request);
	}
	
	@Override
	public void execute() {
		super.execute();
		CustomerBean param = new CustomerBean();
		CustomerService service = new CustomerServiceImpl();
		param.setId(request.getParameter("id"));
		param.setPass(request.getParameter("pass"));
		param.setName(request.getParameter("name"));
		param.setSsn(request.getParameter("ssn"));
		param.setCredit(request.getParameter("credit"));
		service.join(param);
		Receiver.cmd.setPage("login");
	}
}

