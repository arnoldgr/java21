package chap1.UnderstandingMethodDeclarationsAndImports.page13.page14; // package must be first non-comment, not required

import java.util.Date;  // must be after package if there is a package . not required



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
        java.util.Date date2;
        Date date3;

    }
}
