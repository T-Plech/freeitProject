import java.util.Scanner;

public class Library {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("выберите параметр поиска" + "\n" + "1. Название книги" + "\n" + "2.Автор"  + "\n" + "3. Жанр");

        int your_choice = sc.nextInt();

        while(your_choice<1 || your_choice>3) {
            System.out.println("Сделайте свой выбор(от 1 до 3)");
            your_choice = sc.nextInt();

        }

        switch (your_choice){
            case 1:{ System.out.println("Введите название книги");
                String title = sc.nextLine() + sc.nextLine();
                System.out.println("Осуществляю поиск книги " + title);
            break;}

            case 2: {System.out.println("Введите автора книги");
                String author = sc.nextLine() + sc.nextLine();
                System.out.println("Осуществляю поиск книг, написанных " + author);
                break;}

            case 3: {
                System.out.println("Введите жанр");
                String genre = sc.nextLine() + sc.nextLine();
                System.out.println("Осуществляю поиск книг жанра " + genre);
                break;
            }
        }


    }

}
