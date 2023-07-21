package src.tk.akyua.musics.models;

public class MyFavorites {
    public void include(Audio audio){
        if(audio.getClassification() >= 9){
            System.out.println(audio.getTitle() + "  is considered one of the favorites by everyone.");
        } else {
            System.out.println(audio.getTitle() + " is one of the ones that people are enjoying.");
        }
    }
}
