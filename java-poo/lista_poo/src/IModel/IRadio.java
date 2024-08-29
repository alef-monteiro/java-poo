package IModel;

import model.Broadcaster;

public interface IRadio {
    void setBroadcaster(Broadcaster broadcaster);
    void getBroadcaster();

    void setVolumeRadio(int vol);
    void getVolumeRadio();

    void getBroadcastType();
}
