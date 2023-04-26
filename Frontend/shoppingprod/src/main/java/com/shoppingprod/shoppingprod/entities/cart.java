package com.shoppingprod.shoppingprod.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class cart {
	
	
	@Id
	private long id;
	
	@Column(name = "userid")
	private int userId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "cost")
	private String cost;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name="subtotal")
	private String subtotal;
	
	@Column(name = "status")
	private String status;
	
	
	
	
	
	public cart(long id,int userid,String description,  String cost,int quantity,String subtotal,String status) {
		super();
		
		this.id = id;
		this.userId = userid;
		this.description = description;
		this.cost = cost;
		this.quantity = quantity;
		this.subtotal = subtotal;
		this.status = status;
	
	}
	
	
	


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}





	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public cart() {	
	
	}
	
	
	
	
	

}
