package chap1.d4UndderstandingPackageDeclarationsAndImports.page14; // package must be first non-comment, not required

import java.util.Date;



public class Conflicts {
    public static void main(String[] args) {

        // must be after imports if any , required
        Date date;

// OR USE THE FULLY QUALIFIED NAME
    /*Sometimes you really do want to use Date from two different packages.
    When this happens, you can pick one to use in the import statement and use the other’s
    fully qualified class name. Or you can drop both import statements and always use the
    fully qualified class name.
     */
        Date date2;
        Date date3;

    }
}
