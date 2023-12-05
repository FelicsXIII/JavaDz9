import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void shouldSetCurrentNumber() { // тест текущий номер станции
        Radio radio = new Radio();
        radio.setCurrentNumberRadioStation(10);

        int expected = 9;
        int actual = radio.currentNumberRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetMaxCurrentNumber() { // тест макс номер станции
        Radio radio = new Radio();
        radio.setMaxNumberRadioStation();

        int expected = 9;
        int actual = radio.currentNumberRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetMinCurrentNumber() { // тест мин номер станции
        Radio radio = new Radio();
        radio.setMinNumberRadioStation();

        int expected = 0;
        int actual = radio.currentNumberRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNextCurrentNumber() { // следующая станция
        Radio radio = new Radio();
        radio.nextNumberRadioStation(9);

        int expected = 0;
        int actual = radio.currentNumberRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldPrevCurrentNumber() { // предыдущая станция
        Radio radio = new Radio();
        radio.prevNumberRadioStation(0);

        int expected = 9;
        int actual = radio.currentNumberRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldcurrentVolume() { // тест текущая громкость
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);

        int expected = 100;
        int actual = radio.currentSoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldMaxVolume() { // тест макс громкость
        Radio radio = new Radio();
        radio.setMaxSoundVolume();

        int expected = 100;
        int actual = radio.currentSoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldMinVolume() { // тест мин громкость
        Radio radio = new Radio();
        radio.setMinSoundVolume();

        int expected = 0;
        int actual = radio.currentSoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseVolume() { // тест увеличения громкости
        Radio radio = new Radio();
        radio.increaseVolume(2);

        int expected = 3;
        int actual = radio.currentSoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreaseVolume() { // тест уменьшения громкости
        Radio radio = new Radio();
        radio.decreaseVolume(50);

        int expected = 49;
        int actual = radio.currentSoundVolume;

        Assertions.assertEquals(expected, actual);
    }

}

