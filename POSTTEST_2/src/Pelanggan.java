class Pelanggan {
    private String nama;
    private String noHp;

    Pelanggan(String nama, String noHp) {
        setNama(nama);
        setNoHp(noHp);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.isEmpty()) {
            System.out.println("Nama tidak boleh kosong.");
        } else {
            this.nama = nama;
        }
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        if (noHp == null || noHp.isEmpty()) {
            System.out.println("No HP tidak boleh kosong.");
        } else {
            this.noHp = noHp;
        }
    }
}