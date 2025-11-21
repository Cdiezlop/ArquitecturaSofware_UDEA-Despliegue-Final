package com.udea.gestor_tareas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TareaService {
    
    private List<Tarea> lista = new ArrayList<>();

    public TareaService() {
        // Datos iniciales (Seed data)
        lista.add(new Tarea(1, "Instalar Java 17", true));
        lista.add(new Tarea(2, "Desplegar en AWS EC2", false));
    }

    public List<Tarea> listar() {
        return lista;
    }

    public Tarea guardar(Tarea tarea) {
        long id = lista.size() + 1;
        tarea.setId(id);
        lista.add(tarea);
        return tarea;
    }
}