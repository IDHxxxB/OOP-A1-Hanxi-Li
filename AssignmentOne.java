import java.util.ArrayList;

//Part 1 - Base class
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

//Part 2 - Child classes
class GeneralPractitioner extends HealthProfessional{
    boolean whetherGeneral;

    public GeneralPractitioner(int id, String name, String information, boolean whetherGeneral) {
        super(id, name, information);
        this.whetherGeneral = whetherGeneral;
    }

    @Override
    public void printInf() {
        super.printInf();
        System.out.println("Whether is a general practitioner: " + whetherGeneral + "\n");
    }
}

class Nurse extends HealthProfessional{
    boolean whetherGeneral;

    public Nurse(int id, String name, String information, boolean whetherGeneral) {
        super(id, name, information);
        this.whetherGeneral = whetherGeneral;
    }

    @Override
    public void printInf() {
        super.printInf();
        System.out.println("Whether is a general practitioner: " + whetherGeneral + "\n");
    }
}

//Part 4 - Class Appointment
class Appointment{
    String patientName;
    String phoneNum;
    String timeSlot;
    HealthProfessional selectedDoctor;

    public Appointment(String patientName, String phoneNum, String timeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.phoneNum = phoneNum;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    public void printInf(){
        System.out.println("Patient Name: " + patientName);
        System.out.println("Phone Number: " + phoneNum);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Selected Doctor: " + selectedDoctor.name + "\n");

    }

    public String getPhoneNum(){
        return phoneNum;
    }
}

public class AssignmentOne {
    public static void main(String[] args) {

        //Part 3 - Using classes and objects
        GeneralPractitioner G1 = new GeneralPractitioner(1, "Amy", "Dr Amy enjoys the diversity of GP work and is passionate about women and children’s health, skin cancer medicine, sexual health and mental health.", true);
        GeneralPractitioner G2 = new GeneralPractitioner(2, "Jack", "Dr Jack is a highly experienced GP and has been working for 25 years. Dr Jack provides a range of services to his patients including but not limited to chronic disease management and skin cancer checks.", true);
        GeneralPractitioner G3 = new GeneralPractitioner(3, "Jim", "Dr Jim enjoys all aspects of medicine and loves building a rapport with his patient base and community. Special interests include: family health, chronic disease management and heart health.", true);
        Nurse N1 = new Nurse(4, "Tina", "Tina is originally from the UK. Tina will greet you with a smile and is always good for a laugh. She work in nurse practice and is highly sort after by her patients.", false);
        Nurse N2 = new Nurse(5, "Alina", "Alina is full of love and patience, good at communicating with patients and their families, and establishing a good nurse-patient relationship. She works with attention to detail and always puts the safety and comfort of her patients first.", false);

        System.out.println("The health professional details are:");
        G1.printInf();
        G2.printInf();
        G3.printInf();
        N1.printInf();
        N2.printInf();
        System.out.println("--------------------");

        //Part 5 - Collection of appointments
        ArrayList<Appointment> List = new ArrayList<>();

        createAppointment(List, "Patient1", "10001", "8:00", G1);
        createAppointment(List, "Patient2", "10002", "10:00", G2);
        createAppointment(List, "Patient3", "10003", "14:30", N1);
        createAppointment(List, "Patient4", "10004", "14:30", N2);

        System.out.println("The appointment details are:");
        printExistingAppointments(List);
        System.out.println("--------------------");

        cancelBooking(List, "10002");

        System.out.println("After canceling a appointment, other appointment details are:");
        printExistingAppointments(List);
        System.out.println("--------------------");
    }

    public static void createAppointment(ArrayList<Appointment> list, String patientName, String phoneNum, String timeSlot, HealthProfessional selectedDoctor) {
        Appointment newAppointment = new Appointment(patientName, phoneNum, timeSlot, selectedDoctor);
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
