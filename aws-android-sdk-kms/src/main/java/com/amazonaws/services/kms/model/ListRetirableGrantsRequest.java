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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about all grants in the Amazon Web Services account and
 * Region that have the specified retiring principal.
 * </p>
 * <p>
 * You can specify any principal in your Amazon Web Services account. The grants
 * that are returned include grants for KMS keys in your Amazon Web Services
 * account and other Amazon Web Services accounts. You might use this operation
 * to determine which grants you may retire. To retire a grant, use the
 * <a>RetireGrant</a> operation.
 * </p>
 * <p>
 * For detailed information about grants, including grant terminology, see <a
 * href
 * ="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html">Using
 * grants</a> in the <i> <i>Key Management Service Developer Guide</i> </i>. For
 * examples of working with grants in several programming languages, see <a
 * href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-grants.html"
 * >Programming grants</a>.
 * </p>
 * <p>
 * <b>Cross-account use</b>: You must specify a principal in your Amazon Web
 * Services account. However, this operation can return grants in any Amazon Web
 * Services account. You do not need <code>kms:ListRetirableGrants</code>
 * permission (or any other additional permission) in any Amazon Web Services
 * account other than your own.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:ListRetirableGrants</a> (IAM policy) in your Amazon Web Services
 * account.
 * </p>
 * <p>
 * <b>Related operations:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateGrant</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListGrants</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RetireGrant</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RevokeGrant</a>
 * </p>
 * </li>
 * </ul>
 */
public class ListRetirableGrantsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When
     * this value is present, KMS does not return more than the specified number
     * of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 100, inclusive. If you do not include a value, it defaults to 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer limit;

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response
     * with truncated results. Set it to the value of <code>NextMarker</code>
     * from the truncated response you just received.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     */
    private String marker;

    /**
     * <p>
     * The retiring principal for which to list grants. Enter a principal in
     * your Amazon Web Services account.
     * </p>
     * <p>
     * To specify the retiring principal, use the <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an Amazon Web Services principal.
     * Valid Amazon Web Services principals include Amazon Web Services accounts
     * (root), IAM users, federated users, and assumed role users. For examples
     * of the ARN syntax for specifying a principal, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >Amazon Web Services Identity and Access Management (IAM)</a> in the
     * Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     */
    private String retiringPrincipal;

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When
     * this value is present, KMS does not return more than the specified number
     * of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 100, inclusive. If you do not include a value, it defaults to 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         Use this parameter to specify the maximum number of items to
     *         return. When this value is present, KMS does not return more than
     *         the specified number of items, but it might return fewer.
     *         </p>
     *         <p>
     *         This value is optional. If you include a value, it must be
     *         between 1 and 100, inclusive. If you do not include a value, it
     *         defaults to 50.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When
     * this value is present, KMS does not return more than the specified number
     * of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 100, inclusive. If you do not include a value, it defaults to 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param limit <p>
     *            Use this parameter to specify the maximum number of items to
     *            return. When this value is present, KMS does not return more
     *            than the specified number of items, but it might return fewer.
     *            </p>
     *            <p>
     *            This value is optional. If you include a value, it must be
     *            between 1 and 100, inclusive. If you do not include a value,
     *            it defaults to 50.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When
     * this value is present, KMS does not return more than the specified number
     * of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 100, inclusive. If you do not include a value, it defaults to 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param limit <p>
     *            Use this parameter to specify the maximum number of items to
     *            return. When this value is present, KMS does not return more
     *            than the specified number of items, but it might return fewer.
     *            </p>
     *            <p>
     *            This value is optional. If you include a value, it must be
     *            between 1 and 100, inclusive. If you do not include a value,
     *            it defaults to 50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRetirableGrantsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response
     * with truncated results. Set it to the value of <code>NextMarker</code>
     * from the truncated response you just received.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @return <p>
     *         Use this parameter in a subsequent request after you receive a
     *         response with truncated results. Set it to the value of
     *         <code>NextMarker</code> from the truncated response you just
     *         received.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response
     * with truncated results. Set it to the value of <code>NextMarker</code>
     * from the truncated response you just received.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @param marker <p>
     *            Use this parameter in a subsequent request after you receive a
     *            response with truncated results. Set it to the value of
     *            <code>NextMarker</code> from the truncated response you just
     *            received.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response
     * with truncated results. Set it to the value of <code>NextMarker</code>
     * from the truncated response you just received.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @param marker <p>
     *            Use this parameter in a subsequent request after you receive a
     *            response with truncated results. Set it to the value of
     *            <code>NextMarker</code> from the truncated response you just
     *            received.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRetirableGrantsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The retiring principal for which to list grants. Enter a principal in
     * your Amazon Web Services account.
     * </p>
     * <p>
     * To specify the retiring principal, use the <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an Amazon Web Services principal.
     * Valid Amazon Web Services principals include Amazon Web Services accounts
     * (root), IAM users, federated users, and assumed role users. For examples
     * of the ARN syntax for specifying a principal, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >Amazon Web Services Identity and Access Management (IAM)</a> in the
     * Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @return <p>
     *         The retiring principal for which to list grants. Enter a
     *         principal in your Amazon Web Services account.
     *         </p>
     *         <p>
     *         To specify the retiring principal, use the <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Name (ARN)</a> of an Amazon Web Services
     *         principal. Valid Amazon Web Services principals include Amazon
     *         Web Services accounts (root), IAM users, federated users, and
     *         assumed role users. For examples of the ARN syntax for specifying
     *         a principal, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *         >Amazon Web Services Identity and Access Management (IAM)</a> in
     *         the Example ARNs section of the <i>Amazon Web Services General
     *         Reference</i>.
     *         </p>
     */
    public String getRetiringPrincipal() {
        return retiringPrincipal;
    }

    /**
     * <p>
     * The retiring principal for which to list grants. Enter a principal in
     * your Amazon Web Services account.
     * </p>
     * <p>
     * To specify the retiring principal, use the <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an Amazon Web Services principal.
     * Valid Amazon Web Services principals include Amazon Web Services accounts
     * (root), IAM users, federated users, and assumed role users. For examples
     * of the ARN syntax for specifying a principal, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >Amazon Web Services Identity and Access Management (IAM)</a> in the
     * Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @param retiringPrincipal <p>
     *            The retiring principal for which to list grants. Enter a
     *            principal in your Amazon Web Services account.
     *            </p>
     *            <p>
     *            To specify the retiring principal, use the <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Name (ARN)</a> of an Amazon Web Services
     *            principal. Valid Amazon Web Services principals include Amazon
     *            Web Services accounts (root), IAM users, federated users, and
     *            assumed role users. For examples of the ARN syntax for
     *            specifying a principal, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *            >Amazon Web Services Identity and Access Management (IAM)</a>
     *            in the Example ARNs section of the <i>Amazon Web Services
     *            General Reference</i>.
     *            </p>
     */
    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }

    /**
     * <p>
     * The retiring principal for which to list grants. Enter a principal in
     * your Amazon Web Services account.
     * </p>
     * <p>
     * To specify the retiring principal, use the <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an Amazon Web Services principal.
     * Valid Amazon Web Services principals include Amazon Web Services accounts
     * (root), IAM users, federated users, and assumed role users. For examples
     * of the ARN syntax for specifying a principal, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >Amazon Web Services Identity and Access Management (IAM)</a> in the
     * Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @param retiringPrincipal <p>
     *            The retiring principal for which to list grants. Enter a
     *            principal in your Amazon Web Services account.
     *            </p>
     *            <p>
     *            To specify the retiring principal, use the <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Name (ARN)</a> of an Amazon Web Services
     *            principal. Valid Amazon Web Services principals include Amazon
     *            Web Services accounts (root), IAM users, federated users, and
     *            assumed role users. For examples of the ARN syntax for
     *            specifying a principal, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *            >Amazon Web Services Identity and Access Management (IAM)</a>
     *            in the Example ARNs section of the <i>Amazon Web Services
     *            General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRetirableGrantsRequest withRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
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
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getRetiringPrincipal() != null)
            sb.append("RetiringPrincipal: " + getRetiringPrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getRetiringPrincipal() == null) ? 0 : getRetiringPrincipal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRetirableGrantsRequest == false)
            return false;
        ListRetirableGrantsRequest other = (ListRetirableGrantsRequest) obj;

        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getRetiringPrincipal() == null ^ this.getRetiringPrincipal() == null)
            return false;
        if (other.getRetiringPrincipal() != null
                && other.getRetiringPrincipal().equals(this.getRetiringPrincipal()) == false)
            return false;
        return true;
    }
}
