package cmdMgt;

import lombok.Getter;
import lombok.Setter;
import productMgt.Product;

import java.time.LocalDate;
import java.util.ArrayList;

@Getter
@Setter
public class Command {
// Deux commandes sont identiques s’il ont le même code

    int code;
    LocalDate date;
    Product[] productsList;
    int [] quantity;

    public Command() {
    }

    public Command(int code, LocalDate date, Product[] productsList, int[] quantity) {
        this.code = code;
        this.date = date;
        this.productsList = productsList;
        this.quantity = quantity;
    }

}
