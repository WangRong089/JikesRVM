import java.nio.*;

public class JNI_OnLoad {

  // set to true to get messages for each test
  static boolean verbose = true;
  static boolean allTestPass = true;

  public static void main(String[] args) throws Exception {
    System.loadLibrary("JNI_OnLoad");

    if (args.length!=0) {
      if (args[0].equals("-quiet")) {
        verbose = false;        
        setVerboseOff();
      }
    }

    int returnValue;
    
    returnValue = testJNIOnLoad();
    checkTest(returnValue, true, "testJNIOnLoad -- A");

    if (allTestPass) {
      System.out.println("PASS: JNI_OnLoad");
    } else {
      System.out.println("FAIL: JNI_OnLoad");
    }
  }

  private final static native int testJNIOnLoad();

  public static native void setVerboseOff();
      
  static void printVerbose(String str) {
    if (verbose) 
      System.out.println(str);
  }

  static void checkTest(int returnValue, boolean postCheck, String testName) {
    if (returnValue==0 && postCheck) {
      printVerbose("PASS: " + testName);
    } else {
      allTestPass = false;
      printVerbose("FAIL: " + testName);
    }
  }
}
