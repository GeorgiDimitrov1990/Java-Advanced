import java.util.*;

public class E13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String ,LinkedHashMap<String, Integer>> concerts = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){

            if (!input.contains("@") || input.charAt(input.indexOf("@") -1) != ' '){
                input = scanner.nextLine();
                continue;
            }

            String singer = input.substring(0, input.indexOf("@") - 1);
            int firstIndexOfNumber = 0;
            for (int i = input.indexOf("@"); i < input.length(); i++) {
                char current = input.charAt(i);
                if (Character.isDigit(current) && input.charAt(i-1) == ' '){
                    firstIndexOfNumber = i;
                    break;
                }
            }

            if (firstIndexOfNumber == 0){
                input = scanner.nextLine();
                continue;
            }

            String venue = input.substring(input.indexOf("@")+1, firstIndexOfNumber - 1);

            String number = input.substring(firstIndexOfNumber);
            String[] numbersAsArray = number.split("\\s+");
            if (numbersAsArray.length != 2){
                input = scanner.nextLine();
                continue;
            }
            int price = Integer.parseInt(numbersAsArray[0]);
            int capacity = Integer.parseInt(numbersAsArray[1]);


            if (!concerts.containsKey(venue)){
                LinkedHashMap<String, Integer> singers = new LinkedHashMap<>();
                singers.put(singer, price * capacity);
                concerts.put(venue, singers);
            } else {
                LinkedHashMap<String, Integer> currentSingers = concerts.get(venue);
                if (currentSingers.containsKey(singer)){
                    currentSingers.put(singer, currentSingers.get(singer) + price * capacity);

                } else {
                    currentSingers.put(singer, price * capacity);
                }
                concerts.put(venue,currentSingers);
            }

            input = scanner.nextLine();
        }

        for (String venue : concerts.keySet()) {
            System.out.println(venue);
            LinkedHashMap<String, Integer> singers = concerts.get(venue);

            singers.entrySet().stream().sorted((sum1, sum2) -> sum2.getValue().compareTo(sum1.getValue()))
                    .forEach(e-> System.out.println(String.format("#  %s -> %d", e.getKey(), e.getValue())));
        }


    }
}
