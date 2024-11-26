package FunctionalInterface;

@FunctionalInterface
interface Message{

    //only one abstract method in FunctionalInterface
    void printMessage(String message);  

    //But it contain multiple Object class method
    int hashCode();
    String toString();
}
public class FunctionalInterfaceExample implements Message{

    public void printMessage(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {

        FunctionalInterfaceExample e1=new FunctionalInterfaceExample();
        e1.printMessage("Hello Siddharth!!");
        
    }


    
}