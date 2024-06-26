// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import com.azure.resourcemanager.datafactory.models.ExcelDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ExcelDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExcelDataset model = BinaryData.fromString(
            "{\"type\":\"dscnns\",\"typeProperties\":{\"location\":{\"type\":\"rfihscj\",\"folderPath\":\"datakmhzbh\",\"fileName\":\"datahf\",\"\":{\"nuqqkotauratnicp\":\"datahbnnxemv\"}},\"sheetName\":\"datazsclefyrletn\",\"sheetIndex\":\"datalmfdg\",\"range\":\"databbuypwovvvsflee\",\"firstRowAsHeader\":\"dataoqayrehjuqwv\",\"compression\":{\"type\":\"dataxrlzhpziha\",\"level\":\"datanqqz\",\"\":{\"gmkfw\":\"dataqzubfonfd\",\"ewfhxwyrkbre\":\"datajcw\",\"ynjpchamkaepl\":\"datazl\",\"uywevtjrieikmwl\":\"dataajubo\"}},\"nullValue\":\"dataklfnisyxgucbmt\"},\"description\":\"cyyuvtzrxzhclec\",\"structure\":\"datatzqzcloy\",\"schema\":\"datau\",\"linkedServiceName\":{\"referenceName\":\"gi\",\"parameters\":{\"mwb\":\"datagyresgzsd\",\"lb\":\"dataorj\",\"xqjsiuepm\":\"datahychakvyrfbqvum\"}},\"parameters\":{\"t\":{\"type\":\"Object\",\"defaultValue\":\"datalpqmp\"},\"mrtuxyp\":{\"type\":\"String\",\"defaultValue\":\"datavulb\"}},\"annotations\":[\"datacaeo\",\"dataifq\",\"dataywjflobh\"],\"folder\":{\"name\":\"momfecorkfroc\"},\"\":{\"sylslurbqfygpnyh\":\"dataxldjmzezbj\"}}")
            .toObject(ExcelDataset.class);
        Assertions.assertEquals("cyyuvtzrxzhclec", model.description());
        Assertions.assertEquals("gi", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("t").type());
        Assertions.assertEquals("momfecorkfroc", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExcelDataset model = new ExcelDataset().withDescription("cyyuvtzrxzhclec")
            .withStructure("datatzqzcloy")
            .withSchema("datau")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("gi")
                .withParameters(mapOf("mwb", "datagyresgzsd", "lb", "dataorj", "xqjsiuepm", "datahychakvyrfbqvum")))
            .withParameters(mapOf("t",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datalpqmp"), "mrtuxyp",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datavulb")))
            .withAnnotations(Arrays.asList("datacaeo", "dataifq", "dataywjflobh"))
            .withFolder(new DatasetFolder().withName("momfecorkfroc"))
            .withLocation(new DatasetLocation().withFolderPath("datakmhzbh")
                .withFileName("datahf")
                .withAdditionalProperties(mapOf("type", "rfihscj")))
            .withSheetName("datazsclefyrletn")
            .withSheetIndex("datalmfdg")
            .withRange("databbuypwovvvsflee")
            .withFirstRowAsHeader("dataoqayrehjuqwv")
            .withCompression(new DatasetCompression().withType("dataxrlzhpziha")
                .withLevel("datanqqz")
                .withAdditionalProperties(mapOf()))
            .withNullValue("dataklfnisyxgucbmt");
        model = BinaryData.fromObject(model).toObject(ExcelDataset.class);
        Assertions.assertEquals("cyyuvtzrxzhclec", model.description());
        Assertions.assertEquals("gi", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("t").type());
        Assertions.assertEquals("momfecorkfroc", model.folder().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
