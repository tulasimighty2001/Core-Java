package JDBCProject;
import java.sql.*;
import java.sql.ResultSet;
public class Scrollable_ResultSet {
public static void main(String[] args) throws Exception {
Statement st;
Connection con;
ResultSet rs;
System.out.println("driver loaded and registered");
con=DriverManager.getConnection("jdbc:mysql://localhost/mobiles","root","Tulasi@2001");
System.out.println("connection is established");
st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
rs=st.executeQuery("select * from mobile");
rs.first();
int i=rs.getInt(1);
String ss=rs.getString(2);
System.out.println("mid no is"+i);
System.out.println("mname  is"+ss);
rs.absolute(3);
int ii=rs.getInt(1);
String s=rs.getString(2);
System.out.println("mid no is"+ii);
System.out.println("mname  is"+s);
rs.previous();int ij1=rs.getInt(1);
String sss1=rs.getString(2);
System.out.println("mid no is"+ij1);
System.out.println("mname  is"+sss1);
rs.next();int ij=rs.getInt(1);
String sss=rs.getString(2);
System.out.println("mid no is"+ij);
System.out.println("mname  is"+sss);
rs.last();
int ij2=rs.getInt(1);
String sss2=rs.getString(2);
System.out.println("mid no is"+ij2);
System.out.println("mname  is"+sss2);
rs.close();
st.close();
con.close();
}
}

