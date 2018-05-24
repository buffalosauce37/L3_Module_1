package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
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

	public static List<Double> sortScores(List<Double> resultsList) {
		ArrayList<Double> results = new ArrayList<Double>(resultsList);
		
		ArrayList<Double> sorted = new ArrayList<Double>();
		while (results.size() >= 1) {
			Double scores = (double) 99999999;
			for (int j = 0; j < results.size(); j++) {
				if (results.get(j) <= scores) {
					scores = results.get(j);
				}

			}

			sorted.add(scores);
			results.remove(scores);
		}

		return sorted;
	}
	public static List<String> sortDNA(List<String> DNAList) {
		ArrayList<String> DNA = new ArrayList<String>(DNAList);
		
		ArrayList<String> sorted = new ArrayList<String>();
		while (DNA.size() >= 1) {
			String shortestDNA = DNA.get(0);
			for (int j = 0; j < DNA.size(); j++) {
				if (DNA.get(j).length() <= shortestDNA.length()) {
					shortestDNA = DNA.get(j);
				}

			}

			sorted.add(shortestDNA);
			DNA.remove(shortestDNA);
			System.out.println(sorted);
		}

		return sorted;
	}
	public static List<String> sortWords(List<String> WordList) {
		ArrayList<String> Words = new ArrayList<String>(WordList);
		
		ArrayList<String> sorted = new ArrayList<String>();
		while (Words.size() >= 1) {
			String firstWord = Words.get(0);
			for (int j = 0; j < Words.size(); j++) {
				if (Words.get(j).compareTo(firstWord) <0) {
					firstWord = Words.get(j);
				}

			}

			sorted.add(firstWord);
			Words.remove(firstWord);
			System.out.println(sorted);
		}

		return sorted;
	}
}
