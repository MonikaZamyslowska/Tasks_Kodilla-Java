package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

public class BigMacBuilderTest {
    @Test
    public void testNewBigMac() {
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("with sesame")
                .sauce("spicy")
                .ingredient("onion")
                .ingredient("salad")
                .ingredient("beckon")
                .ingredient("cucumber")
                .build();
    }
}
