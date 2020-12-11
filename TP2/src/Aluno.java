import java.util.UUID;

public class Aluno {
    private String _endereco;
    private String _nome;
    private int _idade;
    private UUID _uuid;
    
    public UUID getUUID()
    {
        return _uuid;
    }

    public String getEndereco()
    {
        return _endereco;
    };
    public String getNome()
    {
        return _nome;
    };
    public int getIdade()
    {
        return _idade;
    }; 

    public void setEndereco(String endereco)
    {
        _endereco = endereco; 
    }
    public void setNome(String nome)
    {
        _nome = nome; 
    }
    public void setIdade(int idade)
    {
        _idade = idade; 
    }
    public void getUUID(UUID uuid )
    {
        _uuid = uuid;
    }
} 