package org.example;

import java.sql.*;
import java.util.Scanner;

public class jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc=new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Rutuja@123");

        //**************************************insert*****************************************
//        PreparedStatement ps=con.prepareStatement("insert into bankdetails values(?,?)");
//        System.out.println("Enter the Bank name which you want to insert:");
//        String Name=sc.nextLine();
//
//        System.out.println("enter bank id:");
//        int id=sc.nextInt();
//
//        ps.setString(1,Name);
//        ps.setInt(2,id);
//
//        int i=ps.executeUpdate();
//        if(i>0){
//            System.out.println("sucess.");
//
//        }else{
//            System.out.println("false");
//        }


        //*******************update***************************
//        System.out.println("Enter the name of bank which you wants to update:");
//        String Name1=sc.nextLine();
//        System.out.println("Enter id where you wants to update the bank name:");
//        int id1=sc.nextInt();
//
//        PreparedStatement pt=con.prepareStatement("update bankdetails set Name=? where id=?");
//          pt.setString(1,Name1);
//        pt.setInt(2,id1);
//        int j=pt.executeUpdate();
//        if(j>0){
//            System.out.println("sucess");
//        }else{
//            System.out.println("fail");
//        }

        //****************delete***********************
//        PreparedStatement p1=con.prepareStatement("delete from bankdetails where Name=?");
//        System.out.println("enter the bank name which you want to delete");
//        String name=sc.nextLine();
//        p1.setString(1,name);
//        int count=p1.executeUpdate();
//        if(count>0){
//            System.out.println("data successfully deleted");
//        }else{
//            System.out.println("Failure");
//        }

        //fetch all data
PreparedStatement ps2=con.prepareStatement("select*from bankdetails");
      ResultSet i= ps2.executeQuery();
     while(i.next()){
         System.out.println(i.getString("Name")+"\t"+i.getInt("id"));
     }

    }
}
