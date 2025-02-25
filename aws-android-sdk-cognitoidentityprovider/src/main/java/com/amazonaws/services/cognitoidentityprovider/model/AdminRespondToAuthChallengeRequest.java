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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Responds to an authentication challenge, as an administrator.
 * </p>
 * <note>
 * <p>
 * This action might generate an SMS text message. Starting June 1, 2021, US
 * telecom carriers require you to register an origination phone number before
 * you can send SMS messages to U.S. phone numbers. If you use SMS text messages
 * in Amazon Cognito, you must register a phone number with <a
 * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
 * Amazon Cognito will use the registered number automatically. Otherwise,
 * Amazon Cognito users that must receive SMS messages might be unable to sign
 * up, activate their accounts, or sign in.
 * </p>
 * <p>
 * If you have never used SMS text messages with Amazon Cognito or any other
 * Amazon Web Service, Amazon Simple Notification Service might place your
 * account in SMS sandbox. In <i> <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox
 * mode</a> </i>, you will have limitations, such as sending messages only to
 * verified phone numbers. After testing in the sandbox environment, you can
 * move out of the SMS sandbox and into production. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
 * > SMS message settings for Amazon Cognito User Pools</a> in the <i>Amazon
 * Cognito Developer Guide</i>.
 * </p>
 * </note>
 * <p>
 * Calling this action requires developer credentials.
 * </p>
 */
public class AdminRespondToAuthChallengeRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The app client ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientId;

    /**
     * <p>
     * The challenge name. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     * >AdminInitiateAuth</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, SOFTWARE_TOKEN_MFA, SELECT_MFA_TYPE,
     * MFA_SETUP, PASSWORD_VERIFIER, CUSTOM_CHALLENGE, DEVICE_SRP_AUTH,
     * DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH, NEW_PASSWORD_REQUIRED
     */
    private String challengeName;

    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of
     * <code>ChallengeName</code>, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>,
     * <code>SECRET_HASH</code> (if app client is configured with client
     * secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is
     * configured with client secret).
     * </p>
     * <note>
     * <p>
     * <code>PASSWORD_VERIFIER</code> requires <code>DEVICE_KEY</code> when
     * signing in with a remembered device.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is
     * configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other
     * required attributes, <code>USERNAME</code>, <code>SECRET_HASH</code> (if
     * app client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you must use
     * the session value returned by <code>VerifySoftwareToken</code> in the
     * <code>Session</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's
     * actual username, not an alias (such as an email address or phone number).
     * To make this simpler, the <code>AdminInitiateAuth</code> response
     * includes the actual username value in the
     * <code>USERNAMEUSER_ID_FOR_SRP</code> attribute. This happens even if you
     * specified an alias in your call to <code>AdminInitiateAuth</code>.
     * </p>
     */
    private java.util.Map<String, String> challengeResponses;

    /**
     * <p>
     * The session that should be passed both ways in challenge-response calls
     * to the service. If an <code>InitiateAuth</code> or
     * <code>RespondToAuthChallenge</code> API call determines that the caller
     * must pass another challenge, it returns a session with other challenge
     * parameters. This session should be passed as it is to the next
     * <code>RespondToAuthChallenge</code> API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String session;

    /**
     * <p>
     * The analytics metadata for collecting Amazon Pinpoint metrics for
     * <code>AdminRespondToAuthChallenge</code> calls.
     * </p>
     */
    private AnalyticsMetadataType analyticsMetadata;

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or
     * location used for evaluating the risk of an unexpected event by Amazon
     * Cognito advanced security.
     * </p>
     */
    private ContextDataType contextData;

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the AdminRespondToAuthChallenge API action, Amazon
     * Cognito invokes any functions that are assigned to the following
     * triggers: <i>pre sign-up</i>, <i>custom message</i>, <i>post
     * authentication</i>, <i>user migration</i>, <i>pre token generation</i>,
     * <i>define auth challenge</i>, <i>create auth challenge</i>, and <i>verify
     * auth challenge response</i>. When Amazon Cognito invokes any of these
     * functions, it passes a JSON payload, which the function receives as
     * input. This payload contains a <code>clientMetadata</code> attribute,
     * which provides the data that you assigned to the ClientMetadata parameter
     * in your AdminRespondToAuthChallenge request. In your function code in
     * Lambda, you can process the <code>clientMetadata</code> value to enhance
     * your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private java.util.Map<String, String> clientMetadata;

    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The ID of the Amazon Cognito user pool.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The ID of the Amazon Cognito user pool.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The ID of the Amazon Cognito user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminRespondToAuthChallengeRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return <p>
     *         The app client ID.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The app client ID.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The app client ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminRespondToAuthChallengeRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     * >AdminInitiateAuth</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, SOFTWARE_TOKEN_MFA, SELECT_MFA_TYPE,
     * MFA_SETUP, PASSWORD_VERIFIER, CUSTOM_CHALLENGE, DEVICE_SRP_AUTH,
     * DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH, NEW_PASSWORD_REQUIRED
     *
     * @return <p>
     *         The challenge name. For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     *         >AdminInitiateAuth</a>.
     *         </p>
     * @see ChallengeNameType
     */
    public String getChallengeName() {
        return challengeName;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     * >AdminInitiateAuth</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, SOFTWARE_TOKEN_MFA, SELECT_MFA_TYPE,
     * MFA_SETUP, PASSWORD_VERIFIER, CUSTOM_CHALLENGE, DEVICE_SRP_AUTH,
     * DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH, NEW_PASSWORD_REQUIRED
     *
     * @param challengeName <p>
     *            The challenge name. For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     *            >AdminInitiateAuth</a>.
     *            </p>
     * @see ChallengeNameType
     */
    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     * >AdminInitiateAuth</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, SOFTWARE_TOKEN_MFA, SELECT_MFA_TYPE,
     * MFA_SETUP, PASSWORD_VERIFIER, CUSTOM_CHALLENGE, DEVICE_SRP_AUTH,
     * DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH, NEW_PASSWORD_REQUIRED
     *
     * @param challengeName <p>
     *            The challenge name. For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     *            >AdminInitiateAuth</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChallengeNameType
     */
    public AdminRespondToAuthChallengeRequest withChallengeName(String challengeName) {
        this.challengeName = challengeName;
        return this;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     * >AdminInitiateAuth</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, SOFTWARE_TOKEN_MFA, SELECT_MFA_TYPE,
     * MFA_SETUP, PASSWORD_VERIFIER, CUSTOM_CHALLENGE, DEVICE_SRP_AUTH,
     * DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH, NEW_PASSWORD_REQUIRED
     *
     * @param challengeName <p>
     *            The challenge name. For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     *            >AdminInitiateAuth</a>.
     *            </p>
     * @see ChallengeNameType
     */
    public void setChallengeName(ChallengeNameType challengeName) {
        this.challengeName = challengeName.toString();
    }

    /**
     * <p>
     * The challenge name. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     * >AdminInitiateAuth</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS_MFA, SOFTWARE_TOKEN_MFA, SELECT_MFA_TYPE,
     * MFA_SETUP, PASSWORD_VERIFIER, CUSTOM_CHALLENGE, DEVICE_SRP_AUTH,
     * DEVICE_PASSWORD_VERIFIER, ADMIN_NO_SRP_AUTH, NEW_PASSWORD_REQUIRED
     *
     * @param challengeName <p>
     *            The challenge name. For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     *            >AdminInitiateAuth</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChallengeNameType
     */
    public AdminRespondToAuthChallengeRequest withChallengeName(ChallengeNameType challengeName) {
        this.challengeName = challengeName.toString();
        return this;
    }

    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of
     * <code>ChallengeName</code>, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>,
     * <code>SECRET_HASH</code> (if app client is configured with client
     * secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is
     * configured with client secret).
     * </p>
     * <note>
     * <p>
     * <code>PASSWORD_VERIFIER</code> requires <code>DEVICE_KEY</code> when
     * signing in with a remembered device.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is
     * configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other
     * required attributes, <code>USERNAME</code>, <code>SECRET_HASH</code> (if
     * app client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you must use
     * the session value returned by <code>VerifySoftwareToken</code> in the
     * <code>Session</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's
     * actual username, not an alias (such as an email address or phone number).
     * To make this simpler, the <code>AdminInitiateAuth</code> response
     * includes the actual username value in the
     * <code>USERNAMEUSER_ID_FOR_SRP</code> attribute. This happens even if you
     * specified an alias in your call to <code>AdminInitiateAuth</code>.
     * </p>
     *
     * @return <p>
     *         The challenge responses. These are inputs corresponding to the
     *         value of <code>ChallengeName</code>, for example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>,
     *         <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is
     *         configured with client secret).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PASSWORD_VERIFIER</code>:
     *         <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *         <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>,
     *         <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is
     *         configured with client secret).
     *         </p>
     *         <note>
     *         <p>
     *         <code>PASSWORD_VERIFIER</code> requires <code>DEVICE_KEY</code>
     *         when signing in with a remembered device.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>,
     *         <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is
     *         configured with client secret).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>,
     *         any other required attributes, <code>USERNAME</code>,
     *         <code>SECRET_HASH</code> (if app client is configured with client
     *         secret).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you
     *         must use the session value returned by
     *         <code>VerifySoftwareToken</code> in the <code>Session</code>
     *         parameter.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The value of the <code>USERNAME</code> attribute must be the
     *         user's actual username, not an alias (such as an email address or
     *         phone number). To make this simpler, the
     *         <code>AdminInitiateAuth</code> response includes the actual
     *         username value in the <code>USERNAMEUSER_ID_FOR_SRP</code>
     *         attribute. This happens even if you specified an alias in your
     *         call to <code>AdminInitiateAuth</code>.
     *         </p>
     */
    public java.util.Map<String, String> getChallengeResponses() {
        return challengeResponses;
    }

    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of
     * <code>ChallengeName</code>, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>,
     * <code>SECRET_HASH</code> (if app client is configured with client
     * secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is
     * configured with client secret).
     * </p>
     * <note>
     * <p>
     * <code>PASSWORD_VERIFIER</code> requires <code>DEVICE_KEY</code> when
     * signing in with a remembered device.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is
     * configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other
     * required attributes, <code>USERNAME</code>, <code>SECRET_HASH</code> (if
     * app client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you must use
     * the session value returned by <code>VerifySoftwareToken</code> in the
     * <code>Session</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's
     * actual username, not an alias (such as an email address or phone number).
     * To make this simpler, the <code>AdminInitiateAuth</code> response
     * includes the actual username value in the
     * <code>USERNAMEUSER_ID_FOR_SRP</code> attribute. This happens even if you
     * specified an alias in your call to <code>AdminInitiateAuth</code>.
     * </p>
     *
     * @param challengeResponses <p>
     *            The challenge responses. These are inputs corresponding to the
     *            value of <code>ChallengeName</code>, for example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>,
     *            <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client
     *            is configured with client secret).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PASSWORD_VERIFIER</code>:
     *            <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *            <code>PASSWORD_CLAIM_SECRET_BLOCK</code>,
     *            <code>TIMESTAMP</code>, <code>USERNAME</code>,
     *            <code>SECRET_HASH</code> (if app client is configured with
     *            client secret).
     *            </p>
     *            <note>
     *            <p>
     *            <code>PASSWORD_VERIFIER</code> requires
     *            <code>DEVICE_KEY</code> when signing in with a remembered
     *            device.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>,
     *            <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client
     *            is configured with client secret).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>,
     *            any other required attributes, <code>USERNAME</code>,
     *            <code>SECRET_HASH</code> (if app client is configured with
     *            client secret).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus
     *            you must use the session value returned by
     *            <code>VerifySoftwareToken</code> in the <code>Session</code>
     *            parameter.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The value of the <code>USERNAME</code> attribute must be the
     *            user's actual username, not an alias (such as an email address
     *            or phone number). To make this simpler, the
     *            <code>AdminInitiateAuth</code> response includes the actual
     *            username value in the <code>USERNAMEUSER_ID_FOR_SRP</code>
     *            attribute. This happens even if you specified an alias in your
     *            call to <code>AdminInitiateAuth</code>.
     *            </p>
     */
    public void setChallengeResponses(java.util.Map<String, String> challengeResponses) {
        this.challengeResponses = challengeResponses;
    }

    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of
     * <code>ChallengeName</code>, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>,
     * <code>SECRET_HASH</code> (if app client is configured with client
     * secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is
     * configured with client secret).
     * </p>
     * <note>
     * <p>
     * <code>PASSWORD_VERIFIER</code> requires <code>DEVICE_KEY</code> when
     * signing in with a remembered device.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is
     * configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other
     * required attributes, <code>USERNAME</code>, <code>SECRET_HASH</code> (if
     * app client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you must use
     * the session value returned by <code>VerifySoftwareToken</code> in the
     * <code>Session</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's
     * actual username, not an alias (such as an email address or phone number).
     * To make this simpler, the <code>AdminInitiateAuth</code> response
     * includes the actual username value in the
     * <code>USERNAMEUSER_ID_FOR_SRP</code> attribute. This happens even if you
     * specified an alias in your call to <code>AdminInitiateAuth</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param challengeResponses <p>
     *            The challenge responses. These are inputs corresponding to the
     *            value of <code>ChallengeName</code>, for example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>,
     *            <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client
     *            is configured with client secret).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PASSWORD_VERIFIER</code>:
     *            <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *            <code>PASSWORD_CLAIM_SECRET_BLOCK</code>,
     *            <code>TIMESTAMP</code>, <code>USERNAME</code>,
     *            <code>SECRET_HASH</code> (if app client is configured with
     *            client secret).
     *            </p>
     *            <note>
     *            <p>
     *            <code>PASSWORD_VERIFIER</code> requires
     *            <code>DEVICE_KEY</code> when signing in with a remembered
     *            device.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>,
     *            <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client
     *            is configured with client secret).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>,
     *            any other required attributes, <code>USERNAME</code>,
     *            <code>SECRET_HASH</code> (if app client is configured with
     *            client secret).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus
     *            you must use the session value returned by
     *            <code>VerifySoftwareToken</code> in the <code>Session</code>
     *            parameter.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The value of the <code>USERNAME</code> attribute must be the
     *            user's actual username, not an alias (such as an email address
     *            or phone number). To make this simpler, the
     *            <code>AdminInitiateAuth</code> response includes the actual
     *            username value in the <code>USERNAMEUSER_ID_FOR_SRP</code>
     *            attribute. This happens even if you specified an alias in your
     *            call to <code>AdminInitiateAuth</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminRespondToAuthChallengeRequest withChallengeResponses(
            java.util.Map<String, String> challengeResponses) {
        this.challengeResponses = challengeResponses;
        return this;
    }

    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of
     * <code>ChallengeName</code>, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>,
     * <code>SECRET_HASH</code> (if app client is configured with client
     * secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>,
     * <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is
     * configured with client secret).
     * </p>
     * <note>
     * <p>
     * <code>PASSWORD_VERIFIER</code> requires <code>DEVICE_KEY</code> when
     * signing in with a remembered device.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is
     * configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other
     * required attributes, <code>USERNAME</code>, <code>SECRET_HASH</code> (if
     * app client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you must use
     * the session value returned by <code>VerifySoftwareToken</code> in the
     * <code>Session</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's
     * actual username, not an alias (such as an email address or phone number).
     * To make this simpler, the <code>AdminInitiateAuth</code> response
     * includes the actual username value in the
     * <code>USERNAMEUSER_ID_FOR_SRP</code> attribute. This happens even if you
     * specified an alias in your call to <code>AdminInitiateAuth</code>.
     * </p>
     * <p>
     * The method adds a new key-value pair into ChallengeResponses parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into ChallengeResponses.
     * @param value The corresponding value of the entry to be added into
     *            ChallengeResponses.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminRespondToAuthChallengeRequest addChallengeResponsesEntry(String key, String value) {
        if (null == this.challengeResponses) {
            this.challengeResponses = new java.util.HashMap<String, String>();
        }
        if (this.challengeResponses.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.challengeResponses.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ChallengeResponses.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AdminRespondToAuthChallengeRequest clearChallengeResponsesEntries() {
        this.challengeResponses = null;
        return this;
    }

    /**
     * <p>
     * The session that should be passed both ways in challenge-response calls
     * to the service. If an <code>InitiateAuth</code> or
     * <code>RespondToAuthChallenge</code> API call determines that the caller
     * must pass another challenge, it returns a session with other challenge
     * parameters. This session should be passed as it is to the next
     * <code>RespondToAuthChallenge</code> API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The session that should be passed both ways in challenge-response
     *         calls to the service. If an <code>InitiateAuth</code> or
     *         <code>RespondToAuthChallenge</code> API call determines that the
     *         caller must pass another challenge, it returns a session with
     *         other challenge parameters. This session should be passed as it
     *         is to the next <code>RespondToAuthChallenge</code> API call.
     *         </p>
     */
    public String getSession() {
        return session;
    }

    /**
     * <p>
     * The session that should be passed both ways in challenge-response calls
     * to the service. If an <code>InitiateAuth</code> or
     * <code>RespondToAuthChallenge</code> API call determines that the caller
     * must pass another challenge, it returns a session with other challenge
     * parameters. This session should be passed as it is to the next
     * <code>RespondToAuthChallenge</code> API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param session <p>
     *            The session that should be passed both ways in
     *            challenge-response calls to the service. If an
     *            <code>InitiateAuth</code> or
     *            <code>RespondToAuthChallenge</code> API call determines that
     *            the caller must pass another challenge, it returns a session
     *            with other challenge parameters. This session should be passed
     *            as it is to the next <code>RespondToAuthChallenge</code> API
     *            call.
     *            </p>
     */
    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session that should be passed both ways in challenge-response calls
     * to the service. If an <code>InitiateAuth</code> or
     * <code>RespondToAuthChallenge</code> API call determines that the caller
     * must pass another challenge, it returns a session with other challenge
     * parameters. This session should be passed as it is to the next
     * <code>RespondToAuthChallenge</code> API call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param session <p>
     *            The session that should be passed both ways in
     *            challenge-response calls to the service. If an
     *            <code>InitiateAuth</code> or
     *            <code>RespondToAuthChallenge</code> API call determines that
     *            the caller must pass another challenge, it returns a session
     *            with other challenge parameters. This session should be passed
     *            as it is to the next <code>RespondToAuthChallenge</code> API
     *            call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminRespondToAuthChallengeRequest withSession(String session) {
        this.session = session;
        return this;
    }

    /**
     * <p>
     * The analytics metadata for collecting Amazon Pinpoint metrics for
     * <code>AdminRespondToAuthChallenge</code> calls.
     * </p>
     *
     * @return <p>
     *         The analytics metadata for collecting Amazon Pinpoint metrics for
     *         <code>AdminRespondToAuthChallenge</code> calls.
     *         </p>
     */
    public AnalyticsMetadataType getAnalyticsMetadata() {
        return analyticsMetadata;
    }

    /**
     * <p>
     * The analytics metadata for collecting Amazon Pinpoint metrics for
     * <code>AdminRespondToAuthChallenge</code> calls.
     * </p>
     *
     * @param analyticsMetadata <p>
     *            The analytics metadata for collecting Amazon Pinpoint metrics
     *            for <code>AdminRespondToAuthChallenge</code> calls.
     *            </p>
     */
    public void setAnalyticsMetadata(AnalyticsMetadataType analyticsMetadata) {
        this.analyticsMetadata = analyticsMetadata;
    }

    /**
     * <p>
     * The analytics metadata for collecting Amazon Pinpoint metrics for
     * <code>AdminRespondToAuthChallenge</code> calls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyticsMetadata <p>
     *            The analytics metadata for collecting Amazon Pinpoint metrics
     *            for <code>AdminRespondToAuthChallenge</code> calls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminRespondToAuthChallengeRequest withAnalyticsMetadata(
            AnalyticsMetadataType analyticsMetadata) {
        this.analyticsMetadata = analyticsMetadata;
        return this;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or
     * location used for evaluating the risk of an unexpected event by Amazon
     * Cognito advanced security.
     * </p>
     *
     * @return <p>
     *         Contextual data such as the user's device fingerprint, IP
     *         address, or location used for evaluating the risk of an
     *         unexpected event by Amazon Cognito advanced security.
     *         </p>
     */
    public ContextDataType getContextData() {
        return contextData;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or
     * location used for evaluating the risk of an unexpected event by Amazon
     * Cognito advanced security.
     * </p>
     *
     * @param contextData <p>
     *            Contextual data such as the user's device fingerprint, IP
     *            address, or location used for evaluating the risk of an
     *            unexpected event by Amazon Cognito advanced security.
     *            </p>
     */
    public void setContextData(ContextDataType contextData) {
        this.contextData = contextData;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or
     * location used for evaluating the risk of an unexpected event by Amazon
     * Cognito advanced security.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contextData <p>
     *            Contextual data such as the user's device fingerprint, IP
     *            address, or location used for evaluating the risk of an
     *            unexpected event by Amazon Cognito advanced security.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminRespondToAuthChallengeRequest withContextData(ContextDataType contextData) {
        this.contextData = contextData;
        return this;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the AdminRespondToAuthChallenge API action, Amazon
     * Cognito invokes any functions that are assigned to the following
     * triggers: <i>pre sign-up</i>, <i>custom message</i>, <i>post
     * authentication</i>, <i>user migration</i>, <i>pre token generation</i>,
     * <i>define auth challenge</i>, <i>create auth challenge</i>, and <i>verify
     * auth challenge response</i>. When Amazon Cognito invokes any of these
     * functions, it passes a JSON payload, which the function receives as
     * input. This payload contains a <code>clientMetadata</code> attribute,
     * which provides the data that you assigned to the ClientMetadata parameter
     * in your AdminRespondToAuthChallenge request. In your function code in
     * Lambda, you can process the <code>clientMetadata</code> value to enhance
     * your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     *
     * @return <p>
     *         A map of custom key-value pairs that you can provide as input for
     *         any custom workflows that this action triggers.
     *         </p>
     *         <p>
     *         You create custom workflows by assigning Lambda functions to user
     *         pool triggers. When you use the AdminRespondToAuthChallenge API
     *         action, Amazon Cognito invokes any functions that are assigned to
     *         the following triggers: <i>pre sign-up</i>, <i>custom
     *         message</i>, <i>post authentication</i>, <i>user migration</i>,
     *         <i>pre token generation</i>, <i>define auth challenge</i>,
     *         <i>create auth challenge</i>, and <i>verify auth challenge
     *         response</i>. When Amazon Cognito invokes any of these functions,
     *         it passes a JSON payload, which the function receives as input.
     *         This payload contains a <code>clientMetadata</code> attribute,
     *         which provides the data that you assigned to the ClientMetadata
     *         parameter in your AdminRespondToAuthChallenge request. In your
     *         function code in Lambda, you can process the
     *         <code>clientMetadata</code> value to enhance your workflow for
     *         your specific needs.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *         >Customizing User Pool Workflows with Lambda Triggers</a> in the
     *         <i>Amazon Cognito Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         When you use the ClientMetadata parameter, remember that Amazon
     *         Cognito won't do the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Store the ClientMetadata value. This data is available only to
     *         Lambda triggers that are assigned to a user pool to support
     *         custom workflows. If your user pool configuration doesn't include
     *         triggers, the ClientMetadata parameter serves no purpose.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Validate the ClientMetadata value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Encrypt the ClientMetadata value. Don't use Amazon Cognito to
     *         provide sensitive information.
     *         </p>
     *         </li>
     *         </ul>
     *         </note>
     */
    public java.util.Map<String, String> getClientMetadata() {
        return clientMetadata;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the AdminRespondToAuthChallenge API action, Amazon
     * Cognito invokes any functions that are assigned to the following
     * triggers: <i>pre sign-up</i>, <i>custom message</i>, <i>post
     * authentication</i>, <i>user migration</i>, <i>pre token generation</i>,
     * <i>define auth challenge</i>, <i>create auth challenge</i>, and <i>verify
     * auth challenge response</i>. When Amazon Cognito invokes any of these
     * functions, it passes a JSON payload, which the function receives as
     * input. This payload contains a <code>clientMetadata</code> attribute,
     * which provides the data that you assigned to the ClientMetadata parameter
     * in your AdminRespondToAuthChallenge request. In your function code in
     * Lambda, you can process the <code>clientMetadata</code> value to enhance
     * your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     *
     * @param clientMetadata <p>
     *            A map of custom key-value pairs that you can provide as input
     *            for any custom workflows that this action triggers.
     *            </p>
     *            <p>
     *            You create custom workflows by assigning Lambda functions to
     *            user pool triggers. When you use the
     *            AdminRespondToAuthChallenge API action, Amazon Cognito invokes
     *            any functions that are assigned to the following triggers:
     *            <i>pre sign-up</i>, <i>custom message</i>, <i>post
     *            authentication</i>, <i>user migration</i>, <i>pre token
     *            generation</i>, <i>define auth challenge</i>, <i>create auth
     *            challenge</i>, and <i>verify auth challenge response</i>. When
     *            Amazon Cognito invokes any of these functions, it passes a
     *            JSON payload, which the function receives as input. This
     *            payload contains a <code>clientMetadata</code> attribute,
     *            which provides the data that you assigned to the
     *            ClientMetadata parameter in your AdminRespondToAuthChallenge
     *            request. In your function code in Lambda, you can process the
     *            <code>clientMetadata</code> value to enhance your workflow for
     *            your specific needs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *            >Customizing User Pool Workflows with Lambda Triggers</a> in
     *            the <i>Amazon Cognito Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            When you use the ClientMetadata parameter, remember that
     *            Amazon Cognito won't do the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Store the ClientMetadata value. This data is available only to
     *            Lambda triggers that are assigned to a user pool to support
     *            custom workflows. If your user pool configuration doesn't
     *            include triggers, the ClientMetadata parameter serves no
     *            purpose.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Validate the ClientMetadata value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Encrypt the ClientMetadata value. Don't use Amazon Cognito to
     *            provide sensitive information.
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     */
    public void setClientMetadata(java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the AdminRespondToAuthChallenge API action, Amazon
     * Cognito invokes any functions that are assigned to the following
     * triggers: <i>pre sign-up</i>, <i>custom message</i>, <i>post
     * authentication</i>, <i>user migration</i>, <i>pre token generation</i>,
     * <i>define auth challenge</i>, <i>create auth challenge</i>, and <i>verify
     * auth challenge response</i>. When Amazon Cognito invokes any of these
     * functions, it passes a JSON payload, which the function receives as
     * input. This payload contains a <code>clientMetadata</code> attribute,
     * which provides the data that you assigned to the ClientMetadata parameter
     * in your AdminRespondToAuthChallenge request. In your function code in
     * Lambda, you can process the <code>clientMetadata</code> value to enhance
     * your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientMetadata <p>
     *            A map of custom key-value pairs that you can provide as input
     *            for any custom workflows that this action triggers.
     *            </p>
     *            <p>
     *            You create custom workflows by assigning Lambda functions to
     *            user pool triggers. When you use the
     *            AdminRespondToAuthChallenge API action, Amazon Cognito invokes
     *            any functions that are assigned to the following triggers:
     *            <i>pre sign-up</i>, <i>custom message</i>, <i>post
     *            authentication</i>, <i>user migration</i>, <i>pre token
     *            generation</i>, <i>define auth challenge</i>, <i>create auth
     *            challenge</i>, and <i>verify auth challenge response</i>. When
     *            Amazon Cognito invokes any of these functions, it passes a
     *            JSON payload, which the function receives as input. This
     *            payload contains a <code>clientMetadata</code> attribute,
     *            which provides the data that you assigned to the
     *            ClientMetadata parameter in your AdminRespondToAuthChallenge
     *            request. In your function code in Lambda, you can process the
     *            <code>clientMetadata</code> value to enhance your workflow for
     *            your specific needs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *            >Customizing User Pool Workflows with Lambda Triggers</a> in
     *            the <i>Amazon Cognito Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            When you use the ClientMetadata parameter, remember that
     *            Amazon Cognito won't do the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Store the ClientMetadata value. This data is available only to
     *            Lambda triggers that are assigned to a user pool to support
     *            custom workflows. If your user pool configuration doesn't
     *            include triggers, the ClientMetadata parameter serves no
     *            purpose.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Validate the ClientMetadata value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Encrypt the ClientMetadata value. Don't use Amazon Cognito to
     *            provide sensitive information.
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminRespondToAuthChallengeRequest withClientMetadata(
            java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
        return this;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the AdminRespondToAuthChallenge API action, Amazon
     * Cognito invokes any functions that are assigned to the following
     * triggers: <i>pre sign-up</i>, <i>custom message</i>, <i>post
     * authentication</i>, <i>user migration</i>, <i>pre token generation</i>,
     * <i>define auth challenge</i>, <i>create auth challenge</i>, and <i>verify
     * auth challenge response</i>. When Amazon Cognito invokes any of these
     * functions, it passes a JSON payload, which the function receives as
     * input. This payload contains a <code>clientMetadata</code> attribute,
     * which provides the data that you assigned to the ClientMetadata parameter
     * in your AdminRespondToAuthChallenge request. In your function code in
     * Lambda, you can process the <code>clientMetadata</code> value to enhance
     * your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * The method adds a new key-value pair into ClientMetadata parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into ClientMetadata.
     * @param value The corresponding value of the entry to be added into
     *            ClientMetadata.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminRespondToAuthChallengeRequest addClientMetadataEntry(String key, String value) {
        if (null == this.clientMetadata) {
            this.clientMetadata = new java.util.HashMap<String, String>();
        }
        if (this.clientMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.clientMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ClientMetadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AdminRespondToAuthChallengeRequest clearClientMetadataEntries() {
        this.clientMetadata = null;
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getChallengeName() != null)
            sb.append("ChallengeName: " + getChallengeName() + ",");
        if (getChallengeResponses() != null)
            sb.append("ChallengeResponses: " + getChallengeResponses() + ",");
        if (getSession() != null)
            sb.append("Session: " + getSession() + ",");
        if (getAnalyticsMetadata() != null)
            sb.append("AnalyticsMetadata: " + getAnalyticsMetadata() + ",");
        if (getContextData() != null)
            sb.append("ContextData: " + getContextData() + ",");
        if (getClientMetadata() != null)
            sb.append("ClientMetadata: " + getClientMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode
                + ((getChallengeName() == null) ? 0 : getChallengeName().hashCode());
        hashCode = prime * hashCode
                + ((getChallengeResponses() == null) ? 0 : getChallengeResponses().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        hashCode = prime * hashCode
                + ((getAnalyticsMetadata() == null) ? 0 : getAnalyticsMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getContextData() == null) ? 0 : getContextData().hashCode());
        hashCode = prime * hashCode
                + ((getClientMetadata() == null) ? 0 : getClientMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminRespondToAuthChallengeRequest == false)
            return false;
        AdminRespondToAuthChallengeRequest other = (AdminRespondToAuthChallengeRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getChallengeName() == null ^ this.getChallengeName() == null)
            return false;
        if (other.getChallengeName() != null
                && other.getChallengeName().equals(this.getChallengeName()) == false)
            return false;
        if (other.getChallengeResponses() == null ^ this.getChallengeResponses() == null)
            return false;
        if (other.getChallengeResponses() != null
                && other.getChallengeResponses().equals(this.getChallengeResponses()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        if (other.getAnalyticsMetadata() == null ^ this.getAnalyticsMetadata() == null)
            return false;
        if (other.getAnalyticsMetadata() != null
                && other.getAnalyticsMetadata().equals(this.getAnalyticsMetadata()) == false)
            return false;
        if (other.getContextData() == null ^ this.getContextData() == null)
            return false;
        if (other.getContextData() != null
                && other.getContextData().equals(this.getContextData()) == false)
            return false;
        if (other.getClientMetadata() == null ^ this.getClientMetadata() == null)
            return false;
        if (other.getClientMetadata() != null
                && other.getClientMetadata().equals(this.getClientMetadata()) == false)
            return false;
        return true;
    }
}
