public class Main {
    public static void main(String[] args) {
        // test your program here
        Library library = new Library();
        
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        library.addBook(cheese);
        
        System.out.println(cheese);
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());
        System.out.println("");
        
        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        library.addBook(nhl);
        
        library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
        
         library.printBooks();
    }
}
