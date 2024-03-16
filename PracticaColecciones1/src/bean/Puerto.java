package bean;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Puerto {

    private String nombrePuerto;
    private List<Contenedor> contenedores;

    public Puerto(String nombrePuerto) {
        this.nombrePuerto = nombrePuerto;
        this.contenedores = new ArrayList<>();
    }

    public String getNombrePuerto() {
        return nombrePuerto;
    }

    public void setNombrePuerto(String nombrePuerto) {
        this.nombrePuerto = nombrePuerto;
    }

    public List<Contenedor> getContenedores() {
        return contenedores;
    }

    public void setContenedores(List<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }

}
