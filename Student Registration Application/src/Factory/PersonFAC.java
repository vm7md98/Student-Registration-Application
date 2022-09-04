package Factory;

import Model.*;

public class PersonFAC {

    public Person createUser(String person) {

        if ("advisor".equals(person.toLowerCase())) {
            return new Advisor();

        } else if ("student".equals(person.toLowerCase())) {
            return new Student();

        }
        return null;
    }
}
