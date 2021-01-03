public class Pessoa {
    protected static int kp;
    protected String nome;
    protected char sexo;
    protected int idade;

    public Pessoa() {
       this.nome = "";
       this.sexo = 'F';
       this.idade = 0;
       this.kp = 0;
    }
    public Pessoa(String n, char s, int i) {
        this.nome = n;
        this.sexo = s;
        this.idade = i;
    }
    public void setKp(){
        this.kp++;
    }
    public void setNome(String name){
        this.nome = name;
    }
    public void setSexo(char sex){
        this.sexo = sex;
    }
    public void setIdade(int age){
        this.idade = age;
    }

    public int getKp(){

       return this.kp;
    }
    public String getNome(){
        return this.nome;
    }
    public char getSexo(){
        return this.sexo;
    }
    public int getIdade(){
        return this.idade;
    }

}
