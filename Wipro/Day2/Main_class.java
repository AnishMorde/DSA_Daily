package Wipro.Day2;

// Base class
class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double calculateDiscount(double percentage) {
        return price * (percentage / 100);
    }

    public void displayFinalPrice(double discount) {
        double finalPrice = price - discount;
        System.out.println("Final Price after discount: ₹" + finalPrice);
    }

    public void displayProductDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: ₹" + price);
    }
}

// Subclass for Electronics
class Electronics extends Product {
    int warrantyInYears;

    public Electronics(int id, String name, double price, int warrantyInYears) {
        super(id, name, price);
        this.warrantyInYears = warrantyInYears;
    }

    public void displayDetails() {
        displayProductDetails();
        System.out.println("Warranty: " + warrantyInYears + " year(s)");
    }
}

// Subclass for Clothing
class Clothing extends Product {
    String size;

    public Clothing(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    public void displayDetails() {
        displayProductDetails();
        System.out.println("Size: " + size);
    }
}

// Subclass for Grocery
class Grocery extends Product {
    String expiryDate;

    public Grocery(int id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }

    public void displayDetails() {
        displayProductDetails();
        System.out.println("Expiry Date: " + expiryDate);
    }
}

// Main class
public class Main_class {
    public static void main(String[] args) {
        // Create objects
        Electronics laptop = new Electronics(101, "Laptop", 50000.0, 2);
        Clothing tshirt = new Clothing(102, "T-Shirt", 999.0, "L");
        Grocery rice = new Grocery(103, "Basmati Rice", 750.0, "2025-01-10");

        // Display and calculate
        System.out.println("=== Electronics Product ===");
        laptop.displayDetails();
        double ediscount = laptop.calculateDiscount(10); // 10% discount
        laptop.displayFinalPrice(ediscount);

        System.out.println("\n=== Clothing Product ===");
        tshirt.displayDetails();
        double cdiscount = tshirt.calculateDiscount(20); // 20% discount
        tshirt.displayFinalPrice(cdiscount);

        System.out.println("\n=== Grocery Product ===");
        rice.displayDetails();
        double gdiscount = rice.calculateDiscount(5); // 5% discount
        rice.displayFinalPrice(gdiscount);
    }
}

