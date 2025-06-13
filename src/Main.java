public class Main {
    public static void main(String[] args) {
        /*SuperHero sh = new SuperHero();
        Hero h = new Hero();
        h.name = "ミナト";
        h.run();
        sh.name = "スーパーミナト";
        sh.fly();
        sh.run();
        sh.test();*/
        String name1 = "ななしの剣";
        int num1 = 10;
        String name2 = "剣2";
        int num2 = 15;
        Weapon w1 = new Weapon(name1,num1);
        Weapon w2 = new Weapon(name2,num2);
        System.out.println(w1.name + "\n" + "￥" + w1.price);
        System.out.println(w2.name + "\n" + "￥" + w2.price);
    }
}