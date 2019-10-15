package com.radhsyn83;

public class Tabungan {
    private double saldoAwal;
    private double bunga;
    private double target;

    public void setSaldoAwal(double saldoAwal) {
        this.saldoAwal = saldoAwal;
    }

    public void setBunga(double bunga) {
        this.bunga = bunga;
    }

    public void setTarget(double target) {
        this.target = target;
    }

    public void hasil() {
        int i = 1;
        while (saldoAwal <= target) {
            saldoAwal = saldoAwal+(saldoAwal*bunga);
            System.out.println("Saldo di bulan ke-"+i+" Rp " + saldoAwal);
            i++;
        }
    }
}
