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
            }
    }