package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.Connection.DbConnection;
import DAO.Interface.IInsertData;
import DTO.User;

public class InsertNewUser implements IInsertData{

	@Override
	public boolean insert(Object object) {
		try(Connection cnn=DbConnection.getConnection("postgres")){
			User user=(User)object;
			String sql="INSERT INTO tbuser(username,password,email,role) VALUES(?,?,?,?);";
			PreparedStatement ps=cnn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getRole());
			if(ps.executeUpdate()>=1){
				System.out.println("success");
				return true;
			}
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
