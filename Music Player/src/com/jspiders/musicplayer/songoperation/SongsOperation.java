package com.jspiders.musicplayer.songoperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.jspiders.musicplayer.songs.Songs;

public class SongsOperation {
	static Scanner scanner=new Scanner(System.in);
	ArrayList<Songs> arraylist=new ArrayList<Songs>();
	
	public void addSongs( ) {
		Songs songs=new Songs();
		System.out.println("Enter how many songs you want to add");
		int numberOfSongs=scanner.nextInt();
		for (int i = 0; i < numberOfSongs; i++) {
			
			System.out.println("Enter the song Id...");
			songs.setId(scanner.nextInt());
			
			System.out.println("Enter the song name...");
			songs.setName(scanner.nextLine());
			scanner.nextLine();
			
			System.out.println("Enter the name of movie");
			songs.setMovie(scanner.nextLine());
			
			System.out.println("Enter the duration of songs... " );
			songs.setDuration(scanner.nextDouble());
		}
		arraylist.add(songs);
		System.out.println(songs.getName()+" is added to playlist");
		return;
		
	}
	public void viewSongs() {
		System.out.println("Your song Playlist is..:");		
			for (int i = 1; i < arraylist.size(); i++) {
				System.out.println(i+". "+arraylist.get(i-1).getName());
			}
	}
	
	public void deleteSongs() {
		viewSongs();
		System.out.println("Which Song do you want to remove");
		String name=scanner.nextLine();
		
		for (int i = 0; i < arraylist.size(); i++) {
			if (arraylist.get(i).getName().equals(name)) {
				arraylist.remove(i);
				System.out.println("Successfully Removed the song"+ name);
			}
		}
		return;
		
	}
	
	public void playRandomSong() {

		int random= (int)(Math.random()*arraylist.size());
		System.out.println("Playing Random Song of id number "+ arraylist.get(random));
	}
	
	public void playSpecificSong() {
		viewSongs();
		if (arraylist==null) {
			addSongs();
		} else {
			System.out.println("Enter number to play the song");
			int num=scanner.nextInt();
			for (int i = 0; i < arraylist.size(); i++) {
				if (num==arraylist.get(i).getId()) {
					System.out.println("Now Playing "+ arraylist.get(i).getName()+"...");
				} else {
					System.out.println("Number not matched");
				}
			}
		}	
	}
	
	public void playAllSong() {
		viewSongs();
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println("Now playing "+ arraylist.get(i).getName()+"...");
			try {
				Thread.sleep(2000);
				System.out.println("Now playing "+ arraylist.get(i).getName()+"....");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Playlist is over");
	}
	
	public void editSong() {
		viewSongs();
		
		System.out.println("Enter Song Id");
		int edit=(scanner.nextInt());
		
		System.out.println("Enter Song Id");
		arraylist.get(edit).setId(scanner.nextInt());
		System.out.println("Enter Song Name");
		arraylist.get(edit).setName(scanner.nextLine());
		System.out.println("Enter Movie / Album Name");
		arraylist.get(edit).setMovie(scanner.nextLine());
		System.out.println("Enter duration of the Song");
		arraylist.get(edit).setDuration(scanner.nextDouble());
		
		viewSongs();
	}
	
	
	
}
