package com.viju;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	final int age = 18;
	int user_age;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the age of user:");
	user_age = in.nextInt();
	if(user_age >= age)
    {
        System.out.println("This user is eligible to vote");
    }
    }
}
