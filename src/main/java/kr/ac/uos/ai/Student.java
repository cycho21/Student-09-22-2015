package kr.ac.uos.ai;

import java.util.Random;

/**
 * @author Chan Yeon, Cho
 * @version 0.0.1 - SnapShot
 * @link http://github.com/lovebube
 * on 2015-09-22
 */

public class Student {

    private String name;
    private int number;
    private int grade;

    public Student(int number, String name, Random rand) {
        this.name = name;
        this.number = number;
        this.grade = rand.nextInt(100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
