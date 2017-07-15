/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nafis
 */
public class SoldTimeUpdater {
    
    
    String conString ="jdbc:mysql://localhost:3306/nafis";
    String username ="root";
    String passward ="";
    
    public boolean getToday(String a){
        
        String sql = "SELECT * FROM "+a;
        
        try{
            Connection con= (Connection) DriverManager.getConnection(conString, username, passward);
            
            Statement s =(Statement) con.prepareStatement(sql);
            
            ResultSet rs =s.executeQuery(sql);
            
            
            int qua = 0;
            float sellprice = 0;
            float buyprice = 0;
            while(rs.next()){
                
                
                String quantity = rs.getString(3);
                
                
                String price = rs.getString(4);
                String buy_price = rs.getString(7);
                String type = rs.getString(8);
                
                qua = qua + Integer.parseInt(quantity);
                
                sellprice = sellprice + Integer.parseInt(quantity) * Float.parseFloat(price);
                buyprice = buyprice + Integer.parseInt(quantity) * Float.parseFloat(buy_price);
                
            }
            
            
            Date dNow = new Date( );
                    
            SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd hh:mm:ss");
            String date= ""+ft.format(dNow);
            
            sql="INSERT INTO `nafis`.`soldtime` (`id`, `name`, `quantity`, `sellprice`, `buyprice`, `datetime`) VALUES (NULL, '"+a+"', '"+qua+"', '"+sellprice+"', '"+buyprice+"', '"+date+"')";
            
            try{
                s = (Statement) con.prepareStatement(sql);
                s.execute(sql);
                
            
            }catch(Exception e){
                e.printStackTrace();
                }
            
            
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return false;
    }
    
    
    
}
