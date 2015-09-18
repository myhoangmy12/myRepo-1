package khtn.edu.Main;

import java.util.Scanner;

import khtn.edu.Utils.ExeptionUtils;
import khtn.edu.exeptionModel.TooOldExeption;
import khtn.edu.exeptionModel.TooYoungExeption;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your age : ");
		int age = sc.nextInt();
		
		try {
			ExeptionUtils.CheckAge(age);
			System.out.println("You are welcome");
		} catch (TooYoungExeption e) {
			System.out.println("Sorry , "+ e.getMessage());
		} catch (TooOldExeption e) {
			System.out.println("Sorry , "+ e.getMessage());
		} finally {
			sc.close();
		}
		// TEST
	}
}
