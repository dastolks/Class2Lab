/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.util.Calendar;

/**
 *
 * @author Alec
 */
public class WelcomeService {
    private LocalDateTime ldt;
    private int MORNING_HOURS = 4;
    private int AFTERNOON_HOURS = 12;
    private int EVENING_HOURS = 20;
    private String MORNING_GREETING = "Good Morning ";
    private String AFTERNOON_GREETING = "Good Afternoon ";
    private String EVENING_GREETING = "Good Evening ";
    private String ENDING_TO_GREETING = "!";
    
    private String determineTimeOfDay(){
        ldt = LocalDateTime.now();
        String s = "";
        if(ldt.getHour() >= MORNING_HOURS && ldt.getHour() < AFTERNOON_HOURS){
            s = MORNING_GREETING;
        }
        else if(ldt.getHour() >= AFTERNOON_HOURS && ldt.getHour() < EVENING_HOURS){
            s = AFTERNOON_GREETING;
        }        
        if(ldt.getHour() >= EVENING_HOURS || ldt.getHour() < MORNING_HOURS){
            s = EVENING_GREETING;
        }        
        return s;
    }
    public final String getGreetingForTime(String name){
        return determineTimeOfDay() + name + ENDING_TO_GREETING;
    }
    
    public static void main(String[] args) {
        WelcomeService ws = new WelcomeService();
        System.out.println(ws.getGreetingForTime("Alec"));
    }
}
