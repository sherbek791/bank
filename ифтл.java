import java.util.Scanner;

import static java.lang.System.in;

public class ифтл {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(in);
        System.out.println("Ibratxo'ja Bank");
        for (; ;){

            System.out.println("Next->1: ");
            System.out.println("Exit->2: ");
            System.out.print("= ");
            int n= scanner.nextInt();

            if (n == 1) {
                System.out.print("write name: ");
                scanner=new Scanner(in);
                String name= scanner.next();
                System.out.print("Card number: ");
                int crd= scanner.nextInt();
                System.out.print("money: ");
                double mny= scanner.nextDouble();
                System.out.print("year: ");
                double yer= scanner.nextDouble();

                int p=23;
                double res=0;
                double f= ((mny*p)/100);
                System.out.println(name+" "+((f*yer)+mny));
            }else if(n==0){
                break;
            }else {
                System.out.println("error");
            }


        }






















    }
}
