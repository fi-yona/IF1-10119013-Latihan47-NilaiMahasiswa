/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan47.nilaimahasiswa;

/**
 *
 * @author Fiona Avila
 */


public class OONilaiMahasiswa {
    
    private double quiz = 90;
    private double uts = 80.5;
    private double uas = 85;
    
    public double getQuiz(){
        return quiz;
    }
    
    public void setQuiz(double quiz){
        this.quiz = quiz;
    }
    
    public double getUts(){
        return uts;
    }
    
    public void setUts(double Uts){
        this.uts = uts;
    }
    
    public double getUas(){
        return uas;
    }
    
    public void setUas(double Uas){
        this.uas = uas;
    }
    
    public double hitungNilaiAkhir(){
        double NA;
        NA = (0.20*quiz) + (0.30*uts) + (0.50*uas);
        return NA;
    }
    
    public char indexNilai(double NA){
        char index = 0;
        if(80<NA && NA<=100){
            index = 'A'; 
        }if(68<NA && NA<=80){
            index = 'B';
        }if(56<NA && NA<=68){
            index = 'C';
        }if(45<NA && NA<=56){
            index = 'D';
        }if(0<=NA && NA<=45){
            index = 'E';
        }
        return index;
    }
    
    public String keterangan(char index){
        String ket = null;
        if(index=='A'){
            ket = "Sangat baik";
        }if(index=='B'){
            ket = "Baik";
        }if(index=='C'){
            ket = "Cukup";
        }if(index=='D'){
            ket = "Kurang";
        }if(index=='E'){
            ket = "Sangat kurang";
        }
        return ket;
    }
    
    public static void main(String[] args) {
        OONilaiMahasiswa oo = new OONilaiMahasiswa();
        double NA = oo.hitungNilaiAkhir();
        char index = oo.indexNilai(NA);
        String ket = oo.keterangan(index);
        System.out.println("QUIZ\t= " + oo.getQuiz());
        System.out.println("UTS\t= " + oo.getUts());
        System.out.println("UAS\t= " + oo.getUas());
        System.out.println();
        System.out.println("Nilai akhir = " + NA);
        System.out.println();
        System.out.println("Index = " + index);
        System.out.println("Keterangan = " + ket);
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
    
}
