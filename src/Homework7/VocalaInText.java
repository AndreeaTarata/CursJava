package Homework7;

import java.util.Scanner;

public class VocalaInText {

	public static void main(String[] args) {
		
		VocalaInText obj = new VocalaInText();
		obj.vocaleInText();
		
	}
		public void vocaleInText() {
		
		
		char[] text = "Eu invat Java".toCharArray();
		char[] arrayVocala = {'a', 'A', 'e', 'E', 'I', 'i', 'o', 'O', 'u', 'U'}; 
	
		int i = 0;
		
			for(char catevocale : text) {
				for(char vocala : arrayVocala) {
					if(vocala == catevocale) {
						i++;
						
						
					}
				}
				
			}System.out.println(i);
			
		}
	
	

}
