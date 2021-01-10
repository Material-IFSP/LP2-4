package TrabalhoPratico4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUTIL {

	private static ConexaoUTIL conexaoUtil;
	
	public static ConexaoUTIL getInstance() {
		if(conexaoUtil == null)
		{
			conexaoUtil = new ConexaoUTIL();
		}
		return conexaoUtil;
	}
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/aulajava?useTimezone=true&serverTimezone=UTC", "root", "admin");		
	}
	public static void main(String[]args) {
		try {
			System.out.println(getInstance().getConnection());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
