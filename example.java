import java.util.ArrayList;

public class example {
    public static void main(String[] args) {
        Deposito d1=new Deposito( );
        Deposito d2=new Deposito( );
        Deposito d3=new Deposito( );
        Deposito d4=new Deposito( );
        d1.addBebida(new CocaCola(14));
        d1.addBebida(new CocaCola(15));
        d1.addBebida(new CocaCola(16));
        d2.addBebida(new Kem(28));
        d2.addBebida(new Kem(29));
        d3.addBebida(new Fanta(42));
        d3.addBebida(new Fanta(43));
        d3.addBebida(new Fanta(44));
        d4.addBebida(new Sprite(56));
        d4.addBebida(new Sprite(57));
        d4.addBebida(new Sprite(58));

        Bebida b=null;
        b=d1.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d1.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d1.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d1.getBebida();
        b=null;
        b=d2.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d2.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d2.getBebida();
        b=null;
        b=d3.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d3.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d3.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d3.getBebida();
        b=null;
        b=d4.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d4.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d4.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d4.getBebida();
        b=null;
    }
}

class CreaYPruebaBebida {
    public static void pruebaVeSerieBebe(Deposito dep, int que, int serie){
        Bebida b=null;
        switch (que){
            case 1:  b = new Sprite(serie); break;
            case 2:  b = new Fanta(serie); break;
            case 3:  b = new Kem(serie); break;
            case 4:  b = new CocaCola(serie); break;
            default: return;
        }
        dep.addBebida(b);
    }
}

abstract class Bebida {
    private int serie;

    public Bebida(int serie){
        this.serie = serie;
    }

    public int getSerie(){
        return serie;
    }

    public String beber(){
        return "sabor: ";
    }
}

class Sprite extends Bebida {

    public Sprite(int serie){
        super(serie);
    }

    @Override
    public String beber(){
        return super.beber() + "sprite";
    }
}
class Fanta extends Bebida {

    public Fanta(int serie){
        super(serie);
    }

    @Override
    public String beber(){
        return super.beber() + "fanta";
    }
}
class CocaCola extends Bebida {

    public CocaCola(int serie){
        super(serie);
    }

    @Override
    public String beber(){
        return super.beber() + "cocacola";
    }
}

class Kem extends Bebida {

    public Kem(int serie){
        super(serie);
    }

    @Override
    public String beber(){
        return super.beber() + "kem";
    }
}

class Deposito {
    private ArrayList<Bebida> dep;

    public Deposito(){
        this.dep = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida b) {
        dep.add(b);
    }

    public Bebida getBebida(){
        Bebida beb;
        if(dep.size() != 0){
            beb = dep.remove(0);
            return beb;
        }
        else{
            return null;
        }
    }
}



