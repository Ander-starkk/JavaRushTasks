package com.javarush.task.pro.task12.task1224;

/* 
Подключение к системе
*/

import java.util.Arrays;

public class Solution {
    public final static Planet LULG;

    static {
        LULG = new Planet("Лулг");
        LULG.stations = new Planet.OrbitalStation[]{new Planet.OrbitalStation("Большое Орбитальное Кольцо")};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConnection(LULG)));
    }

    public static int[] getConnection(Planet planet) {
        Planet.OrbitalStation[] orbitalStations = planet.stations;
        for (int i = 0; i < orbitalStations.length; i++) {
            Planet.OrbitalStation orbitalStation = orbitalStations[i];
            Planet.OrbitalStation.ControlSystem controlSystem = orbitalStation.controlSystem;
            int interfacesLength = controlSystem.getInterfacesNumber();
            for (int j = 0; j < interfacesLength; j++) {
                Boolean answer = controlSystem.connect(j);
                if (answer == Boolean.TRUE) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
