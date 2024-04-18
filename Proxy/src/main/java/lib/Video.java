package src.main.java.lib;

/**
 * This class represents a Video.
 * It contains the ID, title, and data of a video.
 */
public class Video {
    public String id;
    public String title;
    public String data;

    /**
     * Constructs a Video object.
     * Initializes the ID, title, and data of the video.
     *
     * @param id the ID of the video
     * @param title the title of the video
     */
    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}