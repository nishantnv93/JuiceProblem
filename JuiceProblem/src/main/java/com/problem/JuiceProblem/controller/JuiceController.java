package com.problem.JuiceProblem.controller;

import com.problem.JuiceProblem.model.JuiceandGuestInfo;
import com.problem.JuiceProblem.service.JuiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *  created by Nishant Verma
 *  Date 29-MAR-2020
 **/

@RestController
@RequestMapping("/serve")
public class JuiceController {

    @Autowired
    JuiceService juiceService;

    @GetMapping("/juice")
    public void serveJuice(){
        JuiceandGuestInfo juiceandGuestInfo = new JuiceandGuestInfo();
        /*juiceandGuestInfo.setNumberOfFriends(3);
        juiceandGuestInfo.setNumberOfJuices(3);
       List<Integer> juiceCalories = new ArrayList<Integer>();
       juiceCalories.add(5);
       juiceCalories.add(4);
       juiceCalories.add(6);
       juiceandGuestInfo.setCaloriesOfFruitJuice(juiceCalories);



       juiceandGuestInfo.setNameOfFruits("abcbacbabcc");
       juiceandGuestInfo.setNumberofCaloriesByGuest(15);*/


        /*
         * Add details
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Guests");
        Integer noOfGuest = scanner.nextInt();
        juiceandGuestInfo.setNumberOfFriends(noOfGuest);
        System.out.println("Number of Juices");
        Integer numberOfJuices = scanner.nextInt();
        juiceandGuestInfo.setNumberOfJuices(numberOfJuices);
        for(int j=0; j<juiceandGuestInfo.getNumberOfJuices(); j++){
            System.out.println("Get Calories of Juices");
            List<Integer> juiceCalories = new ArrayList<Integer>();
            juiceCalories.add(scanner.nextInt());
            juiceandGuestInfo.setCaloriesOfFruitJuice(juiceCalories);
        }
        System.out.println("Enter name of juices");
        String nameOfJuices = scanner.next();
        juiceandGuestInfo.setNameOfFruits(nameOfJuices);

        System.out.println("Enter calories given by guest");
        Integer caloriesByGuest = scanner.nextInt();
        juiceandGuestInfo.setNumberofCaloriesByGuest(caloriesByGuest);

       juiceService.serveJuice(juiceandGuestInfo.getNumberOfFriends(), juiceandGuestInfo.getNumberOfJuices(),
               juiceandGuestInfo.getCaloriesOfFruitJuice(), juiceandGuestInfo.getNameOfFruits(), juiceandGuestInfo.getNumberofCaloriesByGuest());

    }
}
