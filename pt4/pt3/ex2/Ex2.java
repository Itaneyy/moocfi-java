package ex2;

import java.nio.file.FileSystemNotFoundException;

import java.nio.file.Paths;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner skt = new Scanner(System.in);
        System.out.println("Diga qual arquivo você gostaria de abrir");

        String nameArq = skt.nextLine();
        String caminho = "pt4\\pt3\\ex2\\Song.txt";
        caminho += nameArq;

        try (Scanner leitor = new Scanner(Paths.get(caminho))) {

            String linha = leitor.nextLine();

            while (linha != null) {
                System.out.println(linha);
                linha = leitor.nextLine();

            }

            // do mais específico para o mais genérico.
            // E assim que se usa um try catch com vários catch
            //Achei que Path estava lançando execoes , mas aparentemente não 
            //Vou deixar assim mesmo 
        } catch (FileSystemNotFoundException e) {
            System.out.println("Erro! Arquivo não encontrado: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de URL! " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro! " + e.getMessage());
        }
        skt.close();
        

    }

}
