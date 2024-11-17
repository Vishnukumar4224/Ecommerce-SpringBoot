package com.vk.vkcart.Repostitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vk.vkcart.models.product;

@Repository
public interface ProductRepository extends JpaRepository<product, Long>{

}
