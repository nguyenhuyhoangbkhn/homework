package org.o7planning.spring;
/**
 * Description 
 * 
 * @author Hoang
 *
 */
public class MultiplicationTable {
	int n;
	public void getN(int a) {
		this.n = a;
	}
	
	public void printBcc(){
		for (int i =1; i < 10; i++){
			System.out.println(i + "*" + n + "=" + i*n );
		}
	}
	public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
        MultiplicationTable bcc1 = new MultiplicationTable();
        bcc1.getN(8);
        bcc1.printBcc();
    }

}
