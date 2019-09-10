package com.bank.web.daoimpls;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.bank.web.daos.CustomerDao;
import com.bank.web.domains.CustomerBean;
import com.bank.web.pools.Constants;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public void insertMember(CustomerBean param) {
		try {
			BufferedWriter writer = new BufferedWriter(
					new FileWriter(
							new File(
									Constants.SETFILE_PATH+"customer.txt")));
			writer.write(String.format("%s,%s,%s,%s,%s\n", 
					param.getId(),param.getPass(),param.getName(),param.getSsn(),param.getCredit()));
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public CustomerBean getCustomer() {
		CustomerBean cb = new CustomerBean();
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader(
							new File(
									Constants.SETFILE_PATH+"customer.txt")));
			String[] arr = reader.readLine().split(",");
			cb.setId(arr[0]);
			cb.setPass(arr[1]);
			cb.setName(arr[2]);
			cb.setSsn(arr[3]);
			cb.setCredit(arr[4]);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cb;
	}

}
