public class Book1 {
    private String bookname;
    private int ISBNnumber;
    private String authorname;
    private String publisher;
    public Book1(String bookname, int ISBNnumber, String authorname, String publisher) {
        this.bookname = bookname;
        this.ISBNnumber = ISBNnumber;
        this.authorname = authorname;
        this.publisher = publisher;}
    public String getBookname() {
        return bookname;}
    public void setBookname(String bookname) {
        this.bookname = bookname;}
    public int getISBNnumber() {
        return ISBNnumber;}
    public void setISBNnumber(int ISBNnumber) {
        this.ISBNnumber = ISBNnumber;}
    public String getAuthorname() {
        return authorname;}
    public void setAuthorname(String authorname) {
        this.authorname = authorname;}
    public String getpublisher(){
         return publisher;}
    public void setpublisher(String publisher){
         this.publisher=publisher;}
    public String getBookInfo() {
        return String.format("Bookname: %s\nISBNnumber: %d\nAuthorname: %s\nPublisher: %s",
                bookname, ISBNnumber, authorname, publisher);}
    public static void main(String[] args) {
        Book1[] books = new Book1[30];
        books[0] = new Book1("Harry Potter", 1234, "Luise", "Publisher1");
        books[1] = new Book1("Environment", 4321, "Issac", "Publisher2");
        books[2] = new Book1("Spiderman", 4231, "Newton", "Publisher3");
        for (int i = 0; i < books.length; i++) {
        System.out.println(books[i].getBookInfo());}
}}

