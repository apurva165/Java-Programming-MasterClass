package section9.interfacechallenge;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    ArrayList<String> write();

    void read(List<String> savedValues);

}
