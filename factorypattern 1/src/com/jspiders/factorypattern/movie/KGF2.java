package com.jspiders.factorypattern.movie;

import com.jspiders.factorypattern.inter.Movie;

public class KGF2 implements Movie {

	@Override
	public void nowPlaying() {
		System.out.println("Now playing KGF Chapter 2");
	}
}
