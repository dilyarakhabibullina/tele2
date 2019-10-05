public class Main {
    public static void main(String[] args) {
        Tariffs myOnline = new Tariffs();
        int id = 1;
        String name = "Мой онлайн";
        int minutes = 400;
        boolean tele2Unlimited = true;
        int internet = 15;
        boolean internetUnlimited = false;
        boolean socialNetworkUnlimited = true;
        int pricePerMonth = 290;
        int pricePerDay = 0;
        boolean internetAbroad = true;


    Tariffs myTalks = new Tariffs();
    id = 2;
    name = "Мой разговор";
    minutes = 250;
    tele2Unlimited = true;
    internet = 3;
    internetUnlimited = false;
    socialNetworkUnlimited = false;
    pricePerMonth = 190;
    pricePerDay = 0;
    internetAbroad = false;

        System.out.println(name + "\n" + minutes + " мин.");
        if (tele2Unlimited == true) {
            System.out.println("+ безлимит на tele2 России");
        }
        System.out.println(internet + " ГБ");
        if (internetUnlimited == true) {
            System.out.println("БЕЗЛИМИТНЫЙ ИНТЕРНЕТ");
        }
        if (socialNetworkUnlimited == true) {
            System.out.println("+БЕЗЛИМИТНЫЕ СОЦСЕТИ");
        }
        if (internetAbroad == true) {
            System.out.println("ИНТЕРНЕТ ЗА ГРАНИЦЕЙ");
        }
        System.out.println(pricePerMonth + " руб./месяц");
    }
}
