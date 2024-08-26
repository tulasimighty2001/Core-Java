package JDBCProject;
import java.sql.*;
import java.util.Set;
public class TransactionalControlStatemets {

	public static void main(String[] args) throws Exception {
	Statement st;
	System.out.println("driver loaded and registered");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Bank","root","Tulasi@2001");
	System.out.println("connection is established");
	st=con.createStatement();
	con.setAutoCommit(false);
	try
	{
		st.executeUpdate("update hdfc set balance=10000 where acNumber=124");
		st.executeUpdate("update sbi set balance=20000 where acNumber=123");
		con.commit();
		System.out.println("your transaction is successful");
	}
catch(Exception e)
	{
	con.rollback();
	System.out.println("Bank server is low,please try after sometime");
	}
	con.setAutoCommit(true);
	st.close();
	con.close();
	

	}

}
