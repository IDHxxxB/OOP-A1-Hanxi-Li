class GeneralPractitioner extends HealthProfessional{
    // An instance variable that distinguishes whether it is a general practitioner or not
    boolean whetherGeneral;

    // Inherits an instance variable from the parent class and initializes the instance variable
    public GeneralPractitioner(int id, String name, String information, boolean whetherGeneral) {
        super(id, name, information);
        this.whetherGeneral = whetherGeneral;
    }

    // On the basis of the parent class method, an output information that distinguishes whether it is a general practitioner is added
    @Override
    public void printInf() {
        super.printInf();
        System.out.println("Whether is a general practitioner: " + whetherGeneral + "\n");
    }
}
