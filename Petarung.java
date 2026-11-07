package Project_Responsi_Java;

public class Petarung extends Karakter
        implements BisaMenyerang, BisaSkill {

    // Constructor
    public Petarung(String nama) {
        super(nama, 120, "Petarung");
    }

    // Method Overriding
    @Override
    public void bertarung(Karakter target) {
        if (getHp() > 0 && target.getHp() > 0) {
            setSedangBertarung(true);
            System.out.println("Petarung bersiap bertarung!");
        } else {
            setSedangBertarung(false);
            System.out.println("Petarung tidak dapat bertarung!");
        }

        // Memanggil method dari class induk
        super.tampilkanStatus();
    }

    // Implementasi Interface BisaMenyerang
    @Override
    public void serang(Karakter target) {
        if (getHp() > 0 && target.getHp() > 0) {
            System.out.println(getNama() + " menyerang!");
            target.setHp(target.getHp() - 10);
            System.out.println("Damage: 10");
        } else {
            System.out.println("Serangan tidak dapat dilakukan!");
        }
    }

    // Implementasi Interface BisaSkill
    @Override
    public void gunakanSkill(Karakter target) {
        if (getHp() > 0 && target.getHp() > 0) {
            System.out.println(getNama() + " menggunakan Pedang Api!");
            target.setHp(target.getHp() - 40);
            System.out.println("Damage skill: 40");
        } else {
            System.out.println("Skill tidak dapat digunakan!");
        }
    }
}