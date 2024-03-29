package bean;

import java.util.ArrayList;
import java.util.List;

public class Carrera extends OfertaAcademica{

    private double costoBasico;
    private List<OfertaAcademica> cursosTalleres;

    public Carrera(String nombre, String descripcion, double costoBasico) {
        super(nombre, descripcion);
        this.costoBasico = costoBasico;
        cursosTalleres = new ArrayList<>();
    }

    public Boolean validacionCargaHorariaCurso(Curso curso){
        return curso.getCargaHorariaMensual()>10;
    }

    public void agregarCursoTaller(OfertaAcademica oferta){
        cursosTalleres.add(oferta);
    }

    @Override
    public double calcularPrecio() {
        double precioTotal=0;
        for (OfertaAcademica cursosTalleres : cursosTalleres) {
            precioTotal+=cursosTalleres.calcularPrecio();
        }
        return precioTotal+costoBasico;
    }
}
