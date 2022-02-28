package providerMgt;

import MyException.ProviderNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Providers {


    static List<Provider> lstProvider=new ArrayList<>();

    public static boolean findProvider(Provider p) throws ProviderNotFoundException {

        if (! lstProvider.contains(p))
            throw new ProviderNotFoundException("The product doesn't exist");
        return true;
    }
}
