package student.marks.webapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import student.marks.webapp.dto.StudentDto;

public class MarksRepositry {

	public Connection getConnect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection	con=DriverManager.getConnection("jdbc:mysql://localhost/employees","root","Tulasi@2001");
	return con;
	}
	
	
	public String saveData(StudentDto dto) throws ClassNotFoundException, SQLException {
		PreparedStatement ps=getConnect().prepareStatement("insert into students values(?,?,?,?,?,?,?,?)");
		ps.setInt(1,dto.getId());
		ps.setString(2,dto.getName());
		ps.setInt(3,dto.getEnglish());
		ps.setInt(4,dto.getMaths());
		ps.setInt(5,dto.getSciense());
		ps.setInt(6,dto.getResult());
		ps.setDouble(7,dto.getPercentage());
		ps.setString(8,dto.getGrade());
		ps.executeUpdate();
		return dto.getName() + " is saved sucessfully";
		
	}
	public List<StudentDto> getAll() throws ClassNotFoundException, SQLException{
		List<StudentDto> all=new ArrayList<StudentDto>();
		PreparedStatement ps=getConnect().prepareStatement("select * from students");
		ResultSet rs=ps.executeQuery();
		
		
		while(rs.next()) {
			StudentDto dto=new StudentDto();
			dto.setId(rs.getInt(1));
			dto.setName(rs.getString(2));
			dto.setEnglish(rs.getInt(3));
			dto.setMaths(rs.getInt(4));
			dto.setSciense(rs.getInt(5));
			dto.setResult(rs.getInt(6));
			dto.setPercentage(rs.getDouble(7));
			dto.setGrade(rs.getString(8));
			all.add(dto);
		}
		return all;
	}
}
