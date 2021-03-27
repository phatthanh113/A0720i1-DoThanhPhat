package vn.phatdo.case_study.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IService<T> {
    Page<T> findAll(Pageable pageable);
    void save(T t);
    void delete(int id);
    T findById(int id);
}
