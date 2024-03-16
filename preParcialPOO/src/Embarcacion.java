
public class Embarcacion {
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private int anioFabricacion;
    private Double eslora;

    public Embarcacion(Capitan capitan, Double precioBase, int anioFabricacion, Double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = 120.02;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public Double getPrecioBase() {
        return precioBase;
    }
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public Double getValorAdicional() {
        return valorAdicional;
    }

    public Double calcularMontoAlquiler(){
        Double monto=precioBase;
        if(anioFabricacion>2020){
            monto+= valorAdicional;
        }
        return monto;
    }//CIERRE DEL METODO
}
