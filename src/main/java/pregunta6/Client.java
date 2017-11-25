package pregunta6;

public class Client {

    public static void main(String[] args) {
    	SmallBreadSandwich smallBreadSandwich = new SmallBreadSandwich();
        LargeBreadSandwich LargeBreadSandwich = new LargeBreadSandwich();
        System.out.println(smallBreadSandwich.Egg());
        System.out.println(smallBreadSandwich.Chicken());
        System.out.println(smallBreadSandwich.Beef());
        System.out.println(smallBreadSandwich.Bacon());
        System.out.println(smallBreadSandwich.Turkey());
        
        System.out.println(LargeBreadSandwich.Egg());
        System.out.println(LargeBreadSandwich.Chicken());
        System.out.println(LargeBreadSandwich.Beef());
        System.out.println(LargeBreadSandwich.Bacon());
        System.out.println(LargeBreadSandwich.Turkey());
    }
}
