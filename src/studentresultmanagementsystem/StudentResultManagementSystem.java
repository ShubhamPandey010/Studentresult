/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentresultmanagementsystem;

import java.io.IOException;

/**
 *
 * @author Shubh
 */
public class StudentResultManagementSystem {

    /**
     * @param args the command line arguments
     */
  public void func() throws ClassNotFoundException{
      Class.forName("com.mysql.jdbc.Drver");
      
  }  
  
  public static void main(String args[]) throws ClassNotFoundException{  
      StudentResultManagementSystem obj = new StudentResultManagementSystem();
      try{
          obj.func();
      }
      catch(Exception e){
          System.out.print("Error Occured");
      }
  }
}
