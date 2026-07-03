import java.util.Scanner;

public class Chuong3_Bai2 {
    public static void main(String[] args) {
        int n;
        while (true) {
            Scanner sc= new Scanner (System.in);
            System.out.print("Nhap vao mot so (1-7): ");
            n = sc.nextInt();
            if(n<=7)
                break;
            else
                System.out.println("Nhap sai");
        }
        String[] thu=  {"Thu Hai","Thu Ba","Thu Tu","Thu Nam","Thu Sau","Thu Bay","Chu Nhat"};
        System.out.println(n+":"+thu[n-1]);


    }
    
}
