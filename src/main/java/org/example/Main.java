package org.example;
import java.util.*;
import java.io.*;


import org.example.logs.Log;
import org.example.log_parser_factory.JsonLogParser;


public class Main {
    public static void main(String[] args) throws IOException {

        String jsonLogFilePath = "marvel_konfrontationen.json";
        ArrayList<Log> jsonLogs;

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
    }
}