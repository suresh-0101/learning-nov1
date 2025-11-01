package inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClothingProducts extends Product{
    protected ClothSize clothSize;
    protected String clothBrand;

    public void viewSizeChart(ClothSize size){
        int initialSize = 36;
        for(ClothSize clothSize : ClothSize.values()){
            if(size == clothSize)
             System.out.println("Chest Size :"+ clothSize +" : "+initialSize +"CM");
        }
    }

    @Override
    public String toString() {
        return "ClothingProducts{" +
                " productName=" +productName+
                ", productPrize="+productPrize+
                ", clothSize=" + clothSize +
                ", clothBrand='" + clothBrand + '\'' +
                '}';
    }
}
