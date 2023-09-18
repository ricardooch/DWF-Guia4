package sv.edu.udb.www.util;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
public class JsfUtil {
    public static void addErrorMessage(String msg){
        FacesMessage facesMsg = new
                FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }
    public static void addSucessMessage(String msg){
        FacesMessage facesMsg = new
                FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }
}
