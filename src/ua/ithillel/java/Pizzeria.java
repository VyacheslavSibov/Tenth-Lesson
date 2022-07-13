package ua.ithillel.java;
// ctrl + alt + L

import java.util.Arrays;

public class Pizzeria {

    public static void main(String[] args) {
        Pizza[] menu;
        Pizza pizzaBBQ = new Pizza(30, new String[]{"Курица", "Бекон", "Грибы", "Соус Барбекю" , "Моцарела"},
                "Пицца Барбекю", 149.99);

        Pizza pizzaCarbonara = new Pizza(30, new String[]{"Лук","Бекон","Ветчина","Грибы","Моцарела","Соус Альфредо"},
                "Пицца Карбонара ", 165.00);

        Pizza pizzaGrillMix = new Pizza(30, new String[]{"Курица","Фрикадельки","Бекон","Моцарелла","Болг.перец"},
                "Пицца Гриль Микс", 155.99);

        menu = new Pizza[]{pizzaBBQ, pizzaCarbonara, pizzaGrillMix};
        System.out.println("Меню: ");

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Название пиццы: " + menu[i].name);
            System.out.println("Состав: " + Arrays.toString(menu[i].composition));
            System.out.println("Размер пиццы: " + menu[i].basis.radius * 2);
            System.out.println("Цена: " + menu[i].cost);
            System.out.println("           ");
        }
    }
}

