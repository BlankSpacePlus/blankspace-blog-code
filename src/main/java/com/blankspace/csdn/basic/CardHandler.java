package com.blankspace.csdn.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CardHandler {

    // Spade黑桃 Heart红心 Diamond方片 Club梅花
    private static final String[] CARDS = {
            "黑桃1", "黑桃2", "黑桃3", "黑桃4", "黑桃5", "黑桃6", "黑桃7", "黑桃8", "黑桃9", "黑桃10", "黑桃J", "黑桃Q", "黑桃K",
            "红心1", "红心2", "红心3", "红心4", "红心5", "红心6", "红心7", "红心8", "红心9", "红心10", "红心J", "红心Q", "红心K",
            "方片1", "方片2", "方片3", "方片4", "方片5", "方片6", "方片7", "方片8", "方片9", "方片10", "方片J", "方片Q", "方片K",
            "梅花1", "梅花2", "梅花3", "梅花4", "梅花5", "梅花6", "梅花7", "梅花8", "梅花9", "梅花10", "梅花J", "梅花Q", "梅花K"};

    private List<String> cardsLeft;

    private Random random;

    public CardHandler() {
        this.cardsLeft = new ArrayList<>(Arrays.asList(CARDS));
        this.random = new Random();
    }

    public String dealTheCards() {
        int randomIndex = random.nextInt(cardsLeft.size());
        String newCard = this.cardsLeft.get(randomIndex);
        this.cardsLeft.remove(newCard);
        return newCard;
    }

    public String dealTheCards(int cardNum) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < cardNum; i++) {
            result.append(dealTheCards()).append(' ');
        }
        return result.toString();
    }

    public static void main(String[] args) {
        CardHandler cardHandler = new CardHandler();
        System.out.println(cardHandler.dealTheCards());
        System.out.println(cardHandler.dealTheCards(10));
    }

}
