package com.devsenior.yecm;

import java.util.*;

public class TareasService {
    private List<Tarea> tareas;
    private List<Tarea> tareasFinalList;

    public TareasService() {
        this.tareas = new ArrayList<>();
        this.tareasFinalList = new ArrayList<>();
    }

    public void addTarea(Tarea tarea) {
        // agregar tarea a la lista
        tareas.add(tarea);
        System.out.println("Tarea agragada con exito");
    }

    public void showTareas() {
        // verificar si la lista de tareas esta vacia
        if (tareas.isEmpty()) {
            System.out.println("Aun no hay tareas");
            return;
        }
        // si la lista de tareas no esta vacia listar las tareas en la consola
        System.out.println("Tareas");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }

    public void deleteTarea(int indice) {
        // buscar la tarea por el indice y removerlo de la lista
        System.out.println("Tarea a eliminar " + tareas.get(indice - 1));
        tareasFinalList.add(tareas.get(indice - 1));
        tareas.remove(indice - 1);
        System.out.println("tarea eliminada con exito");
    }

    public void showTareasFinal() {
        // verificar si hay tareas finalizadas
        if (tareasFinalList.isEmpty()) {
            System.out.println("Aun no hay tareas finalizadas");
            return;
        }
        // si hay tareas finalizadas listar las tareas en la consola
        System.out.println("Tareas finalizadas");
        for (int i = 0; i < tareasFinalList.size(); i++) {
            System.out.println((i + 1) + ". " + tareasFinalList.get(i));
        }
    }
}
