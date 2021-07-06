package com.capstone.infyorders.dto;

import com.capstone.infyorders.entity.InfyOrders;

public class InfyOrdersDTO {

	Long OrderID;
	String OrderDate;
	String OrderStatus;
	Double Total;
	String ShippingTo;
	String Refund;
	
	public InfyOrdersDTO(Long orderID, String orderDate, String orderStatus, Double total, String shippingTo,
			String refund) {
		super();
		OrderID = orderID;
		OrderDate = orderDate;
		OrderStatus = orderStatus;
		Total = total;
		ShippingTo = shippingTo;
		Refund = refund;
	}
	public InfyOrdersDTO() {
		
	}
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
	@Override
	public String toString() {
		return "InfyOrdersDTO [OrderID=" + OrderID + ", OrderDate=" + OrderDate + ", OrderStatus=" + OrderStatus
				+ ", Total=" + Total + ", ShippingTo=" + ShippingTo + ", Refund=" + Refund + "]";
	}
	
	public static InfyOrders prepareInfyOrderEntity(InfyOrdersDTO infyOrdersDTO)
	{
		InfyOrders orderEntity = new InfyOrders();
		orderEntity.setOrderID(infyOrdersDTO.getOrderID());
		orderEntity.setOrderDate(infyOrdersDTO.getOrderDate());
		orderEntity.setOrderStatus(infyOrdersDTO.getOrderStatus());
		orderEntity.setRefund(infyOrdersDTO.getRefund());
		orderEntity.setShippingTo(infyOrdersDTO.getShippingTo());
		orderEntity.setTotal(infyOrdersDTO.getTotal());
		return orderEntity;
	}
	
	
	
}
