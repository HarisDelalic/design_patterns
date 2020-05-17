package main.java.creational.builder.models;

public class Lemonade {
    private int waterMilliliters;
    private int sugarGrams;
    private int lemons;
    private Straw straw;

    @Override
    public String toString() {
        return "Water amount in milliliters: " + waterMilliliters
                + ", Sugar amount in grams: " + sugarGrams
                + ", Number of lemons used: " + lemons
                + ", Straw used: " + straw;
    }

    private Lemonade(LemonadeBuilder lemonadeBuilder) {
        this.waterMilliliters = lemonadeBuilder.waterMilliliters;
        this.sugarGrams = lemonadeBuilder.sugarGrams;
        this.lemons = lemonadeBuilder.lemons;
        this.straw = lemonadeBuilder.straw;
    }

    public static class LemonadeBuilder {
        private int waterMilliliters;
        private int sugarGrams;
        private int lemons;
        private Straw straw;

        public LemonadeBuilder setWaterMilliliters(int waterMilliliters) {
            this.waterMilliliters = waterMilliliters;
            return this;
        }

        public LemonadeBuilder setSugarGrams(int sugarGrams) {
            this.sugarGrams = sugarGrams;
            return this;
        }

        public LemonadeBuilder setLemons(int lemons) {
            this.lemons = lemons;
            return this;
        }

        public LemonadeBuilder setStraw(Straw straw) {
            this.straw = straw;
            return this;
        }

        public Lemonade build() {
            return new Lemonade(this);
        }
    }
}
