import java.util.ArrayList;
import java.util.Scanner;
public  class libraryapp {
    Scanner s = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();

    public  void run(){
        int choise = 10;
        while(choise != 7){
            PrintMenu();
            choise = s.nextInt();
            switch (choise) {
                case 1:
                    PrintAllBooks();
                    choise = 10;
                    break;
                case 2:
                    AddNewBook();
                    choise = 10;
                    break;
                case 3:
                    SearchBookByTitle();
                    choise = 10;
                    break;
                case 4:
                    BorrowBook();
                    choise = 10;
                    break;
                case 5:
                    ReturnBook();
                    choise = 10;
                    break;
                case 6:
                    DeleteBook();
                    choise = 10;
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Write again");
            }
        }
    }

    private void PrintMenu() {
        System.out.println("***************************");
        System.out.println("Welcome to Library App");
        System.out.println("1.Print all books");
        System.out.println("2.Add new book");
        System.out.println("3.Search book by title");
        System.out.println("4.Borrow a book");
        System.out.println("5.Return a book");
        System.out.println("6.Delete a book by id");
        System.out.println("7.Quit");
        System.out.println("****************************");
    }

    private void PrintAllBooks() {
        if  (books.isEmpty()) {
            System.out.println("There are no books");
        }
        else {System.out.println(books);}
    }

    // Adding new book
    private void AddNewBook() {
        s.nextLine();
        Book book = new Book();
        System.out.println("Write title: ");
        String title = s.nextLine();
        System.out.print("Write author: ");
        String author = s.nextLine();
        System.out.print("Write year: ");
        int year = s.nextInt();
        book.setTitle(title);
        book.setAuthor(author);
        book.setYear(year);
        book.setAvailable(true);
        books.add(book);
    }

    private void SearchBookByTitle() {
        s.nextLine();
        System.out.println("Write title: ");
        String title = s.nextLine();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
            }
            else {System.out.println("Title does not match");}
        }
    }


    private void BorrowBook() {
        s.nextLine();
        System.out.print("Write id of book: ");
        int id = s.nextInt();
        Book book = findBookById(id);
        if (book == null) {
            System.out.println("Book not found");
            return;
        }
        book.markAsBorrowed();
    }

    private void ReturnBook() {
        s.nextLine();
        System.out.print("Write id of book: ");
        int id = s.nextInt();
        Book book = findBookById(id);
        if (book == null) {
            System.out.println("Book not found");
            return;
        }
        book.markAsReturned();
    }

    private void DeleteBook() {
        s.nextLine();
        System.out.print("Write id of book: ");
        int id = s.nextInt();
        Book book = findBookById(id);
        if (book == null) {
            System.out.println("Book not found");
        }
        else books.remove(book);
    }

    private Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

}