package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testCreateBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("regular")
                .burgers(1)
                .sauce("standard")
                .ingredient(Ingredient.LETTUCE)
                .ingredient(Ingredient.ONION)
                .ingredient(Ingredient.BECKON)
                .build();

        System.out.println(bigmac);

        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();
        String bun = bigmac.getBun();
        String sauce = bigmac.getSauce();

        //Then
        assertEquals(1, howManyBurgers);
        assertEquals(3, howManyIngredients);
        assertEquals("regular", bun);
        assertEquals("standard", sauce);
    }
}
