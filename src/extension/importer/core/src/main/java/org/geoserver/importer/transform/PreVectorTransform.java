/* (c) 2014 Open Source Geospatial Foundation - all rights reserved
 * (c) 2001 - 2013 OpenPlans
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.importer.transform;

import org.geoserver.importer.ImportData;
import org.geoserver.importer.ImportTask;

/**
 * Vector transform that is performed before input occurs.
 * 
 * @author Justin Deoliveira, OpenGeo
 */
public interface PreVectorTransform extends VectorTransform {

    void apply(ImportTask task, ImportData data) throws Exception;
}
