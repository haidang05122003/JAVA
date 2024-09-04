package layThongTin_duyetThuMuc_OOP;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
    File file;

    public ViDuFile(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean ktThucThi(){
        //Kiem tra file co the thuc thi
        return file.canExecute();
    }

    public boolean ktCoTheDoc(){
        //Kiem tra file co the doc
        return file.canRead();
    }

    public boolean ktCoTheGhi(){
        //Kiem tra file co the ghi
        return file.canWrite();
    }

    public void inDuongDan(){
        System.out.println(this.file.getAbsolutePath());
    }

    public void inTen(){
        System.out.println(this.file.getName());
    }

    public void kiemTraThuMucHoacTapTin(){
        if(this.file.isDirectory()){
            System.out.println("Day la thu muc !");
        }else if(this.file.isFile()){
            System.out.println("Day la tap tin !");
        }
    }
    public void inDanhSachFileCon(){
        if(this.file.isDirectory()){
            System.out.println("Cac tap tin con/ thu muc con la: ");
            File[] mangCon = this.file.listFiles();
            for(File file : mangCon){
                System.out.println(file.getAbsolutePath());
            }
        }else if(this.file.isFile()){
            System.out.println("Day la tap tin, khong co du lieu con ben trong !");
        }
    }
    public void inCayThuMuc(){
        this.inChiTietCayThuMuc(this.file,1);
    }
    public void inChiTietCayThuMuc(File f, int bac) {
        for (int i = 0; i < bac; i++) {
            System.out.print("_");
        }
        System.out.println(f.getName());
        if (f.canRead() && f.isDirectory()) {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon) {
                inChiTietCayThuMuc(fx, bac + 1);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int luaChon = 0;
        System.out.print("Nhap ten file: ");
        String tenFile = sc.nextLine();
        ViDuFile vdf = new ViDuFile(tenFile);

        do {
            System.out.println("MENU____________");
            System.out.println("1. Kiem tra file co the thuc thi");
            System.out.println("2. Kiem tra file co the doc duoc ");
            System.out.println("3. Kiem tra file co the ghi");
            System.out.println("4. In duong dan");
            System.out.println("5. In ten file");
            System.out.println("6. Kiem tra file la thu muc hoac tap tin");
            System.out.println("7. In ra danh sach file con");
            System.out.println("8. In ra cay thu muc");
            System.out.println("0. Thoat");
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1) {
                System.out.println(vdf.ktThucThi());
            }else if (luaChon == 2) {
                System.out.println(vdf.ktCoTheDoc());
            }else if (luaChon == 3) {
                System.out.println(vdf.ktCoTheGhi());
            } else if (luaChon == 4) {
                vdf.inDuongDan();
            }else if (luaChon == 5) {
                vdf.inTen();
            }else if (luaChon == 6) {
                vdf.kiemTraThuMucHoacTapTin();
            } else if (luaChon == 7) {
                vdf.inDanhSachFileCon();
            } else if (luaChon == 8) {
                vdf.inCayThuMuc();
            }
        }while(luaChon != 0);
    }
}
