
public class test {
    public String name;
    public  String noise;

    public test(String name, String noise) {
        this.name = name;
        this.noise = noise;
    }

    public void play() {
        System.out.println(noise + " I'm " + name + " the cat!");
    }


    public  void anger() {
        noise = noise.toUpperCase();
    }
    public  void calm() {
        noise = noise.toLowerCase();
    }


    public static void main(String[] args) {
        test a = new test("Cream", "Meow!");

        test b = new test("Tubbs", "Nyan!");
        //  Cat.anger();
        //  a.calm();
        a.play();


    }




}





