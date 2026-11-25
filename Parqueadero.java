
    import java.util.Scanner;

public class Parqueadero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutos = leerMinutos(sc);
        
        System.out.print("Tipo de vehiculo (A = auto, M = moto): ");
        char tipo = sc.next().charAt(0);

        int horas = horasCobradas(minutos);
        double total = tarifa(horas, tipo);
    }
}