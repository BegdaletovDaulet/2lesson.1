package com.company;

public class Main {

    public static void main(String[] args) {

        Shelter romashka = new Shelter("Ramashka", "Ibrainova 96");

        Dog sharik = new Dog();
        sharik.setShelter(romashka);
        Dog layka = new Dog("Layka", "Чихуахуа", Color.BLACK, romashka);
        layka.setShelter(romashka);
        Dog barsik = new Dog("Barsik", "Домашняя", Color.BROWN, romashka, new String[]{"Стоять ", "Сидеть"});
        barsik.setShelter(romashka);

        System.out.println(barsik.getInfo());
        System.out.println("___________________________________");
        System.out.println(layka.getInfo());
        System.out.println("________________________________________");
        System.out.println(sharik.getInfo());

        barsik.makeVoice("Гав гав", 3);
        barsik.makeVoice(2, "Гав гав");
        barsik.makeVoice("Гав");

        System.out.println("______________________________");

        sharik.makeVoice("Гав гав", 3);
        sharik.makeVoice("Гав гав");
        sharik.makeVoice(1, "Гав гав");

        System.out.println("___________________________________");

        layka.makeVoice("Гав гав", 1);
        layka.makeVoice(1, "Гав гав");
        layka.makeVoice("Гав гав");

    }
}
