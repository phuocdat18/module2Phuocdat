package BtCustomer.BT7;



import java.util.*;

public class Main {
    List<Giaovien> giaoviens;
    private Scanner scanner = new Scanner(System.in);

    public Main() {
        giaoviens = new ArrayList<>();
        Giaovien giaovien = new Giaovien("1a", "Đạt", 18, "Nhatrang", 500, 50, 0, 550);
        giaoviens.add(giaovien);
        giaoviens.add(new Giaovien("2a", "Đạt1", 28, "Nhatrang", 600, 60, 50, 590));
        giaoviens.add(new Giaovien("3", "Đạt2", 38, "Nhatrang", 700, 70, 10, 640));
        giaoviens.add(new Giaovien("4", "Đạt3", 48, "Nhatrang", 800, 80, 60, 780));
        giaoviens.add(new Giaovien("5", "Đạt4", 58, "Nhatrang", 900, 90, 40, 850));
    }

    public void danhsach() {
        System.out.printf("%5s | %30s | %20s | %30s | %10s \n", "Id", "ten", "tuoi", "que", "luongthuc");
        for (int i = 0; i < giaoviens.size(); i++) {
            Giaovien giaovien = giaoviens.get(i);
            System.out.printf("%5s | %30s | %20s | %30s | %10s \n",
                    giaovien.getId(), giaovien.getTen(), giaovien.getTuoi(),
                    giaovien.getQuequan(), giaovien.getLuongthuc());
        }
    }

    public void danhsach(List<Giaovien> giaoviens) {
        System.out.printf("%5s | %30s | %20s | %30s | %10s \n", "Id", "ten", "tuoi", "que", "luongthuc");
        for (int i = 0; i < giaoviens.size(); i++) {
            Giaovien giaovien = giaoviens.get(i);
            System.out.printf("%5s | %30s | %20s | %30s | %10s \n",
                    giaovien.getId(), giaovien.getTen(), giaovien.getTuoi(),
                    giaovien.getQuequan(), giaovien.getLuongthuc());
        }
    }

}

