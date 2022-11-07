public class Main {
    public static void main(String[] args) {
        int deliveryDistance = 105;
        int VremyaDostavki = 1;
        if (deliveryDistance <=20) {
            System.out.println("Время доставки займет "+VremyaDostavki);
        }
        else if (deliveryDistance <=40)
            System.out.println("Время доставки займет "+VremyaDostavki+"+1 дней");
        else if (deliveryDistance>=40) ;
                    int DniDostavki = (deliveryDistance  / 40) +1 ;
        System.out.println("Время доставки займет " +DniDostavki+ " дней");

            int monthNumber  = 12;
             switch (monthNumber) {
                 case 1:
                 case 2:
                 case 12:
                     System.out.println("Зима");
                     break;
                 case 3:
                 case 4:
                 case 5:
                     System.out.println("Весна");
                     break;
                 case 6:
                 case 7:
                 case 8:
                     System.out.println("лето");
                     break;
                 case 9:
                 case 10:
                 case 11:
                     System.out.println("Осень");
             }
    }
}