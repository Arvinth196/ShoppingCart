package com.shoppingprod.shoppingprod.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="products")
public class product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
//	private int userid;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="imageurl")
	private String imageurl;
	
	@Column(name="cost")
	private String cost;
	
	@Column(name="quantity")
	private String quantity;
	
	
	
	public product(String title, String description, String imageurl, String cost,String quantity) {
		super();
		this.title = title;
//		this.userid = userid;
		this.description = description;
		this.imageurl = imageurl;
		this.cost = cost; 
		this.quantity = quantity;
		
	}
	
	


	public long getId() {
		return id;
	}
	
//	public int getUserid() {
//		return userid;
//	}
//
//
//
//
//	public void setUserid(int userid) {
//		this.userid = userid;
//	}




	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public product() {
		
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", title=" + title + ", description=" + description + ", imageurl=" + imageurl
				+ ", cost=" + cost + "]";
	}
	
	

}
