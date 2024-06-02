package less1.practice.impl;

import less1.practice.Product;
import java.time.LocalDate;

public class BootleOffWater extends Product {

    private float volume;
    private String pack;
    private boolean isSpark;

    public BootleOffWater(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = 1;
        this.pack = EPackage.PlASTIC.getMaterial();
    }
    public BootleOffWater(String name, double price, LocalDate releaseDate, boolean spark, String pack, float volume) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = volume;
        this.pack = pack;
    }

    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSpark() {
        return isSpark;
    }

    @Override
    public String toString() {
        return "BootleOffWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", RD=" + releaseDate +
                ", volume=" + volume +
                ", pack='" + pack + '\'' +
                ", isSpark=" + isSpark +
                '}';
    }
}
