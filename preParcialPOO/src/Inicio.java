public class Inicio {

    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("José", "Malvinas", "ASD1234");
        Capitan capitan2 = new Capitan("Bruno", "Gallegos", "QWE4567");
        Yate yate1 = new Yate(capitan1, 150.03, 2021, 25.2, 5);
        Yate yate2 = new Yate(capitan2, 230.12, 2019, 30.1, 5);
        Velero velero1 = new Velero(capitan1, 222.01, 2024, 9.2, 3);

        int resultado = yate1.compareTo(yate2);
        yate1.comparacion(resultado);

        velero1.esGrande();

    }//CIERRE DEL MAIN
}
