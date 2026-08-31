package ex3;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner skt = new Scanner(System.in);
            String caminho = "C:\\Users\\WIN\\Desktop\\moccfi\\pt4\\pt3\\ex3\\";

            System.out.println("Nome do arquivo");
            String nm = skt.nextLine();
            caminho += nm;
            List<String> arr = list(caminho);

            System.out.println("Enter names, an empty line quits.");
            try (Scanner leitor = new Scanner(Paths.get(caminho))) {
                String name = skt.nextLine();
                name = name.trim();
                while (!(name.isEmpty())) {
                    if (arr.contains(name)) {
                        System.out.println("The name is on the list.");
                    } else {
                        System.out.println("The name is not on the list.");

                    }
                   name = skt.nextLine();
                   name = name.trim();

                }

            } catch (Exception e) {
                System.err.println("Erro ! " + e.getMessage());
            }

            skt.close();
        } catch (Exception e) {
            System.out.println("ERRO no programa ! " + e.getMessage());
        }

    }

    public static List<String> list(String path) throws Exception {
        List<String> arr = new ArrayList<>();
        try (Scanner scan = new Scanner(Paths.get(path))) {
            String item ;
            while (scan.hasNextLine()) {
                item = scan.nextLine();
                arr.add(item);
            }

        } catch (Exception e) {
            throw e;
        }

        return arr;
    }
}
