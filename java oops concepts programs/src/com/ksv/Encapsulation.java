package com.ksv;

public class Encapsulation {
    private int emp_id;
    private String emp_name;
    private String dept_name;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public static void main(String[] args) {
      Encapsulation en=new Encapsulation();
      en.setEmp_id(48873);
      en.setEmp_name("Lakshmi");
      en.setDept_name("jr.Executive");
      System.out.println(en.getEmp_id()+","+en.getEmp_name()+","+en.getDept_name());
    }
}