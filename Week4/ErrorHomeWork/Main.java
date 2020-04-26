package com.isaxved.Week1.Week4.ErrorHomeWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException  {

        Warrior kelt = new Barbarian();
        Warrior sif = new Mage();

        try {
            kelt.setWeapon(new DoubleAxe());
            sif.setWeapon(new DoubleAxe());
        } catch (WrongWeaponException e) {
                File file = new File("log.txt");
                FileWriter fw = new FileWriter(file,true);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(e.getMessage());
                pw.close();
                System.out.println(e.getMessage());
        }


    }
}
