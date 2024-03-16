package bean;

import java.util.List;

public class Contenedor {
    private Integer numero;
    private Pais procedencia;
    private Boolean transportaMaterialesPeligrosos;

    public Contenedor(Integer numero, Pais procedencia, Boolean transportaMaterialesPeligrosos) {
        this.numero = numero;
        this.procedencia = procedencia;
        this.transportaMaterialesPeligrosos = transportaMaterialesPeligrosos;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Pais getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(Pais procedencia) {
        this.procedencia = procedencia;
    }

    public Boolean getTransportaMaterialesPeligrosos() {
        return transportaMaterialesPeligrosos;
    }

    public void setTransportaMaterialesPeligrosos(Boolean transportaMaterialesPeligrosos) {
        this.transportaMaterialesPeligrosos = transportaMaterialesPeligrosos;
    }


}
