package Modules;

import Controllers.MainControllers;
import Emloyee.Employee;

import java.util.Iterator;
import java.util.Stack;

public class FillingCabinets extends MainControllers {
    public static void main(String[] args){
        Stack<Employee> stackEmployee = new Stack<Employee>();
        for (Employee employee : dsEmployee){
            stackEmployee.push(dsEmployee.get(0));
        }
        Iterator<Employee> iterator = stackEmployee.iterator();
        while (iterator.hasNext()) {
            Employee val = iterator.next();
            System.out.println(val);
        }
    }

}
