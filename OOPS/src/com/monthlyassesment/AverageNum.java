package com.monthlyassesment;

public class AverageNum {
	
				    public static void main(String[] args) {
		        int n = 123; // Replace this with your desired number
		        int sum = 0;
		        int count = 0;

		        // Calculate the sum and count of digits
		        while (n != 0) {
		            sum += n % 10;
		            n /= 10;
		            count++;
		        }

		        // Calculate the average
		        double average = (double) sum / count;

		        // Print the average
		        System.out.println("Average: " + average);
		    }
		}


