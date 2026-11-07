package Project_Responsi_Java;

public class Monster extends Karakter implements BisaMenyerang {

    // Constructor
    public Monster(String nama) {
        super(nama, 150, "Monster");
    }

    // Method Overriding
    @Override
    public void bertarung(Karakter target) {
        if (getHp() > 0 && target.getHp() > 0) {
            setSedangBertarung(true);
            System.out.println(getNama() + " mengaum dan bersiap menyerang!");
        } else {
            setSedangBertarung(false);
            System.out.println(getNama() + " tidak dapat bertarung!");
        }
    }

    // Implementasi Interface BisaMenyerang
    @Override
    public void serang(Karakter target) {
        if (getHp() > 0 && target.getHp() > 0) {
            System.out.println(getNama() + " menyerang pemain!");
            target.setHp(target.getHp() - 15);
            System.out.println("Damage monster: 15");
        } else {
            System.out.println("Monster tidak bisa menyerang!");
        }
    }
}