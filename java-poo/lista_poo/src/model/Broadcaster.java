package model;

public class Broadcaster {
    public Broadcaster(String broadCasterName) {
        this.broadCasterName = broadCasterName;
    }

    public String getBroadCasterName() {
        return broadCasterName;
    }

    public void setBroadCasterName(String broadCasterName) {
        this.broadCasterName = broadCasterName;
    }

    private String broadCasterName;

}
