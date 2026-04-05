class PaketPhotobooth extends Paket {
    private int jumlahShoot;
    private String jumlahDigitalCopy;
    private int jumlahPhotoPrint;
    private int maxOrang;

    PaketPhotobooth() {
        super("Photobooth Collage", 30, 65000);
        setJumlahShoot(16);
        setJumlahDigitalCopy("All digital copies");
        setJumlahPhotoPrint(2);
        setMaxOrang(5);
    }

    public int getJumlahShoot() {
        return jumlahShoot;
    }

    public void setJumlahShoot(int jumlahShoot) {
        if (jumlahShoot <= 0) {
            System.out.println("Jumlah shoot harus lebih dari 0.");
        } else {
            this.jumlahShoot = jumlahShoot;
        }
    }

    public String getJumlahDigitalCopy() {
        return jumlahDigitalCopy;
    }

    public void setJumlahDigitalCopy(String jumlahDigitalCopy) {
        if (jumlahDigitalCopy == null || jumlahDigitalCopy.isEmpty()) {
            System.out.println("Jumlah digital copy tidak boleh kosong.");
        } else {
            this.jumlahDigitalCopy = jumlahDigitalCopy;
        }
    }

    public int getJumlahPhotoPrint() {
        return jumlahPhotoPrint;
    }

    public void setJumlahPhotoPrint(int jumlahPhotoPrint) {
        if (jumlahPhotoPrint < 0) {
            System.out.println("Jumlah photo print tidak boleh negatif.");
        } else {
            this.jumlahPhotoPrint = jumlahPhotoPrint;
        }
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

    @Override
    public String getInfo() {
        return super.getInfo() + " | " + jumlahShoot + "x shoot | " + jumlahDigitalCopy
                + " | " + jumlahPhotoPrint + " photo print 4R | Max " + maxOrang + " orang";
    }
}