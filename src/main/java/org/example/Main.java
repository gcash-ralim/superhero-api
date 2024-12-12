package org.example;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // batman
        String hero1 = new RestTemplate().getForObject(
                "https://superheroapi.com/api/35db698ba80ffba900480545a7f4a380/70/powerstats", String.class
        );
        // superman
        String hero2 = new RestTemplate().getForObject(
                "https://superheroapi.com/api/35db698ba80ffba900480545a7f4a380/644/powerstats", String.class
        );

        JsonObject response1 = JsonParser.parseString(hero1).getAsJsonObject();
        JsonObject response2 = JsonParser.parseString(hero2).getAsJsonObject();

        Log log = LogFactory.getLog(Main.class);

        log.info(response1);
        log.info(response2);

        // i used strength stat as basis of how strong one hero is against the other hero
        String heroname1 = response1.get("name").getAsString();
        int herostrength1 = response1.get("strength").getAsInt();
        Hero heroobject1 = new Hero(heroname1, herostrength1);

        String heroname2 = response2.get("name").getAsString();
        int herostrength2 = response2.get("strength").getAsInt();
        Hero heroobject2 = new Hero(heroname2, herostrength2);

        // comparison of strength stat
        if (heroobject1.getStrength() < heroobject2.getStrength()) {
            System.out.println(heroobject2.getName() + " is stronger than " + heroobject1.getName() + "!");
        }
        else {
            System.out.println(heroobject1.getName() + " is stronger than "+ heroobject2.getName() + "!");
        }

    }
}

