import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoTransaction {

	public static void main(String[] args) {
		
		//transaction management
		//auto commit

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott1","tiger1");
			con.setAutoCommit(false);
			System.out.println("Got the connection");
			String insertData="insert into employee values('abc',1,1000,'JAVA')";
			Statement st=con.createStatement();
			int row_inserted=st.executeUpdate(insertData);
			if(row_inserted>0){
				con.commit();
				System.out.println("Rows inserted");
			}
			else
				System.out.println("Sorry");
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
