package less1.practice.impl;

public enum TypeHotDrink {
    TEA("Чай"), COFFEE("Кофе"), CHOCOLATE("Шоколад");

    private final String drink;

    TypeHotDrink(String drink) {
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }
}
