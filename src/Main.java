public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



    int clientOS = 0;
        if(clientOS ==0)

    {
        System.out.println("установите приложение для IOS");
    }
        if (clientOS == 1) {
            System.out.println("установите приложение для Android");
        }
    int clientDeviseYear = 2016;
        if(clientOS ==0)
        {   if (clientDeviseYear > 2015)
            System.out.println("установите приложение для IOS");
        } else {
            System.out.println("установите облегченное приложение для IOS");
        }
       if (clientOS == 1) {
           if (clientDeviseYear > 2015)
                System.out.println("установите приложение для Android");
            } else { System.out.println("установите облешченное приложение для Android");
        }

    int year = 2020;

       if (year % 4 == 0 && year % 100 != 100 || year % 400 == 0){
           System.out.println(year + " является высокосным");
       } else {
           System.out.println(year + " не является высокосным");
       }



    int deliveryDays = 1;
    int deliveryDistance = 95;
            if (deliveryDistance > 20) {
                deliveryDays++;
            }
            if (deliveryDistance > 60){
                deliveryDays++;
            }
            if (deliveryDistance > 100) {
                deliveryDays++;
            }

            System.out.println("потребуется дней: " + deliveryDays);


    int MouthNumber = 12;
    switch (MouthNumber){
        case 12:
        case 1:
        case 2:
            System.out.println("Зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("осень");
            break;
        default:
            System.out.println("некоректный месяц" + MouthNumber);

    }


            }
}



