/**
 * Created by anilkaynar on 7.08.2017.
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
@ManagedBean(name = "index", eager = true)
@RequestScoped
public class IndexManagedBean {
    String deger="Eklenen bir takım şeyler var ise çok fazla bir şey yoktu.";

    public String getDeger() {
        return deger;
    }

    public void setDeger(String deger) {
        this.deger = deger;
    }
    public String returnbirtakım(){
        return "Fonksiyon üzerinden gönderilen bir takım şeyler içerir";
    }
    public void toplama(int a,int b){
       int c=a+b; //Useless Method
    }
    public String floatValue(){
        double a=1.0;
        if(a==(double)1) {
            return "Birdir";
        }
        else {
            return "değildir";
        }
         //Function with bug
    }
}
