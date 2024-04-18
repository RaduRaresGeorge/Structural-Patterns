package src.main.java;

import src.main.java.downloader.YouTubeDownloader;
import src.main.java.lib.ThirdPartyYouTubeClass;
import src.main.java.proxy.YouTubeCacheProxy;

/**
 * This class represents a Demo.
 * It contains the main method which is the entry point of the application.
 * It tests the performance of a YouTubeDownloader with and without a caching proxy.
 */
public class Demo {

    /**
     * The main method.
     * Creates a YouTubeDownloader with a ThirdPartyYouTubeClass and a YouTubeDownloader with a YouTubeCacheProxy.
     * Tests the performance of both downloaders and prints the time saved by the caching proxy.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    /**
     * Tests the performance of a YouTubeDownloader.
     * Renders the popular videos and specific videos by ID, and measures the time taken.
     *
     * @param downloader the YouTubeDownloader to test
     * @return the time taken
     */
    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}