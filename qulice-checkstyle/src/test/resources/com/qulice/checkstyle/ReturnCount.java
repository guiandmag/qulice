/**
 * Hello.
 */
package foo;

/**
 * Simple.
 * @author John Smith (john@example.com)
 * @version $Id$
 * @since 1.0
 */
public final class ReturnCount {
    /**
     * Method with two {@code return} statements.
     * @param number Some nice number.
     */
    public int methodWithTwoReturns(final int number) {
        if (number == 0) {
            return 0;
        }
        return 1;
    }
}
