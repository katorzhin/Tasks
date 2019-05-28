package tamagochi;

public class TamagochiProperties {
    private int maxLevelSleep;
    private int maxLevelPlay;
    private int maxLevelToilet;
    private int maxLevelEat;

    private int levelSleepDec;
    private int levelPlayDec;
    private int levelToiletDec;
    private int levelEatDec;

    public TamagochiProperties(int maxLevelSleep,
                               int maxLevelPlay,
                               int maxLevelToilet,
                               int maxLevelEat,
                               int levelSleepDec,
                               int levelPlayDec,
                               int levelToiletDec,
                               int levelEatDec) {
        this.maxLevelSleep = maxLevelSleep;
        this.maxLevelPlay = maxLevelPlay;
        this.maxLevelToilet = maxLevelToilet;
        this.maxLevelEat = maxLevelEat;
        this.levelSleepDec = levelSleepDec;
        this.levelPlayDec = levelPlayDec;
        this.levelToiletDec = levelToiletDec;
        this.levelEatDec = levelEatDec;
    }

    public int getMaxLevelSleep() {
        return maxLevelSleep;
    }

    public void setMaxLevelSleep(int maxLevelSleep) {
        this.maxLevelSleep = maxLevelSleep;
    }

    public int getMaxLevelPlay() {
        return maxLevelPlay;
    }

    public void setMaxLevelPlay(int maxLevelPlay) {
        this.maxLevelPlay = maxLevelPlay;
    }

    public int getMaxLevelToilet() {
        return maxLevelToilet;
    }

    public void setMaxLevelToilet(int maxLevelToilet) {
        this.maxLevelToilet = maxLevelToilet;
    }

    public int getMaxLevelEat() {
        return maxLevelEat;
    }

    public void setMaxLevelEat(int maxLevelEat) {
        this.maxLevelEat = maxLevelEat;
    }

    public int getLevelSleepDec() {
        return levelSleepDec;
    }

    public void setLevelSleepDec(int levelSleepDec) {
        this.levelSleepDec = levelSleepDec;
    }

    public int getLevelPlayDec() {
        return levelPlayDec;
    }

    public void setLevelPlayDec(int levelPlayDec) {
        this.levelPlayDec = levelPlayDec;
    }

    public int getLevelToiletDec() {
        return levelToiletDec;
    }

    public void setLevelToiletDec(int levelToiletDec) {
        this.levelToiletDec = levelToiletDec;
    }

    public int getLevelEatDec() {
        return levelEatDec;
    }

    public void setLevelEatDec(int levelEatDec) {
        this.levelEatDec = levelEatDec;
    }
}
