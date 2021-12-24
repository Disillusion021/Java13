package com.coding.day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap {

    public static void main(String[] args) {
        String s0 = "Do you fear a love fool who is loving you so deeply?" +
                "First impression of you is most lasting. Love understands love; " +
                "it needs no talk.Your smiling at me is my daily dose of magic. " +
                "Love warms more than a thousand fires. The heart that once truly loves never forgets. " +
                "In love folly is always sweet. " +
                "First love is unforgettable all ones life. Where there is love, " +
                "there are always wishes. Being with you is like walking on a very clear morning. Why do the good girls, always want the bad boys? " +
                "The road to a lovers house is never long. No words are necessary between two loving hearts.";
        String[] ss = s0.split(" |\\? |\\?|; |\\. |, |\\.");

        List<String> a = new ArrayList<>();
        List<String> s = new ArrayList<>();
        List<String> y = new ArrayList<>();
        List<String> j = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String s1 : ss) {
            if (s1.contains("a")) {
                a.add(s1);
            }
            if (s1.contains("s")) {
                s.add(s1);
            }
            if (s1.contains("y")) {
                y.add(s1);
            }
            if (s1.contains("j")) {
                j.add(s1);
            }
        }
        map.put("a", a);
        map.put("s", s);
        map.put("y", y);
        map.put("j", j);
        System.out.println("包含a的单词有：" + map.get("a"));
        System.out.println("包含s的单词有：" + map.get("s"));
        System.out.println("包含y的单词有：" + map.get("y"));
        System.out.println("包含j的单词有：" + map.get("j"));
    }

}