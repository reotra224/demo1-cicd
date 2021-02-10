package com.reotra.democicd.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private Double price;
}
