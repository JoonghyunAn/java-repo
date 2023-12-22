package joonghyunmegazon;

import java.io.*;
 
public class Assignment
{static void modifyFile(String filePath, String oldString, String newString)
    {File fileToBeModified = new File(filePath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
         
        try
        {reader = new BufferedReader(new FileReader(fileToBeModified));
             
             
            String line = reader.readLine();
            while (line != null) 
            {oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll(oldString, newString);
             
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
        }
        catch (IOException e)
        {e.printStackTrace();
        }
        finally   {try
            {reader.close();    
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }}}
     
    public static void main(String[] args)
    {
        modifyFile("C://Users//Coldnoodle//Desktop//poemCanonization.txt", " the ", " this ");
        modifyFile("C://Users//Coldnoodle//Desktop//poemCanonization.txt", "The", "This"); 
        System.out.println("Assignment complete! Good job Joonghyun!");
    }
} // with the help of.. 
//https://javaconceptoftheday.com/modify-replace-specific-string-in-text-file-in-java/
