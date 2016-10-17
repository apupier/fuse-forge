/**
 *  Copyright 2005-2016 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package org.jboss.fuse.forge.addon.ui;

public enum FuseProjectCategory {
    SPRING_BOOT("Spring Boot", "spring-boot"),
    KARAF("Karaf", "jboss-fuse");

    private final String name;
    private final String artifactIdPrefix;

    FuseProjectCategory(String name, String artifactIdPrefix) {
        this.name = name;
        this.artifactIdPrefix = artifactIdPrefix;
    }

    public String getName() {
        return this.name;
    }

    public String getArtifactIdPrefix() {
        return this.artifactIdPrefix;
    }
}
