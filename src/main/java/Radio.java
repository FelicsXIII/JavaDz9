public class Radio {
    public int currentNumberRadioStation; // текущая станция

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation > 9) {
            newCurrentNumberRadioStation = setMaxNumberRadioStation();
        }
        if (newCurrentNumberRadioStation < 0) {
            newCurrentNumberRadioStation = setMinNumberRadioStation();
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;

    }

    public int setMaxNumberRadioStation() {
        currentNumberRadioStation = 9; // макс номер станции
        return currentNumberRadioStation;
    }

    public int setMinNumberRadioStation() {
        currentNumberRadioStation = 0; // мин номер станции
        return currentNumberRadioStation;
    }

    public void nextNumberRadioStation(int currentNumber) { //увеличение номера радиостанции
        if (currentNumber < 9) {
            currentNumberRadioStation = currentNumber + 1; // если меньше 9 то +1
        }
        if (currentNumber == 9) {
            currentNumberRadioStation = setMinNumberRadioStation(); // если 9 то мин номер
        }
    }

    public void prevNumberRadioStation(int currentNumber) { //уменьшение номера радиостанции
        if (currentNumber > 0) {
            currentNumberRadioStation = currentNumber - 1; // если меньше 0 то -1
        }
        if (currentNumber == 0) {
            currentNumberRadioStation = setMaxNumberRadioStation(); // если 0 то макс номер
        }
        if (currentNumber > 9) {
            currentNumberRadioStation = setMinNumberRadioStation();
        }
    }


    public int currentSoundVolume; // текущая громкость

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume > 100) {
            newCurrentSoundVolume = setMaxSoundVolume();
        }
        if (newCurrentSoundVolume < 0) {
            newCurrentSoundVolume = setMinSoundVolume();
        }
        currentSoundVolume = newCurrentSoundVolume;

    }

    public int setMaxSoundVolume() {
        currentSoundVolume = 100; // макс громкость 100
        return currentSoundVolume;
    }

    public int setMinSoundVolume() {
        currentSoundVolume = 0; // мин громкость 0
        return currentSoundVolume;
    }

    public void increaseVolume(int currentSound) { //увеличение громкости звука
        if (currentSound < 100) {
            currentSoundVolume = currentSound + 1; // если меньше 100 то +1
        }
        if (currentSound == 100) {
            currentSoundVolume = setMaxSoundVolume(); // если 100 то макс громкость
        }
    }

    public void decreaseVolume(int currentSound) {  // уменьшение громкости звука
        if (currentSound <= 0) {
            currentSoundVolume = setMinSoundVolume(); // если меньше или равно 0 = мин громкость
        }

        if (currentSound > 0) {
            currentSoundVolume = currentSound - 1;
        }

        if (currentSound > 100) {
            currentSoundVolume = setMaxSoundVolume(); // если 100 то макс громкость
        }
    }
}
