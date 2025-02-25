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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

public class PublishBatchResult implements Serializable {
    /**
     * <p>
     * A list of successful <code>PublishBatch</code> responses.
     * </p>
     */
    private java.util.List<PublishBatchResultEntry> successful = new java.util.ArrayList<PublishBatchResultEntry>();

    /**
     * <p>
     * A list of failed <code>PublishBatch</code> responses.
     * </p>
     */
    private java.util.List<BatchResultErrorEntry> failed = new java.util.ArrayList<BatchResultErrorEntry>();

    /**
     * <p>
     * A list of successful <code>PublishBatch</code> responses.
     * </p>
     *
     * @return <p>
     *         A list of successful <code>PublishBatch</code> responses.
     *         </p>
     */
    public java.util.List<PublishBatchResultEntry> getSuccessful() {
        return successful;
    }

    /**
     * <p>
     * A list of successful <code>PublishBatch</code> responses.
     * </p>
     *
     * @param successful <p>
     *            A list of successful <code>PublishBatch</code> responses.
     *            </p>
     */
    public void setSuccessful(java.util.Collection<PublishBatchResultEntry> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new java.util.ArrayList<PublishBatchResultEntry>(successful);
    }

    /**
     * <p>
     * A list of successful <code>PublishBatch</code> responses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successful <p>
     *            A list of successful <code>PublishBatch</code> responses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishBatchResult withSuccessful(PublishBatchResultEntry... successful) {
        if (getSuccessful() == null) {
            this.successful = new java.util.ArrayList<PublishBatchResultEntry>(successful.length);
        }
        for (PublishBatchResultEntry value : successful) {
            this.successful.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of successful <code>PublishBatch</code> responses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successful <p>
     *            A list of successful <code>PublishBatch</code> responses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishBatchResult withSuccessful(
            java.util.Collection<PublishBatchResultEntry> successful) {
        setSuccessful(successful);
        return this;
    }

    /**
     * <p>
     * A list of failed <code>PublishBatch</code> responses.
     * </p>
     *
     * @return <p>
     *         A list of failed <code>PublishBatch</code> responses.
     *         </p>
     */
    public java.util.List<BatchResultErrorEntry> getFailed() {
        return failed;
    }

    /**
     * <p>
     * A list of failed <code>PublishBatch</code> responses.
     * </p>
     *
     * @param failed <p>
     *            A list of failed <code>PublishBatch</code> responses.
     *            </p>
     */
    public void setFailed(java.util.Collection<BatchResultErrorEntry> failed) {
        if (failed == null) {
            this.failed = null;
            return;
        }

        this.failed = new java.util.ArrayList<BatchResultErrorEntry>(failed);
    }

    /**
     * <p>
     * A list of failed <code>PublishBatch</code> responses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failed <p>
     *            A list of failed <code>PublishBatch</code> responses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishBatchResult withFailed(BatchResultErrorEntry... failed) {
        if (getFailed() == null) {
            this.failed = new java.util.ArrayList<BatchResultErrorEntry>(failed.length);
        }
        for (BatchResultErrorEntry value : failed) {
            this.failed.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of failed <code>PublishBatch</code> responses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failed <p>
     *            A list of failed <code>PublishBatch</code> responses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishBatchResult withFailed(java.util.Collection<BatchResultErrorEntry> failed) {
        setFailed(failed);
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
        if (getSuccessful() != null)
            sb.append("Successful: " + getSuccessful() + ",");
        if (getFailed() != null)
            sb.append("Failed: " + getFailed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishBatchResult == false)
            return false;
        PublishBatchResult other = (PublishBatchResult) obj;

        if (other.getSuccessful() == null ^ this.getSuccessful() == null)
            return false;
        if (other.getSuccessful() != null
                && other.getSuccessful().equals(this.getSuccessful()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        return true;
    }
}
