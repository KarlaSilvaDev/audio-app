import br.com.alura.models.MyFavorite;
import br.com.alura.models.Podcast;
import br.com.alura.models.Song;

public class Main {
    public static void main(String[] args) {
        Song mySong = new Song();
        mySong.setTitle("Paciência");
        mySong.setArtist("Lenine");

        for (int i = 0; i < 1000; i++) {
            mySong.play();
        }

        for (int i = 0; i < 50; i++) {
            mySong.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Bolha Dev");
        myPodcast.setHost("Marcos Mendes");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyFavorite favorite = new MyFavorite();
        favorite.add(myPodcast);
        favorite.add(mySong);



    }
    
}
