package edu.missouristate.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentDataGenerator {

    public static void main(String[] args) {
        List<String> firstNames = generateUniqueFirstNames();
        List<String> lastNames = generateUniqueLastNames();
        List<String> majors = generateUniqueMajors();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            String firstName = firstNames.get(i);
            String lastName = lastNames.get(i);
            int age = random.nextInt(28) + 18; // Random age between 18 and 45
            String major = majors.get(random.nextInt(majors.size()));
            double gpa = Math.round((1.0 + random.nextDouble() * 3.0) * 10.0) / 10.0; // Random GPA between 1.0 and 4.0, rounded to the nearest tenth
            System.out.println(firstName + "," + lastName + "," + age + "," + major + "," + gpa);
        }
    }

    private static List<String> generateUniqueFirstNames() {
        List<String> firstNameList = new ArrayList<>();

        String filePath = "names.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                firstNameList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return firstNameList;
    }

    private static List<String> generateUniqueLastNames() {
        List<String> lastNameList = new ArrayList<>();

        String filePath = "lastnames.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lastNameList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lastNameList;
    }

    private static List<String> generateUniqueMajors() {
        List<String> majorList = new ArrayList<>();

        String filePath = "majors.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                majorList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return majorList;
    }
}
