package src.main.java.lib;

import java.util.HashMap;

/**
 * This interface represents a ThirdPartyYouTubeLib.
 * It provides methods to fetch popular videos and a specific video by its ID.
 */
public interface ThirdPartyYouTubeLib {
    /**
     * Fetches the popular videos.
     *
     * @return a HashMap of popular videos
     */
    HashMap<String, Video> popularVideos();

    /**
     * Fetches a specific video by its ID.
     *
     * @param videoId the ID of the video to fetch
     * @return the video
     */
    Video getVideo(String videoId);
}