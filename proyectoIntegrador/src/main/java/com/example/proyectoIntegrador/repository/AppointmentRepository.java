package com.example.proyectoIntegrador.repository;

import com.example.proyectoIntegrador.model.Appointment;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

}

