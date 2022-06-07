package DesignPatterns.Adapter;

/**
 * Media player and Adv media player are difference hence need of adapter.
 */
public interface MediaPlayer {
    void play (String fileToPlay, String formatToPlay);
}
