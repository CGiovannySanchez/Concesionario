package com.giovanni.concesionario.persistance.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entidad de marca_coche
 */
@Getter
@Setter
@Entity
@Table(name = "marca_coche")
public class BrandCarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "descripcion")
    private String description;


}
