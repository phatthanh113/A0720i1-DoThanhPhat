package Bai4_Class_Object.Thuc_hanh.TV;

public class TV {
    private int channel;
    private int volumeLevel;
    private boolean on;

    public TV() {
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }
    public void turnOn() {
        on=true;
    }
    public void turnOff() {
        on=false;
    }
    public void setChannel(int channel) {
        if(on && channel>=1 && this.channel<=120) {
            this.channel=channel;
        }
    }
    public void setVolume(int volumeLevel) {
        if(this.on) {
            if(volumeLevel>=1 && volumeLevel<=7)
            this.volumeLevel=volumeLevel;
        }
    }
    public void channelUp() {
        if(on && this.channel>=1) {
            this.channel++;
        }

    }
    public void channelDown() {
        if(on && this.channel<=120) {
            this.channel--;
        }
    }
    public void volumeUp() {
        if(on && this.volumeLevel <=7)
        this.volumeLevel++;
    }
    public void volumeDown() {
        if(on && this.volumeLevel >=1)
        this.volumeLevel--;
    }
}
