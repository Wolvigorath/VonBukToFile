import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact {
    private static String lastName;
    private static String name;
    private static String phoneNumber;


    static Scanner input = new Scanner(System.in);

    public static String[] Contact1() {

        String ContactName;
        String ContactLastName;
        String ContactPhN;

        String[] contactTemp = new String[3];
        System.out.println("Podaj nazwisko");
        ContactLastName = input.nextLine();
        lastName = ContactLastName;
        System.out.println("Podaj imię");
        ContactName = input.nextLine();
        name = ContactName;
        System.out.println("Podaj numer telefonu");
        ContactPhN = input.nextLine();
        phoneNumber = ContactPhN;
        contactTemp[0] = lastName;
        contactTemp[1] = name;
        contactTemp[2] = phoneNumber;

        return contactTemp;
    }

    public String getter() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public List<String> list1 = new ArrayList<String>();

    public static List<Integer> checkIt(List<String[]> list1) {
        int a;
        String word;
        a = list1.size();
        System.out.println("Podaj słowo do wyszukania");
        word = input.nextLine();
        String[] temp = new String[3];
        List<Integer> index = new ArrayList<Integer>();
        int z = 0;
        int i;
        for (i = 0; i < a; i++) {

            temp = list1.get(i);
            String wordTemp;
            String wordTemp2;
            wordTemp = String.valueOf(temp[0]);
            wordTemp2 = String.valueOf(temp[1]);

            if (word.equals(wordTemp) || word.equals(wordTemp2)) {
                System.out.println("Wewnatrz");
                index.add(z, i);
                z++;

            }

        }
        return index;


    }
}


