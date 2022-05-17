package com.collection.shoppingcart;

import java.util.List;
import java.util.Scanner;

public class UI {

    Cart cartData = new Cart();
    private int choice = 0;
    
    public UI () {
        menu();
    }
    
    public void startScreen () {
    	System.out.println("Welcome to the Shopping.....");
        System.out.println("\n1. Display All Products");
        System.out.println("\n2. Display Cart");
        System.out.println("\n0. Exit");
        System.out.println("Enter your choice...");
    }
    
    public void storeProductsMenu() {
    	System.out.println("Welcome to cart.....");
        System.out.println("\n1. Add to Cart");
        System.out.println("\n2. Remove From Cart");
        System.out.println("\n0. Exit");
        System.out.println("Enter your choice...");
    }
  
    public void menu () {
        do {
            startScreen();
            getUserInput();
            
            switch (choice) {
                case 1: 
                	
                    displayStoreProducts();
                    storeProductsMenu();
                    getUserInput();
                    System.out.println("Add products to carts what you need...");
                    innerChoice1();
                  
                    break;
                case 2:
                    showCart();
                    break;
                case 0:
                	System.out.println("Thank you customer");
                    System.exit(0);
                    break;
                default:
                	System.out.println("Invalid choice....Please check");
                    break;
            }
        } while (choice != 0);
    }

    private void innerChoice1() {
        switch (choice) {
            case 1:
            	
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            case 0:
            	System.out.println("Thank you customer");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice....Please check");
                break;
        }
    }

    private int getUserInput() throws NumberFormatException {
        Scanner in = new Scanner (System.in);
        choice = Integer.parseInt(in.nextLine());
        return choice;
    }

    private void displayStoreProducts() {
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            System.out.println(
                    prod.getProductId() + "- " +
                            prod.getProductName() + " " +
                            prod.getProductPrice() + " " +
                            prod.getProductQuantity()
            );
        }
    }

    private void addProductToCart() {
        int productId = getUserInput();
        cartData.addToCartById(productId);      
    }

    private void showCart() {
       System.out.println("Items added to cart is.....");
       cartData.displayCartItems();
    }

    private void removeProductFromCart() {
        int productId = getUserInput();
        cartData.removeFromCart(productId);
    }
}