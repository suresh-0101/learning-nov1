package inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElectronicsProduct extends Product{
    protected String productBrand;
    protected String productWarranty;

    public void returnReplacementPolicy(){
        System.out.println("Can't initiate Return or Refund for electronics Products");
    }

    @Override
    public String toString() {
        return "ElectronicsProduct{" +
                " productName='" + productName + '\'' +
                ", productPrize=" + productPrize +
                ", productBrand='" + productBrand + '\'' +
                ", productWarranty='" + productWarranty + '\'' +
                '}';
    }
}
