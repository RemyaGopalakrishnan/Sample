package pack.service;


import java.sql.SQLException;

import com.dao.UserDAO;

import pack.dto.UserDTO;

public class UserRegistrationServiceImpl implements UserRegistrationService {

	public void saveRegisterUser(UserDTO user) throws ClassNotFoundException, SQLException {
	    UserDAO userDao=new UserDAO();
	    String userRegisterQuery="insert into Register(fname,lname,gender,email,Mobile_No,type_of_discess,doctor_Name, role_people,username,password) values(?,?,?,?,?,?,?,?,?,?)";
		
	    userDao.saveRegisterUser(user,userRegisterQuery);
	}

	
	/*public void SaveRegisterUser(){
		String query="insert into Register(patient_No,fname,lname,email,Mobile_No,type_of_discess,username,password) values(?,?,?,?,?,?,?,?)";
	}*/
 
//	insert query
//	create object for dao
//	call DAO Method(query)
	
}
	

