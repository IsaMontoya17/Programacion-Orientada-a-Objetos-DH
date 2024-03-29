package bean;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{

    private List<Curso> cursos;
    private double bonificacion;

    public ProgramaIntensivo(String nombre, String descripcion, double bonificacion) {
        super(nombre, descripcion);
        this.bonificacion = bonificacion;
        cursos = new ArrayList<>();
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }

    @Override
    public double calcularPrecio() {
        double precioTotal=0;
        for (Curso curso : cursos) {
            precioTotal+=curso.calcularPrecio();
        }
        return precioTotal +(precioTotal*bonificacion);
    }
}
