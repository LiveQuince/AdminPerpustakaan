/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adminperpus;

import java.sql.*;

/**
 *
 * @author User
 */
public class koneksiDatabase {
    String url= "jdbc:mysql://localhost:3306/perpustakaaan";
        String username = "root";
        String password = "";
 public void koneksi(){ 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection(url, username, password);
            Statement st = koneksi.createStatement();
    
            st.close();
            koneksi.close();
                System.out.println("Koneksi Ditutup...");
   
        }
        catch (ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
         }
     }
}
