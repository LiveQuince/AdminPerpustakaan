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
     private static koneksiDatabase instance;
    private Connection koneksi;
   
    private koneksiDatabase(){
        String url= "jdbc:mysql://localhost:3306/perpustakaantercinta";
        String username = "root";
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.koneksi = DriverManager.getConnection(url, username, password);
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
         }
    }
    
    public static koneksiDatabase getInstance(){
        if(instance == null){
            instance = new koneksiDatabase();
        }
        return instance;
    }
    
    public Connection getConnection(){
        return koneksi;
    }
}
