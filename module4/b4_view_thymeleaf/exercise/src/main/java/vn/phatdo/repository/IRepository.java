package vn.phatdo.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll() ;
    T getById(int id) ;
    void save(T t);
    void update(T t);
    void remove(T t);
}
