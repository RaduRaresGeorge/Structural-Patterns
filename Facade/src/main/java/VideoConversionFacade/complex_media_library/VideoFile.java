package VideoConversionFacade.complex_media_library;

/**
 * The VideoFile class is part of the complex media library.
 * It represents a video file, storing the name and codec type of the file.
 */
public class VideoFile {
    private String name;
    private String codecType;

    /**
     * Constructs a new VideoFile with the given name.
     * The codec type is determined from the file extension of the name.
     *
     * @param name The name of the video file, including the file extension.
     */
    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    /**
     * Returns the codec type of this video file.
     * The codec type is determined from the file extension of the file name.
     *
     * @return The codec type of this video file.
     */
    public String getCodecType() {
        return codecType;
    }

    /**
     * Returns the name of this video file.
     *
     * @return The name of this video file.
     */
    public String getName() {
        return name;
    }
}