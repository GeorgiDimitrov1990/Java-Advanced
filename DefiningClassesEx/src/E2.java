import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];
            if (tokens.length == 4){
                Employee employee = new Employee(name, salary, position, department);
                employeeList.add(employee);
            } else if (tokens.length == 5){
                if (tokens[4].contains("@")){
                    Employee employee = new Employee(name, salary, position, department, tokens[4]);
                    employeeList.add(employee);
                } else {
                    Employee employee = new Employee(name, salary, position, department, Integer.parseInt(tokens[4]));
                    employeeList.add(employee);
                }
            } else if (tokens.length == 6){
                Employee employee = new Employee(name, salary, position, department, tokens[4], Integer.parseInt(tokens[5]));
                employeeList.add(employee);
            }
        }
        System.out.println();
    }
}
