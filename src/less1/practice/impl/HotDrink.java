package less1.practice.impl;

import less1.practice.Product;

import java.time.LocalDate;

public class HotDrink extends Product {
    protected int temperature;
    protected float volume;
    protected String type;


    public HotDrink(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.temperature = 100;
        this.volume = 0.2F;
        this.type = TypeHotDrink.TEA.getDrink();
    }

    public HotDrink(String name, double price, LocalDate releaseDate, int temperature, String type, float volume) {
        super(name, price, releaseDate);
        this.temperature = temperature;
        this.type = type;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getType() {
        return type;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", volume=" + volume +
                ", price=" + price +
                ", temperature=" + temperature +
                '}';
    }
}
