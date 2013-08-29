/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL
 * license a copy of which has been included with this distribution in
 * the LICENSE.txt file.
 */

package com.mirth.connect.server.userutil;

import org.apache.commons.lang3.text.WordUtils;

/**
 * States of STARTING, STARTED, PAUSING, PAUSED, STOPPING, STOPPED
 */
public enum DeployedState {
    STARTING, STARTED, PAUSING, PAUSED, STOPPING, STOPPED;

    private DeployedState() {}

    @Override
    public String toString() {
        return WordUtils.capitalizeFully(super.toString());
    }
}