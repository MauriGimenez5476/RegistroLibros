/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librosregistro;

/**
 *
 * @author mauri
 */

public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String genero;
    private int id;

    public Libro(String titulo, String autor, int anoPublicacion, String genero, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero;
        this.id = id;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnoPublicacion() { return anoPublicacion; }
    public String getGenero() { return genero; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Autor: " + autor + ", Año: " + anoPublicacion + ", Género: " + genero;
    }
}
