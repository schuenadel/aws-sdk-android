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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

public class GenerateDataKeyResult implements Serializable {
    /**
     * <p>
     * The encrypted copy of the data key. When you use the HTTP API or the
     * Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is
     * not Base64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private java.nio.ByteBuffer ciphertextBlob;

    /**
     * <p>
     * The plaintext data key. When you use the HTTP API or the Amazon Web
     * Services CLI, the value is Base64-encoded. Otherwise, it is not
     * Base64-encoded. Use this data key to encrypt your data outside of KMS.
     * Then, remove it from memory as soon as possible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private java.nio.ByteBuffer plaintext;

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key that encrypted the data key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The encrypted copy of the data key. When you use the HTTP API or the
     * Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is
     * not Base64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         The encrypted copy of the data key. When you use the HTTP API or
     *         the Amazon Web Services CLI, the value is Base64-encoded.
     *         Otherwise, it is not Base64-encoded.
     *         </p>
     */
    public java.nio.ByteBuffer getCiphertextBlob() {
        return ciphertextBlob;
    }

    /**
     * <p>
     * The encrypted copy of the data key. When you use the HTTP API or the
     * Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is
     * not Base64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextBlob <p>
     *            The encrypted copy of the data key. When you use the HTTP API
     *            or the Amazon Web Services CLI, the value is Base64-encoded.
     *            Otherwise, it is not Base64-encoded.
     *            </p>
     */
    public void setCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
    }

    /**
     * <p>
     * The encrypted copy of the data key. When you use the HTTP API or the
     * Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is
     * not Base64-encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextBlob <p>
     *            The encrypted copy of the data key. When you use the HTTP API
     *            or the Amazon Web Services CLI, the value is Base64-encoded.
     *            Otherwise, it is not Base64-encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateDataKeyResult withCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }

    /**
     * <p>
     * The plaintext data key. When you use the HTTP API or the Amazon Web
     * Services CLI, the value is Base64-encoded. Otherwise, it is not
     * Base64-encoded. Use this data key to encrypt your data outside of KMS.
     * Then, remove it from memory as soon as possible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         The plaintext data key. When you use the HTTP API or the Amazon
     *         Web Services CLI, the value is Base64-encoded. Otherwise, it is
     *         not Base64-encoded. Use this data key to encrypt your data
     *         outside of KMS. Then, remove it from memory as soon as possible.
     *         </p>
     */
    public java.nio.ByteBuffer getPlaintext() {
        return plaintext;
    }

    /**
     * <p>
     * The plaintext data key. When you use the HTTP API or the Amazon Web
     * Services CLI, the value is Base64-encoded. Otherwise, it is not
     * Base64-encoded. Use this data key to encrypt your data outside of KMS.
     * Then, remove it from memory as soon as possible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param plaintext <p>
     *            The plaintext data key. When you use the HTTP API or the
     *            Amazon Web Services CLI, the value is Base64-encoded.
     *            Otherwise, it is not Base64-encoded. Use this data key to
     *            encrypt your data outside of KMS. Then, remove it from memory
     *            as soon as possible.
     *            </p>
     */
    public void setPlaintext(java.nio.ByteBuffer plaintext) {
        this.plaintext = plaintext;
    }

    /**
     * <p>
     * The plaintext data key. When you use the HTTP API or the Amazon Web
     * Services CLI, the value is Base64-encoded. Otherwise, it is not
     * Base64-encoded. Use this data key to encrypt your data outside of KMS.
     * Then, remove it from memory as soon as possible.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param plaintext <p>
     *            The plaintext data key. When you use the HTTP API or the
     *            Amazon Web Services CLI, the value is Base64-encoded.
     *            Otherwise, it is not Base64-encoded. Use this data key to
     *            encrypt your data outside of KMS. Then, remove it from memory
     *            as soon as possible.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateDataKeyResult withPlaintext(java.nio.ByteBuffer plaintext) {
        this.plaintext = plaintext;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key that encrypted the data key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (<a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *         >key ARN</a>) of the KMS key that encrypted the data key.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key that encrypted the data key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The Amazon Resource Name (<a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *            >key ARN</a>) of the KMS key that encrypted the data key.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key that encrypted the data key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The Amazon Resource Name (<a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *            >key ARN</a>) of the KMS key that encrypted the data key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateDataKeyResult withKeyId(String keyId) {
        this.keyId = keyId;
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
        if (getCiphertextBlob() != null)
            sb.append("CiphertextBlob: " + getCiphertextBlob() + ",");
        if (getPlaintext() != null)
            sb.append("Plaintext: " + getPlaintext() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCiphertextBlob() == null) ? 0 : getCiphertextBlob().hashCode());
        hashCode = prime * hashCode + ((getPlaintext() == null) ? 0 : getPlaintext().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateDataKeyResult == false)
            return false;
        GenerateDataKeyResult other = (GenerateDataKeyResult) obj;

        if (other.getCiphertextBlob() == null ^ this.getCiphertextBlob() == null)
            return false;
        if (other.getCiphertextBlob() != null
                && other.getCiphertextBlob().equals(this.getCiphertextBlob()) == false)
            return false;
        if (other.getPlaintext() == null ^ this.getPlaintext() == null)
            return false;
        if (other.getPlaintext() != null
                && other.getPlaintext().equals(this.getPlaintext()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }
}
