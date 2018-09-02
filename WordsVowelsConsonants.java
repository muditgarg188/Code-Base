package testPackage;

import java.util.ArrayList;

public class WordsVowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Hi  there";
		int words = 0; int vowels = 0; int consonants = 0;
		ArrayList<Character> vowelList = new ArrayList<Character>();
		vowelList.add('a');
		vowelList.add('e');
		vowelList.add('i');
		vowelList.add('o');
		vowelList.add('u');
		String[] tempArr = sentence.trim().split(" ");
		//check for multiple spaces between two words
		for(String s : tempArr) {
			if(s.trim().length() > 0)
				words++;
		}
		sentence = sentence.toLowerCase();
		int len = sentence.length();
        for(int i = 0; i < len; i++) {
            if(vowelList.contains(sentence.charAt(i)))
                vowels++;
            else if(!vowelList.contains(sentence.charAt(i)) && sentence.charAt(i) != ' ')
                consonants++;
        }
		System.out.println(words+" "+vowels+" "+consonants);
	}

}
