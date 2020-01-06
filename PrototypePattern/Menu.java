package PrototypePattern;

public class Menu {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();
        tea.prepareRecipe();
        coffee.prepareRecipe();
    }
}
