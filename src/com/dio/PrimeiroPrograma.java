package com.dio;

import com.dio.model.Cachorro;

public class PrimeiroPrograma {

public static void main(String[] args) {
				
	Cachorro cachorro = new Cachorro();	
	Gibis gibis = new Gibis();
	
	System.out.println(cachorro);
	System.out.println(gibis);
		/*int A = 1022;
		int B = 1000;
		
		System.out.println("Hello World " + (A+B));*/
	}

}
class Gibis{
	private String nome;
	private String npag;
}