class PaketGrup extends Paket {
    private int jumlahShoot;
    private int jumlahDigitalCopy;
    private int jumlahPhotoPrint;
    private int maxOrang;

    PaketGrup() {
        super("Paket Grup", 15, 200000);
        setJumlahShoot(50);
        setJumlahDigitalCopy(20);
        setJumlahPhotoPrint(5);
        setMaxOrang(20);
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

    public int getJumlahDigitalCopy() {
        return jumlahDigitalCopy;
    }

    public void setJumlahDigitalCopy(int jumlahDigitalCopy) {
        if (jumlahDigitalCopy < 0) {
            System.out.println("Jumlah digital copy tidak boleh negatif.");
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
                + " digital copy | " + jumlahPhotoPrint + " photo print 4R | Max " + maxOrang + " orang";
    }
}