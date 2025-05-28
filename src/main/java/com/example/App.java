package com.example;

/**
 * Hello world!
 *
 */
 
 
 import org.apache.commons.io.FileUtils;
 import java.io.File;
 import java.io.IOException;
 import com.google.common.collect.ImmutableList;
public class App 
{
    public static void main( String[] args )
    {
        
        ImmutableList<String> i = ImmutableList.of("Apple","ball","Cat");
        
        
        File srcfile = new File("src.txt");
        File destfile = new File ("dest.txt");
        try{
        
        FileUtils.copyFile(srcfile,destfile);
        System.out.println("Copes success");
        
        }
        
        catch(IOException e){
        System.err.println("error" + e.getMessage());
        }
    }
}
