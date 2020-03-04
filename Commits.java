import java.io.Serializable;
import java.io.File;
import java.util.HashMap;
import java.util.TreeMap;
import Utils;

class Commit implements Serializable {
    String id;

    Commit[] parents;
    long timeStamp;
    String msg;
    String branch;

    Commit() {
        Commit parent = null;
        long timeStamp = System.currentTimeMillis() / 1000L;
        msg = "initial commit";
        branch = "master";
    }

    Commit(String commitMsg) {
        Commit parent = null;
        long timeStamp = System.currentTimeMillis() / 1000L;
        msg = commitMsg;
        branch = "master";
    }

    Commit(String commitMsg, Commit p) {
        Commit parent = p;
        long timeStamp = System.currentTimeMillis() / 1000L;
        msg = commitMsg;
        branch = "master";
    }

    Commit(String commitMsg, Commit p, String commitBranch) {
        Commit parent = p;
        long timeStamp = System.currentTimeMillis() / 1000L;
        msg = commitMsg;
        branch = commitBranch;
    }

    String getId() {
        String info = msg + timeStamp;
        id = s
    }

}

public class Commits {
    HashMap <String, Commit> branches;




}