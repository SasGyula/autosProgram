
package main;

public class Auto {
    private static int objektumDb = 0;
    private boolean uzemanyag;
    private boolean beinditva;
    
    public Auto(){
        this(false, true);
    }
    
    public Auto(boolean beinditva){
        this(beinditva,false);
    }
    
    public Auto(boolean beindit, boolean uzemanyag){
        this.uzemanyag = uzemanyag;
        this.beinditva = beindit;
        Auto.objektumDb ++;
        System.out.printf("*************%d.bemutató**************\n".formatted(Auto.objektumDb));
        System.out.println("*************************************");
        String info = uzemanyag ? "van" : "nincs";
        System.out.println("Üzemanyag: "+info);
        info = beinditva ? "be" : "nincs";
        System.out.println("Beinditva: "+ info);
        System.out.println("----------------");
    }
    public void setBeindit(boolean beinditva){
        this.beinditva= beinditva;
        if(beinditva){
            System.out.println("A motor be van indítva");
        }else{
            System.out.println("A motor le van állítva");
        }
    }
    //setUzemanyag(false)
    public void megy(){
        if (beinditva && uzemanyag) {
            System.out.println("A kocsi megérkezett de kifogyott az üzemanyag");
            this.uzemanyag = false;
        } else if(!beinditva) {
            System.out.println("Nem haladtunk, az auto nincs beinditva");
        } else if(!uzemanyag){
            System.out.println("Nem haladtunk, mert üres a tank");
        }
    }
    //setUzemanyag(true)
    public void tankol(){
        if (!beinditva) {
            this.uzemanyag = true;
            System.out.println("Sikerült tankolni, tele a tank");
        }else{
            System.out.println("Sikertelen tankolás, mert megy a motor");
        }
    }
}
