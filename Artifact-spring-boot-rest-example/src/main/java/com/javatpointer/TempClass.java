package com.javatpointer;

public class TempClass {
    private float spo2;
    private float heartRate;
    private float bodyTemp;
    private float roomTemp;
    private float humidity;


    public TempClass(float spo2, float heartRate, float bodyTemp, float roomTemp, float humidity){
        super();
        this.spo2 = spo2;
        this.heartRate= heartRate;
        this.bodyTemp = bodyTemp;
        this.roomTemp = roomTemp;
        this.humidity = humidity; //humidity
    }

    public float getSpo2() {
        return spo2;
    }

    public void setSpo2(float spo2) {
        this.spo2 = spo2;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(float bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public float getRoomTemp() {
        return roomTemp;
    }

    public void setRoomTemp(float roomTemp) {
        this.roomTemp = roomTemp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

}
