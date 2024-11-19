// Import the ArrayList class under the java.util package in order to use the ArrayList class later in the code
import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {

        // Part 3 - Using classes and objects

        // Three GeneralPractitioner objects are created
        GeneralPractitioner G1 = new GeneralPractitioner(1, "Amy", "Dr Amy enjoys the diversity of GP work and is passionate about women and children’s health, skin cancer medicine, sexual health and mental health.", true);
        GeneralPractitioner G2 = new GeneralPractitioner(2, "Jack", "Dr Jack is a highly experienced GP and has been working for 25 years. Dr Jack provides a range of services to his patients including but not limited to chronic disease management and skin cancer checks.", true);
        GeneralPractitioner G3 = new GeneralPractitioner(3, "Jim", "Dr Jim enjoys all aspects of medicine and loves building a rapport with his patient base and community. Special interests include: family health, chronic disease management and heart health.", true);

        // Two Nurse objects are created
        Nurse N1 = new Nurse(4, "Tina", "Tina is originally from the UK. Tina will greet you with a smile and is always good for a laugh. She work in nurse practice and is highly sort after by her patients.", false);
        Nurse N2 = new Nurse(5, "Alina", "Alina is full of love and patience, good at communicating with patients and their families, and establishing a good nurse-patient relationship. She works with attention to detail and always puts the safety and comfort of her patients first.", false);

        // Print details of all objects using methods created in the class
        System.out.println("The health professional details are:");
        G1.printInf();
        G2.printInf();
        G3.printInf();
        N1.printInf();
        N2.printInf();
        System.out.println("--------------------");

        // Part 5 - Collection of appointments

        // An ArrayList is created to store the Appointment class
        ArrayList<Appointment> List = new ArrayList<>();

        // Call the method to make two general practitioner appointments
        createAppointment(List, "Patient1", "10001", "8:00", G1);
        createAppointment(List, "Patient2", "10002", "10:00", G2);

        // Call the method to make two nurse appointments
        createAppointment(List, "Patient3", "10003", "14:30", N1);
        createAppointment(List, "Patient4", "10004", "14:30", N2);

        // Call the method to print existing appointments
        System.out.println("The appointment details are:");
        printExistingAppointments(List);
        System.out.println("--------------------");

        // Call the method to cancel one of the existing appointments
        cancelBooking(List, "10002");

        // Call the method to print again existing appointments to demonstrate the updated collection of appointments
        System.out.println("After canceling a appointment, other appointment details are:");
        printExistingAppointments(List);
        System.out.println("--------------------");
    }

    // Creates a method to create a new appointment
    public static void createAppointment(ArrayList<Appointment> list, String patientName, String phoneNum, String timeSlot, HealthProfessional selectedDoctor) {
        Appointment newAppointment = new Appointment(patientName, phoneNum, timeSlot, selectedDoctor);
        list.add(newAppointment);
    }

    // Creates a method to display the existing appointments in ArrayList
    public static void printExistingAppointments(ArrayList<Appointment> list) {
        if (list.isEmpty()) {
            System.out.println("There is no appointments in the database");
        }
        for (Appointment app : list) {
            app.printInf();
        }
    }

    // Created a method to cancel an appointment using patient's phone number
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
