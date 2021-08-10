package PetClinic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Pet> petMap = new HashMap<>();
        Map<String, Clinic> clinicMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            switch (tokens[0]){

                case "Create":

                    if (tokens[1].equals("Clinic")) {
                        try {
                            Clinic clinic = new Clinic(Integer.parseInt(tokens[3]));
                            clinicMap.put(tokens[2], clinic);
                        } catch (IllegalArgumentException ex){
                            System.out.println("Invalid Operation!");
                        }

                    } else if (tokens[1].equals("Pet")) {
                        Pet pet = new Pet(tokens[2], Integer.parseInt(tokens[3]), tokens[4]);
                        petMap.put(tokens[2], pet);
                    }
                    break;
                case "HasEmptyRooms":
                    System.out.println(clinicMap.get(tokens[1]).hasEmptyRooms());
                    break;
                case "Add":
                    System.out.println(clinicMap.get(tokens[2]).add(petMap.get(tokens[1])));
                    break;
                case "Release":
                    System.out.println(clinicMap.get(tokens[1]).release());
                    break;
                case "Print":
                    if (tokens.length == 2){
                        clinicMap.get(tokens[1]).print();
                    } else if (tokens.length == 3){
                        clinicMap.get(tokens[1]).print(Integer.parseInt(tokens[2]));
                    }
                    break;
            }
        }
    }
}
