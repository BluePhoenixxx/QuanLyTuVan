/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Database;
import Model.TuVan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TuVanDao {
    public List<TuVan> getAll(){
        List<TuVan> ls = new ArrayList<>();
        String sql = "SELECT * FROM tuvan";
        Connection conn = Database.ketNoi();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                TuVan tv = new TuVan();
                tv.setId(rs.getInt(1));
                tv.setHoTen(rs.getString(2));
                tv.setEmail(rs.getString(3));
                tv.setSoDienThoai(rs.getString(4));
                tv.setTinhTrang(rs.getString(5));
                tv.setTime((rs.getTimestamp(6)).toLocalDateTime());
                tv.setCoSO(rs.getString(7));
                tv.setDoiTuong(rs.getString(8));
                ls.add(tv);
            }        
        } catch (Exception e) {
            System.out.println("Loi truy van getAlL "+ e ) ;
        }
        return ls;
    }
    
    public List<String> getListSDT(){
        List<String> ls = new ArrayList<>();
        String sql = "select SODIENTHOAI from tuvan ";
        Connection conn = Database.ketNoi();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ls.add(rs.getString(1).trim());
            }
            
        } catch (Exception e) {
            System.out.println("Loi truy van getListSDT "+ e ) ;
        }
        
        return ls;
    }
    
    
    public void  ThemTuVan(TuVan tv){
        Connection conn = Database.ketNoi();
        String sql = "INSERT INTO [dbo].[TUVAN]\n" +
"           ([HOTEN]\n" +
"           ,[EMAIL]\n" +
"           ,[SODIENTHOAI]\n" +
"           ,[TINHTRANG]\n" +
"           ,[TIME]\n" +
"           ,[COSO]\n" +
"           ,[DOITUONG])\n" +
"     VALUES(?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tv.getHoTen());
            ps.setString(2, tv.getEmail());
            ps.setString(3, tv.getSoDienThoai());
            ps.setString(4, tv.getTinhTrang());
            String localDate;
            ps.setObject(5,  tv.getTime());
            ps.setString(6,tv.getCoSO());
            ps.setString(7,tv.getDoiTuong());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("lỗi " + e);
        }
        
    }
    
    public void  CapNhatTuVan(TuVan tv){
        Connection conn = Database.ketNoi();
        String sql = "UPDATE [dbo].[TUVAN]\n" +
"   SET [HOTEN] = ? \n" +
"      ,[EMAIL] = ? \n" +
"      ,[TINHTRANG] = ? \n" +
"      ,[TIME] = ? \n" +
"      ,[COSO] = ? \n" +
"      ,[DOITUONG] = ? \n" +
" WHERE SODIENTHOAI = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tv.getHoTen());
            ps.setString(2, tv.getEmail());
            ps.setString(7, tv.getSoDienThoai());
            ps.setString(3, tv.getTinhTrang());
            String localDate;
            ps.setObject(4,  tv.getTime());
            ps.setString(5,tv.getCoSO());
            ps.setString(6,tv.getDoiTuong());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("lỗi " + e);
        }
        
    }
    public void deleteTV(int id){
        String sql = "delete from tuvan  where id =?";
        Connection conn = Database.ketNoi();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Loi" + e);
        }
    }
    public void  CapNhatTinhTrang(String SDT , String tt){
        Connection conn = Database.ketNoi();
        String sql = "UPDATE TUVAN   SET  TINHTRANG = ? WHERE SODIENTHOAI = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tt);
            ps.setString(2, SDT);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("lỗi " + e);
        }
        
    }

}
