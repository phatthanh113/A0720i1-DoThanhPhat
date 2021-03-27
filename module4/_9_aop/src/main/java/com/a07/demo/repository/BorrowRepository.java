package com.a07.demo.repository;

import com.a07.demo.models.BorrowCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepository extends JpaRepository<BorrowCard,Integer> {
}
