/** Driver class for Gitlet, the tiny stupid version-control system.
 *  @author Franco Achacoso
 */
public class Main {

    /** Usage: java gitlet.Main ARGS, where ARGS contains
     *  <COMMAND> <OPERAND> .... */
    public static void main(String... args) {
        if (args.length == 0) {
            System.out.println("Please enter a command.");
            switch (args[1]) {
                case "init":
                    Methods.init();
                    break;
                case "add":
                    Methods.add();
                    break;
                case "commit":
                    Methods.commit();
                    break;
                case "checkout":
                    Methods.checkout();
                    break;
                case "log":
                    Methods.log();
                    break;
            }
        }
    }

}
