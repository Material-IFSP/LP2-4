public class Author {

    /**
     * Anderson Silva da Conceição 
     * Renato Santos
     */
    private String name;
    private String email;
    private char gender = 'm' | 'f';

    public Author(String n, String e, char g) {

        try {
            error(g);
            name = n;
            email = e;
            gender = g;
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGender() {
        return this.gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private void error(char g) throws Exception {
        if (g != 'm' && g != 'f') {
            this.name = "";
            this.email = "";
            this.gender = ' ';
            throw new Exception("é necessário que seja 'm' ou 'f'");
        }
        ;
    }

    @Override
    public String toString() {
        return "Author[name=" + this.name + ",email=" + this.email + ",gender=" + this.gender + "]";
    }

}