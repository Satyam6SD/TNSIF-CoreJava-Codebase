package com.fooddeliverysystem.application;

import com.fooddeliverysystem.services.*;
import com.fooddeliverysystem.entities.*;

import java.util.Scanner;

// admin password: admin123

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FoodServices foodServices = new FoodServices();
        OrderService orderService = new OrderService();

        boolean running = true;
        boolean loggedInAsAdmin = false;
        boolean loggedInAsCustomer = false;

        System.out.println("=== Welcome to Food Delivery System ===");

        while (running) {
        	if (!loggedInAsAdmin && !loggedInAsCustomer) {
        	    System.out.println("\n--- Login Menu ---");
        	    System.out.println("1. Customer Register");
        	    System.out.println("2. Customer Login");
        	    System.out.println("3. Admin Login");
        	    System.out.println("4. Exit");
        	    System.out.print("Choose option: ");
        	    int loginChoice = scanner.nextInt();
        	    scanner.nextLine();

        	    switch (loginChoice) {
        	        case 1:
        	            UserService.registerUser();
        	            break;
        	        case 2:
        	            boolean loggedIn = UserService.loginUser();
        	            if (loggedIn) {
        	                loggedInAsCustomer = true;
        	            }
        	            break;
        	        case 3:
        	            System.out.print("Enter admin password: ");
        	            String adminPass = scanner.nextLine();
        	            if (adminPass.equals("admin123")) {
        	                loggedInAsAdmin = true;
        	                System.out.println("✅ Admin login successful!");
        	            } else {
        	                System.out.println("❌ Wrong password.");
        	            }
        	            break;
        	        case 4:
        	            running = false;
        	            System.out.println("Goodbye!");
        	            break;
        	        default:
        	            System.out.println("Invalid option. Try again.");
        	    }
        	}

            else if (loggedInAsAdmin) {
                System.out.println("\n--- Admin Menu ---");
                System.out.println("1. Add Restaurant");
                System.out.println("2. Add Food Item to Restaurant");
                System.out.println("3. Remove Food Item from Restaurant");
                System.out.println("4. View Restaurants and Menus");
                System.out.println("5. Logout");
                System.out.println("6. Exit");
                System.out.print("Choose option: ");
                int adminChoice = scanner.nextInt();
                scanner.nextLine();

                switch (adminChoice) {
                    case 1:
                        System.out.print("Enter restaurant ID: ");
                        int restId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter restaurant name: ");
                        String restName = scanner.nextLine();
                        System.out.print("Enter restaurant address: ");
                        String restAddress = scanner.nextLine();
                        Restaurant newRestaurant = new Restaurant(restId, restName, restAddress);
                        foodServices.addRestaurant(newRestaurant);
                        break;
                    case 2:
                        System.out.print("Enter restaurant ID: ");
                        int rId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter food ID: ");
                        int foodId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter food name: ");
                        String foodName = scanner.nextLine();
                        System.out.print("Enter food price: ");
                        double foodPrice = scanner.nextDouble();
                        scanner.nextLine();
                        FoodItem newItem = new FoodItem(foodId, foodName, foodPrice);
                        foodServices.addFoodItemToRestaurant(rId, newItem);
                        break;
                    case 3:
                        System.out.print("Enter restaurant ID: ");
                        int restIdRemove = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter food ID to remove: ");
                        int foodIdRemove = scanner.nextInt();
                        scanner.nextLine();
                        foodServices.removeFoodItemFromRestaurant(restIdRemove, foodIdRemove);
                        break;
                    case 4:
                        foodServices.displayRestaurantsAndMenus();
                        break;
                    case 5:
                        loggedInAsAdmin = false;
                        System.out.println("✅ Logged out from admin.");
                        break;
                    case 6:
                        running = false;
                        System.out.println("Thank you! Goodbye.");
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }
            else if (loggedInAsCustomer) {
                System.out.println("\n--- Customer Menu ---");
                System.out.println("1. View Restaurants and Menus");
                System.out.println("2. Place Order");
                System.out.println("3. Logout");
                System.out.println("4. Exit");
                System.out.print("Choose option: ");
                int custChoice = scanner.nextInt();
                scanner.nextLine();

                switch (custChoice) {
                    case 1:
                        foodServices.displayRestaurantsAndMenus();
                        break;
                    case 2:
                        if (UserService.isLoggedIn()) {
                            String customerName = UserService.getLoggedInCustomer().getName();
                            System.out.print("Enter delivery address: ");
                            String address = scanner.nextLine();

                            orderService.startNewOrder(customerName, address);

                            boolean addingItems = true;
                            while (addingItems) {
                                System.out.print("Enter item name: ");
                                String itemName = scanner.nextLine();
                                System.out.print("Enter quantity: ");
                                int quantity = scanner.nextInt();
                                System.out.print("Enter price per item: ");
                                double price = scanner.nextDouble();
                                scanner.nextLine();
                                orderService.addItemToOrder(itemName, quantity, price);

                                System.out.print("Add another item? (yes/no): ");
                                String more = scanner.nextLine();
                                if (!more.equalsIgnoreCase("yes")) {
                                    addingItems = false;
                                }
                            }
                            orderService.printFinalBill();
                        } else {
                            System.out.println("❌ Please login first!");
                        }
                        break;
                    case 3:
                        loggedInAsCustomer = false;
                        System.out.println("✅ Logged out from customer.");
                        break;
                    case 4:
                        running = false;
                        System.out.println("Thank you! Goodbye.");
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }
        }

        scanner.close();
    }
}
