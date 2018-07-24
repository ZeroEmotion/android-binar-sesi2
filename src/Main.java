public class Main {
    //psvm
    public static void main(String[] args) {
        //primitive data type, reference data type
        //byte, string, float, int ,string, double
        int umur = 19;
        long uang = 10000;
        String nama = "budi";
        float currency = 2.5f; //dibutuhkan tambahan f dibelakangnya
        double cr = 2.3;

        Tiger tgr = new Tiger("kuning", 4);
        tgr.lari();

        String wrnaBulu = tgr.getWarnaBulu();
        System.out.println(wrnaBulu);

        Eagle eagle = new Eagle();
        eagle.makan();
    }
}
