package com.apirest.lookapp.models.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.apirest.lookapp.models.dao.IAprendizDao;
import com.apirest.lookapp.models.entity.Aprendiz;

public class AprendizService implements IAprendizService {

    @Autowired
    private IAprendizDao aprendizDao;

    @Override
    public Collection<Aprendiz> findAll() {
        return aprendizDao.findAll();
        
    }

    @Override
    public Aprendiz findById(Integer id) {
       return aprendizDao.findById(id).get();
    }

    @Override
    public Aprendiz save(Aprendiz Aprendiz) {
        return aprendizDao.save(Aprendiz);
    }

    @Override
    public void deleteById(Integer id) {
      aprendizDao.deleteById(id);
    }
    
}
