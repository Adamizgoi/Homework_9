import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStationIfNumberIsCorrect() {
        Radio station = new Radio();

        station.setCurrentRadioStation(6);

        int expected = 6;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationIfNumberIsBoundaryMin() {
        Radio station = new Radio();

        station.setCurrentRadioStation(0);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationIfNumberIsBoundaryMax() {
        Radio station = new Radio();

        station.setCurrentRadioStation(9);

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationIfNumberIsAboveMax() {
        Radio station = new Radio();

        station.setCurrentRadioStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationIfNumberIsBelowMin() {
        Radio station = new Radio();

        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnNextRadioStationIfCurrentIsMin() {

        Radio station = new Radio();

        station.nextRadioStation();

        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnNextRadioStationIfCurrentIsBetweenMinAndMax() {

        Radio station = new Radio();

        station.setCurrentRadioStation(5);
        station.nextRadioStation();

        int expected = 6;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnNextZeroStationIfCurrentIsMax() {

        Radio station = new Radio();

        station.setCurrentRadioStation(9);
        station.nextRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnPreviousRadioStationIfCurrentIsMax() {

        Radio station = new Radio();

        station.setCurrentRadioStation(9);
        station.prevRadioStation();

        int expected = 8;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnPreviousRadioStationIfCurrentIsBetweenMinAndMax() {

        Radio station = new Radio();

        station.setCurrentRadioStation(5);
        station.prevRadioStation();

        int expected = 4;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnPreviousMaxStationIfCurrentIsMin() {

        Radio station = new Radio();

        station.prevRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeIfCurrentIsMin() {

        Radio station = new Radio();

        station.increaseSoundVolume();

        int expected = 1;
        int actual = station.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeIfCurrentIsBetweenMinAndMax() {

        Radio station = new Radio();

        station.setCurrentSoundVolume(5);
        station.increaseSoundVolume();

        int expected = 6;
        int actual = station.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseSoundVolumeIfCurrentIsMax() {

        Radio station = new Radio();

        station.setCurrentSoundVolume(10);
        station.increaseSoundVolume();

        int expected = 10;
        int actual = station.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownSoundVolumeIfCurrentIsMax() {

        Radio station = new Radio();

        station.setCurrentSoundVolume(10);
        station.turnDownSoundVolume();

        int expected = 9;
        int actual = station.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownSoundVolumeIfCurrentIsBetweenMinAndMax() {

        Radio station = new Radio();

        station.setCurrentSoundVolume(5);
        station.turnDownSoundVolume();

        int expected = 4;
        int actual = station.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDownSoundVolumeIfCurrentIsMin() {

        Radio station = new Radio();

        station.turnDownSoundVolume();

        int expected = 0;
        int actual = station.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}


