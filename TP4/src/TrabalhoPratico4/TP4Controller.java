package TrabalhoPratico4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TP4Controller {
	
	public List<FuncionarioDTO> getFuncByName(String name){
		ArrayList<FuncionarioDTO> listFunc = new ArrayList<FuncionarioDTO>();
			try {
				
				Connection conn = ConexaoUTIL.getInstance().getConnection();
				
				String sql = "SELECT * FROM tbFuncs WHERE nome_Func like '%"+name+"%'";
				
				PreparedStatement statement = conn.prepareStatement(sql);
				
				ResultSet resultset = statement.executeQuery();
				
				while(resultset.next())
				{
					FuncionarioDTO func = new FuncionarioDTO();
					func.setId(resultset.getInt("cod_Func"));
					func.setNome(resultset.getString("nome_Func"));
					func.setSalario(resultset.getDouble("sal_Func"));
					func.setCargo(resultset.getInt("cod_Cargo"));
					
					listFunc.add(func);					
				}
				
				conn.close();
				
			}
			catch(Exception e) {
				e.getStackTrace();
			}
			
			
			
			return listFunc;
	}
	public String getCargobyId(int id){
		CargoDTO carg = new CargoDTO();
		
			try {
				
				Connection conn = ConexaoUTIL.getInstance().getConnection();
				
				String sql = "Select ds_cargo from tbCargos where cd_cargo = " + id;
				
				PreparedStatement statement = conn.prepareStatement(sql);
				
				ResultSet resultset = statement.executeQuery();
				
				while(resultset.next())
				{
					 carg.setDescricaoCargo(resultset.getString("ds_cargo"));								
				}
				
				conn.close();
				
			}
			catch(Exception e) {
				e.getStackTrace();
			}
			
			return carg.DescricaoCargo;
	}
}
