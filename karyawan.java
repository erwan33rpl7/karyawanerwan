//driver class
public class karyawan {
 int id;
 String nama;
 double ipk;
 String alamat;
 String unit;

    public karyawan() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;
        alamat = "kosong";
        unit = "kosong";
       }
    public karyawan(int id, String nama, double ipk,String alamat, String unit) {
        this.id = id; this.nama = nama; this.ipk = ipk ; this.alamat = alamat ; this.unit = unit; 
       }
       public void print() {
        System.out.println("ID = "+ id);
        System.out.println("Nama = "+ nama);
        System.out.println("IPK = "+ ipk);
        System.out.println("Alamat = "+ alamat);
        System.out.println("unit = "+ unit);
              }
            
            
            
            
            
            
            
            
            }