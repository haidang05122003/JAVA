package BaiTapOOP_15;

import java.util.Arrays;

public class MaTran {
    private int n1, m1;
    private int n2, m2;
    private int[][] matran1;
    private int[][] matran2;

    public MaTran() {
    }

    public MaTran(int n1, int m1, int n2, int m2, int[][] matran1, int[][] matran2) {
        this.n1 = n1;
        this.m1 = m1;
        this.n2 = n2;
        this.m2 = m2;
        this.matran1 = matran1;
        this.matran2 = matran2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int[][] getMatran1() {
        return matran1;
    }

    public void setMatran1(int[][] matran1) {
        this.matran1 = matran1;
    }

    public int[][] getMatran2() {
        return matran2;
    }

    public void setMatran2(int[][] matran2) {
        this.matran2 = matran2;
    }

    @Override
    public String toString() {
        return "MaTran{" +
                "n1=" + n1 +
                ", m1=" + m1 +
                ", n2=" + n2 +
                ", m2=" + m2 +
                ", matran1=" + Arrays.deepToString(matran1) +
                ", matran2=" + Arrays.deepToString(matran2) +
                '}';
    }
}
