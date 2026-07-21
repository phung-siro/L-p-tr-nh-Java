package Chuong5_Bai1;
public class Media {
   public static abstract class Item {
        public String name;
        private String description;
        protected String ID;
        float price;
        public Item(String name, String description,String ID,float price){
            this.name=name;
            this.description=description;
            this.ID=ID;
            this.price=price;
        }
        
        public String getDesciption(String description) {
            return description;
        }
        
        public void setDescription(String description) 
        {
            this.description = description;
        }
        public abstract void showInfo();
    }
    public static class MP3 extends Item {
        int duration;
        public MP3(String name , String description,String ID,float price, int duration){
            super(name,description,ID,price);
            this.duration=duration;
        }
        @Override
        public void showInfo(){
            System.out.println("MP3: "+name + " | ID: "+ID+" | Giá: "+price+" | Thoi luong: "+ duration+"s");
        }
    }
    public static class Book extends Item {
        String author;
        int numberOfPages;
        String genre;
        public Book (String name, String description,String ID,float price, String author,int numberOfPages, String genre){
            super(name,description,ID,price);
            this.author=author;
            this.numberOfPages=numberOfPages;
            this.genre=genre;
        }
        @Override
        public  void showInfo(){
            System.out.println("Book: " + name + " | Tác giả: " + author + " | Trang: " + numberOfPages + " | Thể loại: " + genre);
        }
    
        
    }
    //Chỉ cần thêm từ khóa static vào trước khai báo các lớp con (Item, MP3, Book). Khi đó, các lớp này trở thành "Static nested classes" và có thể được khởi tạo trực tiếp trong main mà không cần thông qua đối tượng Media.
    public static void main(String[] args) {
        MP3 mp3= new MP3("Nhac tru tinh", "Bai hat hay", "001", 20000, 288);
        Book book = new Book("Harry Potter", "Sach ngoai", "003", 100000, "Tao", 322, "Truyen co tich");
        mp3.showInfo();
        book.showInfo();

    }
    

}
