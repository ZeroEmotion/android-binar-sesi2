//extends untuk inheritance
public class Eagle extends Animal {
    int jmlSayap;

    void terbang(){
        System.out.println();
    }

   @Override
    void makan() {
        System.out.println("makan daging");
    }
}
