class HealthProfessional {
    int id;
    String name;
    String information;

    public HealthProfessional(int id, String name, String information) {
        this.id = id;
        this.name = name;
        this.information = information;
    }

    public void printInf(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Information: " + information);
    }

    public void getName(){
        System.out.println(name);
    }

    public void setName(String name){
        this.name = name;
    }
}
//Part One

class GeneralPractitioner extends HealthProfessional{
    boolean general;

    public GeneralPractitioner(int id, String name, String information, boolean general) {
        super(id, name, information);
        this.general = general;
    }

    @Override
    public void printInf() {
        System.out.println("Information for health professionals is as follows:");
        super.printInf();
        System.out.println("Is it a general practitioner: " + general + "\n");
    }
}

class Nurse extends HealthProfessional{
    boolean general;

    public Nurse(int id, String name, String information, boolean general) {
        super(id, name, information);
        this.general = general;
    }

    @Override
    public void printInf() {
        System.out.println("Information for health professionals is as follows:");
        super.printInf();
        System.out.println("Is it a general practitioner: " + general + "\n");
    }
}
//Part Two

public class AssignmentOne {
    public static void main(String[] args) {
        int idValue = 1;
        String nameValue = "Tom";
        String detailValue = "None";
        HealthProfessional doctor = new HealthProfessional(idValue, nameValue, detailValue);

        doctor.printInf();
        doctor.getName();
        doctor.setName("Jack");
        doctor.getName();

        GeneralPractitioner G1 = new GeneralPractitioner(1, "Tom", "Professional", true);
        G1.printInf();

        Nurse N1 = new Nurse(2, "Tina", "Beautiful", false);
        N1.printInf();

        G1.getName();
        G1.setName("Gigi");
        G1.getName();
    }
}
