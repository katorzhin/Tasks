package module6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PerfomanceChecker {
    static void checkAdding(int count){
        long startTime = System.currentTimeMillis();
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(i+1);
//            System.out.print(i+" ");
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("\nTime work = "+(finishTime-startTime)+" ms");
    }
    static void checkReading(int count){
        List<Integer>list=new ArrayList<>();
        //Random random = new Random();
        int random = (int)Math.random()* ++count;
        for (int i = 0; i < count; i++) {
            list.add(i+1);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.get(random);
           System.out.print(list.get(random)+" ");
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("\nTime work = "+(finishTime-startTime)+" ms");
    }
    static void checkRemoving(int count) {
        List<Integer> list=new ArrayList<>();
        //Random random = new Random();
        int random = (int)Math.random()* ++count;
        for (int i = 0; i < count; i++) {
            list.add(i+1);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.get(random);
            list.remove(random);
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("\nTime work = "+(finishTime-startTime)+" ms");
    }


    public static void main(String[] args) {
        //checkAdding(100000);
        //checkReading(100);
        checkRemoving(100);
    }


}
/*
Написать классу публичные методы для проверки:
Скорости вставки в коллекции - checkAdding(int count)
Функция создает пустую коллекцию, запускает таймер и начинает заполнять пустую коллекцию элементами по одному. Кол-во элементов = count


Скорости считывания с коллекции - checkReading(int count)
Функция должна создать коллекцию, заполнить ее на count элементов. Запустить таймер и начать count раз брать рандомный индекс элемента в коллекции и считывать его по индексу.


Скорости удаления из коллекции - checkRemoving(int count)
Функция должна создать коллекцию, заполнить ее на count элементов. Запустить таймер и начать count раз брать рандомный индекс элемента в коллекции и удалять его по индексу.

 */