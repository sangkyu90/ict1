package test15;

import java.util.Scanner;

public class Practice {
	public void printLoop(int start, int end) {
		for(int i = start; i<=end ;i++) {
			System.out.println(i);
		}
	}
	
	public void printLoopReverse(int start, int end) {
		for(int i= end; i>=start ; i--	) {
			System.out.println(i);
		}
	}
	public static void main(String[]args) {
		Practice pc = new Practice();
		pc.printLoop(1, 50);

	}
	
}
