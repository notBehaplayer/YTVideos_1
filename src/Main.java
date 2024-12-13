import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ArrayList<String[]> users = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean isFound = false;

        users.add(new String[]{"Behaplayer", "123321", String.valueOf(UUID.randomUUID())});
        users.add(new String[]{"NotLolaty", "456654", String.valueOf(UUID.randomUUID())});
        users.add(new String[]{"JustAUser", "789987", String.valueOf(UUID.randomUUID())});

        users.forEach(user -> {
            System.out.println(Arrays.toString(user));
        });

        System.out.println("Введите айди удаляемого пользователя: ");
        String id = sc.nextLine();
//        Проверка и удаление через цикл
//        for (int i = 0; i < users.size(); i++) {
//            if (users.get(i)[2].equals(id)) {
//                users.remove(i);
//                isFound = true;
//                break;
//            }
//        }

//        removeIf
        isFound = users.removeIf(user -> user[2].equals(id));

        if(!isFound){
            System.out.println("Пользователь не найден!");
        }
        users.forEach(user -> {
            System.out.println(Arrays.toString(user));
        });
    }
}