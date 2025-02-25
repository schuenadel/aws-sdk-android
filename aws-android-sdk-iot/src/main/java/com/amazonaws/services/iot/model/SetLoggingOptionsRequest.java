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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the logging options.
 * </p>
 * <p>
 * NOTE: use of this command is not recommended. Use
 * <code>SetV2LoggingOptions</code> instead.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >SetLoggingOptions</a> action.
 * </p>
 */
public class SetLoggingOptionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The logging options payload.
     * </p>
     */
    private LoggingOptionsPayload loggingOptionsPayload;

    /**
     * <p>
     * The logging options payload.
     * </p>
     *
     * @return <p>
     *         The logging options payload.
     *         </p>
     */
    public LoggingOptionsPayload getLoggingOptionsPayload() {
        return loggingOptionsPayload;
    }

    /**
     * <p>
     * The logging options payload.
     * </p>
     *
     * @param loggingOptionsPayload <p>
     *            The logging options payload.
     *            </p>
     */
    public void setLoggingOptionsPayload(LoggingOptionsPayload loggingOptionsPayload) {
        this.loggingOptionsPayload = loggingOptionsPayload;
    }

    /**
     * <p>
     * The logging options payload.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loggingOptionsPayload <p>
     *            The logging options payload.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetLoggingOptionsRequest withLoggingOptionsPayload(
            LoggingOptionsPayload loggingOptionsPayload) {
        this.loggingOptionsPayload = loggingOptionsPayload;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLoggingOptionsPayload() != null)
            sb.append("loggingOptionsPayload: " + getLoggingOptionsPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLoggingOptionsPayload() == null) ? 0 : getLoggingOptionsPayload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetLoggingOptionsRequest == false)
            return false;
        SetLoggingOptionsRequest other = (SetLoggingOptionsRequest) obj;

        if (other.getLoggingOptionsPayload() == null ^ this.getLoggingOptionsPayload() == null)
            return false;
        if (other.getLoggingOptionsPayload() != null
                && other.getLoggingOptionsPayload().equals(this.getLoggingOptionsPayload()) == false)
            return false;
        return true;
    }
}
