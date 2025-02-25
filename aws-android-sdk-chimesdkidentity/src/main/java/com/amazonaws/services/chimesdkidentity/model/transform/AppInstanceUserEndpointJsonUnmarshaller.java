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

package com.amazonaws.services.chimesdkidentity.model.transform;

import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AppInstanceUserEndpoint
 */
class AppInstanceUserEndpointJsonUnmarshaller implements
        Unmarshaller<AppInstanceUserEndpoint, JsonUnmarshallerContext> {

    public AppInstanceUserEndpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AppInstanceUserEndpoint appInstanceUserEndpoint = new AppInstanceUserEndpoint();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AppInstanceUserArn")) {
                appInstanceUserEndpoint.setAppInstanceUserArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointId")) {
                appInstanceUserEndpoint.setEndpointId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                appInstanceUserEndpoint.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                appInstanceUserEndpoint.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceArn")) {
                appInstanceUserEndpoint.setResourceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointAttributes")) {
                appInstanceUserEndpoint.setEndpointAttributes(EndpointAttributesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTimestamp")) {
                appInstanceUserEndpoint.setCreatedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedTimestamp")) {
                appInstanceUserEndpoint.setLastUpdatedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowMessages")) {
                appInstanceUserEndpoint.setAllowMessages(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointState")) {
                appInstanceUserEndpoint.setEndpointState(EndpointStateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return appInstanceUserEndpoint;
    }

    private static AppInstanceUserEndpointJsonUnmarshaller instance;

    public static AppInstanceUserEndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppInstanceUserEndpointJsonUnmarshaller();
        return instance;
    }
}
