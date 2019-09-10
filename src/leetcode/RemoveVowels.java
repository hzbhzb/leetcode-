package leetcode;

public class RemoveVowels {

	public String removeVowels(String S) {
         return S.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "");
	}
}
