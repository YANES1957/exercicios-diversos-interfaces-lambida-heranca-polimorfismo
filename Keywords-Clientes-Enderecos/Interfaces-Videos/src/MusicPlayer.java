public class MusicPlayer {
    // variável de instância
    private String music = "Parabéns pra você";

    // métodos
    public void playMusic() {
        System.out.println("Tocando: " + music);
    }

    public void pauseMusic() {
        System.out.println("Pausando música");
    }

    public void stopMusic() {
        System.out.println("Parando música");
    }
}
