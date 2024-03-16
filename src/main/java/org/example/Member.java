package org.example;

import java.util.Date;

public class Member extends Account{
    private Date dateOfMembership;
    private int totalBooksCheckedOut;
    private int getTotalBooksCheckedOut(){
        return totalBooksCheckedOut;
    }
    private boolean reserveBookItem(BookItem bookItem){
      return false;
    };
    private boolean reserveBookItem(BookItem bookItem){
        return false;
    }
    private boolean checkoutBookItem(BookItem bookItem){
        if(this.getTotalBooksCheckedOut() >= Constants.MAX_BOOKS_ISSUED_TO_A_USER){
            ShowError("Max limit of books exceeded");
            return false;
        }
        BookReservation bookReservation = new BookReservation();
        if(bookReservation != null && bookReservation.getMemberId() != this.getId()){
            ShowError("REserved by another member");
            return false;
        }else if(bookReservation != null){
            bookReservation.updateStatus(ReservationStatus.COMPLETED);
        }
        if(!bookItem.checkout(this.getId())){
            return false;

        }
        this.incrementTotalBooksCheckedOut();
        return true;
    }
    private void ShowError(String message){
        System.out.println(message);
    }
}
