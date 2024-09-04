package Moi_quan_he_doi_tuong;

class Author
{
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
class Book
{
    private String name;
    private Author[] authors;
    private double price;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String getAuthorNames() {
        String authorName = "";
        for(int i = 0; i<authors.length; i++) {  //Duyệt qua từng phần tử trong mảng authors.
            authorName += authors[i].getName();  //hêm tên của tác giả hiện tại (authors[i].getName()) vào biến authorName.
            if(i < authors.length- 1) {         //Kiểm tra nếu tác giả hiện tại không phải là tác giả cuối cùng trong mảng.
                authorName+= ",";               //Nếu đúng, thêm dấu phẩy vào authorName.
            }
        }
        return authorName; 
    }
}
public class bai_tap_sach {
    public static void main(String[] args) {
        Author[] authors = new Author[3];
        authors[0] = new Author("Dang", "ascaw@gmail.com");
        authors[1] = new Author("Hung", "awegqgw@gmail.com");
        authors[2] = new Author("Duong", "asdgdw@gmail.com");
        
        Book book1 = new Book("Java OOP for benginners", authors, 500000);
        System.out.println(book1.getAuthorNames());
    }
}
