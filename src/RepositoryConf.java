import sun.rmi.runtime.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by paolomoriello on 04/07/16.
 */
public class RepositoryConf {

    private String path;

    public RepositoryConf(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Map<String, String> readSources() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Map<String, String> map = new HashMap();

        String line = null;
        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] tokens = line.split(",");
            map.put(tokens[0], tokens[1]);
        }
        return map;
    }

    /*
    public Map<String, Set<String>> readInternalDb() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Map<String, Set<String>> map = new HashMap();

        String line = null;
        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] tokens = line.split(",");
            Set<String> set = new HashSet<>();
            for(int i = 0; i < tokens.length; i++) {
                set.add(tokens[i]);
            }
            map.put(tokens[0], set);
        }
        return map;
    }
    */
}
