package org.fedicode.oopchallengetest;

public class Eyes extends Organ {

    private String color;
    private boolean isOpened;

    public Eyes(String name, String medicalCondition, String color, boolean isOpened) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.getColor());
    }

    public void openEye() {
        System.out.println(this.getName() + " Opened");
        this.setOpened(true);
    }

    public void closeEye() {
        System.out.println(this.getName() + " Closed");
        this.setOpened(false);
    }

    public String getColor() {
        return color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        this.isOpened = opened;
    }
}
