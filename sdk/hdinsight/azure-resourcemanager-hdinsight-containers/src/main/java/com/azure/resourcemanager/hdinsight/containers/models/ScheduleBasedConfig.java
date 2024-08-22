// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Profile of schedule based Autoscale.
 */
@Fluent
public final class ScheduleBasedConfig implements JsonSerializable<ScheduleBasedConfig> {
    /*
     * User has to specify the timezone on which the schedule has to be set for schedule based autoscale configuration.
     */
    private String timeZone;

    /*
     * Setting default node count of current schedule configuration. Default node count specifies the number of nodes
     * which are default when an specified scaling operation is executed (scale up/scale down)
     */
    private int defaultCount;

    /*
     * This specifies the schedules where scheduled based Autoscale to be enabled, the user has a choice to set multiple
     * rules within the schedule across days and times (start/end).
     */
    private List<Schedule> schedules;

    /**
     * Creates an instance of ScheduleBasedConfig class.
     */
    public ScheduleBasedConfig() {
    }

    /**
     * Get the timeZone property: User has to specify the timezone on which the schedule has to be set for schedule
     * based autoscale configuration.
     * 
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: User has to specify the timezone on which the schedule has to be set for schedule
     * based autoscale configuration.
     * 
     * @param timeZone the timeZone value to set.
     * @return the ScheduleBasedConfig object itself.
     */
    public ScheduleBasedConfig withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the defaultCount property: Setting default node count of current schedule configuration. Default node count
     * specifies the number of nodes which are default when an specified scaling operation is executed (scale up/scale
     * down).
     * 
     * @return the defaultCount value.
     */
    public int defaultCount() {
        return this.defaultCount;
    }

    /**
     * Set the defaultCount property: Setting default node count of current schedule configuration. Default node count
     * specifies the number of nodes which are default when an specified scaling operation is executed (scale up/scale
     * down).
     * 
     * @param defaultCount the defaultCount value to set.
     * @return the ScheduleBasedConfig object itself.
     */
    public ScheduleBasedConfig withDefaultCount(int defaultCount) {
        this.defaultCount = defaultCount;
        return this;
    }

    /**
     * Get the schedules property: This specifies the schedules where scheduled based Autoscale to be enabled, the user
     * has a choice to set multiple rules within the schedule across days and times (start/end).
     * 
     * @return the schedules value.
     */
    public List<Schedule> schedules() {
        return this.schedules;
    }

    /**
     * Set the schedules property: This specifies the schedules where scheduled based Autoscale to be enabled, the user
     * has a choice to set multiple rules within the schedule across days and times (start/end).
     * 
     * @param schedules the schedules value to set.
     * @return the ScheduleBasedConfig object itself.
     */
    public ScheduleBasedConfig withSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (timeZone() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property timeZone in model ScheduleBasedConfig"));
        }
        if (schedules() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property schedules in model ScheduleBasedConfig"));
        } else {
            schedules().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ScheduleBasedConfig.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("timeZone", this.timeZone);
        jsonWriter.writeIntField("defaultCount", this.defaultCount);
        jsonWriter.writeArrayField("schedules", this.schedules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScheduleBasedConfig from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScheduleBasedConfig if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ScheduleBasedConfig.
     */
    public static ScheduleBasedConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScheduleBasedConfig deserializedScheduleBasedConfig = new ScheduleBasedConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("timeZone".equals(fieldName)) {
                    deserializedScheduleBasedConfig.timeZone = reader.getString();
                } else if ("defaultCount".equals(fieldName)) {
                    deserializedScheduleBasedConfig.defaultCount = reader.getInt();
                } else if ("schedules".equals(fieldName)) {
                    List<Schedule> schedules = reader.readArray(reader1 -> Schedule.fromJson(reader1));
                    deserializedScheduleBasedConfig.schedules = schedules;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScheduleBasedConfig;
        });
    }
}
