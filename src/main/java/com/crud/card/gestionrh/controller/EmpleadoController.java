package com.crud.card.gestionrh.controller;

import com.crud.card.gestionrh.model.Empleado;
import com.crud.card.gestionrh.repository.EmpleadoRepositorio;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/")
public class EmpleadoController {


    private final EmpleadoRepositorio empleadoRepositorio;

    @GetMapping("/empleado")
    public List<Empleado> listarTodos(){
        return empleadoRepositorio.findAll();
    }

}
