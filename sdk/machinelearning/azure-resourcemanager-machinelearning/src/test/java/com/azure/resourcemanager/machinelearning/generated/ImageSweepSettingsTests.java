// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.EarlyTerminationPolicy;
import com.azure.resourcemanager.machinelearning.models.ImageSweepSettings;
import com.azure.resourcemanager.machinelearning.models.SamplingAlgorithmType;
import org.junit.jupiter.api.Assertions;

public final class ImageSweepSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageSweepSettings model = BinaryData.fromString(
            "{\"samplingAlgorithm\":\"Grid\",\"earlyTermination\":{\"policyType\":\"EarlyTerminationPolicy\",\"evaluationInterval\":1821428619,\"delayEvaluation\":232113908}}")
            .toObject(ImageSweepSettings.class);
        Assertions.assertEquals(SamplingAlgorithmType.GRID, model.samplingAlgorithm());
        Assertions.assertEquals(1821428619, model.earlyTermination().evaluationInterval());
        Assertions.assertEquals(232113908, model.earlyTermination().delayEvaluation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageSweepSettings model = new ImageSweepSettings().withSamplingAlgorithm(SamplingAlgorithmType.GRID)
            .withEarlyTermination(
                new EarlyTerminationPolicy().withEvaluationInterval(1821428619).withDelayEvaluation(232113908));
        model = BinaryData.fromObject(model).toObject(ImageSweepSettings.class);
        Assertions.assertEquals(SamplingAlgorithmType.GRID, model.samplingAlgorithm());
        Assertions.assertEquals(1821428619, model.earlyTermination().evaluationInterval());
        Assertions.assertEquals(232113908, model.earlyTermination().delayEvaluation());
    }
}
