public class Wolf {
    char gender;
    String name;
    float weight;
    int age;
    String colour;
    
    public Wolf(char gender, String name, float weight, int age, String colour) {
        this.gender = gender;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.colour = colour;
    }
    
    public void walk() {
        System.out.printf("Волк %s идёт\n", name);
    }
    
    public void sit() {
        System.out.printf("Волк %s сидит\n", name);
    }
    
    public void run() {
        System.out.printf("Волк %s бежит\n", name);
    }
    
    public void howl() {
        System.out.printf("Волк %s воет\n", name);
    }
    
    public void hunt() {
        System.out.printf("Волк %s охотится\n", name);
    }
}
