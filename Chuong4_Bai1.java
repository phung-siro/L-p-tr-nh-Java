import java.util.Scanner;

class MathUtils{
    //Nhận vào 2 số nguyên
    public int max (int a, int b){
        return (a>b)?a:b;
    }
    //Nhận vào 2 số thực
    public double max (double a, double b ){
        return (a>b)?a:b;
    }
    //Nhận vào một mảng số nguyên
    public int max (int[] mang){
        int max = mang[0];
        for (int x: mang){
            if(x>max){max=x;}
        }
         return (max);
    }
    //Nhận vào một mảng số thực
    public double max (double[] mang1){
        double max=mang1[0];
        for (double x : mang1){
            if (x>max){max=x;}
        }
        return max;
    }
}
    public class Chuong4_Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathUtils tinh = new MathUtils();
        System.out.print("a = ");
        //Nhận vào 2 số nguyên
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int max = tinh.max(a,b);
        System.out.println("Max giua 2 so a va b la: "+max);
        //Nhận vào 2 số thực  
        System.out.print("Nhap vao so thuc thu nhat: ");
        double sothucthunhat=sc.nextDouble();
        System.out.print("Nhap vao so thuc thu hai: ");
        double sothucthuhai=sc.nextDouble();
        System.out.println("Max cua 2 so thuc la: "+tinh.max(sothucthuhai,sothucthunhat));
         //Nhận vào một mảng số nguyên
        System.out.print("Nhap vao so luong phan tu cau mang: ");
         int soluong = sc.nextInt() ;
         int[] mang = new int[soluong];
         for (int i=0 ; i<soluong;i++){
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            mang[i]=sc.nextInt();
         }
         System.out.println("Gia tri lon nhat trong mang la: "+ tinh.max(mang));
         //Nhận vào một mảng số thực
        System.out.print("Nhap vao so luong phan tu cau mang: ");
         int  soluong1 = sc.nextInt() ;
         double[] mang1 = new double[soluong1];
         for (int i=0 ; i<soluong1;i++){
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            mang1[i]= sc.nextDouble();
         }
         System.out.print("Gia tri lon nhat trong mang la: "+ tinh.max(mang1));



    }
    
        
    }

    

