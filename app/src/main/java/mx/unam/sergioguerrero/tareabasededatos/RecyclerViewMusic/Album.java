package mx.unam.sergioguerrero.tareabasededatos.RecyclerViewMusic;

/**
 * Created by sergioguerrero on 25/05/18.
 */

import mx.unam.sergioguerrero.tareabasededatos.RecyclerViewMusic.Album;

public class Album {

    private int foto;
    private String artista;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }



    public Album(String nombre, String artista, int foto) {
        this.nombre = nombre;
        this.artista = artista;
        this.foto = foto;
    }




}
