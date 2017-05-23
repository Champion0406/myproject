package oo.o;

import java.io.FileOutputStream;
import java.util.Scanner;

public class SimpleScores {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i < 3; i++) {
			System.out.print("請輸入成績");
			String data = scanner.nextLine();
			try {
				int score = Integer.parseInt(data);
				sum = sum + score;

			} catch (NumberFormatException e) {
				System.out.print("成績格式不符規定");
			}
		}
		System.out.print(sum);
		// FileOutputStream fos =
		// new FileOutputStream("data.txt");

	}

}
