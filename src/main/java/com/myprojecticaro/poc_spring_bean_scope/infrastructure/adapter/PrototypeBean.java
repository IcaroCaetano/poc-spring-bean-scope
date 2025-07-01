package com.myprojecticaro.poc_spring_bean_scope.infrastructure.adapter;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
@Scope("prototype")
public class PrototypeBean {

    private static final Logger log = LoggerFactory.getLogger(PrototypeBean.class);

    private final UUID id;
    private final LocalDateTime createdAt;

    public PrototypeBean() {
        this.id = UUID.randomUUID();
        this.createdAt = LocalDateTime.now();
        log.info("New PrototypeBean created | uuid={} | createdAt={}", id, createdAt);
    }

    public String info() {
        return String.format("PrototypeBean | UUID: %s | CreatedAt: %s", id, createdAt);
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}