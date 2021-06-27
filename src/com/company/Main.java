package com.company;

public class Main {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		for (i = 1; i <= 256; i++) {
			i = i * 2;
			sum = sum + i;
		}
			System.out.print("Сумма равна " + i);
		}

	}


