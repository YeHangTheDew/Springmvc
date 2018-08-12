package com.tianyalei.mvc.service.imp;

import com.tianyalei.mvc.annotation.Service;
import com.tianyalei.mvc.service.QueryService;

@Service("myQueryService")
public class QueryServiceImpl implements QueryService {

	
	public String search(String name) {
		// TODO Auto-generated method stub
		return "invoke search name = " + name;  
	}

}
