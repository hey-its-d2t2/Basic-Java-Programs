/* A java program to count the vowels and consonent in a Charector thrugh console class */
import java.io.*;
public class VowelsCons{
	public static void main(String[] args){
		String letter;
		int vowel,cons;
		char ch;
		vowel = cons = 0;
		Console cin = System.console();
		letter =cin.readLine("Enter Charector(String) :");
		for(int i = 0;i < letter.length();i++){
			ch = letter.charAt(i);
			if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U'){
				vowel++;
			}
			else
				cons++;
		}
		System.out.println("------------------------\n"+letter+"\n-------------------");
		System.out.println("Vowels : "+vowel);
		System.out.println("Consonent : "+cons);
	}
} 