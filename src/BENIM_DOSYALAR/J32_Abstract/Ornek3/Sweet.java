package BENIM_DOSYALAR.J32_Abstract.Ornek3;

public abstract class Sweet extends Food{

  //  public abstract void madeIn();//abs meth childe'Test01 zorla implement edilmesi için tanımlanır

    @Override
    public void madeIn() {// conc meth childi overrdie etmek te serbest

    }

    @Override
    public void taste() {
        System.out.println("good sugar  sweet");
    }
}
