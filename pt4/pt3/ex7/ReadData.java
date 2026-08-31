package ex7;

import java.nio.file.Paths;
import java.util.Scanner;

public class ReadData {
    String path;

    public ReadData(String path) {
        this.path = path;

    }

    // #home team, visiting team, home team points, and visiting team points no
    // nosso arquivo csv
    public void showData(String name) {
        int jogos = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner skt = new Scanner(Paths.get(path))) {

            while (skt.hasNextLine()) {
                String[] data = skt.nextLine().split(",");
                String home = data[0];
                String visiting = data[1];
                int homePoints = Integer.valueOf(data[2]);
                int visitPoints = Integer.valueOf(data[3]);
                if (home.equals(name)) {

                    jogos++;
                    if (homePoints > visitPoints) {
                        wins++;

                    } else {
                        losses++;
                    }

                }
                if (visiting.equals(name)) {

                    jogos++;
                    if (visitPoints > homePoints) {
                        wins++;

                    } else {
                        losses++;

                    }

                }

            }
            System.out.println("Jogos: " + jogos);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Erro ao carregar dados ! " + e.getMessage());
        }
    }
}