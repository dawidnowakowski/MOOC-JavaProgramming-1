
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        int games = 0, wins = 0, losses = 0;
        System.out.println("Name:");
        String name = scan.nextLine();

        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                if (row.contains(name)) {
                    String[] temp = row.split(",");
                    games++;
                    if (temp[0].equals(name)) {
                        if (Integer.valueOf(temp[2]) > Integer.valueOf(temp[3])) {
                            wins++;
                        } else {
                            losses++;
                        }
                    } else {
                        if (Integer.valueOf(temp[2]) > Integer.valueOf(temp[3])) {
                            losses++;
                        } else {
                            wins++;
                        }
                    }
                }
            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Error");
        }

    }

}
