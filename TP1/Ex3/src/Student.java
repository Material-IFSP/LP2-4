public class Student extends Person
 {
        /**
         *  Anderson Silva da Conceição 
         *  Renato Santos
         */
    private String _program;
    private int _year;
    private double _fee;

    public Student(String name, String address, String program, int year,double fee) {
        super(name, address);
        _program = program;
        _year = year;
        _fee = fee;        
    }

    public double getFee() {
        return _fee;
    }

    public void setFee(double _fee) {
        this._fee = _fee;
    }

    public int getYear() {
        return _year;
    }

    public void setYear(int _year) {
        this._year = _year;
    }

    public String getProgram() {
        return _program;
    }

    public void setProgram(String _program) {
        this._program = _program;
    }

    @Override
    public String toString() {
        return "[Person[name=" + getName() + ",address=" + getAddress() + "],program="+ this._program + ",year="+ this._year + ",fee="+ this._fee+"]";
    }
}
