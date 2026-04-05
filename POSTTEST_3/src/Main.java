import java.util.ArrayList;
import java.util.Scanner;

void main() {
    ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    ArrayList<Paket> daftarPaket = new ArrayList<>();
    ArrayList<Reservasi> daftarReservasi = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int pilihan;

    do {
        System.out.println("\n==============================");
        System.out.println("     RESERVASI FOTO STUDIO");
        System.out.println("==============================");
        System.out.println("1. Manajemen Pelanggan");
        System.out.println("2. Manajemen Paket");
        System.out.println("3. Manajemen Reservasi");
        System.out.println("0. Keluar");
        System.out.println("==============================");
        System.out.print("Pilihan : ");
        pilihan = Integer.parseInt(input.nextLine());

        switch (pilihan) {
            case 1 -> menuPelanggan(daftarPelanggan, input);
            case 2 -> menuPaket(daftarPaket, input);
            case 3 -> menuReservasi(daftarReservasi, daftarPelanggan, daftarPaket, input);
            case 0 -> System.out.println("Sampai jumpa!");
            default -> System.out.println("Pilihan tidak valid.");
        }
    } while (pilihan != 0);
}

// ===================== PELANGGAN =====================

void menuPelanggan(ArrayList<Pelanggan> daftarPelanggan, Scanner input) {
    int pilihan;
    do {
        System.out.println("\n==============================");
        System.out.println("       Manajemen Pelanggan");
        System.out.println("==============================");
        System.out.println("1. Tambah Pelanggan");
        System.out.println("2. Tampilkan Pelanggan");
        System.out.println("3. Update Detail Pelanggan");
        System.out.println("4. Hapus Pelanggan");
        System.out.println("0. Kembali");
        System.out.println("==============================");
        System.out.print("Pilihan : ");
        pilihan = Integer.parseInt(input.nextLine());

        switch (pilihan) {
            case 1 -> tambahPelanggan(daftarPelanggan, input);
            case 2 -> tampilPelanggan(daftarPelanggan);
            case 3 -> updatePelanggan(daftarPelanggan, input);
            case 4 -> hapusPelanggan(daftarPelanggan, input);
            case 0 -> System.out.println("Kembali...");
            default -> System.out.println("Pilihan tidak valid.");
        }
    } while (pilihan != 0);
}

void tambahPelanggan(ArrayList<Pelanggan> daftarPelanggan, Scanner input) {
    System.out.print("Nama  : ");
    String nama = input.nextLine();
    System.out.print("No HP : ");
    String noHp = input.nextLine();

    if (nama.isEmpty() || noHp.isEmpty()) {
        System.out.println("Gagal menambahkan pelanggan. Nama dan No HP tidak boleh kosong.");
        return;
    }
    daftarPelanggan.add(new Pelanggan(nama, noHp));
    System.out.println("Pelanggan berhasil ditambahkan.");
}

void tampilPelanggan(ArrayList<Pelanggan> daftarPelanggan) {
    if (daftarPelanggan.isEmpty()) {
        System.out.println("Belum ada pelanggan.");
        return;
    }
    int no = 1;
    for (Pelanggan p : daftarPelanggan) {
        System.out.println(no++ + ". " + p.getNama() + " | " + p.getNoHp());
    }
}

void updatePelanggan(ArrayList<Pelanggan> daftarPelanggan, Scanner input) {
    tampilPelanggan(daftarPelanggan);
    System.out.print("Pilih nomor pelanggan : ");
    int index = Integer.parseInt(input.nextLine()) - 1;
    if (index < 0 || index >= daftarPelanggan.size()) {
        System.out.println("Nomor tidak valid.");
        return;
    }
    Pelanggan target = daftarPelanggan.get(index);

    System.out.print("Nama baru  : ");
    String namaBaru = input.nextLine();
    System.out.print("No HP baru : ");
    String noHpBaru = input.nextLine();
    if (namaBaru.isEmpty() || noHpBaru.isEmpty()) {
        System.out.println("Gagal mengupdate. Nama dan No HP tidak boleh kosong.");
        return;
    }
    target.setNama(namaBaru);
    target.setNoHp(noHpBaru);
    System.out.println("Pelanggan berhasil diupdate.");
}

void hapusPelanggan(ArrayList<Pelanggan> daftarPelanggan, Scanner input) {
    tampilPelanggan(daftarPelanggan);
    System.out.print("Pilih nomor pelanggan : ");
    int index = Integer.parseInt(input.nextLine()) - 1;
    if (index < 0 || index >= daftarPelanggan.size()) {
        System.out.println("Nomor tidak valid.");
        return;
    }
    daftarPelanggan.remove(index);
    System.out.println("Pelanggan berhasil dihapus.");
}

// ===================== PAKET =====================

void menuPaket(ArrayList<Paket> daftarPaket, Scanner input) {
    int pilihan;
    do {
        System.out.println("\n==============================");
        System.out.println("     Manajemen Paket Foto");
        System.out.println("==============================");
        System.out.println("1. Tambah Paket");
        System.out.println("2. Tampilkan Paket");
        System.out.println("3. Update Paket");
        System.out.println("4. Hapus Paket");
        System.out.println("0. Kembali");
        System.out.println("==============================");
        System.out.print("Pilihan : ");
        pilihan = Integer.parseInt(input.nextLine());

        switch (pilihan) {
            case 1 -> tambahPaket(daftarPaket, input);
            case 2 -> tampilPaket(daftarPaket);
            case 3 -> updatePaket(daftarPaket, input);
            case 4 -> hapusPaket(daftarPaket, input);
            case 0 -> System.out.println("Kembali...");
            default -> System.out.println("Pilihan tidak valid.");
        }
    } while (pilihan != 0);
}

void tambahPaket(ArrayList<Paket> daftarPaket, Scanner input) {
    System.out.println("Jenis Paket:");
    System.out.println("1. Photobooth Collage  | Rp65.000 | 16x shoot | All digital copies | 2 photo print 4R | Max 5 orang");
    System.out.println("2. Paket Grup          | Rp200.000 | 50x shoot | 20 digital copy | 5 photo print 4R | Max 20 orang");
    System.out.println("3. Foto ID             | Rp45.000 | Max 1 orang | Pilih ukuran cetak");
    System.out.print("Pilih jenis : ");
    int jenis = Integer.parseInt(input.nextLine());

    switch (jenis) {
        case 1 -> {
            daftarPaket.add(new PaketPhotobooth());
            System.out.println("Paket Photobooth Collage berhasil ditambahkan.");
        }
        case 2 -> {
            daftarPaket.add(new PaketGrup());
            System.out.println("Paket Grup berhasil ditambahkan.");
        }
        case 3 -> {
            System.out.println("Ukuran cetak:");
            System.out.println("1. 2x3 → 12 lembar");
            System.out.println("2. 3x4 → 8 lembar");
            System.out.println("3. 4x6 → 4 lembar");
            System.out.println("4. 5x5 → 4 lembar");
            System.out.print("Pilih ukuran : ");
            int pilihanUkuran = Integer.parseInt(input.nextLine());
            String ukuranCetak;
            int jumlahLembar;
            switch (pilihanUkuran) {
                case 1 -> { ukuranCetak = "2x3"; jumlahLembar = 12; }
                case 2 -> { ukuranCetak = "3x4"; jumlahLembar = 8; }
                case 3 -> { ukuranCetak = "4x6"; jumlahLembar = 4; }
                case 4 -> { ukuranCetak = "5x5"; jumlahLembar = 4; }
                default -> {
                    System.out.println("Pilihan ukuran tidak valid.");
                    return;
                }
            }
            daftarPaket.add(new PaketFotoId(ukuranCetak, jumlahLembar));
            System.out.println("Paket Foto ID berhasil ditambahkan.");
        }
        default -> System.out.println("Jenis paket tidak valid.");
    }
}

void tampilPaket(ArrayList<Paket> daftarPaket) {
    if (daftarPaket.isEmpty()) {
        System.out.println("Belum ada paket.");
        return;
    }
    int no = 1;
    for (Paket p : daftarPaket) {
        System.out.println(no++ + ". " + p.getInfo());
    }
}

void updatePaket(ArrayList<Paket> daftarPaket, Scanner input) {
    tampilPaket(daftarPaket);
    System.out.print("Pilih nomor paket : ");
    int index = Integer.parseInt(input.nextLine()) - 1;
    if (index < 0 || index >= daftarPaket.size()) {
        System.out.println("Nomor tidak valid.");
        return;
    }
    Paket target = daftarPaket.get(index);

    System.out.print("Nama baru   : ");
    String namaPaketBaru = input.nextLine();
    if (namaPaketBaru.isEmpty()) {
        System.out.println("Gagal mengupdate. Nama paket tidak boleh kosong.");
        return;
    }
    System.out.print("Durasi baru : ");
    int durasiBaru = Integer.parseInt(input.nextLine());
    System.out.print("Harga baru  : ");
    double hargaBaru = Double.parseDouble(input.nextLine());
    target.setNamaPaket(namaPaketBaru);
    target.setDurasi(durasiBaru);
    target.setHarga(hargaBaru);
    System.out.println("Paket berhasil diupdate.");
}

void hapusPaket(ArrayList<Paket> daftarPaket, Scanner input) {
    tampilPaket(daftarPaket);
    System.out.print("Pilih nomor paket : ");
    int index = Integer.parseInt(input.nextLine()) - 1;
    if (index < 0 || index >= daftarPaket.size()) {
        System.out.println("Nomor tidak valid.");
        return;
    }
    daftarPaket.remove(index);
    System.out.println("Paket berhasil dihapus.");
}

// ===================== RESERVASI =====================

void menuReservasi(ArrayList<Reservasi> daftarReservasi, ArrayList<Pelanggan> daftarPelanggan,
                   ArrayList<Paket> daftarPaket, Scanner input) {
    int pilihan;
    do {
        System.out.println("\n==============================");
        System.out.println("       Manajemen Reservasi");
        System.out.println("==============================");
        System.out.println("1. Tambah Reservasi");
        System.out.println("2. Tampilkan Reservasi");
        System.out.println("3. Update Reservasi");
        System.out.println("4. Hapus Reservasi");
        System.out.println("0. Kembali");
        System.out.println("==============================");
        System.out.print("Pilihan : ");
        pilihan = Integer.parseInt(input.nextLine());

        switch (pilihan) {
            case 1 -> tambahReservasi(daftarReservasi, daftarPelanggan, daftarPaket, input);
            case 2 -> tampilReservasi(daftarReservasi);
            case 3 -> updateReservasi(daftarReservasi, input);
            case 4 -> hapusReservasi(daftarReservasi, input);
            case 0 -> System.out.println("Kembali...");
            default -> System.out.println("Pilihan tidak valid.");
        }
    } while (pilihan != 0);
}

void tambahReservasi(ArrayList<Reservasi> daftarReservasi, ArrayList<Pelanggan> daftarPelanggan,
                     ArrayList<Paket> daftarPaket, Scanner input) {
    if (daftarPelanggan.isEmpty()) {
        System.out.println("Belum ada pelanggan. Tambahkan pelanggan terlebih dahulu.");
        return;
    }
    if (daftarPaket.isEmpty()) {
        System.out.println("Belum ada paket. Tambahkan paket terlebih dahulu.");
        return;
    }

    tampilPelanggan(daftarPelanggan);
    System.out.print("Pilih nomor pelanggan : ");
    int iPelanggan = Integer.parseInt(input.nextLine()) - 1;
    if (iPelanggan < 0 || iPelanggan >= daftarPelanggan.size()) {
        System.out.println("Nomor tidak valid.");
        return;
    }

    tampilPaket(daftarPaket);
    System.out.print("Pilih nomor paket : ");
    int iPaket = Integer.parseInt(input.nextLine()) - 1;
    if (iPaket < 0 || iPaket >= daftarPaket.size()) {
        System.out.println("Nomor tidak valid.");
        return;
    }

    System.out.print("Tanggal (DD-MM-YYYY) : ");
    String tanggal = input.nextLine();
    if (tanggal.isEmpty()) {
        System.out.println("Gagal membuat reservasi. Tanggal tidak boleh kosong.");
        return;
    }

    String id = "RSV" + (daftarReservasi.size() + 1);
    daftarReservasi.add(new Reservasi(id, daftarPelanggan.get(iPelanggan), daftarPaket.get(iPaket), tanggal));
    System.out.println("Reservasi berhasil dibuat! ID : " + id);
}

void tampilReservasi(ArrayList<Reservasi> daftarReservasi) {
    if (daftarReservasi.isEmpty()) {
        System.out.println("Belum ada reservasi.");
        return;
    }
    int no = 1;
    for (Reservasi r : daftarReservasi) {
        System.out.println(no++ + ". [" + r.getIdReservasi() + "] " + r.getPelanggan().getNama()
                + " | " + r.getPaket().getNamaPaket() + " | " + r.getTanggal() + " | " + r.getStatus());
    }
}

void updateReservasi(ArrayList<Reservasi> daftarReservasi, Scanner input) {
    tampilReservasi(daftarReservasi);
    System.out.print("Pilih nomor reservasi : ");
    int index = Integer.parseInt(input.nextLine()) - 1;
    if (index < 0 || index >= daftarReservasi.size()) {
        System.out.println("Nomor tidak valid.");
        return;
    }
    Reservasi target = daftarReservasi.get(index);

    System.out.print("Tanggal baru : ");
    String tanggalBaru = input.nextLine();
    System.out.print("Status baru  : ");
    String statusBaru = input.nextLine();
    if (tanggalBaru.isEmpty() || statusBaru.isEmpty()) {
        System.out.println("Gagal mengupdate. Tanggal dan status tidak boleh kosong.");
        return;
    }
    target.setTanggal(tanggalBaru);
    target.setStatus(statusBaru);
    System.out.println("Reservasi berhasil diupdate.");
}

void hapusReservasi(ArrayList<Reservasi> daftarReservasi, Scanner input) {
    tampilReservasi(daftarReservasi);
    System.out.print("Pilih nomor reservasi : ");
    int index = Integer.parseInt(input.nextLine()) - 1;
    if (index < 0 || index >= daftarReservasi.size()) {
        System.out.println("Nomor tidak valid.");
        return;
    }
    daftarReservasi.remove(index);
    System.out.println("Reservasi berhasil dihapus.");
}