    package JDBCProject;
	import java.sql.*;
		public class BatchUpdateStatement {

			public static void main(String[] args) throws Exception {
		Statement st;
		Connection con;
				//Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("drivewr loaded and register");
				con=DriverManager.getConnection("jdbc:mysql://localhost/mobiles","root","Tulasi@2001");
				System.out.println("connection is establised");
				st=con.createStatement();
				System.out.println("connection is successful");
			for(int a=1;a<=50;a++)
			st.addBatch("insert into mobile values(2,'redmi')");
				st.execute("delete from mobile where mid=1");
				int arr1[]=st.executeBatch();
				System.out.println("execution is successful");
				System.out.println("number of rows:"+arr1.length);
				st.close();
				con.close();
				
			}
		}


