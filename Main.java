public class Main {
    public static void main(String[] args) {
        System.out.println("Class room details: ");
        System.out.println();

        Student studentJelena = new Student("Jelena", "Sterijev", 2005);
        Course coursePhp = new Course("PHP", 5, "PHP-33");
        Course qaCourse = new Course("QA", 4, "QA-22");

        studentJelena.setCourse(coursePhp);
        studentJelena.printInConsole();

        Student studentSonia = new Student("Sonia", "Nikolic", 1988, coursePhp);

        studentSonia.printInConsole();
    }
}
