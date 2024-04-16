package src.main.java.VideoConversionFacade.facade;

import src.main.java.VideoConversionFacade.complex_media_library.*;

import java.io.File;

/**
 * The VideoConversionFacade class acts as a facade for the video conversion process.
 * It simplifies the interface for video conversion by providing a single method for converting videos.
 */
public class VideoConversionFacade {

    /**
     * Converts a video file from one format to another.
     * The conversion process involves reading the file, decoding the video, encoding it in the new format, and writing the converted video to a file.
     *
     * @param fileName The name of the input video file.
     * @param format The desired output format.
     * @return A File object representing the converted video file.
     */
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}