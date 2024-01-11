package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(1, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram");

        CheckFileExtension(studentFiles.get("Stefanie"));
        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("Can't divide by 0.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }

    public static int CheckFileExtension(String fileName) {
        int numPoints = 0;
        
            if (fileName.endsWith(".java")) {
                numPoints = 1;
            } else if (fileName.isEmpty() || fileName == null ) {
                numPoints = -1;
            } else {
                try {
                    throw new IllegalArgumentException("File does not use .java file extension.");
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
        System.out.println(numPoints);
        return numPoints;
    }
}