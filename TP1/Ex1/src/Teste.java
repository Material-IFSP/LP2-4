public class Teste {
    public static void main(String[] args) throws Exception {
        /**
         *  Anderson Silva da Conceição 
         *  Renato Santos
         */

        Author author = new Author("anderson", "@email.com", 'm');

        System.out.println("Nome: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Genero: " + author.getGender());

        System.out.println(author.toString());

        author.setEmail("anderson@anderson.com");
        System.out.println("New Email: " + author.getEmail());

        System.out.println("Email: " + author.getEmail());

    }
}
