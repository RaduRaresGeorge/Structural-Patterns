package src.main.java.downloader;

import src.main.java.lib.ThirdPartyYouTubeLib;
import src.main.java.lib.Video;

import java.util.HashMap;

/**
 * This class represents a YouTubeDownloader.
 * It uses a ThirdPartyYouTubeLib to fetch and render video data.
 */
public class YouTubeDownloader {
    private ThirdPartyYouTubeLib api;

    /**
     * Constructs a YouTubeDownloader object.
     * Initializes the ThirdPartyYouTubeLib object.
     *
     * @param api the ThirdPartyYouTubeLib object
     */
    public YouTubeDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }

    /**
     * Renders a video page for a given video ID.
     * Fetches the video data using the ThirdPartyYouTubeLib and prints it.
     *
     * @param videoId the ID of the video to render
     */
    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("lib.Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.title);
        System.out.println("lib.Video: " + video.data);
        System.out.println("-------------------------------\n");
    }

    /**
     * Renders a page for the most popular videos.
     * Fetches the popular videos using the ThirdPartyYouTubeLib and prints them.
     */
    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}