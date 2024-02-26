import java.util.Scanner;

class Employee {
    String name;
    double salary;
    int id;
    int post;
    double bonus;

    public void setData(String name, double salary, int id, double bonus) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.bonus = bonus;
    }

    public void getEmp() {
        System.out.println("The name of Employee Is " + this.name);
        System.out.println("The Id of " + this.name + " Is " + this.id);
        System.out.println("The Salary of " + this.name + " Is " + this.salary);
        System.out.println("The post of " + this.name + " Is " + this.post);
        System.out.println("The Bonus Amount of " + this.name + " Is " + this.bonus);
    }
}

class Manager extends Employee {
    private String work;

    public void setDataMan(String name, double salary, int id, double bonus, String work) {
        setData(name, salary, id, bonus);
        this.work = work;
    }

    public void getMan() {
        getEmp();
        System.out.println("The Bonus Amount of " + this.name + " Is " + this.work);
    }
}

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        Manager man = new Manager();

        System.out.println("Enter The Employee Details");
        System.out.println("Enter The Employee Name");
        String name = sc.nextLine();
        System.out.println("Enter The Employee Id");
        int id = sc.nextInt();
        System.out.println("Enter The Employee Salary");
        double salary = sc.nextDouble();
        System.out.println("Enter The Employee Bonus Of This Year");
        double bonus = sc.nextDouble();

        man.setData(name, salary, id, bonus);
        man.getEmp();

        System.out.println("Enter The Manager Details");
        System.out.println("Enter The Manager Name");
        sc.nextLine(); // Consume the newline character
        name = sc.nextLine();
        System.out.println("Enter The Manager Id");
        id = sc.nextInt();
        System.out.println("Enter The Manager Salary");
        salary = sc.nextDouble();
        System.out.println("Enter The Manager Bonus Of This Year");
        bonus = sc.nextDouble();
        System.out.println("Enter The Manager Work");
        sc.nextLine(); // Consume the newline character
        String work = sc.nextLine();

        man.setDataMan(name, salary, id, bonus, work);
        man.getMan();
    }
}