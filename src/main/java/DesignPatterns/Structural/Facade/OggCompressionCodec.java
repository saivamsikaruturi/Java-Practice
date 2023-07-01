package DesignPatterns.Structural.Facade;

public class OggCompressionCodec implements CompressionCodec{

    @Override
    public String getType() {
        return "ogg";
    }
}