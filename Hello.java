//
//  Hello.java
//  
//
//  Created by Lynn on 4/10/13.
//  Copyright 2013 Lynn. All rights reserved.
//

public class Hello {
	
	public static void main(String[] args){
		System.out.println("Hello World!");
		
		System.out.print("Radius : ");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int radius = scanner.nextInt();
		
		System.out.print("Height : ");
		scanner = new java.util.Scanner(System.in);
		int height = scanner.nextInt();
		
		double volume = (1.0/3.0) * Math.PI * radius * radius * height;
		System.out.println(volume);
	}
}