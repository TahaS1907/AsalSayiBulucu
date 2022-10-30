import java.util.Scanner;

public class Main {
    public static void primeNumber(){
        Scanner scanner=new Scanner(System.in);
        int number;int divisor=0;
        System.out.println("Please enter a number");
        number= scanner.nextInt();
        
        for(int i=4;i<number;i++){
             if(number%i==0){
                 divisor++;
             }
        }if(divisor==0){System.out.println("Prime number");}
        else System.out.println("isn't a prime number");


    }
    public static void main(String[] args) {
        primeNumber();
    }
}