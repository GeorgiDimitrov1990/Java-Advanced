package ListyIterator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> data = Arrays.stream(scanner.nextLine().split("\\s+")).skip(1).collect(Collectors.toList());
        ListyIterator listyIterator = new ListyIterator(data);
        String command = scanner.nextLine();

        while (!command.equals("END")){
            switch (command){
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    System.out.println(listyIterator.print());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.iterator().hasNext());
                    break;
                case "PrintAll":
                    /*listyIterator.forEach(s -> System.out.println(s + " "));*/

                    for (String s : listyIterator) {
                        System.out.print(s + " ");
                    }
                    System.out.println();

                    break;
            }


            command = scanner.nextLine();
        }

        for (String s : listyIterator) {

        }


    }
}
