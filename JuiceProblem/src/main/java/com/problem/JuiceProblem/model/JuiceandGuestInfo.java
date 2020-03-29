/**
 *  created by Nishant Verma
 *  Date 29-MAR-2020
 **/
package com.problem.JuiceProblem.model;

import java.util.List;

public class JuiceandGuestInfo {

    Integer numberOfFriends;

    Integer numberOfJuices;

    List<Integer> caloriesOfFruitJuice;

    String nameOfFruits;

    Integer numberofCaloriesByGuest;

    public Integer getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(Integer numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public Integer getNumberOfJuices() {
        return numberOfJuices;
    }

    public void setNumberOfJuices(Integer numberOfJuices) {
        this.numberOfJuices = numberOfJuices;
    }

    public List<Integer> getCaloriesOfFruitJuice() {
        return caloriesOfFruitJuice;
    }

    public void setCaloriesOfFruitJuice(List<Integer> caloriesOfFruitJuice) {
        this.caloriesOfFruitJuice = caloriesOfFruitJuice;
    }

    public String getNameOfFruits() {
        return nameOfFruits;
    }

    public void setNameOfFruits(String nameOfFruits) {
        this.nameOfFruits = nameOfFruits;
    }

    public Integer getNumberofCaloriesByGuest() {
        return numberofCaloriesByGuest;
    }

    public void setNumberofCaloriesByGuest(Integer numberofCaloriesByGuest) {
        this.numberofCaloriesByGuest = numberofCaloriesByGuest;
    }
}
