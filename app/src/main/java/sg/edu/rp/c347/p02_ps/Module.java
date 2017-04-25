package sg.edu.rp.c347.p02_ps;

/**
 * Created by 15017434 on 25/4/2017.
 */

public class Module {
    private String code;
    private boolean prog;

    public Module(String code, boolean prog){
        this.code = code;
        this.prog = prog;
    }
    public String getCode(){
        return code;
    }
    public boolean isProg(){
        return prog;
    }
}
