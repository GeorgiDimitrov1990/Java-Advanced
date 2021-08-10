public class Main {
    public static void main(String[] args) {
        printStrings();
        printStrings("first");
        printStrings("first" ,"second");



    }
    public static void printStrings(String... strings) {
        String[] arr = strings;
        if (arr.length == 0){
            System.out.println("No output");
        } else {
            for (String string : arr) {
                System.out.println(string);
            }

        }
    }
}
