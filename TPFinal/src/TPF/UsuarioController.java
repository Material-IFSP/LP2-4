package TPF;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioController {
	
	public void AddUser(String nome, int idade, double peso, double altura, String objetivo ){
		
			try {
				
				Connection conn = ConexaoUTIL.getInstance().getConnection();
				
				String sql = "insert into tbUsuario values('"+nome+"', "+ idade+ ","+ peso +", "+ altura +",'"+objetivo+"')";
				
				PreparedStatement statement = conn.prepareStatement(sql);
				
				statement.execute();			
				
				
				conn.close();
				
			}
			catch(Exception e) {
				e.getStackTrace();
			}
			
	}

}
