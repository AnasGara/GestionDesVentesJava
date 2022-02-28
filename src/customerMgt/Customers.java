package customerMgt;

import productMgt.Product;

import java.util.ArrayList;
import java.util.List;

public class Customers {
    List<Customer> customers = new ArrayList<>();
    public void add(Customer c){
        try {
            if (customers.contains(c))
                throw new Exception("Customer already exist!");
            if(c.getPrenom()==null|c.getNom().trim().equals(""))
                throw new Exception("Missing data:First name");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}
