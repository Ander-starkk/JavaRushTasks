package com.javarush.task.pro.task10.task1002;

/* 
Построим новый жилой комплекс JavaRush Towers
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";
    public int floor;

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }
    public Skyscraper( int floor) {
        this.floor = floor;
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floor);
    }
    public Skyscraper(String SKYSCRAPER_WAS_BUILD_DEVELOPER) {
        System.out.println(this.SKYSCRAPER_WAS_BUILD_DEVELOPER + SKYSCRAPER_WAS_BUILD_DEVELOPER);
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}

