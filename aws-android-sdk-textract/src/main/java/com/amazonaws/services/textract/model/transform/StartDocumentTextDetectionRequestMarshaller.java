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
 * JSON request marshaller for StartDocumentTextDetectionRequest
 */
public class StartDocumentTextDetectionRequestMarshaller implements
        Marshaller<Request<StartDocumentTextDetectionRequest>, StartDocumentTextDetectionRequest> {

    public Request<StartDocumentTextDetectionRequest> marshall(
            StartDocumentTextDetectionRequest startDocumentTextDetectionRequest) {
        if (startDocumentTextDetectionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartDocumentTextDetectionRequest)");
        }

        Request<StartDocumentTextDetectionRequest> request = new DefaultRequest<StartDocumentTextDetectionRequest>(
                startDocumentTextDetectionRequest, "AmazonTextract");
        String target = "Textract.StartDocumentTextDetection";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startDocumentTextDetectionRequest.getDocumentLocation() != null) {
                DocumentLocation documentLocation = startDocumentTextDetectionRequest
                        .getDocumentLocation();
                jsonWriter.name("DocumentLocation");
                DocumentLocationJsonMarshaller.getInstance().marshall(documentLocation, jsonWriter);
            }
            if (startDocumentTextDetectionRequest.getClientRequestToken() != null) {
                String clientRequestToken = startDocumentTextDetectionRequest
                        .getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (startDocumentTextDetectionRequest.getJobTag() != null) {
                String jobTag = startDocumentTextDetectionRequest.getJobTag();
                jsonWriter.name("JobTag");
                jsonWriter.value(jobTag);
            }
            if (startDocumentTextDetectionRequest.getNotificationChannel() != null) {
                NotificationChannel notificationChannel = startDocumentTextDetectionRequest
                        .getNotificationChannel();
                jsonWriter.name("NotificationChannel");
                NotificationChannelJsonMarshaller.getInstance().marshall(notificationChannel,
                        jsonWriter);
            }
            if (startDocumentTextDetectionRequest.getOutputConfig() != null) {
                OutputConfig outputConfig = startDocumentTextDetectionRequest.getOutputConfig();
                jsonWriter.name("OutputConfig");
                OutputConfigJsonMarshaller.getInstance().marshall(outputConfig, jsonWriter);
            }
            if (startDocumentTextDetectionRequest.getKMSKeyId() != null) {
                String kMSKeyId = startDocumentTextDetectionRequest.getKMSKeyId();
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
