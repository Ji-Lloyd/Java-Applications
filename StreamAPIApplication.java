import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class StreamAPIApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int listSize = scanner.nextInt();

        List<Integer> numberList = new ArrayList<Integer>();

        for(int counter = 0 ; counter < listSize ; counter++){
            System.out.print("Enter value: ");
            int listValue = scanner.nextInt();
            numberList.add(listValue);
        }

        scanner.nextLine();

        System.out.print("1: Print Odd Numbers\n2: Print Even Numbers\n3: Sum of elements\n4: Difference of elements\n5: Product of elements\n6: Quotient of elements");
        int valueOperator = scanner.nextInt();

        switch (valueOperator) {
            case 1:
                Stream<Integer> even = numberList.stream().filter(result -> result%2==0).sorted();
                System.out.println(even);
                break;
            case 2:
                Stream<Integer> odd = numberList.stream().filter(result -> result%2==0).sorted();
                System.out.println(odd);
                break;
            case 3:
                Integer sum = numberList.stream().reduce(0, (result,nextElement) -> result + nextElement );
                System.out.println(sum);
                break;
            case 4:
                Integer difference = numberList.stream().reduce(0, (result,nextElement) -> result - nextElement );
                System.out.println(difference);
                break;
            case 5:
                Integer product = numberList.stream().reduce(0, (result,nextElement) -> result * nextElement );
                System.out.println(product);
                break;
            case 6:
                Integer quotient = numberList.stream().reduce(0, (result,nextElement) -> result / nextElement );
                System.out.println(quotient);
                break;
            default:
                System.out.println("Wrong Input Try Again");
                main(args);
                break;
        }

        scanner.close();
    }
}
