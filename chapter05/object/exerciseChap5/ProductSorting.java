package javacore.chapter05.object.exercise;

import javacore.chapter05.object.practice.PracticeStatic;

public class ProductSorting {

    public String name;
    public String category;

    public double price;
    public char currency;

    public ProductSorting(String name, String category, double price, char currency) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }
    public static ProductSorting[] generateFakeProductList() {

        ProductSorting[] productArray = new ProductSorting[10];

        productArray[0] = new ProductSorting("Samsung G9", "Gaming Screen", 1499.99, '$');
        productArray[1] = new ProductSorting("Porsche 911", "Car", 120000, '€');
        productArray[2] = new ProductSorting("IKEA Sofa", "Seating", 599.99, '£');
        productArray[3] = new ProductSorting("MacBook Pro M3", "Laptop", 2499.99, '$');
        productArray[4] = new ProductSorting("Rolex Submariner", "Watch", 9500, '€');
        productArray[5] = new ProductSorting("Bose QuietComfort 45", "Headphones", 329.99, '$');
        productArray[6] = new ProductSorting("Dyson V15 Detect", "Vacuum Cleaner", 7390.10, '¥');
        productArray[7] = new ProductSorting("Harley-Davidson Fat Boy", "Motorcycle", 20300, '€');
        productArray[8] = new ProductSorting("Canon EOS R5", "Camera", 3899, '$');
        productArray[9] = new ProductSorting("Lego Millennium Falcon", "Toy", 849.99, '$');

        return productArray;

    }

    public void displayProduct() {
        System.out.println("Product Name : " + this.name + " | Category : " + this.category + " | Price : " + this.price + this.currency);
    }

    public static void main(String[] args) {

        ProductSorting[] productArray = generateFakeProductList();

        for (int i = 0; i < productArray.length; i++) {
            ProductSorting.Convert(productArray,i);
        }
        ProductSorting.sorting(productArray);
        for(int i = 0;i<productArray.length;i++){
            productArray[i].displayProduct();
        }
    }


        public static void Convert(ProductSorting[] products, int i){
                if (products[i].currency == '€') {
                    products[i].price *= 1.05;
                } else if (products[i].currency == '£') {
                    products[i].price *= 1.21;
                } else if (products[i].currency == '¥') {
                    products[i].price /= 7.27;
                }
        }


        public static void sorting(ProductSorting[] products){
            for(int i = 0;i<products.length;i++){
                for(int j = i;j<products.length;j++){
                    if(products[j].price>products[i].price){
                        ProductSorting temp = products[j];
                        products[j] = products[i];
                        products[i] = temp;
                    }
                }
            }

        }



    }