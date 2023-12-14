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
    protected void finalize()
    {
        System.out.println("Inside Finalize method..");
    }
    void Display()
    {
        System.out.println("Employee name : "+this.Name);
        System.out.println("Employee Age : "+this.Age); 
        System.out.println("Employee Salary : "+this.Salary);
        System.out.println("Employee Address : "+this.Address);
    }
}
class FinalizeDemo1
{
    public static void main(String arg[])
    {
        Employee eobj = new Employee("Amit",78000,28,"Karve road Pune");
        eobj.Display();
        String str = "Marvellous";
        System.out.println(eobj.getClass());
        System.out.println(str.getClass());

    }
}
