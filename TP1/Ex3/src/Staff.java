public class Staff extends Person {
        /**
         *  Anderson Silva da Conceição 
         *  Renato Santos
         */
    private String _school;
    private double _pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        _school = school;
        _pay = pay;
    } 



    public double getPay() {
        
        return _pay;
    }

    public void setPay(double _pay) {
        this._pay = _pay;
    }

    public String getSchool() {
        return _school;
    }

    public void setSchool(String _school) {
        this._school = _school;
    }

    @Override
    public String toString() {
        return "[Person[name=" + getName()+ ",address=" + getAddress() + "],school="+ this._school + ",pay="+ this._pay +"]";
    }
}
