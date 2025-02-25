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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IdentityDocumentField
 */
class IdentityDocumentFieldJsonMarshaller {

    public void marshall(IdentityDocumentField identityDocumentField, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (identityDocumentField.getType() != null) {
            AnalyzeIDDetections type = identityDocumentField.getType();
            jsonWriter.name("Type");
            AnalyzeIDDetectionsJsonMarshaller.getInstance().marshall(type, jsonWriter);
        }
        if (identityDocumentField.getValueDetection() != null) {
            AnalyzeIDDetections valueDetection = identityDocumentField.getValueDetection();
            jsonWriter.name("ValueDetection");
            AnalyzeIDDetectionsJsonMarshaller.getInstance().marshall(valueDetection, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static IdentityDocumentFieldJsonMarshaller instance;

    public static IdentityDocumentFieldJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IdentityDocumentFieldJsonMarshaller();
        return instance;
    }
}
