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
            case 1 -> TambahPelanggan(daftarPelanggan, input);
            case 2 -> TampilPelanggan(daftarPelanggan);
            case 3 -> UpdatePelanggan(daftarPelanggan, input);
            case 4 -> HapusPelanggan(daftarPelanggan, input);
            case 0 -> System.out.println("Kembali...");
            default -> System.out.println("Pilihan tidak valid.");
        }
    } while (pilihan != 0);
}

void TambahPelanggan(ArrayList<Pelanggan> daftarPelanggan, Scanner input) {
    System.out.print("Nama  : ");
    String nama = input.nextLine();
    System.out.print("No HP : ");
    String noHp = input.nextLine();

    daftarPelanggan.add(new Pelanggan(nama, noHp));
    System.out.println("Pelanggan berhasil ditambahkan.");
}

void TampilPelanggan(ArrayList<Pelanggan> daftarPelanggan) {
    if (daftarPelanggan.isEmpty()) {
        System.out.println("Belum ada pelanggan.");
        return;
    }
    int no = 1;
    for (Pelanggan p : daftarPelanggan) {
        System.out.println(no++ + ". " + p.nama + " | " + p.noHp);
    }
}

void UpdatePelanggan(ArrayList<Pelanggan> daftarPelanggan, Scanner input) {
    TampilPelanggan(daftarPelanggan);
    System.out.print("Pilih nomor pelanggan : ");
    int index = Integer.parseInt(input.nextLine()) - 1;
    Pelanggan target = daftarPelanggan.get(index);

    System.out.print("Nama baru  : ");
    target.nama = input.nextLine();
    System.out.print("No HP baru : ");
    target.noHp = input.nextLine();
    System.out.println("Pelanggan berhasil diupdate.");
}

void HapusPelanggan(ArrayList<Pelanggan> daftarPelanggan, Scanner input) {
    TampilPelanggan(daftarPelanggan);
    System.out.print("Pilih nomor pelanggan : ");
    int index = Integer.parseInt(input.nextLine()) - 1;
    daftarPelanggan.remove(index);
    System.out.println("Pelanggan berhasil dihapus.");
}

void menuPaket(ArrayList<Paket> daftarPaket, Scanner input) {
    int pilihan;
    do {
        System.out.println("\n==============================");
        System.out.println("     Manajemen Paket Foto");
        System.out.println("==============================");
        System.out.println("1. Tambah Paket Foto");
        System.out.println("2. Tampilkan Paket Foto");
        System.out.println("3. Update Paket Foto");
        System.out.println("4. Hapus Paket Foto");
        System.out.println("0. Kembali");
        System.out.println("==============================");
        System.out.print("Pilihan : ");
        pilihan = Integer.parseInt(input.nextLine());

        switch (pilihan) {
            case 1 -> TambahPaket(daftarPaket, input);
            case 2 -> TampilPaket(daftarPaket);
            case 3 -> UpdatePaket(daftarPaket, input);
            case 4 -> HapusPaket(daftarPaket, input);
            case 0 -> System.out.println("Kembali...");
            default -> System.out.println("Pilihan tidak valid.");
        }
    } while (pilihan != 0);
}

void TambahPaket(ArrayList<Paket> daftarPaket, Scanner input) {
    System.out.print("Nama paket    : ");
    String namaPaket = input.nextLine();
    System.out.print("Durasi (menit): ");
    int durasi = Integer.parseInt(input.nextLine());
    System.out.print("Harga         : ");
    double harga = Double.parseDouble(input.nextLine());

    daftarPaket.add(new Paket(namaPaket, durasi, harga));
    System.out.println("Paket berhasil ditambahkan.");
}

void TampilPaket(ArrayList<Paket> daftarPaket) {
    if (daftarPaket.isEmpty()) {
        System.out.println("Belum ada paket.");
        return;
    }
    int no = 1;
    for (Paket p : daftarPaket) {
        System.out.println(no++ + ". " + p.namaPaket + " | " + p.durasi + " menit | Rp" + p.harga);
    }
}

void UpdatePaket(ArrayList<Paket> daftarPaket, Scanner input) {
    TampilPaket(daftarPaket);
    System.out.print("Pilih nomor paket : ");
    int index = Integer.parseInt(input.nextLine()) - 1;
    Paket target = daftarPaket.get(index);

    System.out.print("Nama baru   : ");
    target.namaPaket = input.nextLine();
    System.out.print("Durasi baru : ");
    target.durasi = Integer.parseInt(input.nextLine());
    System.out.print("Harga baru  : ");
    target.harga = Double.parseDouble(input.nextLine());
    System.out.println("Paket berhasil diupdate.");
}

void HapusPaket(ArrayList<Paket> daftarPaket, Scanner input) {
    TampilPaket(daftarPaket);
    System.out.print("Pilih nomor paket : ");
    int index = Integer.parseInt(input.nextLine()) - 1;
    daftarPaket.remove(index);
    System.out.println("Paket berhasil dihapus.");
}

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
            case 1 -> TambahReservasi(daftarReservasi, daftarPelanggan, daftarPaket, input);
            case 2 -> TampilReservasi(daftarReservasi);
            case 3 -> UpdateReservasi(daftarReservasi, input);
            case 4 -> HapusReservasi(daftarReservasi, input);
            case 0 -> System.out.println("Kembali...");
            default -> System.out.println("Pilihan tidak valid.");
        }
    } while (pilihan != 0);
}

void TambahReservasi(ArrayList<Reservasi> daftarReservasi, ArrayList<Pelanggan> daftarPelanggan,
                     ArrayList<Paket> daftarPaket, Scanner input) {
    TampilPelanggan(daftarPelanggan);
    System.out.print("Pilih nomor pelanggan : ");
    int iPelanggan = Integer.parseInt(input.nextLine()) - 1;

    TampilPaket(daftarPaket);
    System.out.print("Pilih nomor paket : ");
    int iPaket = Integer.parseInt(input.nextLine()) - 1;

    System.out.print("Tanggal (DD-MM-YYYY) : ");
    String tanggal = input.nextLine();

    String id = "RSV" + (daftarReservasi.size() + 1);
    daftarReservasi.add(new Reservasi(id, daftarPelanggan.get(iPelanggan), daftarPaket.get(iPaket), tanggal));
    System.out.println("Reservasi berhasil dibuat! ID : " + id);
}

void TampilReservasi(ArrayList<Reservasi> daftarReservasi) {
    if (daftarReservasi.isEmpty()) {
        System.out.println("Belum ada reservasi.");
        return;
    }
    int no = 1;
    for (Reservasi r : daftarReservasi) {
        System.out.println(no++ + ". [" + r.idReservasi + "] " + r.pelanggan.nama
                + " | " + r.paket.namaPaket + " | " + r.tanggal + " | " + r.status);
    }
}

void UpdateReservasi(ArrayList<Reservasi> daftarReservasi, Scanner input) {
    TampilReservasi(daftarReservasi);
    System.out.print("Pilih nomor reservasi : ");
    int index = Integer.parseInt(input.nextLine()) - 1;
    Reservasi target = daftarReservasi.get(index);

    System.out.print("Tanggal baru : ");
    target.tanggal = input.nextLine();
    System.out.print("Status baru  : ");
    target.status = input.nextLine();
    System.out.println("Reservasi berhasil diupdate.");
}

void HapusReservasi(ArrayList<Reservasi> daftarReservasi, Scanner input) {
    TampilReservasi(daftarReservasi);
    System.out.print("Pilih nomor reservasi : ");
    int index = Integer.parseInt(input.nextLine()) - 1;
    daftarReservasi.remove(index);
    System.out.println("Reservasi berhasil dihapus.");
}