package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BigMac {
    private final String bun;
    private final String sauce;
    private final List<String> ingredients;

    public final static String BUN_WITH_SESAME = "with sesame";
    public final static String BUN_NO_SESAME = "no sesame";
    public final static String SAUCE_STANDARD = "standard";
    public final static String SAUCE_THOUSAND_ISLAND = "thousand island";
    public final static String SAUCE_BARBECUE = "barbecue";
    public final static String INGREDIENT_SALAD = "salad";
    public final static String INGREDIENT_ONION = "onion";
    public final static String INGREDIENT_BECKON = "beckon";
    public final static String INGREDIENT_CUCUMBER = "cucumber";
    public final static String INGREDIENT_CHILI = "chili";
    public final static String INGREDIENT_MUSHROOMS = "mushrooms";
    public final static String INGREDIENT_SHRIMP = "shrimp";
    public final static String INGREDIENT_CHEESE = "cheese";
    public final static String EXCEPTION_COMMUNIQUE = "Please choose once again, illegal component.";


    public static class BigMacBuilder {
        private String bun;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();
        private final Set<String> products = new HashSet<>();

        public BigMacBuilder() {
            products.add(BUN_WITH_SESAME);
            products.add(BUN_NO_SESAME);
            products.add(SAUCE_BARBECUE);
            products.add(SAUCE_STANDARD);
            products.add(SAUCE_THOUSAND_ISLAND);
            products.add(INGREDIENT_BECKON);
            products.add(INGREDIENT_CHEESE);
            products.add(INGREDIENT_CHILI);
            products.add(INGREDIENT_CUCUMBER);
            products.add(INGREDIENT_MUSHROOMS);
            products.add(INGREDIENT_ONION);
            products.add(INGREDIENT_SALAD);
            products.add(INGREDIENT_SHRIMP);
        }

        public BigMacBuilder bun(String bun) {
            if (products.contains(bun)) {
                this.bun = bun;
            } else {
                throw new IllegalStateException(EXCEPTION_COMMUNIQUE);
            }
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            if (products.contains(sauce)) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException(EXCEPTION_COMMUNIQUE);
            }
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            if (products.contains(ingredient)) {
                this.ingredients.add(ingredient);
            } else {
                throw new IllegalStateException(EXCEPTION_COMMUNIQUE);
            }
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

    public List<String> howManyIngredients() {
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
