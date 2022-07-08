package com.laboratorio.lab2.repositories;

import com.laboratorio.lab2.models.*;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TablaRepository extends CrudRepository<TablaModel, String>{

}
