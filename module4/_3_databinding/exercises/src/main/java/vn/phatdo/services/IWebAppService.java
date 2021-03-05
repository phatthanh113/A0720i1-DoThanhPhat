package vn.phatdo.services;

import vn.phatdo.models.WebApp;

import java.util.List;

public interface IWebAppService {
    List<WebApp> findAll() ;
    void save(WebApp webApp);
    void delete(WebApp webApp);
    WebApp findById(int id);
    List<Integer> getPageList();
}
