import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.Employee;

public class DemoUpdate {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott1","tiger1");
			System.out.println("Got the connection");
			String updateData="update employee set empName=? where empId=?";
			PreparedStatement ps=con.prepareStatement(updateData);
			ps.setString(1,"sai");
			ps.setInt(2, 10);
			int updated=ps.executeUpdate();
			if(updated>0)
				System.out.println("updated");
			else
				System.out.println("No record found for updating");
		     }
			catch (ClassNotFoundException|SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
