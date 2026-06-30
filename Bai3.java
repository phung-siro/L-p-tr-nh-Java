import java.util.Scanner;

public class Bai3 {
  
        public static final double rate =2.54;
        public static void main(String[] args) {
            double dodaicm, dodaiinch;
            Scanner in = new Scanner(System.in);
            System.out.print("Nhap do dai theo cm: ");
            dodaicm =in.nextDouble();
            dodaiinch=dodaicm/rate;
            System.out.println(dodaicm + " cm tuong duong "+dodaiinch+ " inch ");

       
    }
    
}
