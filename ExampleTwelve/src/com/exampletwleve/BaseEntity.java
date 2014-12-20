package com.exampletwleve;

/**
 * The base class which
 * is going to do things
 * that would make its derived classes difficult to test.
 *  
 */
public class BaseEntity {

    private final long identifier = 1/0;

    /**
     * Static initializer that will throw a NullPointerException.
     */
    static {
        String x = null;
        x.toString();
    }

    /**
     * The default constructor throws UnsupportedOperationException.
     */
    public BaseEntity() {
        throw new UnsupportedOperationException();
    }

    /**
     * This method is responsible to do write audit trails.
     * Currently this method throws an UnsupportedOperationException.
     * @param auditInformation the audit information to log.
     */
    protected void performAudit(String auditInformation) {
        throw new UnsupportedOperationException();
    }
}
