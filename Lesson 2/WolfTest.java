public class WolfTest {
    public static void main(String[] args) {
        Wolf testWolf = new Wolf();
        
        testWolf.setGender('M');
        testWolf.setAge(10);
        testWolf.setName("Wolf");
        testWolf.setWeight(10.5f);
        testWolf.setColour("Gray");
        
        System.out.printf("Пол: %c\nИмя: %s\nВес: %.1f\nВозраст: %d\nЦвет: %s%n",
                testWolf.getGender(), testWolf.getName(), testWolf.getWeight(),
                testWolf.getAge(), testWolf.getColour());
        
        testWolf.walk();
        testWolf.sit();
        testWolf.run();
        testWolf.howl();
        testWolf.hunt();
    }
}
