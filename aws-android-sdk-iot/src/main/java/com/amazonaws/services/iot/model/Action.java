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

/**
 * <p>
 * Describes the actions associated with a rule.
 * </p>
 */
public class Action implements Serializable {
    /**
     * <p>
     * Write to a DynamoDB table.
     * </p>
     */
    private DynamoDBAction dynamoDB;

    /**
     * <p>
     * Write to a DynamoDB table. This is a new version of the DynamoDB action.
     * It allows you to write each attribute in an MQTT message payload into a
     * separate DynamoDB column.
     * </p>
     */
    private DynamoDBv2Action dynamoDBv2;

    /**
     * <p>
     * Invoke a Lambda function.
     * </p>
     */
    private LambdaAction lambda;

    /**
     * <p>
     * Publish to an Amazon SNS topic.
     * </p>
     */
    private SnsAction sns;

    /**
     * <p>
     * Publish to an Amazon SQS queue.
     * </p>
     */
    private SqsAction sqs;

    /**
     * <p>
     * Write data to an Amazon Kinesis stream.
     * </p>
     */
    private KinesisAction kinesis;

    /**
     * <p>
     * Publish to another MQTT topic.
     * </p>
     */
    private RepublishAction republish;

    /**
     * <p>
     * Write to an Amazon S3 bucket.
     * </p>
     */
    private S3Action s3;

    /**
     * <p>
     * Write to an Amazon Kinesis Firehose stream.
     * </p>
     */
    private FirehoseAction firehose;

    /**
     * <p>
     * Capture a CloudWatch metric.
     * </p>
     */
    private CloudwatchMetricAction cloudwatchMetric;

    /**
     * <p>
     * Change the state of a CloudWatch alarm.
     * </p>
     */
    private CloudwatchAlarmAction cloudwatchAlarm;

    /**
     * <p>
     * Send data to CloudWatch Logs.
     * </p>
     */
    private CloudwatchLogsAction cloudwatchLogs;

    /**
     * <p>
     * Write data to an Amazon OpenSearch Service domain.
     * </p>
     * <note>
     * <p>
     * The <code>Elasticsearch</code> action can only be used by existing rule
     * actions. To create a new rule action or to update an existing rule
     * action, use the <code>OpenSearch</code> rule action instead. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/apireference/API_OpenSearchAction.html"
     * >OpenSearchAction</a>.
     * </p>
     * </note>
     */
    private ElasticsearchAction elasticsearch;

    /**
     * <p>
     * Send a message to a Salesforce IoT Cloud Input Stream.
     * </p>
     */
    private SalesforceAction salesforce;

    /**
     * <p>
     * Sends message data to an IoT Analytics channel.
     * </p>
     */
    private IotAnalyticsAction iotAnalytics;

    /**
     * <p>
     * Sends an input to an IoT Events detector.
     * </p>
     */
    private IotEventsAction iotEvents;

    /**
     * <p>
     * Sends data from the MQTT message that triggered the rule to IoT SiteWise
     * asset properties.
     * </p>
     */
    private IotSiteWiseAction iotSiteWise;

    /**
     * <p>
     * Starts execution of a Step Functions state machine.
     * </p>
     */
    private StepFunctionsAction stepFunctions;

    /**
     * <p>
     * The Timestream rule action writes attributes (measures) from an MQTT
     * message into an Amazon Timestream table. For more information, see the <a
     * href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/timestream-rule-action.html"
     * >Timestream</a> topic rule action documentation.
     * </p>
     */
    private TimestreamAction timestream;

    /**
     * <p>
     * Send data to an HTTPS endpoint.
     * </p>
     */
    private HttpAction http;

    /**
     * <p>
     * Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon
     * MSK) or self-managed Apache Kafka cluster.
     * </p>
     */
    private KafkaAction kafka;

    /**
     * <p>
     * Write data to an Amazon OpenSearch Service domain.
     * </p>
     */
    private OpenSearchAction openSearch;

    /**
     * <p>
     * Write to a DynamoDB table.
     * </p>
     *
     * @return <p>
     *         Write to a DynamoDB table.
     *         </p>
     */
    public DynamoDBAction getDynamoDB() {
        return dynamoDB;
    }

    /**
     * <p>
     * Write to a DynamoDB table.
     * </p>
     *
     * @param dynamoDB <p>
     *            Write to a DynamoDB table.
     *            </p>
     */
    public void setDynamoDB(DynamoDBAction dynamoDB) {
        this.dynamoDB = dynamoDB;
    }

    /**
     * <p>
     * Write to a DynamoDB table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dynamoDB <p>
     *            Write to a DynamoDB table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withDynamoDB(DynamoDBAction dynamoDB) {
        this.dynamoDB = dynamoDB;
        return this;
    }

    /**
     * <p>
     * Write to a DynamoDB table. This is a new version of the DynamoDB action.
     * It allows you to write each attribute in an MQTT message payload into a
     * separate DynamoDB column.
     * </p>
     *
     * @return <p>
     *         Write to a DynamoDB table. This is a new version of the DynamoDB
     *         action. It allows you to write each attribute in an MQTT message
     *         payload into a separate DynamoDB column.
     *         </p>
     */
    public DynamoDBv2Action getDynamoDBv2() {
        return dynamoDBv2;
    }

    /**
     * <p>
     * Write to a DynamoDB table. This is a new version of the DynamoDB action.
     * It allows you to write each attribute in an MQTT message payload into a
     * separate DynamoDB column.
     * </p>
     *
     * @param dynamoDBv2 <p>
     *            Write to a DynamoDB table. This is a new version of the
     *            DynamoDB action. It allows you to write each attribute in an
     *            MQTT message payload into a separate DynamoDB column.
     *            </p>
     */
    public void setDynamoDBv2(DynamoDBv2Action dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
    }

    /**
     * <p>
     * Write to a DynamoDB table. This is a new version of the DynamoDB action.
     * It allows you to write each attribute in an MQTT message payload into a
     * separate DynamoDB column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dynamoDBv2 <p>
     *            Write to a DynamoDB table. This is a new version of the
     *            DynamoDB action. It allows you to write each attribute in an
     *            MQTT message payload into a separate DynamoDB column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withDynamoDBv2(DynamoDBv2Action dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
        return this;
    }

    /**
     * <p>
     * Invoke a Lambda function.
     * </p>
     *
     * @return <p>
     *         Invoke a Lambda function.
     *         </p>
     */
    public LambdaAction getLambda() {
        return lambda;
    }

    /**
     * <p>
     * Invoke a Lambda function.
     * </p>
     *
     * @param lambda <p>
     *            Invoke a Lambda function.
     *            </p>
     */
    public void setLambda(LambdaAction lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * Invoke a Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambda <p>
     *            Invoke a Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withLambda(LambdaAction lambda) {
        this.lambda = lambda;
        return this;
    }

    /**
     * <p>
     * Publish to an Amazon SNS topic.
     * </p>
     *
     * @return <p>
     *         Publish to an Amazon SNS topic.
     *         </p>
     */
    public SnsAction getSns() {
        return sns;
    }

    /**
     * <p>
     * Publish to an Amazon SNS topic.
     * </p>
     *
     * @param sns <p>
     *            Publish to an Amazon SNS topic.
     *            </p>
     */
    public void setSns(SnsAction sns) {
        this.sns = sns;
    }

    /**
     * <p>
     * Publish to an Amazon SNS topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sns <p>
     *            Publish to an Amazon SNS topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withSns(SnsAction sns) {
        this.sns = sns;
        return this;
    }

    /**
     * <p>
     * Publish to an Amazon SQS queue.
     * </p>
     *
     * @return <p>
     *         Publish to an Amazon SQS queue.
     *         </p>
     */
    public SqsAction getSqs() {
        return sqs;
    }

    /**
     * <p>
     * Publish to an Amazon SQS queue.
     * </p>
     *
     * @param sqs <p>
     *            Publish to an Amazon SQS queue.
     *            </p>
     */
    public void setSqs(SqsAction sqs) {
        this.sqs = sqs;
    }

    /**
     * <p>
     * Publish to an Amazon SQS queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sqs <p>
     *            Publish to an Amazon SQS queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withSqs(SqsAction sqs) {
        this.sqs = sqs;
        return this;
    }

    /**
     * <p>
     * Write data to an Amazon Kinesis stream.
     * </p>
     *
     * @return <p>
     *         Write data to an Amazon Kinesis stream.
     *         </p>
     */
    public KinesisAction getKinesis() {
        return kinesis;
    }

    /**
     * <p>
     * Write data to an Amazon Kinesis stream.
     * </p>
     *
     * @param kinesis <p>
     *            Write data to an Amazon Kinesis stream.
     *            </p>
     */
    public void setKinesis(KinesisAction kinesis) {
        this.kinesis = kinesis;
    }

    /**
     * <p>
     * Write data to an Amazon Kinesis stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kinesis <p>
     *            Write data to an Amazon Kinesis stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withKinesis(KinesisAction kinesis) {
        this.kinesis = kinesis;
        return this;
    }

    /**
     * <p>
     * Publish to another MQTT topic.
     * </p>
     *
     * @return <p>
     *         Publish to another MQTT topic.
     *         </p>
     */
    public RepublishAction getRepublish() {
        return republish;
    }

    /**
     * <p>
     * Publish to another MQTT topic.
     * </p>
     *
     * @param republish <p>
     *            Publish to another MQTT topic.
     *            </p>
     */
    public void setRepublish(RepublishAction republish) {
        this.republish = republish;
    }

    /**
     * <p>
     * Publish to another MQTT topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param republish <p>
     *            Publish to another MQTT topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withRepublish(RepublishAction republish) {
        this.republish = republish;
        return this;
    }

    /**
     * <p>
     * Write to an Amazon S3 bucket.
     * </p>
     *
     * @return <p>
     *         Write to an Amazon S3 bucket.
     *         </p>
     */
    public S3Action getS3() {
        return s3;
    }

    /**
     * <p>
     * Write to an Amazon S3 bucket.
     * </p>
     *
     * @param s3 <p>
     *            Write to an Amazon S3 bucket.
     *            </p>
     */
    public void setS3(S3Action s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * Write to an Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3 <p>
     *            Write to an Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withS3(S3Action s3) {
        this.s3 = s3;
        return this;
    }

    /**
     * <p>
     * Write to an Amazon Kinesis Firehose stream.
     * </p>
     *
     * @return <p>
     *         Write to an Amazon Kinesis Firehose stream.
     *         </p>
     */
    public FirehoseAction getFirehose() {
        return firehose;
    }

    /**
     * <p>
     * Write to an Amazon Kinesis Firehose stream.
     * </p>
     *
     * @param firehose <p>
     *            Write to an Amazon Kinesis Firehose stream.
     *            </p>
     */
    public void setFirehose(FirehoseAction firehose) {
        this.firehose = firehose;
    }

    /**
     * <p>
     * Write to an Amazon Kinesis Firehose stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param firehose <p>
     *            Write to an Amazon Kinesis Firehose stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withFirehose(FirehoseAction firehose) {
        this.firehose = firehose;
        return this;
    }

    /**
     * <p>
     * Capture a CloudWatch metric.
     * </p>
     *
     * @return <p>
     *         Capture a CloudWatch metric.
     *         </p>
     */
    public CloudwatchMetricAction getCloudwatchMetric() {
        return cloudwatchMetric;
    }

    /**
     * <p>
     * Capture a CloudWatch metric.
     * </p>
     *
     * @param cloudwatchMetric <p>
     *            Capture a CloudWatch metric.
     *            </p>
     */
    public void setCloudwatchMetric(CloudwatchMetricAction cloudwatchMetric) {
        this.cloudwatchMetric = cloudwatchMetric;
    }

    /**
     * <p>
     * Capture a CloudWatch metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudwatchMetric <p>
     *            Capture a CloudWatch metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withCloudwatchMetric(CloudwatchMetricAction cloudwatchMetric) {
        this.cloudwatchMetric = cloudwatchMetric;
        return this;
    }

    /**
     * <p>
     * Change the state of a CloudWatch alarm.
     * </p>
     *
     * @return <p>
     *         Change the state of a CloudWatch alarm.
     *         </p>
     */
    public CloudwatchAlarmAction getCloudwatchAlarm() {
        return cloudwatchAlarm;
    }

    /**
     * <p>
     * Change the state of a CloudWatch alarm.
     * </p>
     *
     * @param cloudwatchAlarm <p>
     *            Change the state of a CloudWatch alarm.
     *            </p>
     */
    public void setCloudwatchAlarm(CloudwatchAlarmAction cloudwatchAlarm) {
        this.cloudwatchAlarm = cloudwatchAlarm;
    }

    /**
     * <p>
     * Change the state of a CloudWatch alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudwatchAlarm <p>
     *            Change the state of a CloudWatch alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withCloudwatchAlarm(CloudwatchAlarmAction cloudwatchAlarm) {
        this.cloudwatchAlarm = cloudwatchAlarm;
        return this;
    }

    /**
     * <p>
     * Send data to CloudWatch Logs.
     * </p>
     *
     * @return <p>
     *         Send data to CloudWatch Logs.
     *         </p>
     */
    public CloudwatchLogsAction getCloudwatchLogs() {
        return cloudwatchLogs;
    }

    /**
     * <p>
     * Send data to CloudWatch Logs.
     * </p>
     *
     * @param cloudwatchLogs <p>
     *            Send data to CloudWatch Logs.
     *            </p>
     */
    public void setCloudwatchLogs(CloudwatchLogsAction cloudwatchLogs) {
        this.cloudwatchLogs = cloudwatchLogs;
    }

    /**
     * <p>
     * Send data to CloudWatch Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudwatchLogs <p>
     *            Send data to CloudWatch Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withCloudwatchLogs(CloudwatchLogsAction cloudwatchLogs) {
        this.cloudwatchLogs = cloudwatchLogs;
        return this;
    }

    /**
     * <p>
     * Write data to an Amazon OpenSearch Service domain.
     * </p>
     * <note>
     * <p>
     * The <code>Elasticsearch</code> action can only be used by existing rule
     * actions. To create a new rule action or to update an existing rule
     * action, use the <code>OpenSearch</code> rule action instead. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/apireference/API_OpenSearchAction.html"
     * >OpenSearchAction</a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         Write data to an Amazon OpenSearch Service domain.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>Elasticsearch</code> action can only be used by
     *         existing rule actions. To create a new rule action or to update
     *         an existing rule action, use the <code>OpenSearch</code> rule
     *         action instead. For more information, see <a href=
     *         "https://docs.aws.amazon.com/iot/latest/apireference/API_OpenSearchAction.html"
     *         >OpenSearchAction</a>.
     *         </p>
     *         </note>
     */
    public ElasticsearchAction getElasticsearch() {
        return elasticsearch;
    }

    /**
     * <p>
     * Write data to an Amazon OpenSearch Service domain.
     * </p>
     * <note>
     * <p>
     * The <code>Elasticsearch</code> action can only be used by existing rule
     * actions. To create a new rule action or to update an existing rule
     * action, use the <code>OpenSearch</code> rule action instead. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/apireference/API_OpenSearchAction.html"
     * >OpenSearchAction</a>.
     * </p>
     * </note>
     *
     * @param elasticsearch <p>
     *            Write data to an Amazon OpenSearch Service domain.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Elasticsearch</code> action can only be used by
     *            existing rule actions. To create a new rule action or to
     *            update an existing rule action, use the
     *            <code>OpenSearch</code> rule action instead. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/apireference/API_OpenSearchAction.html"
     *            >OpenSearchAction</a>.
     *            </p>
     *            </note>
     */
    public void setElasticsearch(ElasticsearchAction elasticsearch) {
        this.elasticsearch = elasticsearch;
    }

    /**
     * <p>
     * Write data to an Amazon OpenSearch Service domain.
     * </p>
     * <note>
     * <p>
     * The <code>Elasticsearch</code> action can only be used by existing rule
     * actions. To create a new rule action or to update an existing rule
     * action, use the <code>OpenSearch</code> rule action instead. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/apireference/API_OpenSearchAction.html"
     * >OpenSearchAction</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearch <p>
     *            Write data to an Amazon OpenSearch Service domain.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Elasticsearch</code> action can only be used by
     *            existing rule actions. To create a new rule action or to
     *            update an existing rule action, use the
     *            <code>OpenSearch</code> rule action instead. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/apireference/API_OpenSearchAction.html"
     *            >OpenSearchAction</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withElasticsearch(ElasticsearchAction elasticsearch) {
        this.elasticsearch = elasticsearch;
        return this;
    }

    /**
     * <p>
     * Send a message to a Salesforce IoT Cloud Input Stream.
     * </p>
     *
     * @return <p>
     *         Send a message to a Salesforce IoT Cloud Input Stream.
     *         </p>
     */
    public SalesforceAction getSalesforce() {
        return salesforce;
    }

    /**
     * <p>
     * Send a message to a Salesforce IoT Cloud Input Stream.
     * </p>
     *
     * @param salesforce <p>
     *            Send a message to a Salesforce IoT Cloud Input Stream.
     *            </p>
     */
    public void setSalesforce(SalesforceAction salesforce) {
        this.salesforce = salesforce;
    }

    /**
     * <p>
     * Send a message to a Salesforce IoT Cloud Input Stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param salesforce <p>
     *            Send a message to a Salesforce IoT Cloud Input Stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withSalesforce(SalesforceAction salesforce) {
        this.salesforce = salesforce;
        return this;
    }

    /**
     * <p>
     * Sends message data to an IoT Analytics channel.
     * </p>
     *
     * @return <p>
     *         Sends message data to an IoT Analytics channel.
     *         </p>
     */
    public IotAnalyticsAction getIotAnalytics() {
        return iotAnalytics;
    }

    /**
     * <p>
     * Sends message data to an IoT Analytics channel.
     * </p>
     *
     * @param iotAnalytics <p>
     *            Sends message data to an IoT Analytics channel.
     *            </p>
     */
    public void setIotAnalytics(IotAnalyticsAction iotAnalytics) {
        this.iotAnalytics = iotAnalytics;
    }

    /**
     * <p>
     * Sends message data to an IoT Analytics channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iotAnalytics <p>
     *            Sends message data to an IoT Analytics channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withIotAnalytics(IotAnalyticsAction iotAnalytics) {
        this.iotAnalytics = iotAnalytics;
        return this;
    }

    /**
     * <p>
     * Sends an input to an IoT Events detector.
     * </p>
     *
     * @return <p>
     *         Sends an input to an IoT Events detector.
     *         </p>
     */
    public IotEventsAction getIotEvents() {
        return iotEvents;
    }

    /**
     * <p>
     * Sends an input to an IoT Events detector.
     * </p>
     *
     * @param iotEvents <p>
     *            Sends an input to an IoT Events detector.
     *            </p>
     */
    public void setIotEvents(IotEventsAction iotEvents) {
        this.iotEvents = iotEvents;
    }

    /**
     * <p>
     * Sends an input to an IoT Events detector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iotEvents <p>
     *            Sends an input to an IoT Events detector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withIotEvents(IotEventsAction iotEvents) {
        this.iotEvents = iotEvents;
        return this;
    }

    /**
     * <p>
     * Sends data from the MQTT message that triggered the rule to IoT SiteWise
     * asset properties.
     * </p>
     *
     * @return <p>
     *         Sends data from the MQTT message that triggered the rule to IoT
     *         SiteWise asset properties.
     *         </p>
     */
    public IotSiteWiseAction getIotSiteWise() {
        return iotSiteWise;
    }

    /**
     * <p>
     * Sends data from the MQTT message that triggered the rule to IoT SiteWise
     * asset properties.
     * </p>
     *
     * @param iotSiteWise <p>
     *            Sends data from the MQTT message that triggered the rule to
     *            IoT SiteWise asset properties.
     *            </p>
     */
    public void setIotSiteWise(IotSiteWiseAction iotSiteWise) {
        this.iotSiteWise = iotSiteWise;
    }

    /**
     * <p>
     * Sends data from the MQTT message that triggered the rule to IoT SiteWise
     * asset properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iotSiteWise <p>
     *            Sends data from the MQTT message that triggered the rule to
     *            IoT SiteWise asset properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withIotSiteWise(IotSiteWiseAction iotSiteWise) {
        this.iotSiteWise = iotSiteWise;
        return this;
    }

    /**
     * <p>
     * Starts execution of a Step Functions state machine.
     * </p>
     *
     * @return <p>
     *         Starts execution of a Step Functions state machine.
     *         </p>
     */
    public StepFunctionsAction getStepFunctions() {
        return stepFunctions;
    }

    /**
     * <p>
     * Starts execution of a Step Functions state machine.
     * </p>
     *
     * @param stepFunctions <p>
     *            Starts execution of a Step Functions state machine.
     *            </p>
     */
    public void setStepFunctions(StepFunctionsAction stepFunctions) {
        this.stepFunctions = stepFunctions;
    }

    /**
     * <p>
     * Starts execution of a Step Functions state machine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepFunctions <p>
     *            Starts execution of a Step Functions state machine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withStepFunctions(StepFunctionsAction stepFunctions) {
        this.stepFunctions = stepFunctions;
        return this;
    }

    /**
     * <p>
     * The Timestream rule action writes attributes (measures) from an MQTT
     * message into an Amazon Timestream table. For more information, see the <a
     * href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/timestream-rule-action.html"
     * >Timestream</a> topic rule action documentation.
     * </p>
     *
     * @return <p>
     *         The Timestream rule action writes attributes (measures) from an
     *         MQTT message into an Amazon Timestream table. For more
     *         information, see the <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/timestream-rule-action.html"
     *         >Timestream</a> topic rule action documentation.
     *         </p>
     */
    public TimestreamAction getTimestream() {
        return timestream;
    }

    /**
     * <p>
     * The Timestream rule action writes attributes (measures) from an MQTT
     * message into an Amazon Timestream table. For more information, see the <a
     * href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/timestream-rule-action.html"
     * >Timestream</a> topic rule action documentation.
     * </p>
     *
     * @param timestream <p>
     *            The Timestream rule action writes attributes (measures) from
     *            an MQTT message into an Amazon Timestream table. For more
     *            information, see the <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/timestream-rule-action.html"
     *            >Timestream</a> topic rule action documentation.
     *            </p>
     */
    public void setTimestream(TimestreamAction timestream) {
        this.timestream = timestream;
    }

    /**
     * <p>
     * The Timestream rule action writes attributes (measures) from an MQTT
     * message into an Amazon Timestream table. For more information, see the <a
     * href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/timestream-rule-action.html"
     * >Timestream</a> topic rule action documentation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestream <p>
     *            The Timestream rule action writes attributes (measures) from
     *            an MQTT message into an Amazon Timestream table. For more
     *            information, see the <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/timestream-rule-action.html"
     *            >Timestream</a> topic rule action documentation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withTimestream(TimestreamAction timestream) {
        this.timestream = timestream;
        return this;
    }

    /**
     * <p>
     * Send data to an HTTPS endpoint.
     * </p>
     *
     * @return <p>
     *         Send data to an HTTPS endpoint.
     *         </p>
     */
    public HttpAction getHttp() {
        return http;
    }

    /**
     * <p>
     * Send data to an HTTPS endpoint.
     * </p>
     *
     * @param http <p>
     *            Send data to an HTTPS endpoint.
     *            </p>
     */
    public void setHttp(HttpAction http) {
        this.http = http;
    }

    /**
     * <p>
     * Send data to an HTTPS endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param http <p>
     *            Send data to an HTTPS endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withHttp(HttpAction http) {
        this.http = http;
        return this;
    }

    /**
     * <p>
     * Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon
     * MSK) or self-managed Apache Kafka cluster.
     * </p>
     *
     * @return <p>
     *         Send messages to an Amazon Managed Streaming for Apache Kafka
     *         (Amazon MSK) or self-managed Apache Kafka cluster.
     *         </p>
     */
    public KafkaAction getKafka() {
        return kafka;
    }

    /**
     * <p>
     * Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon
     * MSK) or self-managed Apache Kafka cluster.
     * </p>
     *
     * @param kafka <p>
     *            Send messages to an Amazon Managed Streaming for Apache Kafka
     *            (Amazon MSK) or self-managed Apache Kafka cluster.
     *            </p>
     */
    public void setKafka(KafkaAction kafka) {
        this.kafka = kafka;
    }

    /**
     * <p>
     * Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon
     * MSK) or self-managed Apache Kafka cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kafka <p>
     *            Send messages to an Amazon Managed Streaming for Apache Kafka
     *            (Amazon MSK) or self-managed Apache Kafka cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withKafka(KafkaAction kafka) {
        this.kafka = kafka;
        return this;
    }

    /**
     * <p>
     * Write data to an Amazon OpenSearch Service domain.
     * </p>
     *
     * @return <p>
     *         Write data to an Amazon OpenSearch Service domain.
     *         </p>
     */
    public OpenSearchAction getOpenSearch() {
        return openSearch;
    }

    /**
     * <p>
     * Write data to an Amazon OpenSearch Service domain.
     * </p>
     *
     * @param openSearch <p>
     *            Write data to an Amazon OpenSearch Service domain.
     *            </p>
     */
    public void setOpenSearch(OpenSearchAction openSearch) {
        this.openSearch = openSearch;
    }

    /**
     * <p>
     * Write data to an Amazon OpenSearch Service domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param openSearch <p>
     *            Write data to an Amazon OpenSearch Service domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withOpenSearch(OpenSearchAction openSearch) {
        this.openSearch = openSearch;
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
        if (getDynamoDB() != null)
            sb.append("dynamoDB: " + getDynamoDB() + ",");
        if (getDynamoDBv2() != null)
            sb.append("dynamoDBv2: " + getDynamoDBv2() + ",");
        if (getLambda() != null)
            sb.append("lambda: " + getLambda() + ",");
        if (getSns() != null)
            sb.append("sns: " + getSns() + ",");
        if (getSqs() != null)
            sb.append("sqs: " + getSqs() + ",");
        if (getKinesis() != null)
            sb.append("kinesis: " + getKinesis() + ",");
        if (getRepublish() != null)
            sb.append("republish: " + getRepublish() + ",");
        if (getS3() != null)
            sb.append("s3: " + getS3() + ",");
        if (getFirehose() != null)
            sb.append("firehose: " + getFirehose() + ",");
        if (getCloudwatchMetric() != null)
            sb.append("cloudwatchMetric: " + getCloudwatchMetric() + ",");
        if (getCloudwatchAlarm() != null)
            sb.append("cloudwatchAlarm: " + getCloudwatchAlarm() + ",");
        if (getCloudwatchLogs() != null)
            sb.append("cloudwatchLogs: " + getCloudwatchLogs() + ",");
        if (getElasticsearch() != null)
            sb.append("elasticsearch: " + getElasticsearch() + ",");
        if (getSalesforce() != null)
            sb.append("salesforce: " + getSalesforce() + ",");
        if (getIotAnalytics() != null)
            sb.append("iotAnalytics: " + getIotAnalytics() + ",");
        if (getIotEvents() != null)
            sb.append("iotEvents: " + getIotEvents() + ",");
        if (getIotSiteWise() != null)
            sb.append("iotSiteWise: " + getIotSiteWise() + ",");
        if (getStepFunctions() != null)
            sb.append("stepFunctions: " + getStepFunctions() + ",");
        if (getTimestream() != null)
            sb.append("timestream: " + getTimestream() + ",");
        if (getHttp() != null)
            sb.append("http: " + getHttp() + ",");
        if (getKafka() != null)
            sb.append("kafka: " + getKafka() + ",");
        if (getOpenSearch() != null)
            sb.append("openSearch: " + getOpenSearch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDynamoDB() == null) ? 0 : getDynamoDB().hashCode());
        hashCode = prime * hashCode + ((getDynamoDBv2() == null) ? 0 : getDynamoDBv2().hashCode());
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        hashCode = prime * hashCode + ((getSns() == null) ? 0 : getSns().hashCode());
        hashCode = prime * hashCode + ((getSqs() == null) ? 0 : getSqs().hashCode());
        hashCode = prime * hashCode + ((getKinesis() == null) ? 0 : getKinesis().hashCode());
        hashCode = prime * hashCode + ((getRepublish() == null) ? 0 : getRepublish().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getFirehose() == null) ? 0 : getFirehose().hashCode());
        hashCode = prime * hashCode
                + ((getCloudwatchMetric() == null) ? 0 : getCloudwatchMetric().hashCode());
        hashCode = prime * hashCode
                + ((getCloudwatchAlarm() == null) ? 0 : getCloudwatchAlarm().hashCode());
        hashCode = prime * hashCode
                + ((getCloudwatchLogs() == null) ? 0 : getCloudwatchLogs().hashCode());
        hashCode = prime * hashCode
                + ((getElasticsearch() == null) ? 0 : getElasticsearch().hashCode());
        hashCode = prime * hashCode + ((getSalesforce() == null) ? 0 : getSalesforce().hashCode());
        hashCode = prime * hashCode
                + ((getIotAnalytics() == null) ? 0 : getIotAnalytics().hashCode());
        hashCode = prime * hashCode + ((getIotEvents() == null) ? 0 : getIotEvents().hashCode());
        hashCode = prime * hashCode
                + ((getIotSiteWise() == null) ? 0 : getIotSiteWise().hashCode());
        hashCode = prime * hashCode
                + ((getStepFunctions() == null) ? 0 : getStepFunctions().hashCode());
        hashCode = prime * hashCode + ((getTimestream() == null) ? 0 : getTimestream().hashCode());
        hashCode = prime * hashCode + ((getHttp() == null) ? 0 : getHttp().hashCode());
        hashCode = prime * hashCode + ((getKafka() == null) ? 0 : getKafka().hashCode());
        hashCode = prime * hashCode + ((getOpenSearch() == null) ? 0 : getOpenSearch().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;

        if (other.getDynamoDB() == null ^ this.getDynamoDB() == null)
            return false;
        if (other.getDynamoDB() != null && other.getDynamoDB().equals(this.getDynamoDB()) == false)
            return false;
        if (other.getDynamoDBv2() == null ^ this.getDynamoDBv2() == null)
            return false;
        if (other.getDynamoDBv2() != null
                && other.getDynamoDBv2().equals(this.getDynamoDBv2()) == false)
            return false;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        if (other.getSns() == null ^ this.getSns() == null)
            return false;
        if (other.getSns() != null && other.getSns().equals(this.getSns()) == false)
            return false;
        if (other.getSqs() == null ^ this.getSqs() == null)
            return false;
        if (other.getSqs() != null && other.getSqs().equals(this.getSqs()) == false)
            return false;
        if (other.getKinesis() == null ^ this.getKinesis() == null)
            return false;
        if (other.getKinesis() != null && other.getKinesis().equals(this.getKinesis()) == false)
            return false;
        if (other.getRepublish() == null ^ this.getRepublish() == null)
            return false;
        if (other.getRepublish() != null
                && other.getRepublish().equals(this.getRepublish()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        if (other.getFirehose() == null ^ this.getFirehose() == null)
            return false;
        if (other.getFirehose() != null && other.getFirehose().equals(this.getFirehose()) == false)
            return false;
        if (other.getCloudwatchMetric() == null ^ this.getCloudwatchMetric() == null)
            return false;
        if (other.getCloudwatchMetric() != null
                && other.getCloudwatchMetric().equals(this.getCloudwatchMetric()) == false)
            return false;
        if (other.getCloudwatchAlarm() == null ^ this.getCloudwatchAlarm() == null)
            return false;
        if (other.getCloudwatchAlarm() != null
                && other.getCloudwatchAlarm().equals(this.getCloudwatchAlarm()) == false)
            return false;
        if (other.getCloudwatchLogs() == null ^ this.getCloudwatchLogs() == null)
            return false;
        if (other.getCloudwatchLogs() != null
                && other.getCloudwatchLogs().equals(this.getCloudwatchLogs()) == false)
            return false;
        if (other.getElasticsearch() == null ^ this.getElasticsearch() == null)
            return false;
        if (other.getElasticsearch() != null
                && other.getElasticsearch().equals(this.getElasticsearch()) == false)
            return false;
        if (other.getSalesforce() == null ^ this.getSalesforce() == null)
            return false;
        if (other.getSalesforce() != null
                && other.getSalesforce().equals(this.getSalesforce()) == false)
            return false;
        if (other.getIotAnalytics() == null ^ this.getIotAnalytics() == null)
            return false;
        if (other.getIotAnalytics() != null
                && other.getIotAnalytics().equals(this.getIotAnalytics()) == false)
            return false;
        if (other.getIotEvents() == null ^ this.getIotEvents() == null)
            return false;
        if (other.getIotEvents() != null
                && other.getIotEvents().equals(this.getIotEvents()) == false)
            return false;
        if (other.getIotSiteWise() == null ^ this.getIotSiteWise() == null)
            return false;
        if (other.getIotSiteWise() != null
                && other.getIotSiteWise().equals(this.getIotSiteWise()) == false)
            return false;
        if (other.getStepFunctions() == null ^ this.getStepFunctions() == null)
            return false;
        if (other.getStepFunctions() != null
                && other.getStepFunctions().equals(this.getStepFunctions()) == false)
            return false;
        if (other.getTimestream() == null ^ this.getTimestream() == null)
            return false;
        if (other.getTimestream() != null
                && other.getTimestream().equals(this.getTimestream()) == false)
            return false;
        if (other.getHttp() == null ^ this.getHttp() == null)
            return false;
        if (other.getHttp() != null && other.getHttp().equals(this.getHttp()) == false)
            return false;
        if (other.getKafka() == null ^ this.getKafka() == null)
            return false;
        if (other.getKafka() != null && other.getKafka().equals(this.getKafka()) == false)
            return false;
        if (other.getOpenSearch() == null ^ this.getOpenSearch() == null)
            return false;
        if (other.getOpenSearch() != null
                && other.getOpenSearch().equals(this.getOpenSearch()) == false)
            return false;
        return true;
    }
}
