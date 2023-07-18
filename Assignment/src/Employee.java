import java.util.Scanner;

// Employee Class
public class Employee{
    //three instance variables
   private String name;
   private int number;
   private double salary;

   //Constructor that sets the values of the instance variables.
    Employee(String Name, int Number, double Salary){
        this.name=Name;
        this.number=Number;
        this.salary=Salary;
    }

   //Returns the tax percentage as a decimal
    public double Tax_Percentage(){
        return salary <= 10000 ? 0 : salary <= 20000 ? 0.1 : salary <= 40000 ? 0.2 : 0.25;
    }
    
    //Calculates the tax amount based on the salary.
    public double Tax_Amount(){
        double Amount_deducted = salary*Tax_Percentage();
        double Salary_After_Tax=salary-Amount_deducted;
        return Salary_After_Tax;
    }

    //Displays the employee information
    public void Display(){
        double Tax_Value= Tax_Percentage()*100;
        char Tab='\t';
        System.out.println("Name" + Tab+Tab+ "Employye No" + Tab + "Salary" + Tab+Tab + "After Tax" + Tab+Tab + "Tax value");
        System.out.println(name + Tab+Tab+ number + Tab+Tab+"R"+salary + Tab +"R"+ Tax_Amount() + Tab+Tab+ Tax_Value+'%');

    }

    public static void main(String[] args) throws Exception {
        String Name;
        int Employee_Number;
        double Salary;

        //object used to get user input
        Scanner Input = new Scanner(System.in); 

        System.out.println("Enter Information");

        System.out.print("Name: ");
        Name=Input.nextLine();

        System.out.print("Employee No: ");
        Employee_Number=Input.nextInt();

        System.out.print("Salary: ");
        Salary=Input.nextInt();

        Employee infor =new Employee(Name, Employee_Number, Salary);
        
        infor.Tax_Percentage();
        infor.Tax_Amount();
        infor.Display();
    }
}
