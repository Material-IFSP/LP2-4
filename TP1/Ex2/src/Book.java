public class Book {
        /**
         *  Anderson Silva da Conceição 
         *  Renato Santos
         */
    private String name;
    private double price;
    private Author[] author;
    private int qty = 0;

    public Book(String varNome, Author[] varAuthor, double varPrice) {
        name = varNome;
        price = varPrice;
        author = varAuthor;
    }

    public Book(String varNome, Author[] varAuthor, double varPrice, int varQty) {
        name = varNome;
        price = varPrice;
        author = varAuthor;
        qty = varQty;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public Author[] getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQty() {
        return this.qty;
    }

    public String getAuthorNames() {

        String aux = "";
        for (int i = 0; i < author.length; i++) {
            aux = aux + this.author[i] + ", ";
        }
        return aux;
    }

    // Setters
    public void setPrice(double varPrice) {
        this.price = varPrice;
    }

    public void setQty(int varQty) {
        this.qty = varQty;
    }

    // Override toString Method
    @Override
    public String toString() {
        String aux = "Instância ";
        for (int i = 0; i < author.length; i++) {
            aux = aux + (i+1) + ", Book[name=" + this.name + ", authors=" + this.author[i] + ", price= " + this.price + ", qty="
                    + this.qty + "] | \n";
        }
        return aux;
    }

}
