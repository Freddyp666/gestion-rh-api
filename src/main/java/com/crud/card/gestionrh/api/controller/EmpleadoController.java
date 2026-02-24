package com.crud.card.gestionrh.api.controller;

import com.crud.card.gestionrh.domain.model.Empleado;
import com.crud.card.gestionrh.domain.repository.EmpleadoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")

public class EmpleadoController {


    private final EmpleadoRepositorio empleadoRepositorio;

    @GetMapping("/empleado")
    public List<Empleado> listarTodos(){
        return empleadoRepositorio.findAll();
    }

    @GetMapping("/empleados")
    public  List<Empleado>ListaAll(){return  empleadoRepositorio.findAll();}

}
