package com.cts.grizzlystoreadminweb.main;

import com.cts.grizzlystoreadminweb.service.CategoryService;
import com.cts.grizzlystoreadminweb.service.CategoryServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoryService categoryService = new CategoryServiceImpl();
		System.out.println(categoryService.getAllCategory());
		
	}

}
