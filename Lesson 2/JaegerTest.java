public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gypsyDanger = new Jaeger();
        gypsyDanger.setModelName("Gipsy Danger");
        gypsyDanger.setMark("Mark-3");
        gypsyDanger.setOrigin("USA");
        gypsyDanger.setWeight(1980.0f);
        gypsyDanger.setHeight(79.25f);
        gypsyDanger.setStrength(8);
        gypsyDanger.setArmor(6);
        
        System.out.println("Gypsy Danger:");
        System.out.println("Model Name: " + gypsyDanger.getModelName());
        System.out.println("Mark: " + gypsyDanger.getMark());
        System.out.println("Origin: " + gypsyDanger.getOrigin());
        System.out.println("Weight: " + gypsyDanger.getWeight());
        System.out.println("Height: " + gypsyDanger.getHeight());
        System.out.println("Strength: " + gypsyDanger.getStrength());
        System.out.println("Armor: " + gypsyDanger.getArmor());
        gypsyDanger.move();
        System.out.print("\n" + gypsyDanger.scanKaiju());
        gypsyDanger.useWeapon();
        
        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia",
                1850.0f, 76.2f, 10, 9);
        
        
        System.out.println("\n\nStriker Eureka:");
        System.out.println("Model Name: " + strikerEureka.getModelName());
        System.out.println("Mark: " + strikerEureka.getMark());
        System.out.println("Origin: " + strikerEureka.getOrigin());
        System.out.println("Weight: " + strikerEureka.getWeight());
        System.out.println("Height: " + strikerEureka.getHeight());
        System.out.println("Strength: " + strikerEureka.getStrength());
        System.out.println("Armor: " + strikerEureka.getArmor());
        strikerEureka.move();
        System.out.print("\n" + strikerEureka.scanKaiju());
        strikerEureka.useWeapon();
    }
}