public class TesteBook {

    public static void main(String[] args) throws Exception {

        /*
            * Anderson Silva da Conceição
            * Renato Santos
         */

        Author[] authors = new Author[2];

        authors[0] = new Author("Bahiano de Mauá", "BaianinhoCampeaoSinuca2013@hotmail.com", 'm');
        authors[1] = new Author("Eleson Perigoso", "Eleson_ReiDelas2009@yahoo.com", 'm');

        System.out.println("------------------------//---------------------");

        Book book = new Book("Genere Neutre para Todes", authors, 5.10, 2);

        System.out.println(book);

    }
}
