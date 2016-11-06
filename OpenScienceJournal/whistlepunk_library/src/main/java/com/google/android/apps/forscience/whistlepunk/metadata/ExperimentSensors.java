/*
 *  Copyright 2016 Google Inc. All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.google.android.apps.forscience.whistlepunk.metadata;

import com.google.android.apps.forscience.whistlepunk.devicemanager.ConnectableSensor;

import java.util.List;
import java.util.Set;

/**
 * The sensors that should be available in an experiment are defined as:
 *
 * - The built in sensors
 * - plus (set union) getIncludedSensors
 * - minus (set difference) getExcludedSensorIds
 *
 * For simplicity of database migration, there may be built-in sensors included in
 * getIncludedSensors, and non-built-in sensors included in getExcludedSensors.
 */
public class ExperimentSensors {
    private List<ConnectableSensor> mIncluded;
    private Set<String> mExcluded;

    public ExperimentSensors(List<ConnectableSensor> includedSensors,
            Set<String> excludedSensorIds) {
        mIncluded = includedSensors;
        mExcluded = excludedSensorIds;
    }

    public List<ConnectableSensor> getIncludedSensors() {
        return mIncluded;
    }

    public Set<String> getExcludedSensorIds() {
        return mExcluded;
    }

    @Override
    public String toString() {
        return "ExperimentSensors{" +
                "mIncluded=" + mIncluded +
                ", mExcluded=" + mExcluded +
                '}';
    }
}
