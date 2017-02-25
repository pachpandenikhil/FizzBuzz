package com.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public List<String> fizzBuzz(int n) {
		List<String> output = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if(i % 15 == 0) {
				output.add("FizzBuzz");
			}
			else if(i % 5 == 0) {
				output.add("Buzz");
			}
			else if(i % 3 == 0) {
				output.add("Fizz");
			}
			else {
				output.add(i + "");
			}
		}
		
		return output;
	}

	public static void main(String[] args) {
		int n = 15;
		Main obj = new Main();
		System.out.println(obj.fizzBuzz(n));
	}
}
