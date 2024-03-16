package bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    private List<Cuenta> cuentas;

    public Persona(String nombre, String apellido, int edad, List<Cuenta> cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getNombreCompleto(){
        String nombreCompleto= nombre + " " + apellido;
        return nombreCompleto;
    }

    public Boolean esMayorEdad(){
        return edad>60;
    }

    public double getSaldoTotal(){ //debe traer la suma de todos los saldos de todas las cuentas que posea la persona.
        Iterator<Cuenta> iterator = cuentas.iterator();
        Double sum=0.0;
        while(iterator.hasNext()){
            sum+= iterator.next().getSueldo();
        }
        return sum;
    }

    public void mostrarCuentas(){ //debe mostrar por consulta el saldo de cada cuenta en forma ordenada por número de cuenta.

    }
}
