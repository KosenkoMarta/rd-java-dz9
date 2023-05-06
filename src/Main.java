public class Main {

    public static void main(String[] args) {
        Person men = new Man("Dmytro", "Shevchenko", 58, null);
        Person women = new Woman("Marta", "Kosenko", 59, null, "Kosenko");

        Person menSecond = new Man("Yaroslav", "Lysenko", 50, null);
        Person womenSecond = new Woman("Alina", "Lysenko", 50, menSecond, "maidenAlina");
        menSecond.setPartner(womenSecond);

        Person menThird = new Man("Ihor", "Shostak", 65, null);
        Person womenThird = new Woman("Mira", "Shostak", 60, menThird, "maidenShostak");
        menThird.setPartner(womenThird);

        men.print();
        women.print();
        men.registerPartnership(women);
        women.registerPartnership(men);
        System.out.println("======================");
        System.out.println("Partnership registered");
        men.print();
        women.print();

        menSecond.deregisterPartnership();
        womenSecond.deregisterPartnership();
        System.out.println("========================");
        System.out.println("Partnership deregistered");
        menSecond.print();
        womenSecond.print();
        System.out.println("======================");
        menThird.print();
        menThird.deregisterPartnership();
        womenThird.print();
        womenThird.deregisterPartnership();




    }
}
