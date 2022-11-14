package org.fedicode.oopchallengetest;

public class Skin extends Organ{

    private String color;
    private int softness;

    public Skin(String medicalCondition, String color, int softness) {
        super("Skin", medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin Color: " + this.getColor());
    }

    public String getColor() {
        return color;
    }
}
