public class Employee {

    private String id;
    private String name;
    private int salary;

    public Employee(String name, String id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(String id) {
        id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raisedSalary(int percent){
        double p = ((double) percent /100);
        salary= (int) (salary+(salary*p));
        return salary;
    }

    public String toString(){
        return ("Name: "+getName()+"\nID: "+getId()+"\nSalary: "+getSalary());
    }
}
