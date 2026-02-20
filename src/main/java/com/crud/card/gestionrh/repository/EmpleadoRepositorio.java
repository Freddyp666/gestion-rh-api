package com.crud.card.gestionrh.repository;

import com.crud.card.gestionrh.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado,Long > {


}
