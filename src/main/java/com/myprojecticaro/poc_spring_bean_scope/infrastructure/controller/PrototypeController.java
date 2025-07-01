package com.myprojecticaro.poc_spring_bean_scope.infrastructure.controller;

import com.myprojecticaro.poc_spring_bean_scope.infrastructure.adapter.PrototypeBean;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prototype")
public class PrototypeController {

    private final ObjectProvider<PrototypeBean> provider;

    public PrototypeController(ObjectProvider<PrototypeBean> provider) {
        this.provider = provider;
    }

    @GetMapping
    public String getInstanceInfo() {
        PrototypeBean instance = provider.getObject();
        return instance.info();
    }
}