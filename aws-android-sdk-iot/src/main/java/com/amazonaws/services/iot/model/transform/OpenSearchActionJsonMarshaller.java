/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OpenSearchAction
 */
class OpenSearchActionJsonMarshaller {

    public void marshall(OpenSearchAction openSearchAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (openSearchAction.getRoleArn() != null) {
            String roleArn = openSearchAction.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (openSearchAction.getEndpoint() != null) {
            String endpoint = openSearchAction.getEndpoint();
            jsonWriter.name("endpoint");
            jsonWriter.value(endpoint);
        }
        if (openSearchAction.getIndex() != null) {
            String index = openSearchAction.getIndex();
            jsonWriter.name("index");
            jsonWriter.value(index);
        }
        if (openSearchAction.getType() != null) {
            String type = openSearchAction.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (openSearchAction.getId() != null) {
            String id = openSearchAction.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        jsonWriter.endObject();
    }

    private static OpenSearchActionJsonMarshaller instance;

    public static OpenSearchActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OpenSearchActionJsonMarshaller();
        return instance;
    }
}
