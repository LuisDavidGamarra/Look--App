package com.apirest.lookapp.models.services;

import java.util.Collection;

import com.apirest.lookapp.models.entity.Aprendiz;

public interface IAprendizService {
    public Collection<Aprendiz> findAll();

    public Aprendiz findById(Integer id);

    public Aprendiz save(Aprendiz Aprendiz);

    public void deleteById(Integer id);
}
