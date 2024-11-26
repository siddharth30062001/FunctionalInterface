package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CheckString {

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("sid","sumit","amit","shreya","tom");

        Predicate<String> ls=(s)->s.startsWith("s");

        for(String st:names){

            if(ls.test(st)){
                System.out.println(st);
            }
        }
        
    }
    
}
