package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final String bun;
    private final String sauce;
    private final List<String> ingredients;

    final static String BUN_WITH_SESAME = "with sesame";
    final static String BUN_NO_SESAME = "no sesame";
    final static String SOUCE_STANDARD = "standard";
    final static String SOUCE_THOUSAND_ISLAND = "thousand island";
    final static String SOUCE_BARBECUE = "barbecue";
    final static String INGREDIENT_SALAD = "salad";
    final static String INGREDIENT_ONION = "onion";
    final static String INGREDIENT_BECKON = "beckon";
    final static String INGREDIENT_CUCUMBER = "cucumber";
    final static String INGREDIENT_CHILI = "chili";
    final static String INGREDIENT_MUSHROOMS = "mushrooms";
    final static String INGREDIENT_SHRIMP = "shrimp";
    final static String INGREDIENT_CHEESE = "cheese";


    public static class BigMacBuilder {
        private String bun;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            if (bun.equals(BUN_NO_SESAME) || bun.equals(BUN_WITH_SESAME)) {
                this.bun = bun;
            } else {
                throw new IllegalStateException();
            }

            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, sauce, ingredients);
        }
    }

    private BigMac(String bun, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
