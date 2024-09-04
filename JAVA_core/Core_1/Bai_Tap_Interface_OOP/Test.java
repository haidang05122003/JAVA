package Bai_Tap_Interface_OOP;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test may tinh: ");
        MayTinhCasioFx500 fx500 = new MayTinhCasioFx500();
        MayTinhVinacal500 vna500 = new MayTinhVinacal500();

        System.out.println("5 + 3 = "+fx500.cong(3,5));
        System.out.println("5 - 3 = "+fx500.tru(5,5));
        System.out.println("5 * 3 = "+fx500.nhan(3,5));
        System.out.println("6 / 0 = "+fx500.chia(6,0));

        System.out.println("Test sap xep: ");
        double[] arr1 = new double[]{ 5,1,4,2,3,7,8,1};
        double[] arr2 = new double[]{ 6,1,4,9,3,7,8,10};

        SapXepChen sxchen = new SapXepChen();
        SapXepChon sxchon = new SapXepChon();

        sxchen.sapXepTang(arr1);
        System.out.println("Sap xep tang dan(chen):");
        for(int i = 0; i < arr1.length ;i++) {
            double d = arr1[i];
            System.out.print( arr1[i]+" ");
        }

        System.out.println();

        sxchon.sapXepTang(arr2);
        System.out.println("Sap xep tang dan(chon): ");
        for(int i = 0; i < arr2.length ;i++) {
            double d = arr2[i];
            System.out.print( +arr2[i]+" ");
        }

        System.out.println();

        sxchen.sapXepGiam(arr1);
        System.out.println("Sap xep giam dan(chen): ");
        for(int i = 0; i < arr1.length ;i++) {
            double d = arr1[i];
            System.out.print( +arr1[i]+" ");
        }

        System.out.println();

        sxchon.sapXepGiam(arr2);
        System.out.println("Sap xep giam dan(chon): ");
        for(int i = 0; i < arr2.length ;i++) {
            double d = arr2[i];
            System.out.print( +arr2[i]+" ");
        }

        System.out.println();

        System.out.println("Test PM May tinh:");
        PhanMemMayTinh pmmt = new PhanMemMayTinh();
        System.out.println("5 + 3 = "+pmmt.cong(3,5));
        double[] arr3 = new double[]{ 6,3,4,9,11,7,8,10};

        pmmt.sapXepGiam(arr3);
        System.out.println("Sap xep giam dan(chon): ");
        for(int i = 0; i < arr3.length ;i++) {
            double d = arr3[i];
            System.out.print( +arr3[i]+" ");
        }
    }
}
