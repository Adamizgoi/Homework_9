package ru.netology.java.tutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio defaultStation = new Radio();
    Radio customStation = new Radio(25);

    @Test
    public void mustBeDefaultModeOfRadioStation() {

        int expected = 10;
        int actual = defaultStation.getAmountOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationIfNumberIsCorrect() {
        customStation.setCurrentRadioStation(6);

        int expected = 6;
        int actual = customStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationIfNumberIsBoundaryMin() {
        customStation.setCurrentRadioStation(0);

        int expected = 0;
        int actual = customStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationIfNumberIsBoundaryMax() {
        customStation.setCurrentRadioStation(24);

        int expected = 24;
        int actual = customStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationIfNumberIsAboveMax() {
        customStation.setCurrentRadioStation(25);

        int expected = 0;
        int actual = customStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationIfNumberIsBelowMin() {
        customStation.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = customStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnNextRadioStationIfCurrentIsMin() {
        customStation.nextRadioStation();

        int expected = 1;
        int actual = customStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnNextRadioStationIfCurrentIsBetweenMinAndMax() {
        customStation.setCurrentRadioStation(5);
        customStation.nextRadioStation();

        int expected = 6;
        int actual = customStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnNextZeroStationIfCurrentIsMax() {
        customStation.setCurrentRadioStation(24);
        customStation.nextRadioStation();

        int expected = 0;
        int actual = customStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnPreviousRadioStationIfCurrentIsDefaultMax() {
        customStation.setCurrentRadioStation(24);
        customStation.prevRadioStation();

        int expected = 23;
        int actual = customStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnPreviousRadioStationIfCurrentIsBetweenMinAndMax() {
        customStation.setCurrentRadioStation(5);
        customStation.prevRadioStation();

        int expected = 4;
        int actual = customStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnPreviousMaxStationIfCurrentIsMin() {
        customStation.prevRadioStation();

        int expected = 24;
        int actual = customStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeIfNumberIsCorrect() {
        customStation.setCurrentSoundVolume(25);

        int expected = 25;
        int actual = customStation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeIfNumberIsBoundaryMin() {
        customStation.setCurrentSoundVolume(0);

        int expected = 0;
        int actual = customStation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeIfNumberIsBoundaryMax() {
        customStation.setCurrentSoundVolume(100);

        int expected = 100;
        int actual = customStation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeSoundIfNumberIsAboveMax() {
        customStation.setCurrentSoundVolume(101);

        int expected = 0;
        int actual = customStation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeIfNumberIsBelowMin() {
        customStation.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = customStation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeIfCurrentIsMin() {
        customStation.increaseSoundVolume();

        int expected = 1;
        int actual = customStation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeIfCurrentIsBetweenMinAndMax() {
        customStation.setCurrentSoundVolume(5);
        customStation.increaseSoundVolume();

        int expected = 6;
        int actual = customStation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseSoundVolumeIfCurrentIsMax() {
        customStation.setCurrentSoundVolume(100);
        customStation.increaseSoundVolume();

        int expected = 100;
        int actual = customStation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownSoundVolumeIfCurrentIsMax() {
        customStation.setCurrentSoundVolume(100);
        customStation.turnDownSoundVolume();

        int expected = 99;
        int actual = customStation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownSoundVolumeIfCurrentIsBetweenMinAndMax() {
        customStation.setCurrentSoundVolume(5);
        customStation.turnDownSoundVolume();

        int expected = 4;
        int actual = customStation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDownSoundVolumeIfCurrentIsMin() {
        customStation.turnDownSoundVolume();

        int expected = 0;
        int actual = customStation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustBeAbilityToCustomAmountOfStationsEqualToDefault() {
        Radio customStation = new Radio(10);

        int expected = 10;
        int actual = customStation.getAmountOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustBeAbilityToCustomAmountOfStationsLessThanDefault() {
        Radio customStation = new Radio(6);

        int expected = 6;
        int actual = customStation.getAmountOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustBeAbilityToCustomAmountOfStationsPlusOneToMin() {
        Radio customStation = new Radio(1);

        int expected = 1;
        int actual = customStation.getAmountOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustNotBeAbilityToCustomZeroAmountOfStations() {
        Radio customStation = new Radio(0);

        int expected = 0;
        int actual = customStation.getAmountOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifAmountOfStationsLessThanZeroMaxRadioStationsIsStillCorrect() {
        Radio customStation = new Radio(-1);

        int expected = 0;
        int actual = customStation.getMaxRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}


