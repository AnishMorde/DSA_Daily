package OOP.constructor;

public class Book {

    String title;
    String author;
    int year;

    Book(){
        this.title = "untiled";
        this.author = "unkown";
        this.year = 0;
    }

    Book(String title ,String author ,int year){

        this.title = title;
        this.author = author;
        this.year = year;

    }

    public void disply(){
        System.out.println(title + " " + author + " " + year);
    }

    public static void main(String[] args) {
        Book book1 = new Book();

        Book book2 = new Book("My Book" ,"Anish" , 2025);


        book1.disply();
        book2.disply();

    }
}
