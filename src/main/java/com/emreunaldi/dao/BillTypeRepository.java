package com.emreunaldi.dao;

import com.emreunaldi.entity.BillType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillTypeRepository extends JpaRepository<BillType,Integer> {
}
