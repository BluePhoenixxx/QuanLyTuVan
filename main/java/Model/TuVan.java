/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class TuVan {
    private String hoTen, soDienThoai, email, doiTuong, coSO, tinhTrang;
    private int id;
    private LocalDateTime time;

    public TuVan(String hoTen, String soDienThoai, String email, String doiTuong, String coSO, String tinhTrang, int id, LocalDateTime time) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.doiTuong = doiTuong;
        this.coSO = coSO;
        this.tinhTrang = tinhTrang;
        this.id = id;
        this.time = time;
    }

    public TuVan() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public String getCoSO() {
        return coSO;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public void setCoSO(String coSO) {
        this.coSO = coSO;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    
    
}
