package LW_03.Q5;

import java.util.ArrayList;
import  java.util.List;

class Library {

    private List<BorrowableItems> borrowableItemsList = new ArrayList<>();

    public void addLibraryItems(BorrowableItems items){
        if(items != null){
            borrowableItemsList.add(items);
            System.out.println("Item added to Library");
        }
    }

    public boolean checkoutItembyISBN(String isbn){
        for(BorrowableItems items : borrowableItemsList){
            if(items instanceof Book){
                Book book = (Book) items;
                if (isbn.equals(book.getISBN()) && book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Checked out: " + book.getTitle());
                    return true;
                }
            }
        }

        System.out.println("Book not found or unavailable.");
        return false;
    }

    public void listAvailableItems(){
        System.out.println("\nAvailable Library Items:");
        for (BorrowableItems items : borrowableItemsList){
            if (items instanceof Book){
                Book book = (Book) items;
                if(book.isAvailable()){
                    book.displayInfo();

                }
            }
        }
    }

    public void displayLibraryInfo(){
        int total = borrowableItemsList.size();
        int availableCount = 0;
        for(BorrowableItems items : borrowableItemsList){
            if(items instanceof Book){
                Book book = (Book) items;
                if(book.isAvailable()){
                    availableCount++;
                }
            }
        }

        System.out.println("\nTotal items: " + total);
        System.out.println("Available items: " + availableCount);
    }








}


