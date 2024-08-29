package com.neoteric.javafullstack.model;

import java.sql.*;

public class EmployeeDBService {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://@localhost:3306/tarun","root","root");
            Statement stmt= con.createStatement();
            ResultSet rs= stmt.executeQuery("select * from tarun.employee");
            while (rs.next()){
               String name= rs.getString("name");
               String empId= rs.getString("empId");
               String salary=rs.getString("salary");
               String designation=rs.getString("designation");

                System.out.println(" name "+name+" empId "+empId+" salary "+salary+" designation "+designation);
            }
        } catch (Exception e) {
            System.out.println("DriverException"+e);
        }
    }
}
