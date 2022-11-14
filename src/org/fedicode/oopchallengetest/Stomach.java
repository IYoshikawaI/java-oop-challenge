package org.fedicode.oopchallengetest;

public class Stomach extends Organ{

    private boolean isEmpty;

    public Stomach(String medicalCondition, boolean isEmpty) {
        super("Stomach", medicalCondition);
        this.isEmpty = isEmpty;
    }

    @Override
    public void getDetails() {
        super.getDetails();

        if (this.isEmpty()) {
            System.out.println("Need to be fed");
        } else {
            System.out.println("Stomach is full");
        }

    }

    public void digest() {
        if (this.isEmpty) {
            System.out.println("Digesting begin...");
            this.setEmpty(false);
        } else {
            System.out.println("Stomach is already full");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        this.isEmpty = empty;
    }
}
