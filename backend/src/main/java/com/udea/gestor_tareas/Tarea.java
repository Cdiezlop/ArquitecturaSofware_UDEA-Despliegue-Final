package com.udea.gestor_tareas;

public class Tarea {
    private long id;
    private String descripcion;
    private boolean completada;

    public Tarea() {}

    public Tarea(long id, String descripcion, boolean completada) {
        this.id = id;
        this.descripcion = descripcion;
        this.completada = completada;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public boolean isCompletada() { return completada; }
    public void setCompletada(boolean completada) { this.completada = completada; }
}