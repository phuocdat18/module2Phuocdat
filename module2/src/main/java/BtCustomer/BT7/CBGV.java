package BtCustomer.BT7;

import java.util.ArrayList;
import java.util.List;

public class CBGV {
    private List<Giaovien> giaoviens;

    public CBGV() {
        this.giaoviens = new ArrayList<>();
    }
    public void add(Giaovien giaovien) {
        this.giaoviens.add(giaovien);
    }
    public boolean deleteById(String id) {
        Giaovien giaovien = this.giaoviens.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (giaovien == null) {
            return false;
        }
        this.giaoviens.remove(giaovien);
        return true;
    }

    public double getLuong(String id) {
        Giaovien giaovien = this.giaoviens.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if(giaovien == null) {
            return 0;
        }
        return giaovien.getLuong() + giaovien.getThuong() + giaovien.getTienphat();
    }

}
