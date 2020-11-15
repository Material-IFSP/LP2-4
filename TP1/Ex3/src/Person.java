public class Person {
        /**
         *  Anderson Silva da Conceição 
         *  Renato Santos
         */
    private String _name;
    private String _address;

    public Person(String name, String address) {
        _name = name;
        _address = address;
    }
   
    public String getName() {
        return _name;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;
    }

    @Override
    public String toString() {       
        return "[Person[name=" + this._name + ",address=" + this._address + "]";
    }

}
