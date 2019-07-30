package com.archivo1.model;

import java.util.Scanner;


public class HolaMundo
{

	public static void main(final String[] args)
	{
		// TODO Auto-generated method stub
		String frase = "";
		final Scanner entrada = new Scanner(System.in);
		System.out.println("Hola Mundo!");
		System.out.println("Ingresa una frase: ");
		frase = entrada.nextLine();
		System.out.println("Frase original: " + frase);
		final String frasenoespacios = frase.replace(" ", "");
		System.out.println(frasenoespacios);
		final StringBuilder string1 = new StringBuilder(frasenoespacios);
		final String frase2 = string1.reverse().toString();
		System.out.println("La frase invertida es: " + frase2);
		//		final StringBuilder str1 = new StringBuilder(frase);
		//		System.out.println(str1.reverse());
		if (frasenoespacios.equals(frase2))
		{
			System.out.println("Es un palindromo");
		}
		else
		{
			System.out.println("no es palindromo");
		}

	}

}
