public class Test {
    int emp_id;
    String emp_name;
    double emp_salary;
    static String company="ITC";
    Test(int emp_id,String emp_name,double emp_salary){
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.emp_salary=emp_salary;
    }
    void emp(){
        System.out.println(emp_id+emp_name+emp_salary+company);

        }        static void sbs(){
              company = "Tcs";
        }

    public static void main(String[] args) {
        Test t1=new Test(101,"lakshmi",20000);
        t1.emp();
        t1.sbs();
    }
}