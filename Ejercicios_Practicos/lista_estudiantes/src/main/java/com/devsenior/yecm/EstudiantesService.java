package com.devsenior.yecm;

import java.util.*;

public class EstudiantesService {
    private Map<Integer, String> estudiantes;

    public EstudiantesService(){
        this.estudiantes = new LinkedHashMap<>();
    }

    public void addEstudiante(Estudiante estudiante){
        try {
            if (estudiantes.containsKey(estudiante.getId())) {
                throw new IllegalArgumentException("El estudiante "+ estudiante.getName()+ " con id "+ estudiante.getId() + " ya existe");
            } else {
                estudiantes.put(estudiante.getId(), estudiante.getName());
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
       
        
    }

   public void showListEstudiantes(){
    for(var estudiante : estudiantes.values()){
        System.out.println(estudiante);
    }
   }

   public void deleteEstudiante(int id) throws NotFoundException{
    try {
        if (estudiantes.get(id) == null) {
            throw new NotFoundException("Estudiante con id " + id + " no encontrado");
        } else {
            estudiantes.remove(id);
        }
        
    } catch (NotFoundException e) {
        System.err.println("Error: " + e.getMessage());
    }

   }
}
