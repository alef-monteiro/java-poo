package model;

import IModel.IClock;
import IModel.IRadio;

import java.util.Date;

public class RadioClock implements IClock, IRadio {
    private Date hour;
    private int hourAlarm;
    private String broadcaster;
    private String broadcasterType;
    private int volumeRadio;
    private int volumeClock;

    public RadioClock(Date hour, int hourAlarm, String broadcaster, String broadcasterType, int volumeRadio, int volumeClock) {
        this.hour = hour;
        this.hourAlarm = hourAlarm;
        this.broadcaster = broadcaster;
        this.broadcasterType = broadcasterType;
        this.volumeRadio = volumeRadio;
        this.volumeClock = volumeClock;
    }


    @Override
    public void setTime(Date hours) {

    }

    @Override
    public void getTime() {

    }

    @Override
    public void setTimeAlarm(Date hours) {

    }


    @Override
    public void getTimeAlarm() {

    }

    @Override
    public void turnAlarmOn() {

    }

    @Override
    public void turnAlarmOFF() {

    }

    @Override
    public void setVolumeAlarm(int vol) {

    }

    @Override
    public void setVolumeAlarm() {

    }

    @Override
    public void setBroadcaster(Broadcaster broadcaster) {

    }

    @Override
    public void getBroadcaster() {

    }

    @Override
    public void setVolumeRadio(int vol) {

    }

    @Override
    public void getVolumeRadio() {

    }

    @Override
    public void getBroadcastType() {

    }
}
