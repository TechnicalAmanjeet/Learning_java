package com.Amanjeet;

public class oops1 {
    public static void main(String[] args) {
        // initalizing a Class named Student : Mathod 0.
        Student aman;
        aman = new Student();
        aman.name = "Amanjeet";
        aman.sex = "male";
        aman.marks = 90;
        aman.roll_number = 11;


        // initalizing a class named Student. : Mathod 1.
        Student riya = new Student();
        riya.name = "Riya Kumari";
        riya.roll_number = 1;
        riya.sex = "Female";
        riya.standred = "9th";
        riya.marks = 98;

        // initializing a class student by 2nd mathod : by using constructor.
        Student Amanjeet =  new Student(11,"Amanjeet Kumar","Male",90,"4th year");

        // display different objects of Class Student.
        aman.show();
        riya.show();
        Amanjeet.show();

        // ****** crating a array of class student *****
        Student[] students = new Student[5];

        int[] rollNumber = {1,2,3,4,5};
        String[] name = {"Amanjeet kumar","Neha kumari","Riya kumari","kismat rani","kajal rani"};
        String[] sex = {"Male","Female","Female","Female","Female"};
        String[] standered = {"4th year","3rd year","9th class","2nd Year","4th year"};
        float[] marks = {99,98,97,96,94};


        
        for(int num=0;num<5;++num){
            students[num] = new Student(rollNumber[num],name[num],sex[num],marks[num],standered[num]);
        }

        // showing the output of array object of class Student
        for(int num=0;num<5;++num){
            students[num].show();
        }

    }


    // simple way of creating class.
    static class Student{
        int roll_number;
        String name;
        String sex;
        float marks;
        String standred;

//      static varible which will count/track the number of student initialized till now
        static  int student_number = 0;

//        public Student(int i, String amanjeet_kumar, String male, int i1, String s) {
//
//        }

        // creating constructor of takes nothing nature
        public Student(){
            student_number++;
        }

        // creating a constructor function of student
        public Student(int roll_number,String name,String sex,float marks,String standred){
            this.roll_number = roll_number;
            this.name =  name;
            this.sex = sex;
            this.marks = marks;
            this.standred = standred;

            // increasing the number of student
            student_number++;
        }
        // for showing output of student
        private void show(){
            System.out.println("Total number of Student is : "+ student_number);
            System.out.println("Name : "+this.name);
            System.out.println("Roll Number : "+this.roll_number);
            System.out.println("Sex : "+this.sex);
            System.out.println("Marks : "+this.marks);
            System.out.println("Standered : " + this.standred);


            System.out.println();
        }
    }
}






















































