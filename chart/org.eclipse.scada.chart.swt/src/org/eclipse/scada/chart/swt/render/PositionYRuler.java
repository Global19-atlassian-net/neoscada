/*******************************************************************************
 * Copyright (c) 2011, 2012 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.chart.swt.render;

import org.eclipse.scada.chart.YAxis;

public class PositionYRuler extends AbstractPositionYRuler
{

    private Double position;

    public PositionYRuler ( final YAxis axis, final int style )
    {
        super ( axis, style );
    }

    public void setPosition ( final Double position )
    {
        this.position = position;
    }

    @Override
    public Double getPosition ()
    {
        return this.position;
    }

}
