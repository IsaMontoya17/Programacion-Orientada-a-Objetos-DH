package logica;

import bean.Contenedor;
import bean.Pais;

import java.util.Comparator;
import java.util.List;

public class LPuerto{

    public void agregarContenedor(Contenedor contenedor, List<Contenedor> contenedores){
        contenedores.add(contenedor);
    }

    public void mostrarContenedoresSegunNumero(List<Contenedor> contenedores){
        contenedores.stream().sorted(Comparator.comparingInt(Contenedor::getNumero)).forEach(contenedor -> System.out.println(contenedor.toString()));
    }

    public int cantidadContenedoresPeligrosos(List<Contenedor> contenedores){
        return (int)contenedores.stream().filter(contenedor -> contenedor.getTransportaMaterialesPeligrosos() && contenedor.getProcedencia()== Pais.DESCONOCIDA).count();
    }
}
