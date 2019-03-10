public class Main {
    public static void main(String[] args) {

        Parent parent1 = new Parent();
        Parent parent2 = new Parent();

        parent1.setFirstName("firstName");
        parent1.setLastName("lastName");
        parent2.setFirstName("firstName");
        parent2.setLastName("lastName");

        System.out.println(parent1.equals(parent2));
        System.out.println(parent1.hashCode());
        System.out.println(parent2.hashCode());

    }
}
