package com.problem.JuiceProblem.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 *  created by Nishant Verma
 *  Date 29-MAR-2020
 **/

@Service
public class JuiceService {

    public void serveJuice(Integer numberOfFriends, Integer numberOfJuices,
                           List<Integer> caloriesOfFruitJuice, String nameOfFruits, Integer numberofCaloriesByGuest){
        Logger logger = LoggerFactory.getLogger(JuiceService.class);
        try{
            char ch [] = nameOfFruits.toCharArray();
            Arrays.sort(ch);
            Map<Character, Integer> map = getDuplicate(nameOfFruits);
            for (Integer chr: caloriesOfFruitJuice) {
                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    if((chr == numberofCaloriesByGuest || (entry.getValue()*chr) == numberofCaloriesByGuest)){
                      System.out.println(String.join("", Collections.nCopies(entry.getValue(), String.valueOf(entry.getKey()))));
                    }
                }
            }
        } catch(Exception e){

        }
    }


    public Map<Character, Integer> getDuplicate(String nameOfFruits){
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        for (char ch: nameOfFruits.toCharArray()) {
            list.add(ch);
        }
        List<Character> uniqueCharacterList = list.stream().distinct().collect(Collectors.toList());

        for (char ucl:uniqueCharacterList) {
            map.put(ucl, Collections.frequency(list, ucl));
        }
        return map;
    }
}
