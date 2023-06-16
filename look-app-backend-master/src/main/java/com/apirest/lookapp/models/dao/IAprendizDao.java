package com.apirest.lookapp.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.lookapp.models.entity.Aprendiz;

public interface IAprendizDao extends JpaRepository<Aprendiz, Integer> {
    
}
