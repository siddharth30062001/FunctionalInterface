package Assignment;

@FunctionalInterface
interface Transformer{
    String transform(String s);
}
public class Convert {

    public static void main(String[] args) {

    Transformer t1=(s)->{
        return s.toLowerCase();
    };
    System.out.println(t1.transform("RAju"));

    Transformer t2=(s)->(s.toUpperCase());
    System.out.println(t2.transform("rajput"));

    Transformer t3=(s)->{

        String [] words = s.split(" ");
        StringBuilder sb=new StringBuilder();

        for (String word : words) {

            if(word.length()>0){
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
            }
            
        }

        return sb.toString().trim();
   
    };

    System.out.println(t3.transform("siddharth siNgh raJput"));

}
}

