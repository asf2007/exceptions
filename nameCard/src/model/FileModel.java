package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileModel {

    public FileModel() {
    }
    public void writeData(String [] data){

        try(FileWriter fw = new FileWriter(new File(data[0]+".txt"), false))
       {
           for (String str: data
                ) {
               fw.write("<"+str+">");

           }
           fw.write("\n");
       }catch (IOException ex){
           ex.printStackTrace();
       }


    }
}
