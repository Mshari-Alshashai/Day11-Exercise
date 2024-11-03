public class Main {
    public static void main(String[] args) {
//Q1: Account Class
        Account a1= new Account("1123104567","Mshari",1000);
        Account a2= new Account("1112358822","Majid");

        a2.setBalance(1700);
        a2.setName("Mohammed");
        a1.setId("1234567890");
        a1.credit(120);
        a1.debit(180);
        a1.transferTo(a2,300);
        System.out.println("=================================");
        System.out.println(a1.toString());
        System.out.println("=================================");
        System.out.println(a2.toString());

//Q2: Employee Class
        System.out.println("***************************************");

        Employee e1 = new Employee("Waleed","1123154466",9000);

        e1.setName("Ahmed");
        e1.setId("1112223330");
        e1.setSalary(10000);
        e1.raisedSalary(20);
        System.out.println(e1.toString());
        System.out.println("Annual Salary: "+e1.getAnnualSalary());
    }
}
