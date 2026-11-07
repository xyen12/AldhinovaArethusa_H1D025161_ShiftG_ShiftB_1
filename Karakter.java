package Project_Responsi_Java;

public abstract class Karakter {
    private String nama;
    private int hp;
    private final int hpMaksimal;
    private final String jenis;
    private boolean sedangBertarung;

    // Constructor Overloading
    public Karakter(String nama, int hp) {
        this(nama, hp, "Karakter");
    }

    public Karakter(String nama, int hp, String jenis) {
        this.nama = nama;
        this.hp = hp;
        this.hpMaksimal = hp;
        this.jenis = jenis;
        this.sedangBertarung = false;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHp() {
        return hp;
    }

    public int getHpMaksimal() {
        return hpMaksimal;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else if (hp > hpMaksimal) {
            this.hp = hpMaksimal;
        } else {
            this.hp = hp;
        }
    }

    public String getJenis() {
        return jenis;
    }

    public boolean isSedangBertarung() {
        return sedangBertarung;
    }

    public void setSedangBertarung(boolean sedangBertarung) {
        this.sedangBertarung = sedangBertarung;
    }

    // Method untuk menampilkan status karakter
    public void tampilkanStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("HP: " + hp + "/" + hpMaksimal);
    }

    // Abstract Method
    public abstract void bertarung(Karakter target);
}