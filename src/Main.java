public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
int clientOs =1;
if (clientOs==1)
    System.out.println("Установите версию приложения для iOS по ссылке");
        else
    System.out.println("Установите версию приложения для Android по ссылке");
 int clientDeviceYear = 2015;
 if (clientOs ==1);
        boolean DiviceYearsUnder15 = clientDeviceYear <=2015;
        if (DiviceYearsUnder15)
     System.out.println("Установи облегченную версию приложения для iOS по ссылке:");
 if (clientDeviceYear > 2015) {
     System.out.println("Установите версию приложения для iOS по ссылке");
     boolean DiviceOlder2015 = clientDeviceYear > 2015;
     if (DiviceOlder2015)
         System.out.println("Установите версию для Android по ссылке.");
     else { System.out.println("Установите облегченную версию для Android по ссылке");
         System.out.println("введите год");
         int Year = 100;

         if (Year % 4 == 0 && Year % 400 == 0 && Year % 100 != 0)
         {
             System.out.println(Year+" Год - Весокосный год.");
         }
             else
                 System.out.println(Year+ "Год не весокосный");

     }
 }
}
}