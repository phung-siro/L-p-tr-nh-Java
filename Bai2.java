import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        float gio,sotien,tien;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so gio lam viec: ");
        gio=in.nextFloat();
        System.out.print("So tien tra cho moi gio la: ");
        sotien=in.nextFloat();
        tien=gio*sotien;
        System.out.println("So tien tra cho nhan vien la: "+tien);

    }
    
}
