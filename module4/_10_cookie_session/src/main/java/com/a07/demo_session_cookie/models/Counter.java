package com.a07.demo_session_cookie.models;

import lombok.Data;

@Data
public class Counter {
    private int count;
    public int increament(){
        return this.count++;
    }
}
