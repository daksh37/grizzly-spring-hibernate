package com.cts.grizzlystoreadminweb.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cts.grizzlystoreadminweb.bean.Category;
import com.cts.grizzlystoreadminweb.util.HibernateUtil;

public class CategoryDAOImpl implements CategoryDAO {
	
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		 Transaction transaction = null;
	      try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	         transaction = session.beginTransaction();

	         CriteriaBuilder builder = session.getCriteriaBuilder();
	         CriteriaQuery<Object[]> query = builder.createQuery(Object[].class);
	         Root<Category> root = query.from(Category.class);
	         query.multiselect(root.get("categoryid"),root.get("categoryname"));
	         Query<Object[]> q=session.createQuery(query);
	         List<Object[]> list=q.getResultList();
	         for (Object[] objects : list) {
	            System.out.println("Category Id : "+objects[0]);
	            System.out.println("Category Name : "+objects[1]);
	         }
	  
	         transaction.commit();
	      } catch (Exception e) {
	         e.printStackTrace();
	         if (transaction != null) {
	            transaction.rollback();
	         }
	      }
		return null;
	}

}
