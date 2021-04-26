package com.codegym.demospringjpa.repositories;

import com.codegym.demospringjpa.models.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Integer> {
}
