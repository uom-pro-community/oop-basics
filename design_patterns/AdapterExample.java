interface MediaPlayer {
    void play(String fileName);
}

class LegacyAudioPlayer {
    public void playMp3(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}

class MediaAdapter implements MediaPlayer {
    private final LegacyAudioPlayer legacyAudioPlayer;

    public MediaAdapter() {
        legacyAudioPlayer = new LegacyAudioPlayer();
    }

    @Override
    public void play(String fileName) {
        legacyAudioPlayer.playMp3(fileName);
    }
}

public class AdapterExample {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter();
        player.play("song.mp3");
    }
}
