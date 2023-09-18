package sv.edu.udb.www.managedbean;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ManagedProperty;
import jakarta.faces.bean.RequestScoped;
import sv.edu.udb.www.util.JsfUtil;
import java.util.ResourceBundle;
@ManagedBean
@RequestScoped
public class Login {

    @ManagedProperty("#{language}")
    private Language idioma;
    public Language getIdioma() {
        return idioma;
    }
    public void setIdioma(Language idioma) {
        this.idioma = idioma;
    }
    private String usuario;
    private String password;
    public Login() {
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String validar(){
        if (getUsuario().equals("Rafael") && getPassword().equals("Torres")){

            JsfUtil.addSucessMessage(ResourceBundle.getBundle("/Bundle",idioma.getLocale()
            ).getString("LoginCorrecto"));
            return "bienvenido";
        }else{

            JsfUtil.addErrorMessage(ResourceBundle.getBundle("/Bundle",idioma.getLocale()).
                    getString("LoginError"));
            return null;
        }
    }

}