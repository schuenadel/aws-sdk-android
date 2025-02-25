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

package com.amazonaws.services.chimesdkmessaging.model.transform;

import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BatchCreateChannelMembershipError
 */
class BatchCreateChannelMembershipErrorJsonMarshaller {

    public void marshall(BatchCreateChannelMembershipError batchCreateChannelMembershipError,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (batchCreateChannelMembershipError.getMemberArn() != null) {
            String memberArn = batchCreateChannelMembershipError.getMemberArn();
            jsonWriter.name("MemberArn");
            jsonWriter.value(memberArn);
        }
        if (batchCreateChannelMembershipError.getErrorCode() != null) {
            String errorCode = batchCreateChannelMembershipError.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (batchCreateChannelMembershipError.getErrorMessage() != null) {
            String errorMessage = batchCreateChannelMembershipError.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static BatchCreateChannelMembershipErrorJsonMarshaller instance;

    public static BatchCreateChannelMembershipErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchCreateChannelMembershipErrorJsonMarshaller();
        return instance;
    }
}
