/**
 * Copyright (c) 2015 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 * 
 */
package org.eclipse.scada.configuration.infrastructure.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.scada.configuration.infrastructure.InfrastructurePackage;
import org.eclipse.scada.configuration.infrastructure.JMXSettings;

/**
 * This is the item provider adapter for a {@link org.eclipse.scada.configuration.infrastructure.JMXSettings} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JMXSettingsItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JMXSettingsItemProvider ( AdapterFactory adapterFactory )
    {
        super ( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors ( Object object )
    {
        if ( itemPropertyDescriptors == null )
        {
            super.getPropertyDescriptors ( object );

            addPortPropertyDescriptor ( object );
            addInstancePortOffsetPropertyDescriptor ( object );
            addLocalOnlyPropertyDescriptor ( object );
            addAuthenticatedPropertyDescriptor ( object );
            addSslPropertyDescriptor ( object );
            addAssignNodeHostnamePropertyDescriptor ( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Port feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPortPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_JMXSettings_port_feature" ), //$NON-NLS-1$
        getString ( "_UI_JMXSettings_port_description" ), //$NON-NLS-1$
        InfrastructurePackage.Literals.JMX_SETTINGS__PORT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_OraclePropertyCategory" ), //$NON-NLS-1$
        null ) );
    }

    /**
     * This adds a property descriptor for the Instance Port Offset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInstancePortOffsetPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_JMXSettings_instancePortOffset_feature" ), //$NON-NLS-1$
        getString ( "_UI_JMXSettings_instancePortOffset_description" ), //$NON-NLS-1$
        InfrastructurePackage.Literals.JMX_SETTINGS__INSTANCE_PORT_OFFSET, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_OraclePropertyCategory" ), //$NON-NLS-1$
        null ) );
    }

    /**
     * This adds a property descriptor for the Local Only feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLocalOnlyPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_JMXSettings_localOnly_feature" ), //$NON-NLS-1$
        getString ( "_UI_PropertyDescriptor_description", "_UI_JMXSettings_localOnly_feature", "_UI_JMXSettings_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        InfrastructurePackage.Literals.JMX_SETTINGS__LOCAL_ONLY, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_OraclePropertyCategory" ), //$NON-NLS-1$
        null ) );
    }

    /**
     * This adds a property descriptor for the Authenticated feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuthenticatedPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_JMXSettings_authenticated_feature" ), //$NON-NLS-1$
        getString ( "_UI_PropertyDescriptor_description", "_UI_JMXSettings_authenticated_feature", "_UI_JMXSettings_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        InfrastructurePackage.Literals.JMX_SETTINGS__AUTHENTICATED, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_OraclePropertyCategory" ), //$NON-NLS-1$
        null ) );
    }

    /**
     * This adds a property descriptor for the Ssl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSslPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_JMXSettings_ssl_feature" ), //$NON-NLS-1$
        getString ( "_UI_PropertyDescriptor_description", "_UI_JMXSettings_ssl_feature", "_UI_JMXSettings_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        InfrastructurePackage.Literals.JMX_SETTINGS__SSL, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_OraclePropertyCategory" ), //$NON-NLS-1$
        null ) );
    }

    /**
     * This adds a property descriptor for the Assign Node Hostname feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssignNodeHostnamePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_JMXSettings_assignNodeHostname_feature" ), //$NON-NLS-1$
        getString ( "_UI_JMXSettings_assignNodeHostname_description" ), //$NON-NLS-1$
        InfrastructurePackage.Literals.JMX_SETTINGS__ASSIGN_NODE_HOSTNAME, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString ( "_UI_CommonPropertyCategory" ), //$NON-NLS-1$
        null ) );
    }

    /**
     * This returns JMXSettings.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage ( Object object )
    {
        return overlayImage ( object, getResourceLocator ().getImage ( "full/obj16/JMXSettings" ) ); //$NON-NLS-1$
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean shouldComposeCreationImage ()
    {
        return true;
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText ( Object object )
    {
        JMXSettings jmxSettings = (JMXSettings)object;
        return getString ( "_UI_JMXSettings_type" ) + " " + jmxSettings.isAssignNodeHostname (); //$NON-NLS-1$ //$NON-NLS-2$
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged ( Notification notification )
    {
        updateChildren ( notification );

        switch ( notification.getFeatureID ( JMXSettings.class ) )
        {
            case InfrastructurePackage.JMX_SETTINGS__PORT:
            case InfrastructurePackage.JMX_SETTINGS__INSTANCE_PORT_OFFSET:
            case InfrastructurePackage.JMX_SETTINGS__LOCAL_ONLY:
            case InfrastructurePackage.JMX_SETTINGS__AUTHENTICATED:
            case InfrastructurePackage.JMX_SETTINGS__SSL:
            case InfrastructurePackage.JMX_SETTINGS__ASSIGN_NODE_HOSTNAME:
                fireNotifyChanged ( new ViewerNotification ( notification, notification.getNotifier (), false, true ) );
                return;
        }
        super.notifyChanged ( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors ( Collection<Object> newChildDescriptors, Object object )
    {
        super.collectNewChildDescriptors ( newChildDescriptors, object );
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator ()
    {
        return ( (IChildCreationExtender)adapterFactory ).getResourceLocator ();
    }

}
