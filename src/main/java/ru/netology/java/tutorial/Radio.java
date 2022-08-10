
package ru.netology.java.tutorial;
public class Radio {
    int currentRadioStation;
    int currentSoundVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int numberOfStation) {
        if (numberOfStation < 0 || numberOfStation > 9) {
            return;
        }
        currentRadioStation = numberOfStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
            return;
        }
        currentRadioStation = currentRadioStation + 1;
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
            return;
        }
        currentRadioStation = currentRadioStation - 1;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int loudnessOfSound) {
        if (loudnessOfSound < 0 || loudnessOfSound > 10) {
            return;
        }
        currentSoundVolume = loudnessOfSound;
    }

    public void increaseSoundVolume() {
        if (currentSoundVolume == 10) {
            return;
        }
        currentSoundVolume = currentSoundVolume + 1;
    }

    public void turnDownSoundVolume() {
        if (currentSoundVolume == 0) {
            return;
        }
        currentSoundVolume = currentSoundVolume - 1;
    }
}