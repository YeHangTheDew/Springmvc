package com.tianyalei.mvc.service.imp;

import com.tianyalei.mvc.service.ModifyService;

public class ModifyServiceImpl implements ModifyService {

	public String add(String name, String addr) {
		// TODO Auto-generated method stub
		 return "invoke add name = " + name + " addr = " + addr;  
	}

	public String remove(Integer id) {
		// TODO Auto-generated method stub
		return "remove id = " + id; 
	}

}
