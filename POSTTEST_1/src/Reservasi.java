class Reservasi {
    String idReservasi;
    Pelanggan pelanggan;
    Paket paket;
    String tanggal;
    String status;

    Reservasi(String idReservasi, Pelanggan pelanggan, Paket paket, String tanggal) {
        this.idReservasi = idReservasi;
        this.pelanggan = pelanggan;
        this.paket = paket;
        this.tanggal = tanggal;
        this.status = "Menunggu";
    }
}