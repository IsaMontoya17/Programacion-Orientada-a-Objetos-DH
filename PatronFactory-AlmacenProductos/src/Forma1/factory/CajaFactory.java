package Forma1.factory;

import Forma1.bean.Caja;
import Forma1.bean.Producto;

public class CajaFactory implements ProductoFactory{
    @Override
    public Producto crearProducto(String parametro) {
        if("CAJA10X10".equalsIgnoreCase(parametro)){
            return new Caja(10,10,10);
        }else{
            throw new IllegalArgumentException("Parámetro no coincide");
        }
    }
}
