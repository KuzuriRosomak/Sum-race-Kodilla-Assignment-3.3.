package com.kodilla;

import java.util.*;

class SumRace
{
	public static void main(String[] args)
	{
		int roundCounter = 0;

		int sumA = 1000;
		int sumB = 0;

		Random randomGenerator = new Random();

		while(sumA > sumB)
		{
			roundCounter++;
			sumA += randomGenerator.nextInt(10);
			sumB += randomGenerator.nextInt(50);
			System.out.println("Round #" + roundCounter + "\n" + "SumA now equals: " + sumA + "\n" + "SumB now equals: " + sumB);
			System.out.println();
		}
		System.out.println("Race is over after " + roundCounter + " rounds!");
	}
}