class Employee 
{
    public String Name;
    public int Salary;
    public int Age;
    public String Address;

    Employee(String str, int amount, int a, String addr)
    {
        this.Name = str;
        this.Salary = amount;
        this.Age = a;
        this.Address = addr;
    }

    void Display()
    {
        System.out.println("Employee name : "+this.Name);
        System.out.println("Employee Age : "+this.Age); 
        System.out.println("Employee Salary : "+this.Salary);
        System.out.println("Employee Address : "+this.Address);
    }

    public String toString()
    {
        return Name+" "+Salary+" "+Age+" "+Address;
    }
   
}
class FinalizeDemo5
{
    public static void main(String arg[]) 
    {
        
        Employee eobj1 = new Employee("Amit",78000,28,"Karve road Pune");

            System.out.println(eobj1);
        

    }
}
