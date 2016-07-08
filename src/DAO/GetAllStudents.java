package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import DAO.Connection.DbConnection;
import DAO.Interface.IGetData;
import DTO.Student;


public class GetAllStudents implements IGetData{

	@Override
	public Object get() {
		ArrayList<Student> students=new ArrayList<>();
		try {
			Connection cnn=DbConnection.getConnection("dbstudent");
			Statement st=cnn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM tbstudent");
			while(rs.next()){
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				float score=Float.parseFloat(rs.getString("score"));
				students.add(new Student(id,name,gender,score));
			}
			System.out.println(students);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			DbConnection.closeConnection();
		}
		return students;
	}

}
