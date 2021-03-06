/*******************************************************************************
 * Copyright (c) 2013, 2014 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.world;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.world.Endpoint#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.world.Endpoint#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.world.Endpoint#getBoundService <em>Bound Service</em>}</li>
 * </ul>
 *
 * @see org.eclipse.scada.configuration.world.WorldPackage#getEndpoint()
 * @model
 * @generated
 */
public interface Endpoint extends NamedDocumentable
{
    /**
     * Returns the value of the '<em><b>Node</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.eclipse.scada.configuration.world.Node#getEndpoints <em>Endpoints</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node</em>' container reference.
     * @see #setNode(Node)
     * @see org.eclipse.scada.configuration.world.WorldPackage#getEndpoint_Node()
     * @see org.eclipse.scada.configuration.world.Node#getEndpoints
     * @model opposite="endpoints" keys="hostName" required="true" transient="false"
     * @generated
     */
    Node getNode ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.world.Endpoint#getNode <em>Node</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Node</em>' container reference.
     * @see #getNode()
     * @generated
     */
    void setNode ( Node value );

    /**
     * Returns the value of the '<em><b>Port Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port Number</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port Number</em>' attribute.
     * @see #setPortNumber(int)
     * @see org.eclipse.scada.configuration.world.WorldPackage#getEndpoint_PortNumber()
     * @model required="true"
     * @generated
     */
    int getPortNumber ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.world.Endpoint#getPortNumber <em>Port Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port Number</em>' attribute.
     * @see #getPortNumber()
     * @generated
     */
    void setPortNumber ( int value );

    /**
     * Returns the value of the '<em><b>Bound Service</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bound Service</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bound Service</em>' containment reference.
     * @see #setBoundService(ServiceBinding)
     * @see org.eclipse.scada.configuration.world.WorldPackage#getEndpoint_BoundService()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    ServiceBinding getBoundService ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.world.Endpoint#getBoundService <em>Bound Service</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bound Service</em>' containment reference.
     * @see #getBoundService()
     * @generated
     */
    void setBoundService ( ServiceBinding value );

} // Endpoint
