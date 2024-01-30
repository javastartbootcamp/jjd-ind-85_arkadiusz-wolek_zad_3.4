package pl.javastart.task;

public class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(String n, double p, String d, Category c) {
        name = n;
        price = p;
        description = d;
        category = c;
    }

    Product(String n, double p, String productDesc, String categoryName, String categoryDesc) {
        name = n;
        price = p;
        description = productDesc;
        category = new Category(categoryName, categoryDesc);
    }

    void showInfoWithoutCategory() {
        System.out.println("\nDane o produkcie:");
        System.out.println("Nazwa produktu: " + name);
        System.out.println("Cena: " + price + "zł");
        System.out.println("Opis produktu: " + description);
    }

    void showAllInfo() {
        showInfoWithoutCategory();
        System.out.println("Kategoria: " + category.name);
        System.out.println("Opis kategorii: " + category.description);
    }
}
