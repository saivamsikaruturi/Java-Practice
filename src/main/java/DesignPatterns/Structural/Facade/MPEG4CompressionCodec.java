package DesignPatterns.Structural.Facade;

import DesignPatterns.Structural.Facade.CompressionCodec;

public class MPEG4CompressionCodec implements CompressionCodec {
    @Override
    public String getType() {
        return "mp4";
    }
}