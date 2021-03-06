/**
 * Copyright (c) 2014 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 * 
 */
package org.eclipse.scada.configuration.dave;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.scada.configuration.dave.DavePackage
 * @generated
 */
public interface DaveFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DaveFactory eINSTANCE = org.eclipse.scada.configuration.dave.impl.DaveFactoryImpl.init ();

    /**
     * Returns a new object of class '<em>Device</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Device</em>'.
     * @generated
     */
    DaveDevice createDaveDevice ();

    /**
     * Returns a new object of class '<em>Driver</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Driver</em>'.
     * @generated
     */
    DaveDriver createDaveDriver ();

    /**
     * Returns a new object of class '<em>Communication Processor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Communication Processor</em>'.
     * @generated
     */
    DaveCommunicationProcessor createDaveCommunicationProcessor ();

    /**
     * Returns a new object of class '<em>Request Block</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Request Block</em>'.
     * @generated
     */
    DaveRequestBlock createDaveRequestBlock ();

    /**
     * Returns a new object of class '<em>Block Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Block Definition</em>'.
     * @generated
     */
    DaveBlockDefinition createDaveBlockDefinition ();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DavePackage getDavePackage ();

} //DaveFactory
