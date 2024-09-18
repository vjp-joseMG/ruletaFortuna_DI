import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ruletaPep
 */
public class ruletaPep {

    final static String[] FRASES_A_ADIVINAR = { "que lo que? premoh!", "no por mucho tempranar, amanece mas amadruga",
            "se atormenta una vecina." };

    public static int numAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static String fraseOculta(String frase){
        frase = frase.toLowerCase();
        char[] panel = frase.toCharArray();
        for (int i = 0; i < panel.length; i++) {
            panel[i] = (panel[i] >= 97 && panel[i] <= 122) ? '_' : panel[i];
        }
        return panel.toString();
    }

    public static String revelarLetras(String fraseOculta, String fraseElegida, char letra){
        char[] fraseAux = fraseOculta.toCharArray();
        for(int i = 0; i < fraseElegida.length(); i++){
            if(fraseElegida.charAt(i) == letra){
                fraseAux[i] = letra;
            }
        }
        System.out.println(fraseOculta);
        return fraseAux.toString();
    }

    

    public static void main(String[] args) {
        String fraseElegida = FRASES_A_ADIVINAR[numAleatorio(0, FRASES_A_ADIVINAR.length)];
        Scanner entrada = new Scanner(System.in);

        char pedirConsonante = entrada.next().charAt(0);
        String fraseMostrada = fraseOculta(fraseElegida);
        



        Councursante jugadorUno = new Councursante();
        Councursante jugadorDos = new Councursante();
        Councursante jugadorTres = new Councursante();

    }
}