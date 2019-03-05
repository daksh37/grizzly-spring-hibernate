package com.cts.grizzlystoreadminweb.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category
{
	
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="CategoryId")
	private String categoryid;
	private String categoryname;
	private static Category category;
	public static Category getInstance(){
		if(category  == null){
			category = new Category();
			return category; 
		}
		else 
			return category;
	}
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	
	public Category(String categoryid, String categoryname) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public Category() {

		// TODO Auto-generated constructor stub
	}
	
	
}
