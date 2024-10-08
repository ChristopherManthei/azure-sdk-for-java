// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureMLBatchExecutionActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.AzureMLWebServiceFile;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureMLBatchExecutionActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMLBatchExecutionActivityTypeProperties model = BinaryData.fromString(
            "{\"globalParameters\":{\"xoohyesmlscvhra\":\"databdqmjcedfpub\",\"dxhkdy\":\"dataybbor\"},\"webServiceOutputs\":{\"ekkxlibs\":{\"filePath\":\"dataufqzuduqfdeigx\",\"linkedServiceName\":{\"referenceName\":\"plpgftz\",\"parameters\":{\"b\":\"dataf\"}}},\"erzthcfnrle\":{\"filePath\":\"datacvceglvz\",\"linkedServiceName\":{\"referenceName\":\"ujvv\",\"parameters\":{\"vxnumvorosqessp\":\"datadpclazaoytkub\",\"rqspwsiitzbyu\":\"datautk\",\"ovpsflmwduis\":\"datalumqmo\",\"e\":\"datavlunyqe\"}}},\"ydllhim\":{\"filePath\":\"dataghhcf\",\"linkedServiceName\":{\"referenceName\":\"zmjmfl\",\"parameters\":{\"vauxkgklqu\":\"datalkmtrrcbu\",\"zvarqi\":\"dataxewcdprqjsmhk\"}}}},\"webServiceInputs\":{\"imbqdsuaa\":{\"filePath\":\"dataxhxz\",\"linkedServiceName\":{\"referenceName\":\"bxhmd\",\"parameters\":{\"so\":\"databuapr\",\"cy\":\"dataqicrtibad\",\"w\":\"dataxbjaktg\",\"wcdbtopu\":\"datazpshghorgjidragq\"}}},\"m\":{\"filePath\":\"datakou\",\"linkedServiceName\":{\"referenceName\":\"vgcwsimhjbx\",\"parameters\":{\"z\":\"datagaofwo\",\"bnx\":\"dataxp\"}}},\"oggzppufu\":{\"filePath\":\"datays\",\"linkedServiceName\":{\"referenceName\":\"shbuxjhqu\",\"parameters\":{\"teuegrd\":\"datahcghnclfahryu\",\"miwoisqlsxzfycnp\":\"datatcptpqoajgg\",\"xwcptoihoyv\":\"datavnjzaa\",\"anlgczvfbzzsce\":\"dataaxfjuzgslqpzdxw\"}}}}}")
            .toObject(AzureMLBatchExecutionActivityTypeProperties.class);
        Assertions.assertEquals("plpgftz",
            model.webServiceOutputs().get("ekkxlibs").linkedServiceName().referenceName());
        Assertions.assertEquals("bxhmd", model.webServiceInputs().get("imbqdsuaa").linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMLBatchExecutionActivityTypeProperties model
            = new AzureMLBatchExecutionActivityTypeProperties()
                .withGlobalParameters(mapOf("xoohyesmlscvhra", "databdqmjcedfpub", "dxhkdy", "dataybbor"))
                .withWebServiceOutputs(mapOf("ekkxlibs",
                    new AzureMLWebServiceFile().withFilePath("dataufqzuduqfdeigx")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("plpgftz")
                            .withParameters(mapOf("b", "dataf"))),
                    "erzthcfnrle",
                    new AzureMLWebServiceFile().withFilePath("datacvceglvz")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ujvv")
                            .withParameters(mapOf("vxnumvorosqessp", "datadpclazaoytkub", "rqspwsiitzbyu", "datautk",
                                "ovpsflmwduis", "datalumqmo", "e", "datavlunyqe"))),
                    "ydllhim",
                    new AzureMLWebServiceFile().withFilePath("dataghhcf")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("zmjmfl")
                            .withParameters(mapOf("vauxkgklqu", "datalkmtrrcbu", "zvarqi", "dataxewcdprqjsmhk")))))
                .withWebServiceInputs(mapOf("imbqdsuaa",
                    new AzureMLWebServiceFile().withFilePath("dataxhxz")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("bxhmd")
                            .withParameters(mapOf("so", "databuapr", "cy", "dataqicrtibad", "w", "dataxbjaktg",
                                "wcdbtopu", "datazpshghorgjidragq"))),
                    "m",
                    new AzureMLWebServiceFile().withFilePath("datakou")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("vgcwsimhjbx")
                            .withParameters(mapOf("z", "datagaofwo", "bnx", "dataxp"))),
                    "oggzppufu",
                    new AzureMLWebServiceFile().withFilePath("datays")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("shbuxjhqu")
                            .withParameters(mapOf("teuegrd", "datahcghnclfahryu", "miwoisqlsxzfycnp", "datatcptpqoajgg",
                                "xwcptoihoyv", "datavnjzaa", "anlgczvfbzzsce", "dataaxfjuzgslqpzdxw")))));
        model = BinaryData.fromObject(model).toObject(AzureMLBatchExecutionActivityTypeProperties.class);
        Assertions.assertEquals("plpgftz",
            model.webServiceOutputs().get("ekkxlibs").linkedServiceName().referenceName());
        Assertions.assertEquals("bxhmd", model.webServiceInputs().get("imbqdsuaa").linkedServiceName().referenceName());
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
