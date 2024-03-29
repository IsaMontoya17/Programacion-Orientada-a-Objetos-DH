package bean;

public class Curso extends OfertaAcademica{

    private double cargaHorariaMensual;
    private int mesesDuracion;
    private double valorHora;

    public Curso(String nombre, String descripcion, double cargaHorariaMensual, int mesesDuracion, double valorHora) {
        super(nombre, descripcion);
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.mesesDuracion = mesesDuracion;
        this.valorHora = valorHora;
    }

    public double getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public int getMesesDuracion() {
        return mesesDuracion;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double calcularPrecio() {
        return cargaHorariaMensual * mesesDuracion * valorHora;
    }
}
