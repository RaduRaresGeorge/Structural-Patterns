package src.main.java.VideoConversionFacade.complex_media_library;

/**
 * The CodecFactory class is part of the complex media library.
 * It provides functionality to extract the codec from a video file.
 */
public class CodecFactory {

    /**
     * Extracts the codec from a given video file.
     * The codec is determined based on the codec type of the video file.
     * This method supports extraction of 'mp4' and 'ogg' codecs.
     *
     * @param file The video file from which the codec is to be extracted.
     * @return A Codec object representing the extracted codec.
     */
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}