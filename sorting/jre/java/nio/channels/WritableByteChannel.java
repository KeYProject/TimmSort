/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.nio.channels;

public interface WritableByteChannel extends java.nio.channels.Channel
{


   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public int write(java.nio.ByteBuffer arg0) throws java.io.IOException;
}