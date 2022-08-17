package ru.netology.java.tutorial;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor

public class Radio {
    private int amountOfRadioStations = 10;
    private boolean verificationForAmountOfStation;
    private int maxRadioStation;
    private final int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;

    private final int minSoundVolume = 0;
    private final int maxSoundVolume = 100;
    private int currentSoundVolume = minSoundVolume;


    public Radio(int amountOfRadioStations) {
        this.amountOfRadioStations = amountOfRadioStations;
    }

    public Radio() {
    }

    public boolean verifyAmountOfStations() {
        if (amountOfRadioStations <= 0) return false;
        else return true;
    }

    public int countMaxStations() {
        verificationForAmountOfStation = verifyAmountOfStations();
        if (verificationForAmountOfStation == true) return maxRadioStation = amountOfRadioStations - 1;
        else return maxRadioStation;
    }

    public void setCurrentRadioStation(int numberOfStation) {
        maxRadioStation = countMaxStations();
        if (numberOfStation < minRadioStation || numberOfStation > maxRadioStation) {
            return;
        }
        currentRadioStation = numberOfStation;
    }

    public void nextRadioStation() {
        maxRadioStation = countMaxStations();
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }
        currentRadioStation = ++currentRadioStation;
    }

    public void prevRadioStation() {
        maxRadioStation = countMaxStations();
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation = --currentRadioStation;
    }

    public void setCurrentSoundVolume(int loudnessOfSound) {
        if (loudnessOfSound < minSoundVolume || loudnessOfSound > maxSoundVolume) {
            return;
        }
        currentSoundVolume = loudnessOfSound;
    }

    public void increaseSoundVolume() {
        if (currentSoundVolume == maxSoundVolume) {
            return;
        }
        currentSoundVolume = ++currentSoundVolume;
    }

    public void turnDownSoundVolume() {
        if (currentSoundVolume == minSoundVolume) {
            return;
        }
        currentSoundVolume = --currentSoundVolume;
    }
}