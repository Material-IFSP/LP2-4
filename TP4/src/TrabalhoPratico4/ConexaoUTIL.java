package TrabalhoPratico4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	
}
