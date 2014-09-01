package com.jdc.ls16.ep3;

import java.util.stream.Stream;

import com.jdc.ls16.ep3.T0Common.User;

public class T2Reduce {
	
	public static void main(String[] args) {
		Stream<User> stream = T0Common.getUser().stream();
		int sum = stream.map(a -> a.getAge()).reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}

}
