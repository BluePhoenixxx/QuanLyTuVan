/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ADMIN
 */
public class ChuanHoaHoTen {
    public static String chuanHoaTen(String ten) {
        if (ten == null || ten.isEmpty()) {
            return ten;
        }
        String[] mangTu = ten.split("\\s+");
        StringBuilder ketQua = new StringBuilder();
        for (String tu : mangTu) {
            if (tu.length() > 0) {
                ketQua.append(Character.toUpperCase(tu.charAt(0)));
                if (tu.length() > 1) {
                    ketQua.append(tu.substring(1).toLowerCase());
                }
                ketQua.append(" ");
            }
        }
         return ketQua.toString().trim();
    }
}
