package com.capstone.infyorders.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class orderEntity {
	@Id
	@Column
	private Integer order_id;
	@Column
	private Integer date;
	@Column
	private String status;
	@Column
	private String delivery_estimate;
	@Column
	private String address;
	@Column
	private Integer product_id;
	@Column
	private Integer quantity;
	
	public orderEntity() {
		
	}
	
	public orderEntity(Integer order_id, Integer date, String status, String delivery_estimate, String address,
			Integer product_id, Integer quantity) {
		super();
		this.order_id = order_id;
		this.date = date;
		this.status = status;
		this.delivery_estimate = delivery_estimate;
		this.address = address;
		this.product_id = product_id;
		this.quantity = quantity;
	}
	
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDelivery_estimate() {
		return delivery_estimate;
	}
	public void setDelivery_estimate(String delivery_estimate) {
		this.delivery_estimate = delivery_estimate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
