package com.company;

import java.util.Scanner;

public class WpisywankoGodziny {
    Scanner scanner = new Scanner(System.in);
    private String godzina = scanner.next();
    int n = godzina.length();

    public void naprawianko(int a, int b, int c, int d) {
        if (a > 60) {
            a -= 60;
            a += 1;
        }

        if (b > 60) {
            b -= 60;
            b += 1;
        }

        if (c/24 > 0) {
            d += c/24;
            c -= 24*(c/24);

        }
    }
    public void setTime(int g, int m, int s, int d, String st) {
        g += Character.getNumericValue(st.charAt(0))*10 + Character.getNumericValue(st.charAt(1));
        m += Character.getNumericValue(st.charAt(2))*10 + Character.getNumericValue(st.charAt(3));
        s += Character.getNumericValue(st.charAt(4))*10 + Character.getNumericValue(st.charAt(5));
        d = 0;
        naprawianko(s, m, g, d);
    }

    public boolean sprawdzanko(String s) {
        boolean ok = true;
        try {
            Double num = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            ok = false;
        }
        if (s.length() != 6) {
            ok = false;
        }
        return ok;
    }
}
