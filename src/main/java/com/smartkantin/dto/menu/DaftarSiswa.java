package com.smartkantin.dto.menu;

public class DaftarSiswa {
    private int id_siswa;
    private String nama_siswa;
    private int id_ortu;
    private String id_card;
    private String saldo;

    public DaftarSiswa() {
    }

    public DaftarSiswa(int id_siswa, String nama_siswa, int id_ortu, String id_card, String saldo) {
        this.id_siswa = id_siswa;
        this.nama_siswa = nama_siswa;
        this.id_ortu = id_ortu;
        this.id_card = id_card;
        this.saldo = saldo;
    }

    public int getId_siswa() {
        return id_siswa;
    }

    public void setId_siswa(int id_siswa) {
        this.id_siswa = id_siswa;
    }

    public String getNama_siswa() {
        return nama_siswa;
    }

    public void setNama_siswa(String nama_siswa) {
        this.nama_siswa = nama_siswa;
    }

    public int getId_ortu() {
        return id_ortu;
    }

    public void setId_ortu(int id_ortu) {
        this.id_ortu = id_ortu;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    
    
}
