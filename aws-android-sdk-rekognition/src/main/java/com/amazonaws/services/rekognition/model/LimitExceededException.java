/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * An Amazon Rekognition service limit was exceeded. For example, if you start
 * too many Amazon Rekognition Video jobs concurrently, calls to start
 * operations (<code>StartLabelDetection</code>, for example) will raise a
 * <code>LimitExceededException</code> exception (HTTP status code: 400) until
 * the number of concurrently running jobs is below the Amazon Rekognition
 * service limit.
 * </p>
 */
public class LimitExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new LimitExceededException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public LimitExceededException(String message) {
        super(message);
    }
}
