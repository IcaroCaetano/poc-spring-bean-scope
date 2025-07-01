package com.myprojecticaro.poc_spring_bean_scope.infrastructure.adapter;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class PrototypeConsumer {

    private static final Logger log = LoggerFactory.getLogger(PrototypeConsumer.class);

    private final ObjectProvider<PrototypeBean> prototypeBeanProvider;

    public PrototypeConsumer(ObjectProvider<PrototypeBean> prototypeBeanProvider) {
        this.prototypeBeanProvider = prototypeBeanProvider;
    }

    public void execute() {
        PrototypeBean bean1 = prototypeBeanProvider.getObject();
        log.info("Bean1 instantiated | uuid={} | createdAt={}", bean1.getId(), bean1.getCreatedAt());

        PrototypeBean bean2 = prototypeBeanProvider.getObject();
        log.info("Bean2 instantiated | uuid={} | createdAt={}", bean2.getId(), bean2.getCreatedAt());
    }
}
