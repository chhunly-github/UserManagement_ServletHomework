package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.Connection.DbConnection;
import DAO.Interface.IGetData;
import DTO.User;

public class GetAllUser implements IGetData{

	@Override
	public Object get() {
		ArrayList<User> users=new ArrayList<>();
		try {
			Connection cnn=DbConnection.getConnection("postgres");
			Statement st=cnn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM tbuser");
			while(rs.next()){
				int id=rs.getInt("id");
				String username=rs.getString("username");
				String email=rs.getString("email");
				String role=rs.getString("role");
				users.add(new User(id,username,"",email,role));
			}
			System.out.println(users);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			DbConnection.closeConnection();
		}
		return users;

	}
	
}
