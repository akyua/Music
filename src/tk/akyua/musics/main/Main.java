package src.tk.akyua.musics.main;

import src.tk.akyua.musics.models.Music;
import src.tk.akyua.musics.models.MyFavorites;
import src.tk.akyua.musics.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Call Me What You Like");
        myMusic.setSinger("Lovejoy");

        // Simulating likes
        for(int i = 0; i < 1000; i++){
            myMusic.reproduction();
        }

        for(int i = 0; i < 50; i++){
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setHost("Garnt");
        myPodcast.setTitle("Trash Taste");
        myPodcast.setDescription("A podcast with attitude that hits different.");

        for (int i = 0; i < 5000; i++){
            myPodcast.reproduction();
        }

        for (int i = 0; i < 1000; i++){
            myPodcast.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.include(myPodcast);
        favorites.include(myMusic);
    }
}
