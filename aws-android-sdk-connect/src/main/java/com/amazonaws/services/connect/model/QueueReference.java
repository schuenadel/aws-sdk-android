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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a queue resource for which metrics are returned.
 * </p>
 */
public class QueueReference implements Serializable {
    /**
     * <p>
     * The identifier of the queue.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The identifier of the queue.
     * </p>
     *
     * @return <p>
     *         The identifier of the queue.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the queue.
     * </p>
     *
     * @param id <p>
     *            The identifier of the queue.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier of the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueueReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the queue.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the queue.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueueReference withArn(String arn) {
        this.arn = arn;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueueReference == false)
            return false;
        QueueReference other = (QueueReference) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }
}
