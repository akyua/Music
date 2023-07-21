package src.tk.akyua.musics.models;

public class MyFavorites {
    public void include(Audio audio){
        if(audio.getClassification() >= 9){
            System.out.println(audio.getTitle() + " é considerado uma das preferidas por todo");
        } else {
            System.out.println(audio.getTitle() + " é uma das que as pessoas estão gostando");
        }
    }
}
