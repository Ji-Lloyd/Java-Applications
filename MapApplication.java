import java.util.HashMap;
import java.util.Map;

public class MapApplication {
    public static void main(String[] args) {
        Map <Integer, String> codePlanType = new HashMap<>();
        codePlanType.put(001,"A");
        codePlanType.put(002,"B");
        codePlanType.put(003,"C");

        int charges = 0;
        double discount = 0;
        final double VAT = .10;
        double discountResult = 0;

        double result = 0;
        for(Integer type : codePlanType.keySet()){
            switch (codePlanType.get(type)) {
                case "A":
                    charges = 100;
                    result = (charges * VAT) + charges;
                    System.out.println("Customer '" + type + "' has a bill amount of " + (result));
                    break;

                case "B":
                    charges = 200;
                    discount = .10;
                    discountResult = charges - (charges * discount);
                    result = (discountResult * VAT) + discountResult;
                    System.out.println("Customer '" + type + "' has a bill amount of " + (result));
                    break;
            
                case "C":
                    charges = 300;
                    discount = .25;
                    discountResult = charges - (charges * discount);
                    result = (discountResult * VAT) + discountResult;
                    System.out.println("Customer '" + type + "' has a bill amount of " + (result));
                    break;
            }
        }
    }
}
