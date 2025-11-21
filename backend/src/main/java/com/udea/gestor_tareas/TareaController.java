package com.udea.gestor_tareas;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tareas")
@CrossOrigin(origins = "*") // Necesario para las pruebas entre Front local y Back en AWS
public class TareaController {

    private final TareaService tareaService;

    // Inyección de dependencias por constructor (Mejor práctica que @Autowired)
    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping
    public List<Tarea> listar() {
        return tareaService.listar();
    }

    @PostMapping
    public Tarea agregar(@RequestBody Tarea tarea) {
        return tareaService.guardar(tarea);
    }

    @GetMapping("/health")
    public String health() {
        return "Servicio Tareas Activo - Java 17";
    }
}