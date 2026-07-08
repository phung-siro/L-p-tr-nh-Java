import java.lang.Math;
/**
 * Bài tập chương 4
 * @author Phạm Đức Dũng
 * @version 1.0
 * @since 2026-02-01
 */
public class Chuong4_Bai4 {
    /**
     * 
     * @param dai Chiều dài hình chữ nhật
     * @param rong Chiều rộng hình chữ nhật
     * @return Diện tích hình chữ nhật
     */
    public double Dientichhinhchunhat(double dai,double rong){
        return dai *rong;
    }
    /**
     * 
     * @param r Bán kính hình tròn
     * @return Diện tích hình tròn
     */
    public double Dientichhinhtron(double r){
        return Math.PI *r*r; 
    }
    /**
     * 
     * @param h Đường cao
     * @param a Cạnh tương ứng với đường cao
     * @return Diện tích hình tam giác
     */
    public double Dientichhinhtamgiac(double h,double a){
        return (1/2)* a*h;
    }
    /**
     * 
     * @param h Đường cao của hình thang
     * @param a Cạnh đáy thứ nhất
     * @param b Cạnh đáy thứ hai
     * @return Diện tích hình thang
     */
    public double Dientichhinhthang(double h, double a, double b){
        return((1/2)*(a+b)*h);
    }
    
    
}

