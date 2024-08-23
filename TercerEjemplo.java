package trece;
import java.util.HashMap;
import java.util.Iterator;
public class TercerEjemplo {
	public static void main(String[] args) {
       
        HashMap<String, String> employeeDepartments = new HashMap<String, String>();
        
  
        employeeDepartments.put("Alice", "HR");
        employeeDepartments.put("Bob", "Engineering");
        employeeDepartments.put("Charlie", "Marketing");
        employeeDepartments.put("Diana", "Finance");
        employeeDepartments.put("Eve", "Engineering");     
     
        printEmployeeDirectory(employeeDepartments);
    }
    
    private static void printEmployeeDirectory(HashMap<String, String> employeeDepartments) {
        System.out.println(employeeDepartments);
        Iterator<String> iterator = employeeDepartments.keySet().iterator();
        
        while (iterator.hasNext()) {
            String employee = iterator.next();
            System.out.println(employee + " - " + employeeDepartments.get(employee));
        }
    }
}

