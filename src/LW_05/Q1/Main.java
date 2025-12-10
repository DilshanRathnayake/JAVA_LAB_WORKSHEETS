package LW_05.Q1;

public class Main {
    public static void main(String[] args) {


        Library library = new Library();

        Book b1 = new Book("Seena Maragatham","Sujatha Thilaka","9789553023975");
        Book b2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala","Seynamasasekaka","9789553548721");
        Book b3 = new Book("Island of a Thousand Mirrors","Nayomi Munaweera","9781616953623");


        library.addLibraryItem(b1);
        library.addLibraryItem(b2);
        library.addLibraryItem(b3);

        library.displayLibraryInfo();
        library.displayLibraryInfo();

        System.out.println("\n--------Checking out a book--------");
        library.checkItems("Island of a Thousand Mirrors");

        library.listAvailableItems();



    }
}
