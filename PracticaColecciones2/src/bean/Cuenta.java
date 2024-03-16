package bean;

public class Cuenta implements Comparable<Cuenta>{

    private int numeroCuenta;
    private Double sueldo;

    public Cuenta(int numeroCuenta, Double sueldo) {
        this.numeroCuenta = numeroCuenta;
        this.sueldo = sueldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int compareTo(Cuenta o) {
        return 0;
    }
}
