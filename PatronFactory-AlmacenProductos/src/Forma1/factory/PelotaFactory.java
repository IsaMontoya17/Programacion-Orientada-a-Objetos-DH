package Forma1.factory;

import Forma1.bean.Pelota;
import Forma1.bean.Producto;

public class PelotaFactory implements ProductoFactory{
    @Override
    public Producto crearProducto(String parametro) {
        if("PELOTAFUTBOL".equalsIgnoreCase(parametro)){
            return new Pelota(11);
        } else if ("PELOTATENIS".equalsIgnoreCase(parametro)) {
            return new Pelota(0.32);
        } else{
            throw new IllegalArgumentException("Parámetro no coincide");
        }
    }
}
