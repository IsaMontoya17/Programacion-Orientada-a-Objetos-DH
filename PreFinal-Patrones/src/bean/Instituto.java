package bean;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private List<OfertaAcademica> ofertasAcademicas;

    public Instituto() {
        ofertasAcademicas = new ArrayList<>();
    }

    public void agregarOferta(OfertaAcademica oferta){
        ofertasAcademicas.add(oferta);
    }

    public void generarInforme(){
        for (OfertaAcademica ofertaAcademica : ofertasAcademicas) {
            if(ofertaAcademica instanceof Curso) {
                Curso curso = (Curso) ofertaAcademica;
                System.out.println("Curso: " + curso.getNombre() + " tiene una carga horaria de " +
                        curso.getCargaHorariaMensual() + " horas mensuales de " +
                        curso.getMesesDuracion() + " meses de duración con un precio de " +
                        curso.getValorHora() + " pesos la hora, es decir que tiene un precio de " +
                        curso.calcularPrecio() + " pesos." + "\n");
            } else if(ofertaAcademica instanceof ProgramaIntensivo){
                ProgramaIntensivo programaIntensivo = (ProgramaIntensivo) ofertaAcademica;
                System.out.println("El programa intensivo " + programaIntensivo.getNombre()
                + " que posee " + programaIntensivo.getCursos().size() + " materias"
                + " y cuyo porcentaje de bonificación es de " + programaIntensivo.getBonificacion()*100
                + "%" + " tiene un precio final de " + programaIntensivo.calcularPrecio() + " pesos." + "\n");
            }
        }
    }
}
