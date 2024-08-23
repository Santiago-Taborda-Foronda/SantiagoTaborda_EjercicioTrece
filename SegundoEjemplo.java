package trece;
import java.util.HashMap;
import java.util.Iterator;
public class SegundoEjemplo {
	 public static void main(String[] args) {	       
	        HashMap<String, Double> productPrices = new HashMap<String, Double>();	        
	      
	        productPrices.put("Laptop", 999.99);
	        productPrices.put("Smartphone", 499.49);
	        productPrices.put("Tablet", 299.99);
	        productPrices.put("Headphones", 89.95);
	        productPrices.put("Mouse", 24.99);	        
	     
	        printProductCatalog(productPrices);
	    }
	    
	    private static void printProductCatalog(HashMap<String, Double> productPrices) {
	        System.out.println(productPrices);
	        Iterator<String> iterator = productPrices.keySet().iterator();
	        
	        while (iterator.hasNext()) {
	            String product = iterator.next();
	            System.out.println(product + " - $" + productPrices.get(product));
	        }
	    }
	}

