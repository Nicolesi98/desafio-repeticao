import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String palavraEscolhida = "programacao";

        String palavraOculta = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("");

        for (int i = 0; i < palavraEscolhida.length(); i++) {
            palavraOculta += "_ ";
            System.out.print("_ ");
        }

        int totalTentativas = 6;

        System.out.println("");

        while (totalTentativas > 0) {
            System.out.println("Digite uma letra:");
            String letra = scanner.next();

            if(palavraEscolhida.contains(letra)) {
                for (int i = 0; i < palavraEscolhida.length(); i++) {
                    if (palavraEscolhida.charAt(i) == letra.charAt(0)) {
                        palavraOculta = palavraOculta.substring(0, i*2) + letra + " " + palavraOculta.substring((i*2)+2);
                    }
                }
                System.out.println(palavraOculta);
            } else {
                totalTentativas--;
                System.out.println("A palavra não contém a letra " + letra + ", e você ainda tem " + totalTentativas + " tentativas.");
            }

            if (!palavraOculta.contains("_")) {
                System.out.println("Parabéns, você acertou a palavra! A palavra é " + palavraEscolhida + ".");
                break;
            }

        }

        if(palavraOculta.contains("_")){
            System.out.println("Você perdeu! A palavra era " + palavraEscolhida + ".");
        }

    }
}