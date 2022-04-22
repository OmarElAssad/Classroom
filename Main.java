public class Main {
    public static void main(String[] args) {
        System.out.println("Class room details: ");
        System.out.println();

        
        Course coursePhp = new Course("PHP", 5, "PHP-33");
        Course qaCourse = new Course("QA", 4, "QA-22");
        Course java = new Course("Java", 10, "J-11");
        Course selenium = new Course("Selenium", 7, "SEL-12");

        Computer dell = new Computer("Dell", "Windows 10", 2.4f, 16, 512);
        Computer apple = new Computer("MacBook Pro", "macOS", 3.0f, 64, 256);
        Computer asus = new Computer("Asus Zenbook 14", "Window 10 pro", 2.8f, 32, 512);
        Computer lenovo = new Computer("Chromebook", "Fedora 33", 2.4f, 128, 256);

        Student studentJelena = new Student("Jelena", "Sterijev", 2005, coursePhp, dell);
        Student studentSonja = new Student("Sonja", "Dragicevic", 2006, qaCourse, apple);
        Student studentBane = new Student("Bane", "Radisic", 2007, java, lenovo);
        Student studentOmar = new Student("Omar", "El-Assad", 2008, selenium, asus);

        studentJelena.printInConsole();
        studentSonja.printInConsole();
        studentBane.printInConsole();
        studentOmar.printInConsole();

    }
}
