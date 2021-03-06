/*
  Copyright (c) 1999, 2000 Brown University, Providence, RI
  
                            All Rights Reserved
  
  Permission to use, copy, modify, and distribute this software and its
  documentation for any purpose other than its incorporation into a
  commercial product is hereby granted without fee, provided that the
  above copyright notice appear in all copies and that both that
  copyright notice and this permission notice appear in supporting
  documentation, and that the name of Brown University not be used in
  advertising or publicity pertaining to distribution of the software
  without specific, written prior permission.
  
  BROWN UNIVERSITY DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS
  SOFTWARE, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND
  FITNESS FOR ANY PARTICULAR PURPOSE.  IN NO EVENT SHALL BROWN
  UNIVERSITY BE LIABLE FOR ANY SPECIAL, INDIRECT OR CONSEQUENTIAL
  DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR
  PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
  TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
  PERFORMANCE OF THIS SOFTWARE.
*/

package jdsl.core.api;



/**
 * Used when an accessor (position or locator) is invalid, either internally invalid
 * or invalid with respect to a particular container.  Cases when
 * it would be thrown:
 * <ol>
 * <li>accessor has been marked invalid by some sort of invalidate() method
 * <li>accessor passed to a method is null
 * <li>accessor passed to a method is foreign (is of the wrong implementation
 * type or is contained by another container)
 * </ol>
 *
 * @version JDSL 2.1.1 
 * @author David Ellis
 * @author based on a previous version by Mark Handy
 */
public class InvalidAccessorException extends CoreException {

  public InvalidAccessorException( String message ) {
    super (message);
  }
  
  public InvalidAccessorException (String message, Throwable cause) {
	super(message, cause);
  }
     
  public InvalidAccessorException (Throwable cause) {
	super(cause);
  }

}
