package tamagochi;

public class Tamagochi implements Runnable {
    //Класс тамагочи. Реализует интерфейс, что позволяет использовать нам прелести многопоточности
        private static final TamagochiProperties TAMAGOCHI_PROPERTIES =
                new TamagochiProperties(1000, 1000, 1000, 1000, 200, 100, 50, 200);


        private int levelSleep;
        private int levelPlay;
        private int levelEat;
        private int levelToilet;
        private TamagochiProperties properties;

        public Tamagochi() {
            this.levelSleep = TAMAGOCHI_PROPERTIES.getMaxLevelSleep();
            this.levelPlay = TAMAGOCHI_PROPERTIES.getMaxLevelPlay();
            this.levelEat = TAMAGOCHI_PROPERTIES.getMaxLevelEat();
            this.levelToilet = TAMAGOCHI_PROPERTIES.getMaxLevelToilet();
            this.properties = TAMAGOCHI_PROPERTIES;
        }

        @Override
        public void run() {
            //это метод из многопоточности. запускает отдельный поток и выполняет то что в нем
            while (true) {
                if (levelEat < 0 || levelSleep < 0 || levelPlay < 0 || levelToilet < 0) {
                    rip();
                    break;
                }
                decLevels();
                needSome();
                sleep();
            }
        }

        private void needSome() {
            //проверяем, что хочет тамагочки наш
            if (this.levelPlay < properties.getLevelPlayDec() * 2)
                needPlay();
            if (this.levelEat < properties.getLevelEatDec() * 2)
                needEat();
            if (this.levelSleep < properties.getLevelSleepDec() * 2)
                needSleep();
            if (this.levelToilet < properties.getLevelToiletDec() * 2)
                needToilet();
        }


        private void decLevels() {
            //уменьшаем параметры довольности
            this.levelPlay -= properties.getLevelPlayDec();
            this.levelEat -= properties.getLevelEatDec();
            this.levelSleep -= properties.getLevelSleepDec();
            this.levelToilet -= properties.getLevelToiletDec();
        }

        private void sleep() {
            //потоку надо спать иначе тамагочи умрет быстрее чем свобода слова в 1984
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void needSleep() {
            System.out.println("I need some sleep, nya =^_^=");
        }

        public void needPlay() {
            System.out.println("I need some play, nya =^_^=");
        }

        public void needEat() {
            System.out.println("I need some eat, nya =^_^=");
        }

        public void needToilet() {
            System.out.println("I need some toilet, nya =^_^=");
        }

        public void rip() {
            System.out.println(" _________");
            System.out.println("|         |");
            System.out.println("|  R.I.P  |");
            System.out.println("|  C A T  |");
            System.out.println("|_________| ");
        }

        public void setSleep() {
            this.levelSleep = properties.getMaxLevelSleep();
            System.out.println("ZzzZZZzzzZZzzz");
        }

        public void setPlay() {
            this.levelPlay = properties.getMaxLevelPlay();
            System.out.println("MrrrrMrrMrrrr");


        }

        public void setEat() {
            this.levelEat = properties.getMaxLevelEat();
            System.out.println("OmNomNom");
        }

        public void setToilet() {
            this.levelToilet = properties.getMaxLevelToilet();
            System.out.println("kaka");
        }

    }