package vn.phatdo.services.impl;

import org.springframework.stereotype.Service;
import vn.phatdo.services.IListService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListService implements IListService {

    @Override
    public List<String> productList() {
        List<String> list = new ArrayList<>();
        list.add("milk");
        list.add("sugar");
        list.add("candy");
        list.add("egg");
        list.add("salt");
        return list;
    }

    @Override
    public List<String> genderList() {
        List<String> list = new ArrayList<>();
        list.add("male");
        list.add("female");
        list.add("other");
        return list;
    }
}
