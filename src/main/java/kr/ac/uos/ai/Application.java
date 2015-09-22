package kr.ac.uos.ai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Chan Yeon, Cho
 * @version 0.0.1 - SnapShot
 * @link http://github.com/lovebube
 * on 2015-09-22
 */

public class Application {

    private Scanner scan;
    private Student[] studentsArray;
    private int sum;

    public Application() {
        startApp();
    }

    private void startApp() {
        try {
            /*
             * of course, your path
             */
            scan = new Scanner(new File("F:/sslFile/sslFile.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File or directory is not found");
            System.exit(0);
        }
        makeObject();
    }

    private void makeObject() {
        int i = 0;
        Random rand = new Random();
        Student studentsArray[];
        studentsArray= new Student[1000];

        while(scan.hasNext()){
            String readLine = scan.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(readLine);
                while(tokenizer.hasMoreElements()){
                    Student tempStudent = new Student(Integer.parseInt(tokenizer.nextElement().toString()), tokenizer.nextElement().toString(), rand);
                    studentsArray[i] = tempStudent;
                    System.out.println("Student Number : " + studentsArray[i].getNumber() + " Name : "
                            + studentsArray[i].getName() + "\n" +"                         Grade : " + studentsArray[i].getGrade());
                    i++;
                }
            }
                sum = 0;
            for(int j =0; j<i; j++){
                sum = sum + studentsArray[j].getGrade();
            }
        System.out.println("Average of students grade : " + sum/i);
        }

    public static void main(String[] args) {
        new Application();
    }
}
