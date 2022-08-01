package com.example.clickup.entity.template;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@MappedSuperclass
public class Abstract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false)
    @CreationTimestamp
    private Timestamp yaratilganvaqt;

    @Column(nullable = false)
    @UpdateTimestamp
    private Timestamp yangilanganvaqt;

    @CreatedBy
    private Long kimyaratgan;

    @LastModifiedBy
    private Long kimyangilangan;

}
