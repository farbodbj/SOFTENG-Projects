package model;

public class Worker extends Person {
    private final int idnumber;
    private int baseSalary;
    private int complements;

    public Worker(int IDNumber, String name, int baseSalary, int complements) {
        super(name);
        this.idnumber = IDNumber;
        this.baseSalary = baseSalary;
        this.complements = complements;
    }

    public int getIdnumber() {
        return idnumber;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getComplements() {
        return complements;
    }
    public void setComplements(int complements) {
        this.complements = complements;
    }
}
