package main.java.creational.builder;

import main.java.creational.builder.models.Color;
import main.java.creational.builder.models.Lemonade;
import main.java.creational.builder.models.Straw;

public class BuilderMain {

    public static void main(String[] args) {
        Lemonade lemonade = new Lemonade.LemonadeBuilder()
                .setLemons(2)
                .setWaterMilliliters(250)
                .setSugarGrams(10)
                .setStraw(new Straw(Color.BLUE, 250))
                .build();

        System.out.println(lemonade);
    }
}
