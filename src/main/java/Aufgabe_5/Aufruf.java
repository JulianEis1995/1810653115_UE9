package Aufgabe_5;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Aufruf
{
    public static void main(String[] args)
    {
        ObjectMapper mapper = new ObjectMapper();
        Weather w = new Weather(50, "Clear", "Sky is clear", "01n");

        try
        {
            String jsonInString = mapper.writeValueAsString(w);
            System.out.println(jsonInString);
        } catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }
    }
}
