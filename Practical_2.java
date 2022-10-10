//shreyans j. pranami 21CE110
import java.util.*;

public class Practical_2 {
    public static void main(String[] args) {


        String str = "This is program for Counting number of words";
        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = str.split(" ");


        for (String word : words) {
            hashMap.merge(word, 1, Integer::sum);
        }
        TreeMap<String,Integer> tm=new  TreeMap<String,Integer>(hashMap);
        Iterator itr=tm.keySet().iterator();
        while(itr.hasNext())
        {
            String key= (String) itr.next();
            System.out.println( key +" "+hashMap.get(key));
        }
        System.out.println("shreyans 21CE110");
    }
}
