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
    }
}
