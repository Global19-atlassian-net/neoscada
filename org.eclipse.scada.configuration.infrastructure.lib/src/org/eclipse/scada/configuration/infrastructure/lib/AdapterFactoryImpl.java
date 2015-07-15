/*******************************************************************************
 * Copyright (c) 2014, 2015 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.infrastructure.lib;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.scada.configuration.infrastructure.EventInjectorHttp;
import org.eclipse.scada.configuration.infrastructure.EventInjectorSyslog;
import org.eclipse.scada.configuration.infrastructure.GenericVMSettings;
import org.eclipse.scada.configuration.infrastructure.HttpServiceModule;
import org.eclipse.scada.configuration.infrastructure.JMXSettings;
import org.eclipse.scada.configuration.infrastructure.OracleVMSettings;
import org.eclipse.scada.configuration.infrastructure.RestExporterModule;
import org.eclipse.scada.configuration.infrastructure.WebAdminConsole;
import org.eclipse.scada.configuration.infrastructure.lib.internal.EventInjectorHttpHandler;
import org.eclipse.scada.configuration.infrastructure.lib.internal.EventInjectorSyslogHandler;
import org.eclipse.scada.configuration.infrastructure.lib.internal.GenericVMSettingsModuleHandler;
import org.eclipse.scada.configuration.infrastructure.lib.internal.HttpServiceModuleHandler;
import org.eclipse.scada.configuration.infrastructure.lib.internal.JMXSettingsModuleHandler;
import org.eclipse.scada.configuration.infrastructure.lib.internal.OracleVMSettingsModuleHandler;
import org.eclipse.scada.configuration.infrastructure.lib.internal.RestExporterModuleHandler;
import org.eclipse.scada.configuration.infrastructure.lib.internal.WebAdminConsoleHandler;

public class AdapterFactoryImpl implements IAdapterFactory
{

    @SuppressWarnings ( "unchecked" )
    @Override
    public <T> T getAdapter ( final Object adaptableObject, final Class<T> adapterType )
    {
        if ( !ModuleHandler.class.equals ( adapterType ) )
        {
            return null;
        }

        if ( adaptableObject instanceof HttpServiceModule )
        {
            return (T)new HttpServiceModuleHandler ();
        }
        else if ( adaptableObject instanceof RestExporterModule )
        {
            return (T)new RestExporterModuleHandler ();
        }
        else if ( adaptableObject instanceof WebAdminConsole )
        {
            return (T)new WebAdminConsoleHandler ();
        }
        else if ( adaptableObject instanceof EventInjectorHttp )
        {
            return (T)new EventInjectorHttpHandler ();
        }
        else if ( adaptableObject instanceof EventInjectorSyslog )
        {
            return (T)new EventInjectorSyslogHandler ();
        }
        else if ( adaptableObject instanceof OracleVMSettings )
        {
            return (T)new OracleVMSettingsModuleHandler ();
        }
        else if ( adaptableObject instanceof GenericVMSettings )
        {
            return (T)new GenericVMSettingsModuleHandler ();
        }
        else if ( adaptableObject instanceof JMXSettings )
        {
            return (T)new JMXSettingsModuleHandler ();
        }
        return null;
    }

    @Override
    public Class<?>[] getAdapterList ()
    {
        return new Class<?>[] { ModuleHandler.class };
    }

}
