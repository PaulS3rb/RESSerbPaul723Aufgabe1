package org.example;
import java.util.*;
import java.io.*;


import org.example.logs.Log;
import org.example.log_parser_factory.JsonLogParser;

import static org.example.logs.Konfrontation.Galaktisch;


public class Main {
    public static void main(String[] args) throws IOException {

        String jsonLogFilePath = "marvel_konfrontationen.json";
        ArrayList<Log> jsonLogs = null;

        System.out.println("------------------------------------------");
        System.out.println("JSON");
        System.out.println("------------------------------------------");

        JsonLogParser jsonLogParser = JsonLogParser.getInstance();

        try {
            jsonLogs = jsonLogParser.parseLogFile(jsonLogFilePath);
            for (Log log : jsonLogs) {
                System.out.println(log);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        displayHeldWithHigherEinfluss(jsonLogs);
        sortGalaktischeKonfrontationenByDatum(jsonLogs);
    }



    public static void displayHeldWithHigherEinfluss(List<Log> logs)
    {
        double einfluss;
        System.out.println("Write the letter");
        einfluss = Double.parseDouble(System.console().readLine());
        List<String>  heroes = new ArrayList<>();
        for (Log log : logs) {
            if (log.getGlobalerEinfluss()>einfluss && !heroes.contains(log.getHeld()) ) {
                heroes.add(log.getHeld());
            }
        }

        for (String hero : heroes) {
            System.out.println(hero);
        }
    }

    public static void sortGalaktischeKonfrontationenByDatum(ArrayList<Log> logs) {
        List<Log> newLogs = new ArrayList<>();
        for(Log log : logs) {
            if(Objects.equals(log.getKonfrontationstyp(), Galaktisch)) {
                newLogs.add(log);
            }
        }



        newLogs.sort((p1,p2) -> p2.getDatum().compareTo(p1.getDatum()));


        for(Log log : newLogs) {
            System.out.print(log.getDatum() + ":");
            System.out.print(log.getHeld() + " vs. ");
            System.out.print(log.getAntagonist() + " ");
            System.out.println(log.getOrt() + " ");
        }
    }

}