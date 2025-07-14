package com.fooddeliverysystem.services;

import java.util.Scanner;

import com.fooddeliverysystem.entities.Payment;

public class PayementService 
{
	
	 private static int paymentCounter = 1;

	    public Payment processPayment(int orderId, double amount) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Select Payment Method:");
	        System.out.println("1. Cash");
	        System.out.println("2. UPI");
	        System.out.println("3. Card");
	        System.out.print("Enter option (1-3): ");
	        int option = scanner.nextInt();
	        scanner.nextLine(); 

	        String method = switch (option) {
	            case 1 -> "Cash";
	            case 2 -> "UPI";
	            case 3 -> "Card";
	            default -> {
	                System.out.println("Invalid payment method selected.");
	                yield "Invalid";
	            }
	        };

	        if (method.equals("Invalid")) {
	            return null;
	        }

	        boolean isValid = validatePayment(method, scanner);
	        boolean success = isValid;

	        Payment payment = new Payment(paymentCounter++, orderId, method, amount, success);
	        System.out.println(success ? "Payment Successful!" : "Payment Failed!");
	        System.out.println(payment);

	        return payment;
	    }

	    private boolean validatePayment(String method, Scanner scanner) {
	        switch (method) {
	            case "UPI" -> {
	                System.out.print("Enter UPI ID: ");
	                String upiId = scanner.nextLine();
	                return upiId.contains("@");
	            }
	            case "Card" -> {
	                System.out.print("Enter Card Number(16-digit): ");
	                String cardNumber = scanner.nextLine();
	                return cardNumber.length() == 16 && cardNumber.matches("\\d+");
	            }
	            case "Cash" -> {
	                System.out.println("Pay with cash on delivery.");
	                return true;
	            }
	            default -> {
	                return false;
	            }
	        }
	    }

}
