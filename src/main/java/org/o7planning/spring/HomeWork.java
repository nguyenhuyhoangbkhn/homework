package org.o7planning.spring;

import java.util.Scanner;

/**
 * Description 
 * 
 * @author Hoang
 *
 */
public class HomeWork {
	//declare variable
	int n;
	static Scanner inp = new Scanner(System.in);

	/**
	 * display menu
	 */
	public void menu() {
		System.out.println("Menu");
		System.out.println("1.Tim cac so nguyen to nho hon N");
		System.out.println("2.In ra bang cuu chuong N");
		System.out.println("3.Sap xep mang");
		System.out.println("4.Tim kiem xau");
		System.out.println("5: thoat");
		System.out.println("Ban hay nhap so can nhap:");
	}

	/**
	 * display multiplication table with n
	 */
	public void multipliTable() {
		System.out.println("enter number");
		int n = inp.nextInt();
		MultiplicationTable bcc1 = new MultiplicationTable();
		bcc1.getN(n);
		bcc1.printBcc();
	}

	/**
	 * display Prime 1 to n
	 * with n is the number of input
	 */
	public void checkElement() {
		System.out.println("enter the largest number");
		int n = inp.nextInt();
		Prime snt = new Prime();
		//
		while (n < 0) {
			System.out.println("ERROR! retype pls!");
			n = inp.nextInt();
		}
		
		//
		if (n == 1)
			System.out.println("No primes less than or equal to sort n");
		else {
			int dem = 0;
			for (int i = 2; i <= n; i++) {
				if (snt.ktnguyento(i) == true) {
					dem++;
					if (dem % 5 == 1)
						System.out.print(i);
					else if (dem % 5 == 0)
						System.out.print(", " + i + "\n");
					else
						System.out.print(", " + i);
				}
			}
			System.out.print("\n");
		}
	}
	
	/**
	 * sort number of input
	 */
	public void sortArray() {
		int[] a = new int[100];
		int i, j, tg;
		System.out.println("input lenght of array");
		int n = inp.nextInt();
		System.out.println("input array");
		// input array
		for (i = 0; i < n; i++) {
			System.out.print("a" + "[" + i + "]" + "=");
			a[i] = inp.nextInt();
		}
		
		System.out.println("display sorted array");
		
		//sort array
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					tg = a[i];
					a[i] = a[j];
					a[j] = tg;
				}
			}
			System.out.print("a" + "[" + i + "]" + "=");
			System.out.println(a[i]);
		}
	}

	/**
	 * search word in the text
	*/
	
	public void checkParam(){
		inp.nextLine();
		System.out.println("input text: ");
		String par = inp.nextLine();
		System.out.println("input word: ");
		String checkPar = inp.nextLine();
		String result[] = par.split(" ");
		System.out.print("Result: ");
		int count = 0;
		for(String r : result){
			count++;
			if(r.equals(checkPar)) {
				System.out.print(count + "\t");
			}
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		int menu;
		// do funtion
		HomeWork homework1 = new HomeWork();
		while (true) {
			homework1.menu();		
			menu = inp.nextInt();
			if (menu == 5) break;//break project
			if (menu < 1 || menu > 4){
				System.out.println("Error.");
				continue;//print eror and reload project
			}
				
			switch (menu) {
			case 1: //find primary and display
				homework1.checkElement();
				break;
			case 2: // display multication table 
				homework1.multipliTable();
				break;
			case 3: //input array, sort array and display 
				homework1.sortArray();
				break;
			case 4://find word in text
				homework1.checkParam();
				break;
			}
		}
		System.out.println("End Project");
		inp.close();
	}
}
