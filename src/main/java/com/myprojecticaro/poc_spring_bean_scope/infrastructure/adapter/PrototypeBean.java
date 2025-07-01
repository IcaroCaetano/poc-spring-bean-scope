package com.myprojecticaro.poc_spring_bean_scope.infrastructure.adapter;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Creating new instance of PrototypeBean: " + this.hashCode());
    }

    public void doSomething() {
        System.out.println("Executing logic with instance: " + this.hashCode());
    }
}