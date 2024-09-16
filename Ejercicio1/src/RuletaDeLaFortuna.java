import java.util.Scanner;

public class RuletaDeLaFortuna {

    public static void main(String[] args) {
        // Frase a adivinar
        String frase = "hola, mundo!";
        char[] fraseArray = frase.toCharArray();
        
        // Array para mostrar los caracteres adivinados
        char[] mostrar = new char[fraseArray.length];
        for (int i = 0; i < mostrar.length; i++) {
            mostrar[i] = (fraseArray[i] >= 97 && fraseArray[i] <= 122) ? '_' : fraseArray[i];
        }



        Scanner scanner = new Scanner(System.in);
        boolean adivinada = false;

        while (!adivinada) {
            System.out.println("Frase a adivinar: " + new String(mostrar));
            System.out.print("Introduce una consonante: ");
            char letra = scanner.next().toLowerCase().charAt(0);

            // Verificar si la letra es una consonante
            if (!esConsonante(letra)) {
                System.out.println("Eso no es una consonante. Inténtalo de nuevo.");
                continue;
            }

            // Comprobar si la letra está en la frase
            boolean acierto = false;
            for (int i = 0; i < fraseArray.length; i++) {
                if (fraseArray[i] == letra) {
                    mostrar[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                System.out.println("La letra no está en la frase.");
            }

            // Verificar si la frase ha sido adivinada
            adivinada = true;
            for (int i = 0; i < mostrar.length; i++) {
                if (mostrar[i] == '_') {
                    adivinada = false;
                    break;
                }
            }
        }

        System.out.println("¡Felicidades! Has adivinado la frase: " + new String(mostrar));
    }

    private static boolean esConsonante(char letra) {
        return Character.isLetter(letra) && "bcdfghjklmnpqrstvwxyz".indexOf(letra) >= 0;
    }
}
