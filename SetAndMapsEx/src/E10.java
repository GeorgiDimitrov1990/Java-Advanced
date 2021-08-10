import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Long>> countries = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("report")){

            String[] tokens = input.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            long cityPopulation = Long.parseLong(tokens[2]);

            countries.putIfAbsent(country, new LinkedHashMap<>());
            countries.get(country).put(city, cityPopulation);


            input = scanner.nextLine();
        }

        countries.entrySet().stream()
                .sorted((country1, country2) ->{
                    long sum1 = country1.getValue().values().stream().mapToLong(Long::longValue).sum();
                    long sum2 = country2.getValue().values().stream().mapToLong(Long::longValue).sum();
                    return Long.compare(sum2, sum1);
                }).forEach(e->{
                    long sum = e.getValue().values().stream().mapToLong(Long::longValue).sum();
                    System.out.println(String.format("%s (total population: %d)",e.getKey(), sum));
                    e.getValue().entrySet().stream().sorted((city1, city2)->{
                       return city2.getValue().compareTo(city1.getValue());
                    }).forEach(c-> System.out.println(String.format("=>%s: %d",c.getKey(),c.getValue())));
        });

    }
}
