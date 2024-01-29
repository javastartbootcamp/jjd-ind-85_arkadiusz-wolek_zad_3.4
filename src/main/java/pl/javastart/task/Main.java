package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category category1 = new Category("przekąski", "różne");
        Product product1 = new Product("Paluszki słone", 2.49, "z Lubelli", category1);
        Product product2 = new Product("Sushi", 7.99, "danie japońskie", category1);
        Product product3 = new Product("Bombonierka", 12.99, "od Wedla", "słodycze", "na prezent");
        Product product4 = new Product("Ser", 3.69, "Mlekovita", null);
        SpecialOffer specialOffer2 = new SpecialOffer(product2, "oferta specjalna", "od 29 do 31 stycznia 2024", 0.2);
        product1.showAllInfo();
        product2.showAllInfo();
        specialOffer2.showInfo();
        product3.showAllInfo();
        product4.showInfoWithoutCategory();
    }
}
