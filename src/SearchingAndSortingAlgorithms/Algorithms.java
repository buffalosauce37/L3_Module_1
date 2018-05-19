package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int tRex = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				tRex++;
			}
		}
		return tRex;
	}

	// Add other methods here
	public static Double findTallest(List<Double> peeps) {
		Double UtahRaptor = (double) 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) >= UtahRaptor) {
				UtahRaptor = peeps.get(i);
			}
		}
		return UtahRaptor;
	}

	public static String findLongestWord(List<String> words) {
		String longestWord = null;
		int longestLength = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestLength) {
				longestLength = words.get(i).length();
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}

	public static Boolean containsSOS(List<String> mbagel) {
		Boolean messages = null;
		String coantinsSOS = "... --- ...";
		for (int i = 0; i < mbagel.size(); i++) {
			if (mbagel.get(i).contains(coantinsSOS)) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		Double scores = (double) 0;
		for (int i = 0; i < results.size(); i++) {
			if (results.get(i) <= scores) {
				scores = results.get(i);
			}
		}
		return results;
	}
}
