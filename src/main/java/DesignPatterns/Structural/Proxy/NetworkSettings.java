package DesignPatterns.Structural.Proxy;

public class NetworkSettings {
    public ISP getInternet(){
        return new InternetProxy();
    }

    public ISP getISP(){
        return new Jio();
    }
}