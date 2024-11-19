class Appointment{
    // Four instance variables: patientName, phoneNum, timeSlot and selectedDoctor
    String patientName;
    String phoneNum;
    String timeSlot;
    // selectedDoctor this instance variable is based on the previously created class
    HealthProfessional selectedDoctor;

    // Initializes these four instance variables
    public Appointment(String patientName, String phoneNum, String timeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.phoneNum = phoneNum;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Create a method that prints the above instance variable
    public void printInf(){
        System.out.println("Patient Name: " + patientName);
        System.out.println("Phone Number: " + phoneNum);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Selected Doctor: " + selectedDoctor.name + "\n");

    }

    // This method returns the patient's phone number in order to facilitate the patient to cancel the appointment
    public String getPhoneNum(){
        return phoneNum;
    }
}
