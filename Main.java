package Project_Responsi_Java;

import java.util.Scanner;

public class Main {

    public static final int DAMAGE_MONSTER = 15;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Karakter pemain = null;
        Monster monster = new Monster("Goblin");

        System.out.println("================================");
        System.out.println("       MONSTER BATTLE RPG       ");
        System.out.println("================================");

        System.out.println("Pilih karakter:");
        System.out.println("1. Petarung");
        System.out.println("2. Penyihir");
        System.out.print("Pilihan: ");

        int pilihan = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan nama karakter: ");
        String nama = input.nextLine();

        if (pilihan == 1) {
            pemain = new Petarung(nama);
        } else if (pilihan == 2) {
            pemain = new Penyihir(nama);
        } else {
            System.out.println("Pilihan tidak valid!");
            input.close();
            return;
        }

        System.out.println("\n-- Karakter berhasil dipilih --");
        pemain.tampilkanStatus();

        System.out.println("\n-- Musuh Muncul --");
        monster.tampilkanStatus();

        BisaMenyerang seranganPemain = (BisaMenyerang) pemain;
        BisaSkill skillPemain = (BisaSkill) pemain;

        pemain.bertarung(monster);
        monster.bertarung(pemain);

        while (pemain.getHp() > 0 && monster.getHp() > 0) {

            System.out.println("\n================================");
            System.out.println("             MENU               ");
            System.out.println("================================");
            System.out.println("1. Serang");
            System.out.println("2. Gunakan Skill");
            System.out.println("3. Lihat Status");
            System.out.print("Pilih aksi: ");

            int aksi = input.nextInt();

            if (aksi == 1) {
                seranganPemain.serang(monster);

            } else if (aksi == 2) {
                skillPemain.gunakanSkill(monster);

            } else if (aksi == 3) {
                System.out.println("\n-- Status Pemain --");
                pemain.tampilkanStatus();

                System.out.println("\n-- Status Monster --");
                monster.tampilkanStatus();

                continue;

            } else {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            if (monster.getHp() <= 0) {
                break;
            }

            System.out.println("\n-- Giliran Monster --");
            monster.serang(pemain);

            System.out.println("\n-- Status Pertarungan --");
            System.out.println(pemain.getNama() + " HP: " + pemain.getHp());
            System.out.println(monster.getNama() + " HP: " + monster.getHp());
        }

        System.out.println("\n================================");

        if (pemain.getHp() > 0) {
            System.out.println("SELAMAT! KAMU BERHASIL MENGALAHKAN MONSTER!");
        } else {
            System.out.println("GAME OVER! KAMU DIKALAHKAN MONSTER!");
        }

        System.out.println("================================");

        input.close();
    }
}