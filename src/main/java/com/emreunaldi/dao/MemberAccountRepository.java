package com.emreunaldi.dao;

import com.emreunaldi.entity.MemberAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberAccountRepository extends JpaRepository<MemberAccount, Integer> {
}
