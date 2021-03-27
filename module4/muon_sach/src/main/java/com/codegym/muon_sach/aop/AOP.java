package com.codegym.muon_sach.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AOP {
    @Before("execution(* com.codegym.muon_sach.controller.BookController.*(..))")
    public void beforeExcution(JoinPoint joinPoint) {
        System.out.println("cac phuong thuc sẽ chạy" + joinPoint.getSignature().getName());
    }
}
