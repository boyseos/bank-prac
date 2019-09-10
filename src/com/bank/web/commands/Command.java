package com.bank.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.bank.web.enums.Action;
import com.bank.web.pools.Constants;
import lombok.Data;
@Data
public class Command implements Order{
	protected HttpServletRequest request;
	protected String action,domain, page, view;
	
	@Override
	public void execute(){
		setDomain();
		setPage();
		setView(domain,page);
}
	public void setDomain() {
		domain = request.getServletPath().replace(".do", "").substring(1);
	}
	
	public void setPage() {
		page = request.getParameter("page");
}
	
	public void setView(String domain, String page) {
		this.view =  String.format(Constants.VIEW_PATH, domain, page);
		}
	
}
