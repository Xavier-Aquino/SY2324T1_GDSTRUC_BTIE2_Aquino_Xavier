public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Greco Yatco");
        Student student2 = new Student("Jason Cepeda");
        Student student3 = new Student("Jan Zacarias");
        Student student4 = new Student("Jen Zeceries");
        Student student5 = new Student("Kat Lerin");
        Student student6 = new Student("Xavier Aquino");

        SimpleHashtable hashtable = new SimpleHashtable(10);

        hashtable.put(student1.getName(), student1);
        hashtable.put(student2.getName(), student2);
        hashtable.put(student3.getName(), student3);
        hashtable.put(student4.getName(), student4);
        hashtable.put(student5.getName(), student5);
        hashtable.put(student6.getName(), student6);

        System.out.println("Hashtable:");
        hashtable.printHashtable();

        System.out.println("Getting element at hashtable with key: Jen Zeceries");
        System.out.println(hashtable.get("Jen Zeceries"));

        hashtable.remove("Jen Zeceries");

        System.out.println("Hashtable updated:");
        hashtable.printHashtable();
    }
}