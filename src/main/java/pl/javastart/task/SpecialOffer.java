package pl.javastart.task;

public class SpecialOffer {
    Product product;
    String description;
    String vaildFromTo;
    double discount;

    SpecialOffer(Product p, String desc, String v, double d) {
        product = p;
        description = desc;
        vaildFromTo = v;
        discount = d;
    }

    void showInfo() {
        System.out.println("Oferta specjalna na produkt: " + product.name);
        System.out.println("Opis oferty: " + description);
        System.out.println("Ważna od-do: " + vaildFromTo);
        System.out.println("Obniżka o " + (discount * 100) + "%");
        System.out.printf("Cena po obniżce: %.2fzł%n", (product.price * (1 - discount)));
    }
}
