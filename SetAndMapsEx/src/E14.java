import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class E14 {
    public class DragonStats{
        int damage;
        int health;
        int armor;
        

        public int getDamage() {
            return damage;
        }

        public void setDamage(int damage) {
            this.damage = damage;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getArmor() {
            return armor;
        }

        public void setArmor(int armor) {
            this.armor = armor;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, TreeMap<String, DragonStats>> typeOfDragons = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String type = tokens[0];
            String dragonName = tokens[1];
            int damage = Integer.parseInt(tokens[2]);
            int health = Integer.parseInt(tokens[3]);
            int armor = Integer.parseInt(tokens[4]);



            // ако ти гърмят тестовете сложи проверка за ГЛАВНА буква.

            typeOfDragons.putIfAbsent(type, new TreeMap<>());

        }

    }
}
