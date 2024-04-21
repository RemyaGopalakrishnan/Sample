/**
 * 
 */
package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pack.dto.UserDTO;
import pack.jdbc.connections.JdbcConnection;

/**
 * 
 */

public class UserDAO {

	public void saveRegisterUser(UserDTO uesr,String userRegisterQuery) throws ClassNotFoundException, SQLException{
		JdbcConnection userDbConnection=new JdbcConnection();
		Connection mySqlCon = userDbConnection.getMySqlConnection();
		PreparedStatement ps = mySqlCon.prepareStatement(userRegisterQuery);
	    ps.setString(1, uesr.getFirstName());
	    ps.setString(2, uesr.getLastName());
	    ps.setString(3, uesr.getGender());
	    ps.setString(4, uesr.getUserEmail());
	    ps.setString(5, uesr.getMobileNo());
	    ps.setString(6, uesr.getTypeOfDisease());
	    ps.setString(7, uesr.getDoctorName());
	    ps.setString(8, uesr.getRoleOfPerson());
	    ps.setString(9, uesr.getUserName());
	    ps.setString(10, uesr.getPassWord());
	    
	    
	    int count=ps.executeUpdate();
	    System.out.println(count);
	    System.out.println("inserted successfully");
	    
	}
}
//method(query)  {
//getconnection
//query, dto
//execute()