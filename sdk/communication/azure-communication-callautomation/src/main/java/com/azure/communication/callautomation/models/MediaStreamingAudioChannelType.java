// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MediaStreamingAudioChannelType. */
public final class MediaStreamingAudioChannelType extends ExpandableStringEnum<MediaStreamingAudioChannelType> {
    /** Static value mixed for MediaStreamingAudioChannelType. */
    public static final MediaStreamingAudioChannelType MIXED = fromString("mixed");

    /** Static value unmixed for MediaStreamingAudioChannelType. */
    public static final MediaStreamingAudioChannelType UNMIXED = fromString("unmixed");

    /**
     * Creates or finds a MediaStreamingAudioChannelType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MediaStreamingAudioChannelType.
     */
    @JsonCreator
    public static MediaStreamingAudioChannelType fromString(String name) {
        return fromString(name, MediaStreamingAudioChannelType.class);
    }

    /** @return known MediaStreamingAudioChannelType values. */
    public static Collection<MediaStreamingAudioChannelType> values() {
        return values(MediaStreamingAudioChannelType.class);
    }
}
