package com.example.tweetproducer.controller;

import com.example.tweetproducer.Util.TweetTextGenerator;
import com.example.tweetproducer.model.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class Tweet {

    @GetMapping("/fetchTweet")
    public Data getTweet() {
        String id = UUID.randomUUID().toString();
        String text = TweetTextGenerator.getText();

        return new Data(id, text);
    }
}
