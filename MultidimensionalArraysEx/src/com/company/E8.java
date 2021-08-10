package com.company;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerHealth = 18500;
        double playerDamage = Double.parseDouble(scanner.nextLine());
        int playerRow = 7;
        int playerCol = 7;

        double bossHealth = 3_000_000;
        String previousSpell = "";
        String currentSpell = "";

        while (playerHealth > 0 && bossHealth > 0) {
            bossHealth -= playerDamage;

            if (previousSpell.equals("Cloud")) {
                playerHealth -= 3500;
                if (playerHealth < 0) {
                    continue;
                }
            }
            if (bossHealth < 0) {
                continue;
            }

            String[] input = scanner.nextLine().split(" ");
            currentSpell = input[0];
            int rowHit = Integer.parseInt(input[1]);
            int colHit = Integer.parseInt(input[2]);

            int[][] chamber = new int[15][15];
            for (int row = rowHit - 1; row <= rowHit + 1; row++) {
                if (row >= 0 && row < chamber.length) {
                    for (int col = colHit - 1; col <= colHit + 1; col++) {
                        if (col >= 0 && col < chamber[row].length) {
                            chamber[row][col] = 1;

                        }
                    }

                }
            }

            if (chamber[playerRow][playerCol] == 1) {
                if (playerRow - 1 >= 0 && chamber[playerRow - 1][playerCol] == 0) {
                    playerRow--;
                } else if (playerCol + 1 < chamber[playerRow].length && chamber[playerRow][playerCol + 1] == 0) {
                    playerCol++;
                } else if (playerRow + 1 < chamber.length && chamber[playerRow + 1][playerCol] == 0) {
                    playerRow++;
                } else if (playerCol - 1 >= 0 && chamber[playerRow][playerCol - 1] == 0) {
                    playerCol--;
                }
            }


            if (chamber[playerRow][playerCol] == 1) {
                switch (currentSpell) {
                    case "Cloud":
                        playerHealth -= 3500;
                        previousSpell = currentSpell;
                        break;
                    case "Eruption":
                        playerHealth -= 6000;
                        previousSpell = currentSpell;
                        break;

                }
            }
        }

        if (bossHealth > 0) {
            System.out.printf("Heigan: %.2f%n", bossHealth);
        } else {
            System.out.println("Heigan: Defeated!");
        }
        if (playerHealth > 0) {
            System.out.printf("Player: %d%n", playerHealth);
        } else {
            if (previousSpell.equals("Cloud")) {
                System.out.println("Player: Killed by Plague Cloud");
            } else {
                System.out.println("Player: Killed by " + previousSpell);
            }

        }
        System.out.println("Final position: " + playerRow + ", " + playerCol);

    }

}
