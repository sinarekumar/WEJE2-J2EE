package com.jspiders.factorypattern.main;

import java.util.Scanner;

import com.jspiders.factorypattern.inter.Movie;
import com.jspiders.factorypattern.movie.KGF2;
import com.jspiders.factorypattern.movie.Kantara;
import com.jspiders.factorypattern.movie.Pushpa;   
import com.jspiders.factorypattern.movie.Vikram;

public class MovieMain {
	static Boolean loop=true;
	static Movie movie;
	public static void main(String[] args) {
		while (loop) {
			try {
				movieFactory().nowPlaying();
			} catch (NullPointerException e) {
				System.out.println("No Movie Selected...!");
			}
			
		}
	}
	@SuppressWarnings("unused")
	public static Movie movieFactory() {
		System.out.println("Select movie to watch \n"+"1. K.G.F. Chapter 2 \n"+"2.Vikram \n"+"3.Pushpa \n"+"4.Kantara \n");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		scanner.close();
		
		switch (choice) {
		case 1:
			movie=new KGF2();
			loop=false;
			return movie;
		case 2:
			movie:new Vikram();
			loop=false;
			return movie;
		case 3:
			movie=new Pushpa();
			loop=false;
			return movie;
		case 4:
			movie=new Kantara();
			loop=false;
			return movie;
		}
		return movie;
	}
}
