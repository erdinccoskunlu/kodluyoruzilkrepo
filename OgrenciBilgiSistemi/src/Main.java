public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali", "555", "TRH");
        Teacher t2 = new Teacher("Mahmut", "000", "FZK");
        Teacher t3 = new Teacher("Kulyutmaz","111", "BIO");
        Course tarih = new Course("Tarih", "101","TRH");
        Course fizik = new Course("Fizik", "102","FZK");
        Course biyoloji = new Course("Biyoloji", "103","BIO");

        Student s1 = new Student("erdinc", "101", "1",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,100,100,100,100,100);

        Student s2 = new Student("Damla", "102","1", tarih,fizik,biyoloji);
        s2.addBulkExamNote(100,100,100,100,100,100);

    }
}