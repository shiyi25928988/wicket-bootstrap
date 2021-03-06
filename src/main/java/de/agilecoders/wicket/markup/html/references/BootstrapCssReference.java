package de.agilecoders.wicket.markup.html.references;

import de.agilecoders.wicket.util.References;
import org.apache.wicket.request.resource.CssResourceReference;
import org.apache.wicket.request.resource.ResourceReference;

/**
 * TODO: document
 *
 * @author miha
 * @version 1.0
 */
public class BootstrapCssReference extends CssResourceReference {
    private static final long serialVersionUID = 1L;

    /**
     * Singleton instance of this reference
     */
    public static final ResourceReference INSTANCE = new BootstrapCssReference();

    /**
     * Private constructor.
     */
    private BootstrapCssReference() {
        super(BootstrapCssReference.class, "css/bootstrap.css");
    }

}