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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ViolationEvent
 */
class ViolationEventJsonUnmarshaller implements
        Unmarshaller<ViolationEvent, JsonUnmarshallerContext> {

    public ViolationEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ViolationEvent violationEvent = new ViolationEvent();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("violationId")) {
                violationEvent.setViolationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingName")) {
                violationEvent.setThingName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("securityProfileName")) {
                violationEvent.setSecurityProfileName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("behavior")) {
                violationEvent.setBehavior(BehaviorJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("metricValue")) {
                violationEvent.setMetricValue(MetricValueJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("violationEventAdditionalInfo")) {
                violationEvent
                        .setViolationEventAdditionalInfo(ViolationEventAdditionalInfoJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("violationEventType")) {
                violationEvent.setViolationEventType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("verificationState")) {
                violationEvent.setVerificationState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("verificationStateDescription")) {
                violationEvent.setVerificationStateDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("violationEventTime")) {
                violationEvent.setViolationEventTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return violationEvent;
    }

    private static ViolationEventJsonUnmarshaller instance;

    public static ViolationEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ViolationEventJsonUnmarshaller();
        return instance;
    }
}
