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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * The result of calling the operation. The operation returns one object for
 * each document that is successfully processed by the operation.
 * </p>
 */
public class BatchDetectEntitiesItemResult implements Serializable {
    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     */
    private Integer index;

    /**
     * <p>
     * One or more <a>Entity</a> objects, one for each entity detected in the
     * document.
     * </p>
     */
    private java.util.List<Entity> entities;

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     *
     * @return <p>
     *         The zero-based index of the document in the input list.
     *         </p>
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     *
     * @param index <p>
     *            The zero-based index of the document in the input list.
     *            </p>
     */
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param index <p>
     *            The zero-based index of the document in the input list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectEntitiesItemResult withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * <p>
     * One or more <a>Entity</a> objects, one for each entity detected in the
     * document.
     * </p>
     *
     * @return <p>
     *         One or more <a>Entity</a> objects, one for each entity detected
     *         in the document.
     *         </p>
     */
    public java.util.List<Entity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * One or more <a>Entity</a> objects, one for each entity detected in the
     * document.
     * </p>
     *
     * @param entities <p>
     *            One or more <a>Entity</a> objects, one for each entity
     *            detected in the document.
     *            </p>
     */
    public void setEntities(java.util.Collection<Entity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<Entity>(entities);
    }

    /**
     * <p>
     * One or more <a>Entity</a> objects, one for each entity detected in the
     * document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            One or more <a>Entity</a> objects, one for each entity
     *            detected in the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectEntitiesItemResult withEntities(Entity... entities) {
        if (getEntities() == null) {
            this.entities = new java.util.ArrayList<Entity>(entities.length);
        }
        for (Entity value : entities) {
            this.entities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more <a>Entity</a> objects, one for each entity detected in the
     * document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            One or more <a>Entity</a> objects, one for each entity
     *            detected in the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectEntitiesItemResult withEntities(java.util.Collection<Entity> entities) {
        setEntities(entities);
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
        if (getIndex() != null)
            sb.append("Index: " + getIndex() + ",");
        if (getEntities() != null)
            sb.append("Entities: " + getEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetectEntitiesItemResult == false)
            return false;
        BatchDetectEntitiesItemResult other = (BatchDetectEntitiesItemResult) obj;

        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        return true;
    }
}
