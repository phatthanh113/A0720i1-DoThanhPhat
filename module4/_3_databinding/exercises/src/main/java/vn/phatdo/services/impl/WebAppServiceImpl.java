package vn.phatdo.services.impl;

import org.springframework.stereotype.Service;
import vn.phatdo.models.WebApp;
import vn.phatdo.services.IWebAppService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class WebAppServiceImpl implements IWebAppService {
    static Map<Integer,WebApp> webAppList;
    static {
        webAppList = new HashMap<>();
        webAppList.put(1,new WebApp(1,"English",25,"enable spams","thor"));
        webAppList.put(2,new WebApp(2,"Vietnamese",5,"enable spams","phat"));
        webAppList.put(3,new WebApp(3,"India",10,"enable spams","dat"));
    }
    @Override
    public List<WebApp> findAll() {
        return new ArrayList<>(webAppList.values());
    }

    @Override
    public void save(WebApp webApp) {
        webAppList.put(this.findAll().size()+1,webApp);
    }

    @Override
    public void delete(WebApp webApp) {
        webAppList.replace(webApp.getId(),webApp);
    }

    @Override
    public WebApp findById(int id) {
        return webAppList.get(id);
    }
    public List<Integer> getPageList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            if(i%5==0) {
                list.add(i);
            };
        }
        return list ;
    }
}
