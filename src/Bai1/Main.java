package Bai1;

import java.util.Scanner;

public class Main {
    public static ClassExample classExample;

    public static void main(String[] args) {
        classExample = new ClassExample();
        System.out.println("Nhap vao 1 ten lop de kiem tra ");
        Scanner sc = new Scanner(System.in);
        String acc = sc.nextLine();
        boolean isvallid = classExample.validate(acc);
        if (isvallid){
            System.out.println("Dung voi dinh dang");
        }else {
            System.out.println("Sai voi dinh dang " +
                    "");
        }
    }
}
