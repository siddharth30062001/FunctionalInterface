package Assignment;


interface MathOperation{
    double calculate(double a, double b);
}
public class Calculation {

    public static void main(String[] args) {
        
        MathOperation mo1=(a,b)->(a%b);
        System.out.println("modlus: " +mo1.calculate(10, 3));

        MathOperation mo2=(a,b)->{
            double ans=1;
            for(int i=1;i<=b;i++){
                ans=ans*a;
            }

            return ans;
        };
        System.out.println("power: "+mo2.calculate(2, 4));
    }
    
}
