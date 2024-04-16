package VideoConversionFacade;

import VideoConversionFacade.facade.VideoConversionFacade;
import java.io.File;

/**
 * This is the main class for the video conversion application.
 * It uses the Facade design pattern to simplify the video conversion process.
 */
public class Demo {
    /**
     * The main method is the entry point of the application.
     * It creates an instance of VideoConversionFacade and uses it to convert a video file.
     *
     * @param args Command line arguments. Not used in this application.
     */
    public static void main(String[] args) {
        // Create an instance of VideoConversionFacade
        VideoConversionFacade converter = new VideoConversionFacade();

        // Convert a video file from .ogg format to .mp4 format
        // The convertVideo method takes the name of the input video file and the desired output format as arguments
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");

        // The rest of the code would typically involve further processing or use of the converted video file
        // ...
    }
}
