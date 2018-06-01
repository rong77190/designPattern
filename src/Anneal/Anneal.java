package Anneal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Anneal {
    public static void main(String[] args) throws IOException {
        long begin = System.currentTimeMillis();

        Anneal anneal = new Anneal();
        anneal.anneal();
        anneal.printInfo();
        long end = System.currentTimeMillis();
        System.out.println("spend time :"+(end - begin) +"ms");
    }
    
    private  static double[][] city;    
    private  static int[] currPath;    
    private  static int[] bestPath;    
    private  static double shortesDistance;    
    private  static int numOfCity = 20;    
    //trace item    
    private static int iterator = 0;    
    
    public void printInfo() {    
        System.out.println("bestPath: " + Arrays.toString(bestPath));
        System.out.println("shortest distance: " + shortesDistance);    
        System.out.println("iterator times: " + iterator);    
    }    
    
    private void init() throws IOException {
        city = new double[numOfCity][numOfCity];    
        currPath = new int[numOfCity];    
        bestPath = new int[numOfCity];    
        shortesDistance = 0;    
        loadCity();    
        int lenth = currPath.length;    
        for (int i = 0; i < lenth; i++) {    
            currPath[i] = i;    
        }    
    }    
    
    private void loadCity() throws IOException {    
        //DistanceMatrix.csv" a file stores the distance info.    
        File file = new File("E:\\TSP\\DistanceMatrix.csv");
        inputGraph(file, city);    
    }    
    
    private void inputGraph(File file, double[][] city) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(file));
        String str = "";    
        int length = 0;    
        while ((str = in.readLine()) != null) {    
            str = str.replaceAll(", ", ",");    
            String[] line = str.split(",");    
            for (int j = 0; j < numOfCity; j++)    
                // ten cities    
                city[length][j] = Double.parseDouble(line[j]);    
            length++;    
        }    
    }    
    
    /**  
     * key function  
     * @throws IOException  
     */    
    public void anneal() throws IOException {    
    
        double temperature = 10000.0D;    
        double deltaDistance = 0.0D;    
        double coolingRate = 0.9999;    
        double absoluteTemperature = 0.00001;    
    
        init();    
    
        double distance = getToatalDistance(currPath);    
    
        int[] nextPath;     
        Random random = new Random();
        while (temperature > absoluteTemperature) {    
            nextPath = generateNextPath();    
            deltaDistance = getToatalDistance(nextPath) - distance;    
    
            if ((deltaDistance < 0)    
                    || (distance > 0 &&     
                          Math.exp(-deltaDistance / temperature) > random.nextDouble())) {    
                currPath = Arrays.copyOf(nextPath, nextPath.length);    
                distance = deltaDistance + distance;    
            }    
    
            temperature *= coolingRate;    
            iterator++;    
            System.out.println("iterator: " + iterator + " path: " + Arrays.toString(currPath));    
        }    
        shortesDistance = distance;    
        System.arraycopy(currPath, 0, bestPath, 0, currPath.length);    
    
    }    
    
    /**  
     * calculate total distance  
     * @param currPath  
     * @return  
     */    
    private double getToatalDistance(int[] currPath) {    
        int length = currPath.length;    
        double totalDistance = 0.0D;    
        for (int i = 0; i < length - 1; i++) {    
            totalDistance += city[currPath[i]][currPath[i + 1]];    
        }    
        totalDistance += city[currPath[length - 1]][0];    
    
        return totalDistance;    
    }    
    
    /**  
     * swap two elements in the old array to genreate new array  
     * @return  
     */    
    private int[] generateNextPath() {    
        int[] nextPath = Arrays.copyOf(currPath, currPath.length);    
        Random random = new Random();    
        int length = nextPath.length;    
        int fistIndex = random.nextInt(length - 1) + 1;    
        int secIndex = random.nextInt(length - 1) + 1;    
        while (fistIndex == secIndex) {    
            secIndex = random.nextInt(length - 1) + 1;    
        }    
        int tmp = nextPath[fistIndex];    
        nextPath[fistIndex] = currPath[secIndex];    
        nextPath[secIndex] = tmp;    
    
        return nextPath;    
    }    
    
}    