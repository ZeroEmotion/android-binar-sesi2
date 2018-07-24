public class Tiger extends Animal{

    String warnaBulu;
    //constructor
    Tiger(String warnaBulu){
        this.warnaBulu = warnaBulu;
        super.warnaBulu = warnaBulu;
        System.out.println("ini kosntruktor dari kelas tiger");
    }

    Tiger(String warnaBulu, int jmlKaki){
        this(warnaBulu);
        System.out.println("overload");
    }

    void lari(){
        System.out.println("lari..");
    }

    String getWarnaBulu(){
        warnaBulu = "kuning";
        return warnaBulu;
    }
}
