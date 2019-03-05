package com.cts.grizzlystoreadminweb.service;

import java.util.List;

import com.cts.grizzlystoreadminweb.bean.Category;
import com.cts.grizzlystoreadminweb.dao.CategoryDAO;
import com.cts.grizzlystoreadminweb.dao.CategoryDAOImpl;

public class CategoryServiceImpl implements CategoryService
{
	
	private static CategoryServiceImpl  CategoryServiceImpl;
	 CategoryDAO dao=new CategoryDAOImpl();
	 

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return dao.getAllCategory();
	}

}
