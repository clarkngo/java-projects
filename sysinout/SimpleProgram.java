import java.util.ArrayList;
import java.util.Scanner;

public class SimpleProgram {
    public static void singleInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(scanner.next());
        scanner.close();
    }

    public static void multipleInputs() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int count = 1;

        while(count <= 3){
            list.add(scanner.nextLine());
            count++;
        }

        String combinedStr = "";
        for (String str : list) {
            combinedStr += str;
        }
        System.out.print(combinedStr);
        scanner.close();
    }

    public static void main(String[] args) {

    }
}
