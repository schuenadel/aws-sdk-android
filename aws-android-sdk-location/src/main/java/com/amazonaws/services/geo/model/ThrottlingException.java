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

package com.amazonaws.services.geo.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request was denied because of request throttling.
 * </p>
 */
public class ThrottlingException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ThrottlingException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public ThrottlingException(String message) {
        super(message);
    }
}
