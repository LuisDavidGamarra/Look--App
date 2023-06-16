package com.apirest.lookapp.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "aprendiz")

public class Aprendiz implements Serializable{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Id
    private int id;
    private String nombre;
    private String correo;
    private String ficha;
}

