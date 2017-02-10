/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.xquery.springboot;

import java.util.Map;
import net.sf.saxon.Configuration;
import net.sf.saxon.lib.ModuleURIResolver;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * Transforms the message using a XQuery template using Saxon.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.xquery")
public class XQueryComponentConfiguration {

    /**
     * To use the custom ModuleURIResolver
     */
    @NestedConfigurationProperty
    private ModuleURIResolver moduleURIResolver;
    /**
     * To use a custom Saxon configuration
     */
    @NestedConfigurationProperty
    private Configuration configuration;
    /**
     * To set custom Saxon configuration properties
     */
    private Map<String, Object> configurationProperties;

    public ModuleURIResolver getModuleURIResolver() {
        return moduleURIResolver;
    }

    public void setModuleURIResolver(ModuleURIResolver moduleURIResolver) {
        this.moduleURIResolver = moduleURIResolver;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public Map<String, Object> getConfigurationProperties() {
        return configurationProperties;
    }

    public void setConfigurationProperties(
            Map<String, Object> configurationProperties) {
        this.configurationProperties = configurationProperties;
    }
}