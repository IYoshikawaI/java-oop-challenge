package org.fedicode.oopchallengetest;

public class Heart extends Organ{

    private int heartRate;

    public Heart(String medicalCondition, int heartRate) {
        super("Heart", medicalCondition);
        this.heartRate = heartRate;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart rate: " + this.getHeartRate());
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
