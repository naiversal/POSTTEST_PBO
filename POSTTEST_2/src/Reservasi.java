class Reservasi {
    private String idReservasi;
    private Pelanggan pelanggan;
    private Paket paket;
    private String tanggal;
    private String status;

    Reservasi(String idReservasi, Pelanggan pelanggan, Paket paket, String tanggal) {
        this.idReservasi = idReservasi;
        this.pelanggan = pelanggan;
        this.paket = paket;
        setTanggal(tanggal);
        this.status = "Menunggu";
    }

    public String getIdReservasi() {
        return idReservasi;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Paket getPaket() {
        return paket;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        if (tanggal == null || tanggal.isEmpty()) {
            System.out.println("Tanggal tidak boleh kosong.");
        } else {
            this.tanggal = tanggal;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || status.isEmpty()) {
            System.out.println("Status tidak boleh kosong.");
        } else {
            this.status = status;
        }
    }
}