public class Teacher {

    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print(){
        System.out.println("Teacher Name : " + this.name );
        System.out.println("Teacher PhoneNumber : " + this.mpno );
        System.out.println("Teacher Branch : " + this.branch );
    }
}
