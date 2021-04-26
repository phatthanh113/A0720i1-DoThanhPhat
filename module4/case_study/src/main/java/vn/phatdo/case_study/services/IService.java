package vn.phatdo.case_study.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IService<T> {
    List<T> findAll();
    Page<T> findAll(Pageable pageable);
    void save(T t);
    void delete(int id);
    T findById(int id);
}
