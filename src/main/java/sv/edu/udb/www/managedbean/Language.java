package sv.edu.udb.www.managedbean;
/**
 *
 * @author Rafael
 */
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;
import jakarta.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Locale;
@ManagedBean(name="language")
@SessionScoped
public class Language implements Serializable{
    private static final long serialVersionUID = 1L;
    private Locale locale =
            FacesContext.getCurrentInstance().getViewRoot().getLocale();
    public Locale getLocale() {
        return locale;
    }
    public String getLanguage() {
        return locale.getLanguage();
    }

    public void changeLanguage(String language) {
        locale = new Locale(language);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(new
                Locale(language));
    }
}