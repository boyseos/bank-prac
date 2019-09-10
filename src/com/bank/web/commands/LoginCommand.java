package com.bank.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.bank.web.domains.CustomerBean;
import com.bank.web.serviceimpls.CustomerServiceImpl;
import com.bank.web.services.CustomerService;

public class LoginCommand extends MoveCommand{
	public LoginCommand(HttpServletRequest request)throws Exception {
		super(request);
	}
	@Override
	public void execute() {
		CustomerBean param = new CustomerBean();
		CustomerService service = new CustomerServiceImpl();
		param.setId(request.getParameter("id"));
		param.setPass(request.getParameter("pass"));
		String domain ="";
		String page  ="";
		CustomerBean temp = service.login(param);
		if(temp == null) {
				page = "login";
				domain ="customer";
		}else {
			     page = "mypage";
			     domain ="customer";
		}
		Receiver.cmd.setPage(page);
		Receiver.cmd.setDomain(domain);
		Receiver.cmd.setView(domain, page);
		request.setAttribute("customer", temp);
	}
}
