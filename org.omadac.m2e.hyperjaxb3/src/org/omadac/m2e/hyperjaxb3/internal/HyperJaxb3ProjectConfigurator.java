/*******************************************************************************
 * Copyright (c) 2011 Martin Goldhahn
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.omadac.m2e.hyperjaxb3.internal;

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.m2e.core.lifecyclemapping.model.IPluginExecutionMetadata;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.configurator.AbstractBuildParticipant;
import org.eclipse.m2e.jdt.AbstractJavaProjectConfigurator;

public class HyperJaxb3ProjectConfigurator extends AbstractJavaProjectConfigurator {
    
    @Override
    public AbstractBuildParticipant getBuildParticipant(IMavenProjectFacade projectFacade,
            MojoExecution execution, IPluginExecutionMetadata executionMetadata) {
        return new HyperJaxb3BuildParticipant(execution);
    }

    @Override
    protected String getOutputFolderParameterName() {
        return "generateDirectory";
    }
}
