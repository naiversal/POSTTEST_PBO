class PaketFotoId extends Paket {
    private int maxOrang;
    private String ukuranCetak;
    private int jumlahLembar;

    PaketFotoId(String ukuranCetak, int jumlahLembar) {
        super("Foto ID", 15, 45000);
        setMaxOrang(1);
        setUkuranCetak(ukuranCetak);
        setJumlahLembar(jumlahLembar);
    }

    public int getMaxOrang() {
        return maxOrang;
    }

    public void setMaxOrang(int maxOrang) {
        if (maxOrang <= 0) {
            System.out.println("Max orang harus lebih dari 0.");
        } else {
            this.maxOrang = maxOrang;
        }
    }

    public String getUkuranCetak() {
        return ukuranCetak;
    }

    public void setUkuranCetak(String ukuranCetak) {
        if (ukuranCetak == null || ukuranCetak.isEmpty()) {
            System.out.println("Ukuran cetak tidak boleh kosong.");
        } else {
            this.ukuranCetak = ukuranCetak;
        }
    }

    public int getJumlahLembar() {
        return jumlahLembar;
    }

    public void setJumlahLembar(int jumlahLembar) {
        if (jumlahLembar <= 0) {
            System.out.println("Jumlah lembar harus lebih dari 0.");
        } else {
            this.jumlahLembar = jumlahLembar;
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Ukuran " + ukuranCetak + " " + jumlahLembar + " lembar | Max " + maxOrang + " orang";
    }
}