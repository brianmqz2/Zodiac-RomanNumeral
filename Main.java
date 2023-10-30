import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Program 1 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("What month were you born (1-12)? ");
        int Month = in.nextInt();
        System.out.print("What day of the month were you born? ");

        int Day = in.nextInt();
        System.out.println("Your birthstone is " + Birthstone(Month) + ".");
        System.out.println("Your zodiac sign is " + ZodiacSign(Month, Day) + ".");

        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Program 2 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        char[][] World = new char[10][10];

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                World[x][y] = '.';
            }
        }

        int X = 1;
        while (X <= 10) {
            World[(int) (Math.random() * 10)][(int) (Math.random() * 10)] = '$';
            X++;
        }

        World[(int) (Math.random() * 10)][(int) (Math.random() * 10)] = 'M';

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                System.out.print(World[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Program 3 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Enter a Roman Numeral: ");
        in.nextLine();
        String RomanNum = in.nextLine();
        System.out.println("Convert to Decimal is " + RomanToDecimal(RomanNum) + ".");
    }

    static int RomanToDecimal(String Roman) {
        int Decimal = 0;
        for (int i = 0; i < Roman.length(); i++) {
            if (Roman.charAt(i) == 'I')
                Decimal += 1;
            else if (Roman.charAt(i) == 'V')
                Decimal += 5;
            else if (Roman.charAt(i) == 'X')
                Decimal += 10;
            else if (Roman.charAt(i) == 'L')
                Decimal += 50;
            else if (Roman.charAt(i) == 'C')
                Decimal += 100;
            else if (Roman.charAt(i) == 'D')
                Decimal += 500;
            else if (Roman.charAt(i) == 'M')
                Decimal += 1000;
        }
        if (Roman.contains("IV"))
            Decimal -= 2;
        if (Roman.contains("IX"))
            Decimal -= 2;
        if (Roman.contains("XL"))
            Decimal -= 20;
        if (Roman.contains("XC"))
            Decimal -= 20;
        if (Roman.contains("CD"))
            Decimal -= 200;
        if (Roman.contains("CM"))
            Decimal -= 200;

        return Decimal;
    }

    static String Birthstone(int Month) {
        String[] Stones = {"", "Garnet", "Amethyst", "Aquamarine", "Dimond", "Emerald", "Alexandrite", "Ruby", "Peridot", "Sapphire",
                "Tourmaline", "Topaz", "Blue Topaz"};
        return Stones[Month];
    }

    static String ZodiacSign(int Month, int Day) {
        if ((Month == 3 && Day >= 21) || (Month == 4 && Day <= 19))
            return "Aries";
        if ((Month == 4 && Day >= 20) || (Month == 5 && Day <= 20))
            return "Taurus";
        if ((Month == 5 && Day >= 21) || (Month == 6 && Day <= 21))
            return "Gemini";
        if ((Month == 6 && Day >= 22) || (Month == 7 && Day <= 22))
            return "Cancer";
        if ((Month == 7 && Day >= 23) || (Month == 8 && Day <= 22))
            return "Leo";
        if ((Month == 8 && Day >= 23) || (Month == 9 && Day <= 22))
            return "Virgo";
        if ((Month == 9 && Day >= 23) || (Month == 10 && Day <= 22))
            return "Libra";
        if ((Month == 10 && Day >= 23) || (Month == 11 && Day <= 21))
            return "Scorpio";
        if ((Month == 11 && Day >= 22) || (Month == 12 && Day <= 21))
            return "Sagittarius";
        if ((Month == 12 && Day >= 22) || (Month == 1 && Day <= 19))
            return "Capricorn";
        if ((Month == 13 && Day >= 20) || (Month == 2 && Day <= 18))
            return "Aquarius";
        if ((Month == 14 && Day >= 19) || (Month == 3 && Day <= 20))
            return "Pices";
        return "";
    }
}