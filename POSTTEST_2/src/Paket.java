class Paket {
    private String namaPaket;
    private int durasi;
    private double harga;

    Paket(String namaPaket, int durasi, double harga) {
        setNamaPaket(namaPaket);
        setDurasi(durasi);
        setHarga(harga);
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public void setNamaPaket(String namaPaket) {
        if (namaPaket == null || namaPaket.isEmpty()) {
            System.out.println("Nama paket tidak boleh kosong.");
        } else {
            this.namaPaket = namaPaket;
        }
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        if (durasi <= 0) {
            System.out.println("Durasi harus lebih dari 0 menit.");
        } else {
            this.durasi = durasi;
        }
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga < 0) {
            System.out.println("Harga tidak boleh negatif.");
        } else {
            this.harga = harga;
        }
    }
}