package Project_Responsi_Java;

public class Penyihir extends Karakter
        implements BisaMenyerang, BisaSkill {

    public Penyihir(String nama) {
        super(nama, 100, "Penyihir");
    }

    @Override
    public void bertarung(Karakter target) {
        if (getHp() > 0 && target.getHp() > 0) {
            setSedangBertarung(true);
            System.out.println("Penyihir bersiap bertarung!");
        } else {
            setSedangBertarung(false);
            System.out.println("Penyihir tidak dapat bertarung!");
        }

        super.tampilkanStatus();
    }

    @Override
    public void serang(Karakter target) {
        if (getHp() > 0 && target.getHp() > 0) {
            System.out.println(getNama() + " menyerang!");
            target.setHp(target.getHp() - 15);
            System.out.println("Damage: 15");
        } else {
            System.out.println("Serangan tidak dapat dilakukan!");
        }
    }

    @Override
    public void gunakanSkill(Karakter target) {
        if (getHp() > 0 && target.getHp() > 0) {
            System.out.println(getNama() + " menggunakan Meteor!");
            target.setHp(target.getHp() - 50);
            System.out.println("Damage skill: 50");
        } else {
            System.out.println("Skill tidak dapat digunakan!");
        }
    }
}