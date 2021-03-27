package vn.phatdo.my_demo_project.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Services<T> {
    Page<T> findAll(Pageable pageable);
    void save(T t);
    void delete(int id);
    T findById(int id);
}
