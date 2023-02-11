package com.jspiders.factorypattern.movie;

import com.jspiders.factorypattern.inter.Movie;

public class Kantara implements Movie {

	@Override
	public void nowPlaying() {
		System.out.println("Now playing Kantara");
	}

}
