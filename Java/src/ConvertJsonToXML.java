package javaTpoint.JavaExample;  
  
import java.io.*;  
import java.nio.file.Files;  
import java.nio.file.Paths;  
import org.json.JSONException;  
import org.json.JSONObject;  
import org.json.XML;  
  
//create ConvertJsonToXML class to convert JSON data into XML  
public class ConvertJsonToXML {  
      
    // main() method start  
    public static void main(String[] args) throws JSONException {  
         
       // create variable loc that store location of the Sample.json file   
        String loc = "C:\\Users\\rastogi ji\\OneDrive\\Desktop\\Sample.json";  
              
        String result;  
        try {  
                  
            // read byte data from the Sample.json file and convert it into String  
            result = new String(Files.readAllBytes(Paths.get(loc)));  
            //Convert JSON to XML  
            String xml = convertToXML(result, "root"); // This method converts json object to xml string  
              
            // use try-catch to store XML data into file.  
            FileWriter file = new FileWriter("C:\\Users\\rastogi ji\\OneDrive\\Desktop\\XMLData.txt");  
                  
                // use write() method of File to write XML data into XMLData.txt  
                file.write(xml);   
                file.flush();  
                System.out.println("Your XML data is successfully written into XMLData.txt");  
                  
                // close FileWriter  
                file.close();  
                  
        } catch (IOException e1) {  
            // TODO Auto-generated catch block  
            e1.printStackTrace();  
        }  
    }  
      
    // create convertToXML() method for converting JSOn data into XML  
    public static String convertToXML(String jsonString, String root) throws JSONException {    // handle JSONException  
          
        // create instance of JSONObject by passing jsonString to the constructor  
        JSONObject jsonObject = new JSONObject(jsonString);  
          
        // use XML.toString() method to convert JSON into XML and store the result into a string  
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-15\"?>\n<"+root+">" + XML.toString(jsonObject) + "</"+root+">";  
          
        // pass the XML data to the main() method  
        return xml;  
    }  
} 