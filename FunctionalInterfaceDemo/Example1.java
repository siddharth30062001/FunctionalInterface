package FunctionalInterfaceDemo;

@FunctionalInterface
interface Message{

    //only one abstract method in FunctionalInterface
    void printMessage(String message);  

    //But it contain multiple Object class method
    int hashCode();
    String toString();
}
public class Example1 implements Message{

    public void printMessage(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {

        Example1 e1=new Example1();
        e1.printMessage("Hello Siddharth!!");
        
    }


    
}