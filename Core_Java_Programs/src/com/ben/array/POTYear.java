package com.ben.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class POTYear {

	public static void main(String[] args) {
		int[][] arr = { { 1, 3, 4, 5 }, { 7, 2, 3, 4 }, { 1, 3, 2, 1 } };
		int playerCount = arr.length;
		int matchCount = arr[0].length;
		System.out.println("Player of ther year :: " + playerOfTheYear(arr, playerCount, matchCount));
	}

	private static int playerOfTheYear(int[][] arr, int playerCount, int matchCount) {
		int potYear = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 1; i <= playerCount; i++) {
			map.put(i, 0);
		}
		System.out.println(map);

		for (int i = 0; i < matchCount; i++) {
			int bestPerfomer = 0;
			int mom = 0;
			for (int player = 0; player < playerCount; player++) {
				if (bestPerfomer < arr[player][i]) {
					bestPerfomer = arr[player][i];
					mom += 1;
				}
			}
			map.put(mom, map.get(mom).intValue() + 1);
		}
		System.out.println(map);
		int toper = 0;
		for (Entry<Integer, Integer> e : map.entrySet()) {
			if (toper < e.getValue()) {
				toper = e.getValue();
				potYear = e.getKey();
			}
		}
		return potYear;
	}
}
