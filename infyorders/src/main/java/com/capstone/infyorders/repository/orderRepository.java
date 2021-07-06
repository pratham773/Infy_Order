package com.capstone.infyorders.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capstone.infyorders.entity.orderEntity;

@Repository
public interface orderRepository extends CrudRepository<orderEntity, String>{

}
