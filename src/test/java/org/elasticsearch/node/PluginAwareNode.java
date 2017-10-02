/*
 * Copyright 2016 by floragunn UG (haftungsbeschränkt) - All rights reserved
 * 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed here is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * This software is free of charge for non-commercial and academic use. 
 * For commercial use in a production environment you have to obtain a license 
 * from https://floragunn.com
 * 
 */

package org.elasticsearch.node;

import java.util.Arrays;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.plugins.Plugin;

public class PluginAwareNode extends Node {

    @SafeVarargs
    public PluginAwareNode(final Settings preparedSettings, final Class<? extends Plugin>... plugins) {
        super(InternalSettingsPreparer.prepareEnvironment(preparedSettings, null), Arrays.asList(plugins));
    }
}