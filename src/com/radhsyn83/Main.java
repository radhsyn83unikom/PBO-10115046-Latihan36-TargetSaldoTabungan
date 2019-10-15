package com.radhsyn83;

import javafx.scene.control.Tab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double bunga;
        Scanner s = new Scanner(System.in);
        Tabungan t = new Tabungan();

        System.out.print("Saldo Awal: Rp ");
        t.setSaldoAwal(s.nextDouble());
        System.out.print("Bunga/Bulan (%): ");
        bunga = s.nextDouble();
        t.setBunga(bunga/100);
        System.out.print("Target Saldo: ");
        t.setTarget(s.nextDouble());

        t.hasil();

    }
}
