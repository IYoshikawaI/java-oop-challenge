package org.fedicode.oopchallengetest;

public class Patient {

    private String name;
    private int age;
    private Eyes leftEye;
    private Eyes rightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Patient(String name, int age, Eyes leftEye, Eyes rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Eyes getLeftEye() {
        return leftEye;
    }

    public Eyes getRightEye() {
        return rightEye;
    }

    public Heart getHeart() {
        return heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public Skin getSkin() {
        return skin;
    }
}
