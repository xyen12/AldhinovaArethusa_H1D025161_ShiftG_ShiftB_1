package Project_Responsi_Java;

public class Petarung extends Karakter
        implements BisaMenyerang, BisaSkill {

    public Petarung(String nama) {
        super(nama, 120, "Petarung");
    }

    @Override
    public void bertarung(Karakter target) {
        if (getHp() > 0 && target.getHp() > 0) {
            setSedangBertarung(true);
            System.out.println("Petarung bersiap bertarung!");
        } else {
            setSedangBertarung(false);
            System.out.println("Petarung tidak dapat bertarung!");
        }

        super.tampilkanStatus();
    }

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