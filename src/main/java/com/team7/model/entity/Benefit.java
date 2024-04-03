package com.team7.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "benefit")
public class Benefit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "benefit_uid")
    private Long id;

    @Column(name = "benefit_on", length = 20, nullable = false)
    private String on;

    @Column(name = "type", length = 20, nullable = false)
    private String type;

    @Column(name = "unit", length = 5, nullable = false)
    private String unit;

    // 생성자, getter, setter...
}
