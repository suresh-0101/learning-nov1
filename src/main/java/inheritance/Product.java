package inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    protected String productName;
    protected Double productPrize;

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrize=" + productPrize +
                '}';
    }
}
