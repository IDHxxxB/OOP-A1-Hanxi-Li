import java.util.ArrayList;

//Part 1
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
}

//Part 2
class GeneralPractitioner extends HealthProfessional{
    boolean general;

    public GeneralPractitioner(int id, String name, String information, boolean general) {
        super(id, name, information);
        this.general = general;
    }

    @Override
    public void printInf() {
        super.printInf();
        System.out.println("Whether is it a general practitioner: " + general + "\n");
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
        super.printInf();
        System.out.println("Whether is it a general practitioner: " + general + "\n");
    }
}

//Part 4
class Appointment{
    String name;
    String phoneNum;
    String timeSlot;
    HealthProfessional selectedDoctor;

    public Appointment(String name, String phoneNum, String timeSlot, HealthProfessional selectedDoctor) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    public void printInf(){
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNum);
        System.out.println("Time: " + timeSlot);
        System.out.println("Selected Doctor: " + selectedDoctor.name + "\n");

    }

    public String getPhoneNum(){
        return phoneNum;
    }
}

public class AssignmentOne {
    public static void main(String[] args) {

        //Part 3 - Using classes and objects
        GeneralPractitioner G1 = new GeneralPractitioner(1, "Tom", "I am Tom", true);
        GeneralPractitioner G2 = new GeneralPractitioner(2, "Jack", "I am Jack", true);
        GeneralPractitioner G3 = new GeneralPractitioner(3, "Jim", "I am Lisa", true);
        Nurse N1 = new Nurse(4, "Tina", "I am Tina", false);
        Nurse N2 = new Nurse(5, "Alina", "I am Alina", false);

        System.out.println("The health professional details are:");
        G1.printInf();
        G2.printInf();
        G3.printInf();
        N1.printInf();
        N2.printInf();
        System.out.println("--------------------");

        //Part 5 - Collection of appointment
        ArrayList<Appointment> List = new ArrayList<>();
        createAppointment(List, "Patient1", "10001", "8:00", G1);
        createAppointment(List, "Patient2", "10002", "10:00", N1);
        printExistingAppointments(List);
        cancelBooking(List, "10002");
        printExistingAppointments(List);
        System.out.println("--------------------");
    }

    public static void createAppointment(ArrayList<Appointment> list, String name, String phoneNum, String timeSlot, HealthProfessional selectedDoctor) {
        Appointment newAppointment = new Appointment(name, phoneNum, timeSlot, selectedDoctor);
        list.add(newAppointment);
    }

    public static void printExistingAppointments(ArrayList<Appointment> list) {
        if (list.isEmpty()) {
            System.out.println("There is no appointments in the database");
        }
        for (Appointment app : list) {
            app.printInf();
        }
    }

    public static void cancelBooking(ArrayList<Appointment> list, String phoneNum) {
        boolean found = false;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getPhoneNum().equals(phoneNum)) {
                list.remove(i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println(phoneNum + " could not be found. Can not cancel booking." + "\n");
        }
    }
}
