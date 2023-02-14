package com.mycompany.biblioteca;
import java.util.*;
public class Recurso {
    private final long isbn;
    private String titulo;
    private List autores;
    private int ejemplares;

    
    public Recurso(long isbn, String titulo, List autores, int ejemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = autores;
        this.ejemplares = ejemplares;
    }
        
    public Recurso(long isbn, String titulo, Autor aut, int ejemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = new ArrayList(Arrays.asList(aut));
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString() {
        return "Recurso{" + "isbn=" + isbn + ", titulo=" + titulo + ", autores=" + autores + ", ejemplares=" + ejemplares + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List getAutores() {
        return autores;
    }

    public void setAutores(List autores) {
        this.autores = autores;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (this.isbn ^ (this.isbn >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recurso other = (Recurso) obj;
        return this.isbn == other.isbn;
    }

    public long getIsbn() {
        return isbn;
    }
           
    
}
