/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adeli
 */

public class MainApp {
     public static void main(String[] args) throws SQLException {
        DbConnectionAccountsDatabase.connect();
        
        
        LoginScreen log=new LoginScreen();
        log.setVisible(true);
        
    }
     
     
     //INSERARE UTILIZATOR NOU 
     public static void insert(String Utilizator, String Parola, String Intrebare, String Raspuns,int manager) throws SQLException {
  Connection con = DbConnectionAccountsDatabase.connect();
  PreparedStatement ps = null; 
  try {
    String sql = "INSERT INTO Accounts(Utilizator, Parola,Intrebare, Raspuns, Manager) VALUES(?,?,?,?,?) ";
    ps = con.prepareStatement(sql);
    ps.setString(1, Utilizator);
    ps.setString(2, Parola);
    ps.setString(3, Intrebare);
    ps.setString(4, Raspuns);
    ps.setString(5,String.valueOf(manager));
    ps.execute();
    System.out.println("Data has been inserted!");
  } catch(SQLException e) {
    System.out.println(e.toString());
  
  } finally {
    try{
      ps.close();
      con.close();
    } catch(SQLException e) {
      System.out.println(e.toString());
    }
  }
}
     
     
// INSERARE INFORMATII PROFIL
 
 
   public static int readSpecificRow(String nume) throws SQLException {
    // lets read specific row on the database
    Connection con = DbConnectionAccountsDatabase.connect(); 
    PreparedStatement ps = null; 
    ResultSet rs = null; 
    String utilizator = null;
    try {
      String sql = "Select Utilizator from Accounts";  // Selecteaza utilizatorii din BD
      ps = con.prepareStatement(sql); 
      
      rs = ps.executeQuery(); 
     while(rs.next()){
      // we are reading one row, so no need to loop 
      utilizator = rs.getString(1); 
      if(nume.equals(utilizator))// Verifica daca numele de utilizator exista deja in baza de date
      {
          return -1;
      }
     }
     } catch(SQLException e) {
      System.out.println(e.toString());
    } finally {
      // close connections
      try{
        rs.close(); 
        ps.close();
        con.close(); 
      } catch (SQLException e) {
        // TODO: handle exception
        System.out.println(e.toString());
      }
    }
    return 0;
   }
    
    
    public static int VerifyUser(String nume,String parola,String manager) throws SQLException {
    // lets read specific row on the database
    Connection con = DbConnectionAccountsDatabase.connect(); 
    PreparedStatement ps = null; 
    ResultSet rs = null; 
    String utilizator = null;
    String pass=null;
    String man;
    try {
      String sql = "Select Utilizator,Parola,Manager from Accounts";  // Selecteaza utilizatorii din BD
      ps = con.prepareStatement(sql); 
      rs = ps.executeQuery(); 
     while(rs.next()){
      // we are reading one row, so no need to loop 
      utilizator = rs.getString(1); 
      pass=rs.getString(2);
      man=rs.getString(3);
      if(nume.equals(utilizator))// Verifica daca numele de utilizator exista deja in baza de date
      {
          if(parola.equals(pass))
          {      {

              if(manager.equals(man))
              {
                   
                    return 1;
                    }
          }
          }
      }
     }
     } catch(SQLException e) {
      System.out.println(e.toString());
    } finally {
      // close connections
      try{
        rs.close(); 
        ps.close();
        con.close(); 
      } catch (SQLException e) {
        // TODO: handle exception
        System.out.println(e.toString());
      }
    }
    
    return 0;
  }  
     
     
    
    public static int readAnswer(String nume,String raspunsDat) throws SQLException {
    // lets read specific row on the database
    Connection con = DbConnectionAccountsDatabase.connect(); 
    PreparedStatement ps = null; 
    ResultSet rs = null; 
    String raspuns = null;
    try {
      String sql = "Select Raspuns from Accounts WHERE Utilizator=?";  // Selecteaza utilizatorii din BD
      ps = con.prepareStatement(sql); 
       ps.setString(1, nume);
      rs = ps.executeQuery(); 
     while(rs.next()){
      // we are reading one row, so no need to loop 
      raspuns = rs.getString(1); 
      if(raspuns.equals(raspunsDat))// Verifica daca numele de utilizator exista deja in baza de date
      {
          return 1;
      }
     }
     } catch(SQLException e) {
      System.out.println(e.toString());
    } finally {
      // close connections
      try{
        rs.close(); 
        ps.close();
        con.close(); 
      } catch (SQLException e) {
        // TODO: handle exception
        System.out.println(e.toString());
      }
    }
    return 0;
   }
     
    public static String getQuestion(String nume) throws SQLException {
    // lets read specific row on the database
    Connection con = DbConnectionAccountsDatabase.connect(); 
    PreparedStatement ps = null; 
    ResultSet rs = null; 
    String raspuns = null;
    try {
      String sql = "Select Intrebare from Accounts WHERE Utilizator=?";  // Selecteaza utilizatorii din BD
      ps = con.prepareStatement(sql); 
       ps.setString(1, nume);
      rs = ps.executeQuery(); 
     while(rs.next()){
      // we are reading one row, so no need to loop 
      raspuns = rs.getString(1); 
      return raspuns;
     }
     } catch(SQLException e) {
      System.out.println(e.toString());
    } finally {
      // close connections
      try{
        rs.close(); 
        ps.close();
        con.close(); 
      } catch (SQLException e) {
        // TODO: handle exception
        System.out.println(e.toString());
      }
    }
    return null;
   }
    
    
  
    public static void updatePassword(String user,String newPassword) throws SQLException {
    // we will update only first name of a certain row
    Connection con = DbConnectionAccountsDatabase.connect(); 
    PreparedStatement ps = null; 
    try {
      String sql = "UPDATE Accounts set Parola = ? WHERE Utilizator = ? ";
      ps = con.prepareStatement(sql); 
      ps.setString(1, newPassword);
      ps.setString(2, user);
      ps.execute();
      System.out.println("Data has been updated");
    } catch (SQLException e) {
      // TODO: handle exception
      System.out.println(e.toString());
    }
  }}
    
    