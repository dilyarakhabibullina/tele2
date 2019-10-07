public class Main {
    public static void main(String[] args) {
        Tariff myOnline = new Tariff();
        myOnline.id = 1;
        myOnline.name = "Мой онлайн";
        myOnline.minutes = 400;
        myOnline.tele2Unlimited = true;
        myOnline.internet = 15;
        myOnline.internetUnlimited = false;
        myOnline.socialNetworkUnlimited = true;
        myOnline.payment = 290;
        myOnline.periodOfPayment = "в месяц";
        myOnline.internetAbroad = true;

        Tariff myTalks = new Tariff();
        myTalks.id = 2;
        myTalks.name = "Мой разговор";
        myTalks.minutes = 250;
        myTalks.tele2Unlimited = true;
        myTalks.internet = 3;
        myTalks.internetUnlimited = false;
        myTalks.socialNetworkUnlimited = false;
        myTalks.payment = 7;
        myTalks.periodOfPayment = "в день";
        myTalks.internetAbroad = false;

        
        System.out.println(myOnline.name + "\n" + myOnline.minutes + " мин.");
        if (myOnline.tele2Unlimited == true) {
            System.out.println("+ безлимит на tele2 России");
        }
        System.out.println(myOnline.internet + " ГБ");
        if (myOnline.internetUnlimited == true) {
            System.out.println("БЕЗЛИМИТНЫЙ ИНТЕРНЕТ");
        }
        if (myOnline.socialNetworkUnlimited == true) {
            System.out.println("+БЕЗЛИМИТНЫЕ СОЦСЕТИ");
        }
        if (myOnline.internetAbroad == true) {
            System.out.println("ИНТЕРНЕТ ЗА ГРАНИЦЕЙ");
        }
        System.out.println(myOnline.payment + " руб./" + myOnline.periodOfPayment);

        System.out.println(myTalks.name + "\n" + myTalks.minutes + " мин.");
        if (myTalks.tele2Unlimited == true) {
            System.out.println("+ безлимит на tele2 России");
        }
        System.out.println(myOnline.internet + " ГБ");
        if (myTalks.internetUnlimited == true) {
            System.out.println("БЕЗЛИМИТНЫЙ ИНТЕРНЕТ");
        }
        if (myTalks.socialNetworkUnlimited == true) {
            System.out.println("+БЕЗЛИМИТНЫЕ СОЦСЕТИ");
        }
        if (myTalks.internetAbroad == true) {
            System.out.println("ИНТЕРНЕТ ЗА ГРАНИЦЕЙ");
        }
        System.out.println(myTalks.payment + " руб./" + myTalks.periodOfPayment);
    }
}


