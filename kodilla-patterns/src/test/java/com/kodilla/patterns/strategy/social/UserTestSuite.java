package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("UserM");
        User user2 = new ZGeneration("UserZ");
        User user3 = new YGeneration("UserY");

        //When
        String facebook = user1.sharePost().share();
        String snapchat = user2.sharePost().share();
        String twitter = user3.sharePost().share();

        //Then
        assertEquals("Facebook", facebook);
        assertEquals("Snapchat", snapchat);
        assertEquals("Twitter", twitter);
    }

    @Test
    void testIndividualSharingStrategies() {
        //Given
        User user1 = new Millenials("UserM");

        //When
        String social = user1.sharePost().share();
        System.out.println("Social publisher: " + social);
        user1.setSocialPublisher(new TwitterPublisher());
        social = user1.sharePost().share();
        System.out.println("Social publisher after: " + social);

        //Then
        assertEquals("Twitter", social);
    }
}
