package Bai2;

import java.util.Scanner;

public class Main {
    public static NumberPhone numberPhone ;

    public static void main(String[] args) {
        numberPhone = new NumberPhone();
        System.out.println("Nhap vao day so de kiem tra");
        Scanner sc = new Scanner(System.in);
        String acc = sc.nextLine();
        boolean isvalisd = numberPhone.validate(acc);
        if (isvalisd){
            System.out.println("Dung voi dinh dang !");
        }else {
            System.out.println("Sai voi dinh dang !");
        }
    }

}
