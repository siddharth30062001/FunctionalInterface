package FunctionalInterface;


//Non-FunctionalInterafce
interface Demo1{
    default void printDemo1(){
        System.out.println("Demo1 interface");
    }
}

//FunctionalInterafce
interface Demo2 extends Demo1{

    public  void printDemo2();    //abstract method
    
}

public class MultipleInterface implements Demo2{

    @Override
    public void printDemo2() {
        System.out.println("Demo2 Interface");
        
    }


    public static void main(String[] args) {

        MultipleInterface e1=new MultipleInterface();
        e1.printDemo2();
        e1.printDemo1();
        
    }

    
}
