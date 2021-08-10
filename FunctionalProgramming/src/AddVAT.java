import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Унарния оператор е също като функция, но приема само един елемент, защото връща винаги елемент
        //от същият тип.

        UnaryOperator<Double> unaryOperator = priceWithoutVat -> priceWithoutVat * 1.20;


        Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(e-> unaryOperator.apply(Double.parseDouble(e)))
                .forEach(e-> System.out.printf("%.2f%n", e));
        System.out.println("Prices with VAT:");
    }
}
