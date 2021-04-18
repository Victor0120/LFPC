package com.LABS.laborator3;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            ChomskyNormalForm cfg = new ChomskyNormalForm(new File(
                    "D:\\Universitatea\\Anul II\\SEM IV\\LFPC\\src\\com\\LABS\\laborator3\\cfg.txt"));
            cfg.to_chomsky();
        }
        catch (FileNotFoundException e){
            System.out.print(e.toString());
        }
    }
}
