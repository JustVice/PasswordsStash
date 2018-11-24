package LogicV2;

import Logic.Passwordv2;
import java.io.Serializable;
import java.util.LinkedList;

public class UserData implements Serializable {
    
    private static final long serialVersionUID = 2883991000023476147L;
    
    private LinkedList<Passwordv2> passwordsList = new LinkedList<Passwordv2>();
    
    public UserData() {
    }

    public LinkedList<Passwordv2> getPasswordsList() {
        return passwordsList;
    }

    public void setPasswordsList(LinkedList<Passwordv2> passwordsList) {
        this.passwordsList = passwordsList;
    }
    
    
}
