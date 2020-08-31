import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoDelete {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott1","tiger1");
			System.out.println("Got the connection");
			String deleteData="delete from employee where empId=?";
			PreparedStatement ps=con.prepareStatement(deleteData);
			ps.setInt(1, 10);
			int deleted=ps.executeUpdate();
			if(deleted>0)
				System.out.println("deleted");
			else
				System.out.println("No record found for deleting");
		     }
			catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}

}
