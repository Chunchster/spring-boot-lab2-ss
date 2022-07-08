package com.laboratorio.lab2.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laboratorio.lab2.models.TablaModel;
import com.laboratorio.lab2.repositories.TablaRepository;



@Service
public class TablaService {
    @Autowired
    TablaRepository tabla_Repository;

    @Transactional(readOnly = true)
    public ArrayList<TablaModel> obtenerDatos(){
        ArrayList<TablaModel> list = new ArrayList<>();
        tabla_Repository.findAll().forEach(list::add);
        return list;
    }

    @Transactional
    public TablaModel guardarDatos(TablaModel datos){
        return tabla_Repository.save(datos);
    }

    @Transactional(readOnly = true)
    public Optional<TablaModel> obtenerPorId(String id){
        return tabla_Repository.findById(id);
    }

    @Transactional
    public boolean eliminarDato(String id){
        try {
            tabla_Repository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
    
}
