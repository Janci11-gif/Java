class Song {
    String title;
    String artist;
    
    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    
    void play() {
        System.out.println("Playing: " + title + " by " + artist);
    }
}

class PopSong extends Song {
    PopSong(String title, String artist) {
        super(title, artist);
    }
    
    void play() {
        System.out.println("Pop music playing: " + title);
    }
}

class RockSong extends Song {
    RockSong(String title, String artist) {
        super(title, artist);
    }
    
    void play() {
        System.out.println("Rock music playing: " + title + " with guitar");
    }
}

public class MusicApp {
    public static void main(String[] args) {
        Song[] playlist = {
            new PopSong("Dance Night", "Pop Star"),
            new RockSong("Thunder", "Rock Band")
        };
        
        for(Song song : playlist) {
            song.play();
        }
    }
}
