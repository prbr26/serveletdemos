package jdbcbasics;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement =  null;
		ResultSet rs = null;
		try {
			 connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb1","root","root");
			statement = connection.createStatement();
			rs = statement.executeQuery("select * from account");
			while(rs.next()) {
				int acctno = rs.getInt(1);
				String lastname = rs.getString(2);
				String firstname = rs.getString(3);
				double balance = rs.getDouble(4);
				System.out.println(acctno+"|"+lastname+"|"+firstname+"|"+balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
