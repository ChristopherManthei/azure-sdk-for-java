// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MediaStreamingContentType. */
public final class MediaStreamingContentType extends ExpandableStringEnum<MediaStreamingContentType> {
    /** Static value audio for MediaStreamingContentType. */
    public static final MediaStreamingContentType AUDIO = fromString("audio");

    /**
     * Creates or finds a MediaStreamingContentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MediaStreamingContentType.
     */
    @JsonCreator
    public static MediaStreamingContentType fromString(String name) {
        return fromString(name, MediaStreamingContentType.class);
    }

    /** @return known MediaStreamingContentType values. */
    public static Collection<MediaStreamingContentType> values() {
        return values(MediaStreamingContentType.class);
    }
}
