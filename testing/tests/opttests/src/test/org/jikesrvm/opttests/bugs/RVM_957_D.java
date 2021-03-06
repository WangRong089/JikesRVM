/*
 *  This file is part of the Jikes RVM project (http://jikesrvm.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License. You
 *  may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  See the COPYRIGHT.txt file distributed with this work for information
 *  regarding copyright ownership.
 */
package test.org.jikesrvm.opttests.bugs;

public class RVM_957_D extends RVM_957_C {

  @Override
  public boolean check(RVM_957_A a, RVM_957_B b) {
    return ((a instanceof RVM_957_A) && (b instanceof RVM_957_B));
  }
}
