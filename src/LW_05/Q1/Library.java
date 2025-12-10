package LW_05.Q1;


import java.util.ArrayList;

public class Library {

    private final ArrayList<BorrowableItems> BorrowableItemsList;

    public Library() {
        BorrowableItemsList = new ArrayList<>();
    }

    public void addLibraryItem(BorrowableItems items){
        BorrowableItemsList.add(items);
    }


    public void checkItems(String title){
        for(BorrowableItems item : BorrowableItemsList){
            if(item instanceof Book){
                Book book = (Book) item;
                if(book.getTitle().equalsIgnoreCase(title)){
                    book.setAvailable(false);
                    System.out.println(book.getTitle() + " checked out.");
                }
            }
        }
    }


    public void listAvailableItems(){
        System.out.println("\nAvailable Books: ");
        for (BorrowableItems items : BorrowableItemsList){
            if(items instanceof Book && ((Book) items).isAvailable()){
                items.displayInfo();
            }
        }
    }

    public void displayLibraryInfo(){
        int availableCount = 0;
        for(BorrowableItems items : BorrowableItemsList){
            if(items instanceof  Book && ((Book) items).isAvailable()){
                availableCount++;
            }
        }
        System.out.println("\nTotal Items Available : " + BorrowableItemsList.size());
        System.out.println("\nAvailable Books : " + availableCount);
    }




}
