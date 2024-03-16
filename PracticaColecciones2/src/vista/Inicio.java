package vista;

import bean.Cuenta;
import bean.Persona;

import java.util.ArrayList;
import java.util.List;

public class Inicio {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta(234, 2000.0);
        Cuenta cuenta2 = new Cuenta(123, 3000.0);
        Cuenta cuenta3 = new Cuenta(001, 4000.0);
        Cuenta cuenta4 = new Cuenta(100, 4000.0);
        Cuenta cuenta5 = new Cuenta(80, 4000.0);
        Cuenta cuenta6 = new Cuenta(142, 4000.0);

        // Crear objetos Persona
        Persona persona1 = new Persona("Juan", "Gómez", 30);
        Persona persona2 = new Persona("María", "López", 25);

        persona1.agregarCuenta(cuenta1);
        persona1.agregarCuenta(cuenta2);
        persona1.agregarCuenta(cuenta3);

        persona2.agregarCuenta(cuenta4);
        persona2.agregarCuenta(cuenta5);
        persona2.agregarCuenta(cuenta6);

        double saldoTotalP1= persona1.getSaldoTotal();
        System.out.println(saldoTotalP1);

        persona1.mostrarCuentas(persona1.getNombre());
        persona2.mostrarCuentas(persona2.getNombre());

    }
}
