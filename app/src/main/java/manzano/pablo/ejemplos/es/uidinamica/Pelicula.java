package manzano.pablo.ejemplos.es.uidinamica;

import java.io.Serializable;

public class Pelicula implements Serializable {

    private String id;
    private String titulo;
    private String genero;
    private int portada;
    private float valoracion;
    private int duracion;
    private String comentario;

    public Pelicula (String id, String titulo, String genero, int portada, float valoracion, int duracion, String sinopsis, String comentario){

        this.id=id;
        this.titulo=titulo;
        this.genero=genero;
        this.portada=portada;
        this.valoracion=valoracion;
        this.duracion=duracion;
        this.comentario=comentario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPortada() {
        return portada;
    }

    public void setPortada(int portada) {
        this.portada = portada;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
