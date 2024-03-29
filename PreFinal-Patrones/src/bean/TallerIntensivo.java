package bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TallerIntensivo extends OfertaAcademica{

    private int numeroTrabajosPracticos;
    private List<Double> costosTrabajosPracticos;

    public TallerIntensivo(String nombre, String descripcion, int numeroTrabajosPracticos) {
        super(nombre, descripcion);
        this.numeroTrabajosPracticos = numeroTrabajosPracticos;
        costosTrabajosPracticos = new ArrayList<>();
    }

    public int getNumeroTrabajosPracticos() {
        return numeroTrabajosPracticos;
    }

    public void agregarCostoTP(Double costo){
        costosTrabajosPracticos.add(costo);
    }

    public void agregarCostoSegunNumeroTP(int num, Scanner scanner){
        for (int i = 0; i < num; i++) {
            System.out.print("Ingrese el costo del trabajo práctico " + (i + 1) + ": ");
            Double costo = scanner.nextDouble(); //Si quiere ingresar un decimal use coma (,) y no punto(.)
            agregarCostoTP(costo);
        }
    }

    @Override
    public double calcularPrecio() {
        double precioTotal=0;
        for (Double costosTrabajosPractico : costosTrabajosPracticos) {
            precioTotal+=costosTrabajosPractico;
        }
        return precioTotal;
    }
}
