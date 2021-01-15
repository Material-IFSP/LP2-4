package TPF;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
	
	public List<UsuarioDTO> getAllUser(){
		ArrayList<UsuarioDTO> listUser = new ArrayList<UsuarioDTO>();
			try {
				
				Connection conn = ConexaoUTIL.getInstance().getConnection();
				
				String sql = "SELECT * FROM tbUsuario";
				
				PreparedStatement statement = conn.prepareStatement(sql);
				
				ResultSet resultset = statement.executeQuery();
				
				while(resultset.next())
				{
					UsuarioDTO users = new UsuarioDTO();					
					users.setNome(resultset.getString("nome"));
					users.setIdade(resultset.getInt("idade"));
					users.setPeso(resultset.getFloat("peso"));
					users.setAltura(resultset.getFloat("altura"));
					users.setObjetivo(resultset.getString("objetivo"));
					
					listUser.add(users);					
				}
				
				conn.close();
				
			}
			catch(Exception e) {
				e.getStackTrace();
			}
			
			
			
			return listUser;
	}

}
