package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.Connection.DbConnection;
import DAO.Interface.IGetData;
import DTO.User;

public class GetUserById implements IGetData{
	private int id;
	public GetUserById(int id){
		this.id=id;
	}
	@Override
	public Object get() {
		try(Connection cnn=DbConnection.getConnection("postgres")){
			PreparedStatement ps = cnn.prepareStatement("SELECT * FROM tbuser WHERE id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				return new User(rs.getInt("id"),rs.getString("username"),rs.getString("password"),rs.getString("email"),rs.getString("role"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
