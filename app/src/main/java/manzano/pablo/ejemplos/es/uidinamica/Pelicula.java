package manzano.pablo.ejemplos.es.uidinamica;

import java.io.Serializable;

public class Pelicula implements Serializable {

    private String id;
    private String titulo;
    private String genero;
    private String portada;
    private String valoracion;
    private String duracion;
    private String comentario;

    public Pelicula (String id, String titulo, String genero, String portada, String valoracion, String duracion, String sinopsis){

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

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
