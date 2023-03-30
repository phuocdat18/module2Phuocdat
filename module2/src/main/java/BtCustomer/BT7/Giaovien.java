package BtCustomer.BT7;

public class Giaovien {
    private String id;
    private String ten;
    private int tuoi;
    private String quequan;
    private double luong;
    private double thuong;
    private double tienphat;
    private double luongthuc;

    public Giaovien(String id, String ten, int tuoi,  String quequan,double luong, double thuong, double tienphat, double luongthuc) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.quequan = quequan;
        this.luong = luong;
        this.thuong = thuong;
        this.tienphat = tienphat;
        this.luongthuc = luongthuc;



    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    public double getTienphat() {
        return tienphat;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }

    public double getLuongthuc() {
        return luongthuc;
    }

    public void setLuongthuc(double luongthuc) {
        this.luongthuc = luongthuc;
    }
}
