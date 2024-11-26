package Assignment;

interface IntOperation{
    public int apply(int x,int y);
}
public class ArithmeticOperation {

    public static void main(String[] args) {
    

        IntOperation o1=(x,y)->(x+y);
        System.out.println("Addition: "+o1.apply(2, 3));

        IntOperation o2=(x,y)->(x-y);
        System.out.println("Subtraction: "+o2.apply(5, 3));

        IntOperation o3=(x,y)->(x/y);
        System.out.println("Division:" +o3.apply(10, 5));

        IntOperation o4=(x,y)->(x*y);
        System.out.println("multipliaction: "+ o4.apply(5, 3));
        
    }
}
    

