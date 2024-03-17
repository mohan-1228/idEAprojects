package edu.missouristate.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Helper {

    public static String getStudentsText(Integer limit, List<String> studentList) {
        StringBuilder sb = new StringBuilder();
        sb.append("students: ");

        for (int i=0; i<limit; i++) {
            sb.append((sb.toString().length() > 10)?", " : "");
            sb.append("[" + studentList.get(i) + "]");
        }

        return sb.toString();
    }

    public static String getStudentsJson(Integer limit, List<String> studentList) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ \"students\" : ");
        sb.append("[");

        for (int i=0; i<limit; i++) {
            System.out.println("Processing=> " + studentList.get(i));
            String[] data = studentList.get(i).split(",", -1);
            System.out.println("Data=>"+data);

            for (int m = 0; m<5 ; m++) {
                System.out.println(m+"=>"+data[m]);
            }


            sb.append((sb.toString().length() > 16) ? ",{" : "{");
            sb.append("\"firstName\":\"").append(data[0]).append("\",");
            sb.append("\"lastName\":\"").append(data[1]).append("\",");
            sb.append("\"age\":").append(data[2]).append(",");
            sb.append("\"major\":\"").append(data[3]).append("\",");
            sb.append("\"gpa\":").append(data[4]);
            sb.append("}");
        }

        sb.append("]");
        sb.append("}");
        return sb.toString();
    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static List<String> getAllStudents(InputStream inputStream) {

        List<String> studentList = new ArrayList<String>();
        //InputStream inputStream = Helper.class.getResourceAsStream("/data.txt");

        if (inputStream != null) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                while ((line = br.readLine()) != null) {
                    studentList.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Resource not found: data.txt");
        }

        return studentList;
    }

    public static List<String> getAllStudentsManual(InputStream inputStream) {
        List<String> studentList = new ArrayList<String>();
        studentList.add("Emma,Smith,31,Computer Science,2.9");
        studentList.add("Olivia,Johnson,24,Anthropology,3.6");
        studentList.add("Ava,Brown,36,Sociology,3.1");
        studentList.add("Isabella,Davis,20,History,3.6");
        studentList.add("Sophia,Wilson,39,English Literature,3.4");
        studentList.add("Mia,Moore,39,Art History,3.5");
        studentList.add("Charlotte,Taylor,30,Graphic Design,2.1");
        studentList.add("Amelia,Anderson,37,Anthropology,2.5");
        studentList.add("Harper,Thomas,42,Graphic Design,3.3");
        studentList.add("Evelyn,Jackson,41,English Literature,2.5");
        studentList.add("Abigail,White,43,Biology,3.6");
        studentList.add("Emily,Harris,34,Computer Science,2.4");
        studentList.add("Elizabeth,Martin,33,Mathematics,2.4");
        studentList.add("Sofia,Thompson,32,Psychology,2.6");
        studentList.add("Madison,Garcia,38,Environmental Science,2.9");
        studentList.add("Avery,Martinez,23,Computer Science,3.7");
        studentList.add("Ella,Robinson,33,Anthropology,3.0");
        studentList.add("Scarlett,Clark,34,Physics,3.6");
        studentList.add("Grace,Rodriguez,35,Computer Science,3.7");
        studentList.add("Lily,Lewis,25,Mathematics,2.9");
        studentList.add("Chloe,Lee,45,Electrical Engineering,3.6");
        studentList.add("Victoria,Walker,28,Mathematics,2.1");
        studentList.add("Aubrey,Hall,36,Sociology,3.9");
        studentList.add("Zoey,Allen,21,Sociology,2.9");
        studentList.add("Penelope,Young,27,International Relations,2.5");
        studentList.add("Riley,Hernandez,29,Art History,2.6");
        studentList.add("Nora,King,33,Graphic Design,2.2");
        studentList.add("Layla,Wright,26,Business Administration,1.4");
        studentList.add("Eleanor,Lopez,39,Economics,2.9");
        studentList.add("Hannah,Hill,18,Political Science,2.6");
        studentList.add("Lillian,Scott,21,Sociology,3.6");
        studentList.add("Addison,Green,30,Physics,3.1");
        studentList.add("Natalie,Adams,26,Electrical Engineering,3.2");
        studentList.add("Luna,Baker,19,Chemistry,3.4");
        studentList.add("Savannah,Gonzalez,31,International Relations,3.1");
        studentList.add("Brooklyn,Nelson,21,Business Administration,2.5");
        studentList.add("Zoe,Carter,40,Biology,3.9");
        studentList.add("Leah,Mitchell,22,Biology,3.7");
        studentList.add("Stella,Perez,34,Chemistry,2.3");
        studentList.add("Hazel,Roberts,31,Business Administration,3.0");
        studentList.add("Aurora,Turner,45,Philosophy,3.4");
        studentList.add("Lucy,Phillips,35,Graphic Design,3.9");
        studentList.add("Paisley,Campbell,26,Economics,3.7");
        studentList.add("Audrey,Parker,33,Sociology,3.0");
        studentList.add("Skylar,Evans,26,Mathematics,3.5");
        studentList.add("Bella,Edwards,21,Graphic Design,3.4");
        studentList.add("Aria,Collins,41,Philosophy,3.5");
        studentList.add("Autumn,Stewart,43,Nursing,2.3");
        studentList.add("Hailey,Sanchez,40,International Relations,3.4");
        studentList.add("Violet,Morris,39,Communications,3.5");
        studentList.add("Liam,Rogers,43,International Relations,3.6");
        studentList.add("Noah,Reed,22,Nursing,3.4");
        studentList.add("Ethan,Cook,34,English Literature,1.3");
        studentList.add("Oliver,Morgan,27,Environmental Science,3.2");
        studentList.add("Elijah,Bell,24,Communications,3.3");
        studentList.add("James,Murphy,39,Anthropology,3.3");
        studentList.add("Benjamin,Bailey,26,Computer Science,3.2");
        studentList.add("William,Rivera,43,Environmental Science,2.6");
        studentList.add("Henry,Cooper,32,Business Administration,3.4");
        studentList.add("Alexander,Richardson,29,English Literature,2.8");
        studentList.add("Samuel,Cox,36,Economics,3.7");
        studentList.add("Michael,Howard,23,Nursing,2.5");
        studentList.add("Daniel,Ward,41,Chemistry,3.1");
        studentList.add("David,Torres,34,Economics,2.1");
        studentList.add("Joseph,Peterson,29,Art History,3.6");
        studentList.add("Matthew,Gray,28,Physics,3.0");
        studentList.add("Jackson,Ramirez,35,Communications,2.5");
        studentList.add("Andrew,James,18,Mathematics,3.1");
        studentList.add("Christopher,Watson,21,Anthropology,3.6");
        studentList.add("Charles,Brooks,30,Philosophy,1.3");
        studentList.add("Jack,Kelly,37,Business Administration,1.4");
        studentList.add("Ryan,Sanders,37,Business Administration,2.9");
        studentList.add("Nicholas,Price,36,International Relations,1.0");
        studentList.add("Aiden,Bennett,29,Philosophy,2.9");
        studentList.add("Caleb,Wood,30,Anthropology,3.7");
        studentList.add("Mason,Barnes,36,English Literature,2.0");
        studentList.add("Gabriel,Ross,27,Sociology,2.2");
        studentList.add("Ethan,Henderson,39,Business Administration,2.0");
        studentList.add("Logan,Coleman,33,Philosophy,2.3");
        studentList.add("Owen,Jenkins,44,Music,3.4");
        studentList.add("Lucas,Perry,31,Geology,3.3");
        studentList.add("Dylan,Powell,31,Geology,2.9");
        studentList.add("Adam,Long,43,Mathematics,3.1");
        studentList.add("Anthony,Patterson,36,Music,2.7");
        studentList.add("Isaac,Hughes,40,History,2.3");
        studentList.add("John,Flores,39,History,2.2");
        studentList.add("Nathan,Washington,28,Economics,3.6");
        studentList.add("Noah,Butler,18,Geology,2.2");
        studentList.add("Oscar,Simmons,18,Geology,3.3");
        studentList.add("Robert,Foster,42,Sociology,3.4");
        studentList.add("Thomas,Gonzales,40,Music,2.5");
        studentList.add("Sebastian,Bryant,33,Computer Science,3.3");
        studentList.add("Elijah,Alexander,18,Biology,3.6");
        studentList.add("Daniel,Russell,45,Psychology,3.1");
        studentList.add("Matthew,Griffin,21,Graphic Design,1.4");
        studentList.add("Joshua,Diaz,31,Political Science,2.1");
        studentList.add("Evan,Holden,25,Economics,3.1");
        studentList.add("Connor,Camper,41,Physics,3.6");
        studentList.add("Julian,Stevens,23,Electrical Engineering,4.0");
        studentList.add("Grayson,Michael,40,Environmental Science,2.5");
        return studentList;
    }

    public static List<String> getStudentList(InputStream inputStream) {
        List<String> studentList = new ArrayList<String>();

        if (inputStream != null) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                while ((line = br.readLine()) != null) {
                    studentList.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Resource not found: data.txt");
        }

        return studentList;
    }

}
