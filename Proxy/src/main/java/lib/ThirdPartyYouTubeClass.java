package src.main.java.lib;

import java.util.HashMap;

/**
 * This class represents a ThirdPartyYouTubeClass.
 * It implements the ThirdPartyYouTubeLib interface to fetch popular videos and specific video by ID.
 */
public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    /**
     * Fetches the popular videos.
     * Connects to the server and returns random videos.
     *
     * @return a HashMap of popular videos
     */
    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    /**
     * Fetches a specific video by its ID.
     * Connects to the server and returns the video.
     *
     * @param videoId the ID of the video to fetch
     * @return the video
     */
    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    // -----------------------------------------------------------------------
    // Fake methods to simulate network activity. They as slow as a real life.

    /**
     * Generates a random integer between min and max.
     *
     * @param min the minimum value
     * @param max the maximum value
     * @return a random integer between min and max
     */
    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    /**
     * Simulates network latency.
     * Pauses the thread for a random amount of time between 5 and 10.
     */
    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * Connects to a server.
     * Prints a message indicating that it's connecting to the server, simulates network latency, and then prints a message indicating that it's connected.
     *
     * @param server the server to connect to
     */
    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    /**
     * Fetches random videos.
     * Prints a message indicating that it's downloading the videos, simulates network latency, and then returns a HashMap of videos.
     *
     * @return a HashMap of videos
     */
    private HashMap<String, Video> getRandomVideos() {
        System.out.print("Downloading populars... ");

        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.print("Done!" + "\n");
        return hmap;
    }

    /**
     * Fetches a specific video.
     * Prints a message indicating that it's downloading the video, simulates network latency, and then returns the video.
     *
     * @param videoId the ID of the video to fetch
     * @return the video
     */
    private Video getSomeVideo(String videoId) {
        System.out.print("Downloading video... ");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.print("Done!" + "\n");
        return video;
    }

}