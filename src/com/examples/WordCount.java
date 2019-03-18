package com.examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *  This class takes two commandline parameters common.txt alice.txt
 *  first step: parse common.txt and creates map.
 *  second step: parse alice.txt line by line creates an array of words and check the map for the each word
 *  main() method - contains these steps
 *  Map<String, Integer> wordMap = parseCommonTxt(filesNames[0]);
 *  wordMap = parseFileAliceandCountWords(file[1], wordMap);
 *  sortMapToPrint(wordMap);
 */
public class WordCount{

    static int maxKeyLength = 0;

    /**
     * parses files Alice.txt
     * checks for the match word in map keys and increment the count for the map of words for each line
     * return the map
     * @param file
     * @param wordMap
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static Map<String, Integer> parseFileAliceandCountWords(String file, Map<String, Integer> wordMap) throws FileNotFoundException, IOException
        {
        BufferedReader targetFileReader = null;
        targetFileReader = new BufferedReader(new FileReader(file));
        String inputLine = null;
        while ((inputLine = targetFileReader.readLine()) != null) {
            String[] contentArray = inputLine.split("\\s+");
            //searches for the words in map keys and increment the word count value for a match
            increateMapValueCountForMatchingWord(contentArray, wordMap);
        }
       return wordMap;
    }

    /**
     * sort the map <key value> using CompareMapVo.java
     * @param wordMap
     */
    private static void sortMapToPrint(Map<String, Integer> wordMap) {
        List<CompareMapVo> listEntries = new ArrayList<>();
        for (Map.Entry<String, Integer> value : wordMap.entrySet()) {
            listEntries.add( new CompareMapVo(value.getValue(), value.getKey()));
        }

        Collections.sort(listEntries);

        listEntries.stream().forEach(entry -> System.out.println(padSpace(entry.key+":")+ "\t" +entry.value));
    }

    /**
     * pad (add) extra space for each string upto max length
     * @param result
     * @return
     */
    private static String padSpace(String result)
    {
        StringBuilder sb = new StringBuilder(result);
        int padlength = maxKeyLength - result.length();

        if(padlength > 0) {
            for(int i=0; i < padlength ; i++)
                        sb.append(" ");
        }
        return sb.toString();
    }


    /**
     * Increments value of the each key for a match find in the alice.txt
     *
     * @param contentArray
     * @param wordMap
     */
    private static void increateMapValueCountForMatchingWord(String[] contentArray, Map<String, Integer> wordMap) {
        for (String string : contentArray) {
            if(wordMap.containsKey(string)){
                //System.out.println(wordMap.get(string) +" and string "+string);
                int count = wordMap.get(string);
                count++;
                wordMap.put(string, count);
            }
        }
    }


    /**
     * parses the first input file
     * return Map
     * @param file
     * @return
     * @throws IOException
     */
    private static Map<String, Integer> parseCommonTxt(String file) throws IOException {
        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader(file));

        String inputLine = null;
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();


        try {
            while ((inputLine = bufferedReader.readLine()) != null) {
                String[] words = inputLine.split("[ \n\t\r.,;:!?(){}]");

                for (int wordCounter = 0; wordCounter < words.length; wordCounter++) {
                    String key = words[wordCounter].toLowerCase();
                    if (key.length() > 0) {

                        if(key.length() > maxKeyLength){
                            maxKeyLength = key.length();
                        }

                        if (map.get(key) == null) {
                            map.put(key, 0);
                        }else {
                            //System.out.println(" already exists "+ key);
                            int value = map.get(key).intValue();
                            value++;
                            map.put(key, value);
                        }
                    }
                }

            }
        }
        catch (IOException error) {
            System.out.println("Invalid File");
        }
        finally {
            bufferedReader.close();

        }

        return map;
    }


    /**
     * Main method, starting point of execution
     * @param filesNames
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] filesNames) throws FileNotFoundException, IOException {
        if (filesNames.length != 2) {
            System.out.println("Usage: java WordCounter common.txt targetfile");
            System.exit(0);
        }

        Map<String, Integer> wordMap = parseCommonTxt(filesNames[0]);

        if(wordMap.size() == 0){
            System.out.println("no keys found in "+filesNames[0]);
            System.exit(0);
        }

        sortMapToPrint(parseFileAliceandCountWords(filesNames[1], wordMap));
    }



}

