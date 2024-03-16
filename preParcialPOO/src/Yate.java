
public class Yate extends Embarcacion implements Comparable{
    private int cantidadCamarotes;

    public Yate(Capitan capitan, Double precioBase, int anioFabricacion, Double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        return this.cantidadCamarotes - ((Yate) o).getCantidadCamarotes();
    }

    public void comparacion(int num){
        if (num > 0) {
            System.out.println("El yate 1 tiene más lujos que el yate 2");
        }else if(num<0){
            System.out.println("El yate 2 tiene más lujos que el yate 1");
        }else{
            System.out.println("Ambos yates son igual de lujosos");
        }
    }
}
