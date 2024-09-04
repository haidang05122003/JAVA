package BaiTapOOP_15;

import java.util.ArrayList;

public class TinhMaTran  {
    private ArrayList<MaTran> tinhMaTran;

    public TinhMaTran(ArrayList<MaTran> tinhMaTran) {
        this.tinhMaTran = tinhMaTran;
    }

    public ArrayList<MaTran> getTinhMaTran() {
        return tinhMaTran;
    }

    public void setTinhMaTran(ArrayList<MaTran> tinhMaTran) {
        this.tinhMaTran = tinhMaTran;
    }

    public void themMaTran(MaTran matran1, MaTran matran2) {
        this.tinhMaTran.add(matran1);
        this.tinhMaTran.add(matran2);
    }

    public void inMaTran(){
        for(MaTran maTran : tinhMaTran){
            System.out.println(maTran);
        }
    }

    public void tongMaTran(){
        if(tinhMaTran.size() < 2 || tinhMaTran.isEmpty()){
            System.out.println("Không đủ 2 ma trận hoặc rỗng !!!");
        }
        MaTran matran1 = tinhMaTran.get(0);
        MaTran matran2 = tinhMaTran.get(1);

        int m1 = matran1.getM1();
        int m2 = matran2.getM2();
        int n1 = matran1.getN1();
        int n2 = matran2.getN2();

        if (m1 != m2 || n1 != n2) {
            System.out.println("Không thể cộng hai ma trận. Hai ma trận phải có cùng kích thước.");
            return;
        }

        int[][] maTranTong = new int[m1][n1];

        for(int i = 0; i < m1; i++){
            for(int j = 0; j < n1; j++){
                maTranTong[i][j] = matran1.getMatran1()[i][j] + matran2.getMatran2()[i][j];
            }
        }

        System.out.println("Tổng 2 ma trận là: ");
        for(int i = 0; i < m1; i++){
            for(int j = 0; j < n1; j++){
                System.out.print(maTranTong[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void hieuMaTran(){
        if(tinhMaTran.size() < 2 || tinhMaTran.isEmpty()){
            System.out.println("Không đủ 2 ma trận hoặc rỗng !!!");
        }
        MaTran matran1 = tinhMaTran.get(0);
        MaTran matran2 = tinhMaTran.get(1);

        int m1 = matran1.getM1();
        int m2 = matran2.getM2();
        int n1 = matran1.getN1();
        int n2 = matran2.getN2();

        if (m1 != m2 || n1 != n2) {
            System.out.println("Không thể trừ hai ma trận. Hai ma trận phải có cùng kích thước.");
            return;
        }
        int[][] hieuMaTran = new int[m1][n1];

        for(int i = 0; i < m1; i++){
            for(int j = 0; j < n1; j++){
                hieuMaTran[i][j] = matran1.getMatran1()[i][j] - matran2.getMatran2()[i][j];
            }
        }

        System.out.println("Hiệu 2 ma trận là: ");
        for(int i = 0; i < m1; i++){
            for(int j = 0; j < n1; j++){
                System.out.print(hieuMaTran[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void tichMaTran(){
        if(tinhMaTran.size() < 2 || tinhMaTran.isEmpty()){
            System.out.println("Không đủ 2 ma trận hoặc rỗng !!!");
        }
        MaTran matran1 = tinhMaTran.get(0);
        MaTran matran2 = tinhMaTran.get(1);

        int m1 = matran1.getM1();
        int m2 = matran2.getM2();
        int n1 = matran1.getN1();
        int n2 = matran2.getN2();

        if (n1 != m2) {
            System.out.println("Không thể nhân hai ma trận. Hai ma trận phải có cùng kích thước.");
        }

        int[][] MaTranC = new int[m1][n2];

        for(int i = 0; i < m1; i++){
            for(int j = 0; j < n2; j++){
                MaTranC[i][j] = 0;
                for(int k = 0; k < m1; k++){
                    MaTranC[i][j] += matran1.getMatran1()[i][k] * matran2.getMatran2()[k][j];
                }
            }
        }

        System.out.println("Tích của 2 ma trận là: C = ");
        for(int i = 0; i < m1; i++){
            for(int j = 0; j < n2; j++){
                System.out.print(MaTranC[i][j] + " ");
            }
            System.out.println();
        }
    }

}
