/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b23902.i.terra;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/**
 * Это для генерации тестовых данных о еретиках
 */
public class DataGenerator {
    private final Faker faker;
    private final Random random;
    
    /**
     * Это конструктор класса DataGenerator
     */
    public DataGenerator() {
        this.faker = new Faker(new Locale("ru"));
        this.random = new Random();
    }
    
    /**
     * Генерация случайного объекта Heretic
     */
    public Heretic generateHeretic() {
        String name = faker.name().fullName();
        
        // Генерируем преступления
        String[] possibleCrimes = {
            "Ересь", "Мятеж", "Отрицание Императора", "Распространение запрещенных знаний",
            "Связь с ксеносами", "Использование запрещенной технологии", "Хранение архео-технологии",
            "Саботаж", "Дезертирство", "Подстрекательство к бунту"
        };
        
        StringBuilder crimes = new StringBuilder();
        int numCrimes = random.nextInt(3) + 1; // От 1 до 3 преступлений
        
        for (int i = 0; i < numCrimes; i++) {
            if (i > 0) {
                crimes.append(", ");
            }
            crimes.append(possibleCrimes[random.nextInt(possibleCrimes.length)]);
        }
        
        String lastLocation = faker.address().cityName() + ", сектор " + 
                              faker.address().buildingNumber();
        
        String identityId = "IMP-" + faker.numerify("######-##");
        
        Heretic.ThreatLevel[] threatLevels = Heretic.ThreatLevel.values();
        Heretic.ThreatLevel threatLevel = threatLevels[random.nextInt(threatLevels.length)];
        
        return new Heretic(name, crimes.toString(), lastLocation, identityId, threatLevel);
    }
    
    /**
     * Генерирует список еретиков заданного размера
     */
    public List<Heretic> generateHereticList(int count) {
        List<Heretic> heretics = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            heretics.add(generateHeretic());
        }
        return heretics;
    }
}