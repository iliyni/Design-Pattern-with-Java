package SecondOne;

import SecondOne.Model.Currency;
import SecondOne.Model.Product;
import java.util.List;

public class AmericaShopping implements Shopping {

    @Override
    public double calculatePrice(List<Product> products) {
        return 0;
    }

    @Override
    public Currency getCurrency() {
        return Currency.USD;
    }
}
