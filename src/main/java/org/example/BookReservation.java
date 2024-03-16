package org.example;

import java.util.Date;

public class BookReservation {
    private Date createTime;
    private ReservationStatus reservationStatus;
    private String bookItemBarcode;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public String getBookItemBarcode() {
        return bookItemBarcode;
    }

    public void setBookItemBarcode(String bookItemBarcode) {
        this.bookItemBarcode = bookItemBarcode;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    private String memberId;
    public static BookReservation fetchReservationDetails(String barcode){
        return null;
    }
}
