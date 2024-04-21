package pack.service;

import java.sql.SQLException;

import pack.dto.UserDTO;

public interface UserRegistrationService {
   public void saveRegisterUser(UserDTO uesr) throws ClassNotFoundException, SQLException;
}
