package Practica;

import java.util.StringTokenizer;

public class token {
	
	public static void main(String[] args) {
	
		int i;
		String line,word,subword;
		
		StringTokenizer elementos,subelementos;
		
		line ="[[a,b],[c,d],[e,f]]";
		elementos = new StringTokenizer(line,"[]");
		
		while(elementos.hasMoreTokens()){
		  word = elementos.nextToken();
		  i=1;
		  
		  subelementos = new StringTokenizer(word,",");
		  while(subelementos.hasMoreTokens()){
		    subword = subelementos.nextToken();
		   
		    System.out.println(i+". "+subword);
		    i++;
		  }
		}
	}
}
