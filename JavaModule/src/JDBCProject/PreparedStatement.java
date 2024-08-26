
	package JDBCProject;
import java.sql.Connection;
import java.sql.DriverManager;
	public class PreparedStatement {

		public static void main(String[] args) throws Exception {
	
	Connection con;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("drivewr loaded and register");
			con=DriverManager.getConnection("jdbc:mysql://localhost/mobiles","root","Tulasi@2001");
			System.out.println("connection is establised"); 
			java.sql.PreparedStatement ps=con.prepareStatement("update mobile set mname=(?) where mid=(?)");
			ps.setString(1,"nokia");
			ps.setInt(2,10);
			int val=ps.executeUpdate();
			System.out.println("updated rows are"+val);
			ps.close();
			con.close();
		   	
		}
	}