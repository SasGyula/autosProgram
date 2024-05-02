package main;

public class AutosProgram {

    public static void main(String[] args) {
        //referencia nélkül
        //new AutosProgram().bemutato_0();
        
        //referenciával
        AutosProgram prg = new AutosProgram();
        prg.bemutato_0();
        //prg.bemutato_1();
        //prg.bemutato_2();
        
    }

    private void bemutato_0() {
        Auto auto = new Auto();
        auto.megy();
        auto.setBeindit(true);
        auto.megy();
        auto.megy();
        auto.tankol();
        auto.setBeindit(false);
        auto.tankol();
        auto.setBeindit(true);
        auto.megy();
    }

    private void bemutato_1() {
        Auto auto = new Auto(false);
    }

    private void bemutato_2() {
        Auto auto = new Auto(true, true);
    }
    
}
