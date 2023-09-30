package com.example.tweetproducer.Util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TweetTextGenerator {

    public static List<String> topicList = Arrays.asList("Buffalo", "Covid19", "Crypto");

    public static String getText() {
        // Array of words
        String[] words = {
                "The", "quick", "brown", "fox", "jumps",
                "over", "the", "lazy", "dog", "in",
                "a", "beautiful", "park", "on", "a",
                "sunny", "day", "with", "a", "clear",
                "blue", "sky", "Cloudera", "Technology", "Silicon Valley"
        };

        // Random number generator
        Random rand = new Random();

        // Generate a random 5-word sentence
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int randomIndex = rand.nextInt(words.length);
            sentence.append(words[randomIndex]).append(" ");
        }

        sentence.append(rand.nextInt(topicList.size()));

        // Remove the trailing space
        String randomSentence = sentence.toString().trim();


        return randomSentence;
    }
}
