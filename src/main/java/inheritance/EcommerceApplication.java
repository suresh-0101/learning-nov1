package inheritance;

public class EcommerceApplication {
    public static void main(String[] args) {

        ElectronicsProduct laptop = new ElectronicsProduct();
        laptop.productName = "Macbook Air";
        laptop.productPrize = 80000.00d;
        laptop.productBrand = "Apple";
        laptop.productWarranty = "1 Year Manufacturer warranty";

        ClothingProducts cloth = new ClothingProducts();
        cloth.productName = "Shirt";
        cloth.productPrize = 845.99d;
        cloth.clothBrand = "Ralph Lauren";
        cloth.clothSize = ClothSize.M;

        laptop.returnReplacementPolicy();
        cloth.viewSizeChart(cloth.clothSize );

        System.out.println(laptop.toString());
        System.out.println(cloth.toString());
    }
}
