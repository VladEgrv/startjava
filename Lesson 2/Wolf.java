public class Wolf {
    private char gender;
    private String name;
    private float weight;
    private int age;
    private String colour;
    
    public String getColour() {
        return colour;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
            return;
        }
        this.age = age;
    }
    
    public float getWeight() {
        return weight;
    }
    
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public char getGender() {
        return gender;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
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
