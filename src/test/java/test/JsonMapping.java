package test;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonMapping {
    public static void main(String[] args) {
        String jsonBody="{\n" +
                "        \t\t\"name\": \"John\",\n" +
                "        \t\t\"batch\": 17,\n" +
                "        \t\t\"subject\": \"Intro to Java\"\n" +
                "        \t}";
        String Campanynaymes=" {\n" +
                "                \"company\": \"Goolge\",\n" +
                "                \"title\": \"Automation\",\n" +
                "                \"address\":{\n" +
                "                    \"street\":\"123 N. Main st\",\n" +
                "                    \"city\": \"Chicago\"\n" +
                "                }\n" +
                "            }";
        ObjectMapper mapper =new ObjectMapper();

//        try {
//            Teacher teacher=mapper.readValue(jsonBody,Teacher.class);
//            System.out.println(teacher.getName());
//            System.out.println(teacher.getSubject());


//        }catch (IOException e){
//            e.printStackTrace();
//        }
        }}