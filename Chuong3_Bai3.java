public class Chuong3_Bai3 {
    public static void main(String[] args) {
        int i;
        for (i=1;i<=100;i++){
            boolean in = false;
            if (i%3==0){
                System.out.print("Coza");
                in= true;}
            if (i%5==0){
                System.out.print("Loza");
                in=true;}
            if(i%7==0){
                System.out.print("Woza");
                in=true;
            }
            if(i%3==0 && i%5==0){
                System.out.print("CozaLoza");
                in=true;
            }
            if (! in){
                System.out.print(i);
            }
            if(i%11==0){
                System.out.println();
            }
            else{
                System.out.print(" ");
            }


        }
    }
    
}
