class HealthProfessional {
    // Three instance variables: id, name and information
    int id;
    String name;
    String information;

    // Initializes these three instance variables
    public HealthProfessional(int id, String name, String information) {
        this.id = id;
        this.name = name;
        this.information = information;
    }

    // Create a method that prints the above instance variable
    public void printInf(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Information: " + information);
    }
}
