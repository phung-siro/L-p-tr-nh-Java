import java.util.Scanner;

class Math{
    public static double sum (double ... n){
        double sum =0;
        for (double x: n){
            sum += x;
        }
        return sum;
    }
}
public class Chuong4_Bai2 {
   
    public static void main(String[] args) {
        Math tong = new Math();
        Scanner sc= new Scanner(System.in);
        System.out.println("sum = "+tong.sum(5.4,2.5,6.8));
        System.out.print("Nhap so luong phan tu: ");
        int soluong = sc.nextInt();
        double[] mang = new double[soluong];
        for (int i=0 ; i<soluong; i++){
            System.out.print("Nhap vao phan tu thu "+(i+1)+": ");
            mang[i] =sc.nextDouble();
        }
        System.out.println("Tong cua danh sach la: "+tong.sum(mang));
    }
}
