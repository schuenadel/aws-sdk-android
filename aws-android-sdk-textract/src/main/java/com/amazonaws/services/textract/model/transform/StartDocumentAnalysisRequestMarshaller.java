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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.textract.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartDocumentAnalysisRequest
 */
public class StartDocumentAnalysisRequestMarshaller implements
        Marshaller<Request<StartDocumentAnalysisRequest>, StartDocumentAnalysisRequest> {

    public Request<StartDocumentAnalysisRequest> marshall(
            StartDocumentAnalysisRequest startDocumentAnalysisRequest) {
        if (startDocumentAnalysisRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartDocumentAnalysisRequest)");
        }

        Request<StartDocumentAnalysisRequest> request = new DefaultRequest<StartDocumentAnalysisRequest>(
                startDocumentAnalysisRequest, "AmazonTextract");
        String target = "Textract.StartDocumentAnalysis";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startDocumentAnalysisRequest.getDocumentLocation() != null) {
                DocumentLocation documentLocation = startDocumentAnalysisRequest
                        .getDocumentLocation();
                jsonWriter.name("DocumentLocation");
                DocumentLocationJsonMarshaller.getInstance().marshall(documentLocation, jsonWriter);
            }
            if (startDocumentAnalysisRequest.getFeatureTypes() != null) {
                java.util.List<String> featureTypes = startDocumentAnalysisRequest
                        .getFeatureTypes();
                jsonWriter.name("FeatureTypes");
                jsonWriter.beginArray();
                for (String featureTypesItem : featureTypes) {
                    if (featureTypesItem != null) {
                        jsonWriter.value(featureTypesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (startDocumentAnalysisRequest.getClientRequestToken() != null) {
                String clientRequestToken = startDocumentAnalysisRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (startDocumentAnalysisRequest.getJobTag() != null) {
                String jobTag = startDocumentAnalysisRequest.getJobTag();
                jsonWriter.name("JobTag");
                jsonWriter.value(jobTag);
            }
            if (startDocumentAnalysisRequest.getNotificationChannel() != null) {
                NotificationChannel notificationChannel = startDocumentAnalysisRequest
                        .getNotificationChannel();
                jsonWriter.name("NotificationChannel");
                NotificationChannelJsonMarshaller.getInstance().marshall(notificationChannel,
                        jsonWriter);
            }
            if (startDocumentAnalysisRequest.getOutputConfig() != null) {
                OutputConfig outputConfig = startDocumentAnalysisRequest.getOutputConfig();
                jsonWriter.name("OutputConfig");
                OutputConfigJsonMarshaller.getInstance().marshall(outputConfig, jsonWriter);
            }
            if (startDocumentAnalysisRequest.getKMSKeyId() != null) {
                String kMSKeyId = startDocumentAnalysisRequest.getKMSKeyId();
                jsonWriter.name("KMSKeyId");
                jsonWriter.value(kMSKeyId);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
