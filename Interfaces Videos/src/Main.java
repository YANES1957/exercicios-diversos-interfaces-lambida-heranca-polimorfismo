public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();

        musicPlayer.playMusic();
        musicPlayer.pauseMusic();
        musicPlayer.stopMusic();

        videoPlayer.playVideo();
        videoPlayer.pauseVideo();
        videoPlayer.stopVideo();
    }
}
