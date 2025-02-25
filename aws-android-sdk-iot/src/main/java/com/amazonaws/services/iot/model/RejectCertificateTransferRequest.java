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
 * Rejects a pending certificate transfer. After IoT rejects a certificate
 * transfer, the certificate status changes from <b>PENDING_TRANSFER</b> to
 * <b>INACTIVE</b>.
 * </p>
 * <p>
 * To check for pending certificate transfers, call <a>ListCertificates</a> to
 * enumerate your certificates.
 * </p>
 * <p>
 * This operation can only be called by the transfer destination. After it is
 * called, the certificate will be returned to the source's account in the
 * INACTIVE state.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >RejectCertificateTransfer</a> action.
 * </p>
 */
public class RejectCertificateTransferRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains
     * the certificate ID.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     */
    private String certificateId;

    /**
     * <p>
     * The reason the certificate transfer was rejected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String rejectReason;

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains
     * the certificate ID.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @return <p>
     *         The ID of the certificate. (The last part of the certificate ARN
     *         contains the certificate ID.)
     *         </p>
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains
     * the certificate ID.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId <p>
     *            The ID of the certificate. (The last part of the certificate
     *            ARN contains the certificate ID.)
     *            </p>
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains
     * the certificate ID.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId <p>
     *            The ID of the certificate. (The last part of the certificate
     *            ARN contains the certificate ID.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RejectCertificateTransferRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * <p>
     * The reason the certificate transfer was rejected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         The reason the certificate transfer was rejected.
     *         </p>
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * <p>
     * The reason the certificate transfer was rejected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param rejectReason <p>
     *            The reason the certificate transfer was rejected.
     *            </p>
     */
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    /**
     * <p>
     * The reason the certificate transfer was rejected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param rejectReason <p>
     *            The reason the certificate transfer was rejected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RejectCertificateTransferRequest withRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
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
        if (getCertificateId() != null)
            sb.append("certificateId: " + getCertificateId() + ",");
        if (getRejectReason() != null)
            sb.append("rejectReason: " + getRejectReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode
                + ((getRejectReason() == null) ? 0 : getRejectReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RejectCertificateTransferRequest == false)
            return false;
        RejectCertificateTransferRequest other = (RejectCertificateTransferRequest) obj;

        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null
                && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getRejectReason() == null ^ this.getRejectReason() == null)
            return false;
        if (other.getRejectReason() != null
                && other.getRejectReason().equals(this.getRejectReason()) == false)
            return false;
        return true;
    }
}
