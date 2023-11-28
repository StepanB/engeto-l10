package org.example.calculation;

import java.util.List;

public class FindingMatching {

	public static Double findMatching(List<Double> list, Double lowerLimit, Double upperLimit) {
		for (Double item : list) {
			if (item >= lowerLimit && item<=upperLimit) {
				return item;
			}
		}
		return null;
	}

}
