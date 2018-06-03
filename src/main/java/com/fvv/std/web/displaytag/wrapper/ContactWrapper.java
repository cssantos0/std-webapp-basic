package com.fvv.std.web.displaytag.wrapper;

import org.apache.commons.lang.time.FastDateFormat;
import org.displaytag.decorator.TableDecorator;

import com.fvv.std.bean.Contact;

/**
 * 
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>
 * @version 1.0 	
 *
 */
public class ContactWrapper extends TableDecorator {

	/**
     * FastDateFormat used to format dates in getDate().
     */
    private FastDateFormat dateFormat;
    
    /**
     * Creates a new Wrapper decorator who's job is to reformat some of the data located in our TestObject's.
     */
    public ContactWrapper() {
        super();
        this.dateFormat = FastDateFormat.getInstance("MM/dd/yy"); 
    }
    
    /**
     * Test method which always returns a null value.
     * @return <code>null</code>
     */
    public String getNullValue() {
        return null;
    }

    /**
     * Returns the date as a String in MM/dd/yy format.
     * @return formatted date
     */
    public String getBirthDate() {
        return this.dateFormat.format(((Contact) this.getCurrentRowObject()).getBirthDate().getTime());
    }
}
