public class Employee {
    int empId=101;
    String empName="Thriveni";
    double empSalary=10000.00;

    void mark(){
        System.out.println("hai");
    }
    public static void main(String args[]){
        Employee obj1=new Employee();
        obj1.mark();
        System.out.println(obj1.empId);
        System.out.println(obj1.empName);
        System.out.println(obj1.empSalary);

    }
}
