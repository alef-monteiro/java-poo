package IModel;

import java.util.Date;

public interface IClock {
    void setTime(Date hours);
    void getTime();

    void setTimeAlarm(Date hours);
    void getTimeAlarm();

    void turnAlarmOn();
    void turnAlarmOFF();

    void setVolumeAlarm(int vol);
    void setVolumeAlarm();
}
