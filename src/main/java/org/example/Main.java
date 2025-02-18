package org.example;
import java.util.*;
import java.io.*;


import org.example.logs.Log;
import org.example.log_parser_factory.JsonLogParser;


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
    }



    public static void displayHeldWithHigherEinfluss(List<Log> logs)
    {
        double einfluss;
        System.out.println("Write the letter");
        einfluss = Double.parseDouble(System.console().readLine());

        for (Log log : logs) {
            if (log.getGlobalerEinfluss()>einfluss) {
                System.out.println(log);
            }
        }
    }
}