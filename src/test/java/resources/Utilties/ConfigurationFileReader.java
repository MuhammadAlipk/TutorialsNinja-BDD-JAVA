package resources.Utilties;

import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
public class ConfigurationFileReader {
    JSONParser parser;
    Object obj;
    JSONObject jsonObject;
    public ConfigurationFileReader()
    {
        try {
            parser = new JSONParser();
            obj = parser.parse(new FileReader("Configuration.json"));
            jsonObject = (JSONObject)obj;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public String getSingleValue(String key)
    {
        String value = (String) jsonObject.get(key);
        return value;
    }




}
