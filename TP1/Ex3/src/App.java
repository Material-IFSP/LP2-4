public class App {
        /**
         *  Anderson Silva da Conceição 
         *  Renato Santos
         */

    public static void main(String[] args) throws Exception {
        Staff staff = new Staff("Anderson", "Rua do Porto, 46", "IFSP", 0.00);
        Student student = new Student("Renato", "Bolsãozeira", "Só dia 5" , 1993, 0.00 );

        // testando staff
        System.out.println("get school "+ staff.getSchool());
        System.out.println("get pay "+ staff.getPay());

        System.out.println();

        //testando student
        System.out.println("get programa " + student.getProgram());
        System.out.println("get ano "+ student.getYear());
        System.out.println("get taxa " + student.getFee());

        System.out.println();
        // testando toString();
        System.out.println(staff.toString());
        System.out.println(student.toString());


    }
}
