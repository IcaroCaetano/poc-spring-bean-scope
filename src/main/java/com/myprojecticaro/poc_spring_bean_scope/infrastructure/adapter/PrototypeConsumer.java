package com.myprojecticaro.poc_spring_bean_scope.infrastructure.adapter;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class PrototypeConsumer {

    private final ObjectProvider<PrototypeBean> prototypeBeanProvider;

    public PrototypeConsumer(ObjectProvider<PrototypeBean> prototypeBeanProvider) {
        this.prototypeBeanProvider = prototypeBeanProvider;
    }

    public void execute() {
        PrototypeBean bean1 = prototypeBeanProvider.getObject();
        bean1.doSomething();

        PrototypeBean bean2 = prototypeBeanProvider.getObject();
        bean2.doSomething();
    }
}