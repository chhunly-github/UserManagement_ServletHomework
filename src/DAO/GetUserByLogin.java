package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DAO.Connection.DbConnection;
import DAO.Interface.IGetData;
import DTO.User;

public class GetUserByLogin implements IGetData{
	private String name;
	private String password;
	public GetUserByLogin(String name,String password){
		this.name=name;
		this.password=password;
	}
	@Override
	public Object get() {
		
		try(Connection cnn=DbConnection.getConnection("postgres")){
			PreparedStatement ps = cnn.prepareStatement("SELECT * FROM tbuser WHERE username=? AND password=?");
			ps.setString(1, this.name);
			ps.setString(2, this.password);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				return new User(rs.getInt("id"),rs.getString("username"),rs.getString("password"),rs.getString("email"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
