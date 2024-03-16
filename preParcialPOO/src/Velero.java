
public class Velero extends Embarcacion{
    private int cantidadMastiles;

    public Velero(Capitan capitan, Double precioBase, int anioFabricacion, Double eslora, int cantidadMastiles) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public void esGrande(){
        if(cantidadMastiles > 4) {
            System.out.println("El velero es grande");
        } else{
            System.out.println("El velero es pequeño");
        }

    }//CIERRE DEL METODO

}
