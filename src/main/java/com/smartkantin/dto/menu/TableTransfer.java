package com.smartkantin.dto.menu;

public class TableTransfer {
    private int id_transfer;
    private String nama_wali;
    private String id_card;
    private String total;
    private String bukti;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setAksi(String status) {
        this.status = status;
    }

    public TableTransfer() {
    }

    public TableTransfer(int id_transfer, String nama_wali, String id_card, String total, String bukti) {
        this.id_transfer = id_transfer;
        this.nama_wali = nama_wali;
        this.id_card = id_card;
        this.total = total;
        this.bukti = bukti;
    }

    public int getId_transfer() {
        return id_transfer;
    }

    public String getNama_wali() {
        return nama_wali;
    }

    public String getId_card() {
        return id_card;
    }

    public String getTotal() {
        return total;
    }

    public String getBukti() {
        return bukti;
    }

    public void setId_transfer(int id_transfer) {
        this.id_transfer = id_transfer;
    }

    public void setNama_wali(String nama_wali) {
        this.nama_wali = nama_wali;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setBukti(String bukti) {
        this.bukti = bukti;
    }
    
    
}
