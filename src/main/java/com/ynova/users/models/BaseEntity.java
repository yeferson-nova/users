package com.ynova.users.models;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
public class BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @NotNull
    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP", updatable = false)
    private Date createdDate;

    @NotNull
    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP", updatable = false)
    private Date updateDate;

    @PrePersist
    private void onCreate() {
        updateDate = new Date();
        if (createdDate == null) {
            createdDate = new Date();
        }
    }

}
