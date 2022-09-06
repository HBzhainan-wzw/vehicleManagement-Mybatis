package com.wzw.pojo;

public class VehicleBind {
    private int uid;
    private int vid;

    public VehicleBind() {
    }

    public VehicleBind(int uid, int vid) {
        this.uid = uid;
        this.vid = vid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    @Override
    public String toString() {
        return "VehicleBind{" +
                "uid=" + uid +
                ", vid=" + vid +
                '}';
    }
}
