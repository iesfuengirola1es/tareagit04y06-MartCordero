import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinanza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generar un número aleatorio entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("He elegido un número entre 1 y 100. ¡Intenta adivinarlo!");

        while (!adivinado) {
            System.out.print("Introduce tu número: ");
            int intentoUsuario = scanner.nextInt();
            intentos++;

            if (intentoUsuario < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (intentoUsuario > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                adivinado = true;
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }
        }

        scanner.close();
    }
}
