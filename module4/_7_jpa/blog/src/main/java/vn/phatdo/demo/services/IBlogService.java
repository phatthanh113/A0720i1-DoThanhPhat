package vn.phatdo.demo.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.phatdo.demo.models.Blog;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);
    void save(Blog blog);;
    void delete(int id);
    Blog findById(int id);
}
