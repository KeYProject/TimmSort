/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.nio.channels;

public interface CompletionHandler
{


   /*@ requires true; ensures true; assignable \everything; */
   public void completed(java.lang.Object arg0, java.lang.Object arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public void failed(java.lang.Throwable arg0, java.lang.Object arg1);
}