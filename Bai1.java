import java.util.Scanner;

public class Bai1 {
  public static void main(String[] args) {
    double gia,thue;
    Scanner in= new Scanner(System.in);
    System.out.print("Nhap vao gia mot san pham: ");
    gia= in.nextDouble();
    thue = (8.25/100)*gia;
    System.out.println("So tien tra cho phan thue la: "+thue);
    System.out.println("Gia sau khi tinh thue la: "+(gia-thue));


  }
    
}
