package productMgt;

import MyException.*;
import providerMgt.Providers;

import java.util.ArrayList;
import java.util.List;

public class Products {
    List<Product> listProducts = new ArrayList<>();

    public void add(Product p) throws ProviderNotFoundException, Exception, RequiredValueException {
        if (Providers.findProvider(p.getIdProvider())) {
            if (p.getLabel().equals("") || p.getExpirationDate() == null || p.getFabricationDate() == null)
                throw new RequiredValueException("Problem");
            int index = listProducts.indexOf(p);
            if (index != -1)
                listProducts.add(p);
            listProducts.get(index).setStock(listProducts.get(index).getStock() + p.getStock());
            System.out.println("Product has been added! GG");
        }

//
//        if (this.listProducts.contains(p)) {
//            System.out.println("incrementer quantity");
//            int n= this.listProducts.indexOf(p);
//            Product p1= listProducts.get(n);
//            p1.stock=p1.stock++;
//            listProducts.set(n, p1);
//        }else
//            this.listProducts.add(p);
    }

    public void add2(Product p) {

        try {
            if (Providers.findProvider(p.getIdProvider())) {
                if (p.getLabel().equals("") || p.getExpirationDate() == null || p.getFabricationDate() == null)
                    throw new RequiredValueException("Problem");
                int index = listProducts.indexOf(p);
                if (index != -1)
                    listProducts.add(p);
                listProducts.get(index).setStock(listProducts.get(index).getStock() + p.getStock());
                System.out.println("Product has been added! GG");
            }
        } catch (ProviderNotFoundException e) {
            e.printStackTrace();
        } catch (RequiredValueException e) {
            e.printStackTrace();
        }

    }


    public void showProducts() {

    }

    public List<Product> outOfStockProducts() {
        List<Product> lst1 = new ArrayList<>();

        return lst1;
    }

}
