package Forma2.factory;

import Forma2.bean.Caja;
import Forma2.bean.Pelota;
import Forma2.bean.Producto;

public abstract class ProductoFactory {

    public static Producto crearProducto(String tipo){
        if("CAJA10X10".equalsIgnoreCase(tipo)){
            return new Caja(10,10,10);
        } else if ("PELOTAFUTBOL".equalsIgnoreCase(tipo)) {
            return new Pelota(11);
        }else if ("PELOTATENIS".equalsIgnoreCase(tipo)) {
            return new Pelota(0.32);
        }else {
            throw  new IllegalArgumentException("Paramtros no coincidentes");
        }
    }
}

