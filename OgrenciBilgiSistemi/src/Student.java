public class Student {
    Course c1;
    Course c2;
    Course c3;

    Course s1;
    Course s2;
    Course s3;

    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this. c1 = c1;
        this. c2 = c2;
        this. c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3, int s1, int s2, int s3){
        if(note1>=0 && note1<=100){
            this.c1.note = note1;
        }
        if(note2>=0 && note2<=100){
            this.c2.note = note2;
        }
        if(note3>=0 && note3<=100){
            this.c3.note = note3;
        }

        if(s1>=0 && s1<=100){
            this.c1.verbalGrade = s1;
        }

        if(s2>=0 && s2<=100){
            this.c2.verbalGrade = s2;
        }

        if(s3>=0 && s3<=100){
            this.c3.verbalGrade = s3;
        }
        printNote();
        isPass();

    }

    void isPass(){
        this.c1.note = (int) (this.c1.note * 0.8 + this.c1.verbalGrade * 0.2);
        this.c2.note = (int) (this.c2.note * 0.8 + this.c2.verbalGrade * 0.2);
        this.c3.note = (int) (this.c3.note * 0.8 + this.c3.verbalGrade * 0.2);

        this.avarage = (this.c1.note+this.c2.note+this.c3.note)/3.0;
        if(this.avarage>55){
            System.out.println(this.name + "\t: has passed the class" + "Average is " + this.avarage);
            this.isPass=true;
        }else{
            System.out.println(this.name + "\t: has failed through the class" + "Average is " + this.avarage);
            this.isPass=false;
        }
    }

    void calcAvarage(){

    }

    void printNote(){
        System.out.println("Student name : " + this.name);
        System.out.println(this.c1.name+ " Class Note : " + this.c1.note);
        System.out.println(this.c2.name+ " Class Note : " + this.c2.note);
        System.out.println(this.c3.name+ " Class Note : " + this.c3.note);

    }

}
