package ex4;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Arquivo ? ");
        String path = teclado.nextLine();
        System.out.print("Lower Bound? ");
        int lower = teclado.nextInt();
        System.out.print("Upper Bound? ");
        int max = teclado.nextInt();

        int result = foo(path, lower, max);

        System.out.println(result);
        teclado.close();
    }

    public static int foo(String path, int lowerBound, int maxBound) {
        String caminho = "C:\\Users\\WIN\\Desktop\\moccfi\\pt4\\pt3\\ex4\\" + path;
        int contador = 0;

        try (Scanner skt = new Scanner(Paths.get(caminho))) {

            while (skt.hasNextLine()) {
                String linha = skt.nextLine().trim();

                if (linha.isEmpty())
                    continue;

                int valor = Integer.parseInt(linha);

                if (valor >= lowerBound && valor <= maxBound) {
                    contador++;
                }
            }

        } catch (Exception e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        }

        return contador;
    }

}
