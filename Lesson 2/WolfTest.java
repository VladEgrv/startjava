public class WolfTest {
    public static void main(String[] args) {
        Wolf testWolf = new Wolf('M', "Volchok", 40.5f, 10, "Gray");
        
        System.out.printf("Пол: %c\nИмя: %s\nВес: %.1f\nВозраст: %d\nЦвет: %s%n",
                testWolf.gender, testWolf.name, testWolf.weight, testWolf.age, testWolf.colour);
        
        testWolf.walk();
        testWolf.sit();
        testWolf.run();
        testWolf.howl();
        testWolf.hunt();
    }
}
