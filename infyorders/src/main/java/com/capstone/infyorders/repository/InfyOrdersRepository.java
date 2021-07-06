package com.capstone.infyorders.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.capstone.infyorders.entity.InfyOrders;

public interface InfyOrdersRepository extends JpaRepository<InfyOrders,Long>{

}
