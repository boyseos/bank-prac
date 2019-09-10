package com.bank.web.pools;

import java.io.File;

public class Constants {
	final public static String SETFILE_PATH = new File("E:"+File.separator+"study"+File.separator).isDirectory() ?
			"E:"+File.separator+
			"study"+File.separator+"java"+File.separator+
			"bank-practice"+File.separator+
			"WebContent"+File.separator+"resources"+File.separator+"text"+File.separator 
	: "C:"+File.separator+
			"Users"+File.separator+"user"+File.separator+
			"eclipse_jee"+File.separator+"jee-bank"+File.separator+
			"WebContent"+File.separator+"resources"+File.separator+"text"+File.separator;
	final public static String VIEW_PATH = "WEB-INF/views/%s/%s.jsp";
}
