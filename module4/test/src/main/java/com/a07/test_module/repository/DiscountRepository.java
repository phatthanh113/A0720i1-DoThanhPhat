package com.a07.test_module.repository;

import com.a07.test_module.model.entity.Discount;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscountRepository extends JpaRepository<Discount,Integer> {
    @Query("select d from Discount d where "
            +"concat(d.level,d.startDate,d.endDate,'')"
            +"like %?1%"
    )
    List<Discount> findDiscount(String name);
}
