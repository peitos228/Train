package com.company;

import java.io.*;
import java.util.*;

public class Main {

    void run() {
        Locale.setDefault(Locale.US); // ����� ������ �������
        try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out);) {
            solve(in, out);
        }
    }

    void solve(Scanner in, PrintWriter out) {
        String a = "bad_Style";
        out.print(a.equals(a.toUpperCase()));
    }


    public static void main(String[] args) {
        new Main().run();
    }
}