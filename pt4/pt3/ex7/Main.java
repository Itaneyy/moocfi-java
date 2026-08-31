package ex7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("File?");
        String path = "C:\\Users\\WIN\\Desktop\\moccfi\\pt4\\pt3\\ex7\\" + teclado.nextLine();

        ReadData dt = new ReadData(path);
        System.out.println("Insira o nome de um time para obter suas informações");
        dt.showData(teclado.nextLine());
        

        teclado.close();
    }

}