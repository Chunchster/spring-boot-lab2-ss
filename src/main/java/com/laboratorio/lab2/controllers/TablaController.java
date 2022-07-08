package com.laboratorio.lab2.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.laboratorio.lab2.models.TablaModel;
import com.laboratorio.lab2.services.TablaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TablaController {
    @Autowired
    TablaService Tabla_Service;
    
    @RequestMapping("/")
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

    @RequestMapping("/consulta")
    public ModelAndView consulta () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("consulta.html");
        return modelAndView;
    }

    @GetMapping
    @ResponseBody
    @RequestMapping(value = "/datos", method = { RequestMethod.GET, RequestMethod.POST })
    public ResponseEntity<?> obtenerDatos(){
        Map<String, List<TablaModel>> mappedData = new HashMap<>();
        List<TablaModel> dataList = this.Tabla_Service.obtenerDatos();
        for(TablaModel data: dataList){
            if(mappedData.containsKey(data.getSeries_code())){
                mappedData.get(data.getSeries_code()).add(data);
            }else{
                List<TablaModel> tempList = new ArrayList<TablaModel>();
                tempList.add(data);
                mappedData.put(data.getSeries_code(), tempList);
            }
        }
        return new ResponseEntity<>(mappedData, HttpStatus.OK);
    }

    @PostMapping()
    public TablaModel guardarDatos(@RequestBody TablaModel datos) {
        return this.Tabla_Service.guardarDatos(datos);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") String id){
        boolean ok = this.Tabla_Service.eliminarDato(id);
        if (ok){
            return "Se eliminó el dato con id " + id;
        }else{
            return "No pudo eliminar el dato con id " + id;
        }
    }
    
}
