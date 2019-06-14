package com.choices;

import java.util.Scanner;

public class Logic {
    public static void main(String args[])
    {
        try {
            String someClassName = "";
            Scanner in = new Scanner(System.in);
            System.out.print("Please class name with package structure\n");
            someClassName = in.nextLine();
            Class clasz = Class.forName(someClassName);
            Object obj = clasz.newInstance();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (InstantiationException e)
        {
            e.printStackTrace();
        } catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
    }

}
