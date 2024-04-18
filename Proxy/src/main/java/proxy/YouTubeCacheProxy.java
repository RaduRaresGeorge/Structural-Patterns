package src.main.java.proxy;

import src.main.java.lib.ThirdPartyYouTubeClass;
import src.main.java.lib.ThirdPartyYouTubeLib;
import src.main.java.lib.Video;

import java.util.HashMap;

/**
 * This class represents a YouTubeCacheProxy.
 * It implements the ThirdPartyYouTubeLib interface and provides caching for popular videos and specific videos by ID.
 */
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    /**
     * Constructs a YouTubeCacheProxy object.
     * Initializes the ThirdPartyYouTubeLib object.
     */
    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    /**
     * Fetches the popular videos.
     * If the cache is empty, it fetches the videos from the ThirdPartyYouTubeLib and stores them in the cache.
     * If the cache is not empty, it retrieves the videos from the cache.
     *
     * @return a HashMap of popular videos
     */
    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    /**
     * Fetches a specific video by its ID.
     * If the video is not in the cache, it fetches the video from the ThirdPartyYouTubeLib and stores it in the cache.
     * If the video is in the cache, it retrieves the video from the cache.
     *
     * @param videoId the ID of the video to fetch
     * @return the video
     */
    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    /**
     * Resets the cache.
     * Clears the cache of popular videos and the cache of all videos.
     */
    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}