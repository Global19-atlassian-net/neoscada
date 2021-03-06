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
package org.eclipse.scada.configuration.driver.jdbc.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.scada.configuration.driver.jdbc.JdbcFactory;
import org.eclipse.scada.configuration.driver.jdbc.QueryComponent;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Query Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryComponentTest extends TestCase
{

    /**
     * The fixture for this Query Component test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QueryComponent fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( QueryComponentTest.class );
    }

    /**
     * Constructs a new Query Component test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QueryComponentTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Query Component test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( QueryComponent fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Query Component test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QueryComponent getFixture ()
    {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp () throws Exception
    {
        setFixture ( JdbcFactory.eINSTANCE.createQueryComponent () );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown () throws Exception
    {
        setFixture ( null );
    }

} //QueryComponentTest
