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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the amount of time in days that a given <code>AppInstance</code> retains
 * data.
 * </p>
 */
public class PutAppInstanceRetentionSettingsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String appInstanceArn;

    /**
     * <p>
     * The time in days to retain data. Data type: number.
     * </p>
     */
    private AppInstanceRetentionSettings appInstanceRetentionSettings;

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the <code>AppInstance</code>.
     *         </p>
     */
    public String getAppInstanceArn() {
        return appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param appInstanceArn <p>
     *            The ARN of the <code>AppInstance</code>.
     *            </p>
     */
    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param appInstanceArn <p>
     *            The ARN of the <code>AppInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAppInstanceRetentionSettingsRequest withAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
        return this;
    }

    /**
     * <p>
     * The time in days to retain data. Data type: number.
     * </p>
     *
     * @return <p>
     *         The time in days to retain data. Data type: number.
     *         </p>
     */
    public AppInstanceRetentionSettings getAppInstanceRetentionSettings() {
        return appInstanceRetentionSettings;
    }

    /**
     * <p>
     * The time in days to retain data. Data type: number.
     * </p>
     *
     * @param appInstanceRetentionSettings <p>
     *            The time in days to retain data. Data type: number.
     *            </p>
     */
    public void setAppInstanceRetentionSettings(
            AppInstanceRetentionSettings appInstanceRetentionSettings) {
        this.appInstanceRetentionSettings = appInstanceRetentionSettings;
    }

    /**
     * <p>
     * The time in days to retain data. Data type: number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appInstanceRetentionSettings <p>
     *            The time in days to retain data. Data type: number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAppInstanceRetentionSettingsRequest withAppInstanceRetentionSettings(
            AppInstanceRetentionSettings appInstanceRetentionSettings) {
        this.appInstanceRetentionSettings = appInstanceRetentionSettings;
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
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: " + getAppInstanceArn() + ",");
        if (getAppInstanceRetentionSettings() != null)
            sb.append("AppInstanceRetentionSettings: " + getAppInstanceRetentionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getAppInstanceRetentionSettings() == null) ? 0
                        : getAppInstanceRetentionSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAppInstanceRetentionSettingsRequest == false)
            return false;
        PutAppInstanceRetentionSettingsRequest other = (PutAppInstanceRetentionSettingsRequest) obj;

        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null
                && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        if (other.getAppInstanceRetentionSettings() == null
                ^ this.getAppInstanceRetentionSettings() == null)
            return false;
        if (other.getAppInstanceRetentionSettings() != null
                && other.getAppInstanceRetentionSettings().equals(
                        this.getAppInstanceRetentionSettings()) == false)
            return false;
        return true;
    }
}
