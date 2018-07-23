package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacBuilderTest {
    @Test
    public void testNewBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("with sesame")
                .sauce("barbecue")
                .ingredient("onion")
                .ingredient("salad")
                .ingredient("beckon")
                .ingredient("cucumber")
                .build();
        //When
        String whatBun = bigMac.getBun();
        String whatSauce = bigMac.getSauce();
        int howManyIngredients = bigMac.howManyIngredients().size();
        //Then
        Assert.assertEquals("with sesame", whatBun);
        Assert.assertEquals("barbecue", whatSauce);
        Assert.assertEquals(4, howManyIngredients, 0);
    }
}
