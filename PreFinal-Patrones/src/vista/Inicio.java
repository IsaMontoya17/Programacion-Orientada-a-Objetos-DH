package vista;

import bean.*;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Front End", "Aprende a programar en HTML y CSS", 16, 2, 1000);
        Curso curso2 = new Curso("Back End", "Aprende a programar back end", 20, 2, 900);
        Curso curso3 = new Curso("Inglés Avanzado", "Mejora tus habilidades en inglés", 9, 6, 1200);
        Curso curso4 = new Curso("Marketing Digital", "Aprende estrategias de marketing en línea", 12, 4, 800);
        Curso curso5 = new Curso("Base de Datos", "Aprende a diseñar bases de datos relacionales", 8, 5, 1100);

        ProgramaIntensivo programa1 = new ProgramaIntensivo("Desarrollo de Software", "Incluye programación y diseño web", 0.1);
        programa1.agregarCurso(curso1);
        programa1.agregarCurso(curso2);

        ProgramaIntensivo programa2 = new ProgramaIntensivo("Desarrollo Profesional", "Incluye inglés avanzado y marketing digital", 0.15);
        programa2.agregarCurso(curso3);
        programa2.agregarCurso(curso4);
        programa2.agregarCurso(curso5);

        Instituto instituto = new Instituto();

        instituto.agregarOferta(curso1);
        instituto.agregarOferta(curso2);
        instituto.agregarOferta(curso3);
        instituto.agregarOferta(curso4);
        instituto.agregarOferta(curso5);
        instituto.agregarOferta(programa1);
        instituto.agregarOferta(programa2);

        instituto.generarInforme();
        Scanner scanner = new Scanner(System.in);

        TallerIntensivo taller1 = new TallerIntensivo("Taller de Programación", "Aprende a programar", 5);
        taller1.agregarCostoSegunNumeroTP(taller1.getNumeroTrabajosPracticos(), scanner);

        TallerIntensivo taller2 = new TallerIntensivo("Taller de Diseño", "Aprende a diseñar", 2);
        taller2.agregarCostoSegunNumeroTP(taller2.getNumeroTrabajosPracticos(), scanner);

        scanner.close();

        System.out.println("El precio del taller 1 es de " + taller1.calcularPrecio());
        System.out.println("El precio del taller 2 es de " + taller2.calcularPrecio());

        Carrera carrera = new Carrera("Desarrollo de Software", "Incluye programación y diseño web", 2000);
        carrera.agregarCursoTaller(curso5);
        carrera.agregarCursoTaller(curso2);
        carrera.agregarCursoTaller(taller1);

        carrera.calcularPrecio();
        System.out.println("\n" + "El precio de la carrera "+ carrera.getNombre() + " es de "
        + carrera.calcularPrecio());



    }
}
