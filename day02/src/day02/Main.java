package day02;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input cmd ...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye ...");
				break;
			} else if (cmd.equals("a")) {
				System.out.println(cmd);
			} else if (cmd.equals("b")) {
				while(true) {
					System.out.println("Input cmd2 ...");
					String cmd2 = sc.next();
					if (cmd2.equals("q")) {
						System.out.println("Bye ...");
						break;
					} else if (cmd2.equals("a2")) {
						System.out.println(cmd2);
					}
				}
			}
		}
		sc.close(); // End Resource
		System.out.println("End ...");

	}

}
