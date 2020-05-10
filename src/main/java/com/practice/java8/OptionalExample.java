package com.practice.java8;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args){

    }

    public void demo(){
        Computer computer = new Computer();


    }

}



class Computer {
    private Optional<Soundcard> soundcard;
    public Optional<Soundcard> getSoundcard() { return soundcard;  }
}

class Soundcard {
    private Optional<USB> usb;
    public Optional<USB> getUSB() { return usb; }

}

class USB{
    public String getVersion(){  return "1";}
}
