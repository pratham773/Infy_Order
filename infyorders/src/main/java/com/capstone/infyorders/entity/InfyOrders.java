package com.capstone.infyorders.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.capstone.infyorders.dto.InfyOrdersDTO;

@Entity
public class InfyOrders {

	@Id
	Long OrderID;
	String OrderDate;
	String OrderStatus;
	Double Total;
	String ShippingTo;
	String Refund;
	public Long getOrderID() {
		return OrderID;
	}
	public void setOrderID(Long orderID) {
		OrderID = orderID;
	}
	public String getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}
	public Double getTotal() {
		return Total;
	}
	public void setTotal(Double total) {
		Total = total;
	}
	public String getShippingTo() {
		return ShippingTo;
	}
	public void setShippingTo(String shippingTo) {
		ShippingTo = shippingTo;
	}
	public String getRefund() {
		return Refund;
	}
	public void setRefund(String refund) {
		Refund = refund;
	}
	public InfyOrders(Long orderID, String orderDate, String orderStatus, Double total, String shippingTo,
			String refund) {
		super();
		OrderID = orderID;
		OrderDate = orderDate;
		OrderStatus = orderStatus;
		Total = total;
		ShippingTo = shippingTo;
		Refund = refund;
	}
	public InfyOrders() {
		
	}
	
	public static InfyOrdersDTO prepareInfyOrdersDTO(InfyOrders infyOrders)
	{
		InfyOrdersDTO infyOrdersDTO = new InfyOrdersDTO();
		infyOrdersDTO.setOrderID(infyOrders.getOrderID());
		infyOrdersDTO.setOrderDate(infyOrders.getOrderDate());
		infyOrdersDTO.setOrderStatus(infyOrders.getOrderStatus());
		infyOrdersDTO.setRefund(infyOrders.getRefund());
		infyOrdersDTO.setShippingTo(infyOrders.getShippingTo());
		infyOrdersDTO.setTotal(infyOrders.getTotal());
		return infyOrdersDTO;
	}
	
	
}
