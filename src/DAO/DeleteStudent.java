package DAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

import DAO.Connection.DbConnection;
import DAO.Interface.IManipulateData;

public class DeleteStudent implements IManipulateData {
	private int id;
	public DeleteStudent(int id){
		this.id=id;
	}
	@Override
	public boolean execute() {
		try {
			Connection con=DbConnection.getConnection("dbstudent");
			PreparedStatement pst=con.prepareStatement("DELETE FROM tbstudent WHERE id=?");
			pst.setInt(1, id);
			int i=pst.executeUpdate();
			if(i>0)
				return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			DbConnection.closeConnection();
		}
		return false;
	}
}
