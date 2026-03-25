package chap1.d4UndderstandingPackageDeclarationsAndImports.page13;

//import java.nio.file.Files;
//import java.nio.file.Paths;

//import java.nio.*;            // NO GOOD - a wildcard only matches
// class names, not "file.Files"
//import java.nio.*.*;          // NO GOOD - you can only have one wildcard
// and it must be at the end
//import java.nio.file.Paths.*; // NO GOOD - you cannot import methods
// only class names

import java.nio.file.Files;
import java.nio.file.Paths;

public class ImputImports {
    public void read(Files files) {
        Paths.get("name");
    }
}

//There are two possible answers. The shorter one is to use a wildcard to import both at the same time.

