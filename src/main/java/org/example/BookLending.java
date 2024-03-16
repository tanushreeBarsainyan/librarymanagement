package org.example;

import java.util.Date;

public class BookLending {
    private Date creationTime;
    private Date dueDate;
    private Date returnDate;
    private String bookItemBarCode;
    private static boolean lendBook(String barcode, String memberId){
        return false;
    }
    private static BookLending fetchLendingDetails(String barcode){
        return null;
    }
}
