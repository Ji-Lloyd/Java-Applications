import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringCompareApplication {
    public static void main(String[] args) {
        Comparator<String> lisComparator = new Comparator<String>() {

            // Overrides the compare method that will be used as an argument for sorting
            @Override
            public int compare(String o1, String o2) {
                // Checks if the first String has greater index length on other String within the list
                if(o1.length() > o2.length()){
                    // Swap the element if the left String is longer than right String
                    return 1;
                }else{
                    // Remain at position
                    return -1;
                }
            }
            
        };
        
        List<String> stringList = new ArrayList<>();
        stringList.add("monkey");
        stringList.add("dog");
        stringList.add("dragon");
        stringList.add("worm");
        stringList.add("cat");

        // Calls the 'Collections' interface to sort the List
        // Takes two (2) arguments the list and the comparator
        Collections.sort(stringList,lisComparator);

        for(String myList : stringList){
            System.out.println(myList);
        }
    }
}
