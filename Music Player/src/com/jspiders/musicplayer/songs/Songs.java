package com.jspiders.musicplayer.songs;

public class Songs {
	int id;
	String name;
	String movie;
	double duration;
	String singer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Songs [id=" + id + ", name=" + name + ", movie=" + movie + ", duration=" + duration + ", singer="
				+ singer + "]";
	}
}
