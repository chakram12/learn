package com.jsfcompref.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Model1 {

    private Map<String, List<UserBean>> data;

    public Model1() {
        data = new HashMap<String, List<UserBean>>();
        // Populate the model with data in the constructor.  Naturally
        // in a real application, the model would be populated some
        // other way
        List<UserBean> users = new ArrayList<UserBean>();

        // users with "Medium" service level
        users.add(makeUser("Bob", "Biceps", "Medium", "M"));
        users.add(makeUser("Frank", "Forearms", "Medium", "M"));
        users.add(makeUser("Sherry", "Shins", "Medium", "F"));
        users.add(makeUser("Alice", "Abs", "Medium", "F"));
        data.put(users.get(0).getServiceLevel(), users);

        users = new ArrayList<UserBean>();

        // users with "Basic" service level
        users.add(makeUser("Pete", "Pectorals", "Basic", "M"));
        users.add(makeUser("Neil", "Neck", "Basic", "M"));
        users.add(makeUser("Ellen", "Elbows", "Basic", "F"));
        users.add(makeUser("Tina", "Tummy", "Basic", "F"));
        data.put(users.get(0).getServiceLevel(), users);

        users = new ArrayList<UserBean>();

        // users with "Premium" service level
        users.add(makeUser("Bernd", "Beine", "Premium", "M"));
        users.add(makeUser("Rolf", "yaaa", "Premium", "M"));
        users.add(makeUser("Bettina", "Bauch", "Premium", "F"));
        users.add(makeUser("Frauke", " vayya", "Premium", "F"));
        data.put(users.get(0).getServiceLevel(), users);


    }

    public Set<String> getKeys() {
        return data.keySet();
    }

    private UserBean makeUser(String firstName, String lastName,
            String serviceLevel, String sex) {
        UserBean result = new UserBean();
        result.setFirstName(firstName);
        result.setLastName(lastName);
        result.setServiceLevel(serviceLevel);
        result.setSex(sex);
        return result;
    }
    
    public Map<String,List<UserBean>> getData() {
        return data;
    }

}
