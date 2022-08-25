import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int j = 0;

        String[] contactTemp;
        Scanner intput = new Scanner(System.in);

        List<String[]> contacp = new ArrayList<>();

        String newLine = System.lineSeparator();
        Scanner input = new Scanner(System.in);


        for (; ; ) // while(true) is more common
        {
            System.out.println("Menu: " + newLine + "1.Search" + newLine + "2.Create" + newLine +
                    "3.Update" + newLine + "4.Remove" + newLine + "5.Exit");
            String selection = input.nextLine();
            switch (selection) {
                case "1":

                    List<Integer> indexTemp = Contact.checkIt(contacp);
                    int s = indexTemp.size();
                    for (int d = 0; d < s; d++) {
                        List<String[]> lartemp;
                        lartemp = contacp;
                        String[] arrtemp = new String[3];
                        arrtemp = lartemp.get(d);

                        System.out.println("Indeks: " + indexTemp.get(d) + " Nazwisko: " + arrtemp[0] + " Imię: " + arrtemp[1] + " Numer telefonu: " + arrtemp[2]);
                    }

                    if (s == 0) {
                        System.out.println("Brak szukanego wyrażenia w kontaktach");
                    }

                    if (contacp.isEmpty()) {
                        System.out.println("Pusto");
                    }
                    break;

                case "2":
                    Contact contTemp = new Contact();
                    contactTemp = contTemp.Contact1();
                    int g = 0;
                    g = contacp.size();
                    contacp.add(g, contactTemp);
                    if (g > 0) {
                        System.out.println(contacp.get(g - 1));
                        System.out.println(contacp.get(g));
                    }
                    break;

                case "3":

                    System.out.println("Podaj indeks");
                    g = intput.nextInt();
                    if ((g <= 0 && contacp.isEmpty()) || g > (contacp.size() - 1)) {
                        System.out.println("Błędny indeks");
                        break;
                    } else {
                        List<String[]> lartemp2;
                        lartemp2 = contacp;
                        String[] arrtemp2 = new String[3];
                        arrtemp2 = lartemp2.get(g);
                        System.out.println("Kontakt do podmiany: " + g + arrtemp2[0] + " " + arrtemp2[1] + " " + arrtemp2[2]);
                    }
                    ;

                    Contact contTemp2 = new Contact();
                    contactTemp = contTemp2.Contact1();
                    contacp.set(g, contactTemp);
                    break;

                case "4":
                    System.out.println("Podaj indeks");
                    int h = intput.nextInt();
                    if (h < 0) {
                        System.out.println("Błędny indeks");
                        break;
                    } else {
                        System.out.println("Kontakt do usunięcia: " + contacp.get(h));
                    }
                    ;

                    System.out.println("Potwierdź 5 lub zaprzecz, wpisując inny znak");
                    int z = intput.nextInt();
                    if (z == 5) {
                        contacp.remove(h);
                        System.out.println("Usunięto kontakt o indeksie " + h);

                    } else {
                        System.out.println("Anulowano ");
                    }


                    break;

                case "5":
                    System.exit(0);


                default:
                    System.out.println("Wrong instruction");


            }
            //break;
        }
    }


}