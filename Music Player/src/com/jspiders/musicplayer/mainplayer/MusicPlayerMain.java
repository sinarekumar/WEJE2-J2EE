package com.jspiders.musicplayer.mainplayer;

import java.util.Scanner;

import com.jspiders.musicplayer.songoperation.SongsOperation;

public class MusicPlayerMain {
	static Scanner scanner=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		MusicPlayerMain musicplayer=new MusicPlayerMain();
		musicplayer.songMenu();
		
	}
		
		public void songMenu() {
			System.out.println("Welcome to the music player \n"+"Choose the following the operation : \n"
					+"1. Add /Remove the song in the playlist \n"
					+"2. Play the song \n"
					+"3. Edit Song \n"
					+"4. Exit");
			
			int num=scanner.nextInt();
			SongsOperation songsOperation=new SongsOperation();
			MusicPlayerMain musicPlayerMain=new MusicPlayerMain();
			switch (num) {
			case 1:
				System.out.println("Thank you for choosing the option ...Press: \n"
						+"1. Add song \n"+"2. Delete song \n"+"3. Back");
				num=scanner.nextInt();
				switch (num) {
				case 1:
					System.out.println("Please add the songs..");
					songsOperation.addSongs();
					musicPlayerMain.songMenu();
	 				break;
				case 2:
					System.out.println("Choose the song you want to delete...");
					songsOperation.deleteSongs();
					break;
				case 3:
					musicPlayerMain.songMenu();
					break;
				}
			break;
				
			case 2:
				System.out.println("Thank you for choosing the option....press: \n"
						+"1. Select song to play \n"
						+"2. Play all Songs: \n"
						+"3. Play Random songs \n"
						+"4. Back");
				num=scanner.nextInt();
				switch (num) {
				case 1:
					songsOperation.playSpecificSong();
					String songName = scanner.nextLine();
					System.out.println("Enjoy the uniterapted song...Now Playing " + songName);
					break;
				case 2:
					System.out.println("Your playlist is ready to play....bingo....get started");
					songsOperation.playAllSong();
					musicPlayerMain.songMenu();
					break;
				case 3:
					System.out.println("as per your wish songs will play randomly...enjoy...cheers");
					songsOperation.playRandomSong();
					musicPlayerMain.songMenu();
					break;
				case 4:
					musicPlayerMain.songMenu();
					break;
				}
			break;
					
			case 3:
				System.out.println("Edit the song...please go for the further operation");
				songsOperation.editSong();
			break;
			case 4:
				System.out.println("Thank you for using this app....have a nice day...");
			break;
				
			default:
				System.out.println("Invalid choice...please enter the valid input");
				musicPlayerMain.songMenu();
				break;
			}
			
	
		}

}
