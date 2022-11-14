package org.fedicode.oopchallengetest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient("Tom", 25,
                new Eyes("Left Eye", "Short sighted", "Blue", true),
                new Eyes("Right Eye", "Normal", "Blue", true),
                new Heart("Normal", 65),
                new Stomach("PUD", true),
                new Skin("Burned", "White", 40));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("Choose an Organ:");
            System.out.println("\t1. " + patient.getLeftEye().getName());
            System.out.println("\t2. " + patient.getRightEye().getName());
            System.out.println("\t3. " + patient.getHeart().getName());
            System.out.println("\t4. " + patient.getStomach().getName());
            System.out.println("\t5. " + patient.getSkin().getName());
            System.out.println("\t6. Quit");
            int organ = scanner.nextInt();
            int answer = 0;
            switch (organ) {
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpened()) {
                        System.out.println("\t\t1. Close the Eye");
                        answer = scanner.nextInt();
                        if (answer == 1) {
                            patient.getLeftEye().closeEye();
                            break;
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("\t\t1. Open the Eye");
                        answer = scanner.nextInt();
                        if (answer == 1) {
                            patient.getLeftEye().openEye();
                            break;
                        } else {
                            break;
                        }
                    }
                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpened()) {
                        System.out.println("\t\t1. Close the Eye");
                        answer = scanner.nextInt();
                        if (answer == 1) {
                            patient.getRightEye().closeEye();
                            break;
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("\t\t1. Open the Eye");
                        answer = scanner.nextInt();
                        if (answer == 1) {
                            patient.getRightEye().openEye();
                            break;
                        } else {
                            break;
                        }
                    }
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    answer = scanner.nextInt();
                    if (answer == 1) {
                        System.out.println("Enter the new heart rate:");
                        int heartRate = scanner.nextInt();
                        patient.getHeart().setHeartRate(heartRate);
                        System.out.println("Heart rate changed to: " + patient.getHeart().getHeartRate());
                        break;
                    } else {
                        break;
                    }
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    answer = scanner.nextInt();
                    if (answer == 1) {
                        patient.getStomach().digest();
                        break;
                    } else {
                        break;
                    }
                case 5:
                    patient.getSkin().getDetails();
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    break;
            }
        }

    }
}
