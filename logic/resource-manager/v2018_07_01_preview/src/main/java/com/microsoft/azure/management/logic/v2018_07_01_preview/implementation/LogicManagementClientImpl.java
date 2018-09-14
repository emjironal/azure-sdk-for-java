/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the LogicManagementClientImpl class.
 */
public class LogicManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription id. */
    private String subscriptionId;

    /**
     * Gets The subscription id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription id.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public LogicManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The API version. */
    private String apiVersion;

    /**
     * Gets The API version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public LogicManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public LogicManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public LogicManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The WorkflowsInner object to access its operations.
     */
    private WorkflowsInner workflows;

    /**
     * Gets the WorkflowsInner object to access its operations.
     * @return the WorkflowsInner object.
     */
    public WorkflowsInner workflows() {
        return this.workflows;
    }

    /**
     * The WorkflowVersionsInner object to access its operations.
     */
    private WorkflowVersionsInner workflowVersions;

    /**
     * Gets the WorkflowVersionsInner object to access its operations.
     * @return the WorkflowVersionsInner object.
     */
    public WorkflowVersionsInner workflowVersions() {
        return this.workflowVersions;
    }

    /**
     * The WorkflowTriggersInner object to access its operations.
     */
    private WorkflowTriggersInner workflowTriggers;

    /**
     * Gets the WorkflowTriggersInner object to access its operations.
     * @return the WorkflowTriggersInner object.
     */
    public WorkflowTriggersInner workflowTriggers() {
        return this.workflowTriggers;
    }

    /**
     * The WorkflowVersionTriggersInner object to access its operations.
     */
    private WorkflowVersionTriggersInner workflowVersionTriggers;

    /**
     * Gets the WorkflowVersionTriggersInner object to access its operations.
     * @return the WorkflowVersionTriggersInner object.
     */
    public WorkflowVersionTriggersInner workflowVersionTriggers() {
        return this.workflowVersionTriggers;
    }

    /**
     * The WorkflowTriggerHistoriesInner object to access its operations.
     */
    private WorkflowTriggerHistoriesInner workflowTriggerHistories;

    /**
     * Gets the WorkflowTriggerHistoriesInner object to access its operations.
     * @return the WorkflowTriggerHistoriesInner object.
     */
    public WorkflowTriggerHistoriesInner workflowTriggerHistories() {
        return this.workflowTriggerHistories;
    }

    /**
     * The WorkflowRunsInner object to access its operations.
     */
    private WorkflowRunsInner workflowRuns;

    /**
     * Gets the WorkflowRunsInner object to access its operations.
     * @return the WorkflowRunsInner object.
     */
    public WorkflowRunsInner workflowRuns() {
        return this.workflowRuns;
    }

    /**
     * The WorkflowRunActionsInner object to access its operations.
     */
    private WorkflowRunActionsInner workflowRunActions;

    /**
     * Gets the WorkflowRunActionsInner object to access its operations.
     * @return the WorkflowRunActionsInner object.
     */
    public WorkflowRunActionsInner workflowRunActions() {
        return this.workflowRunActions;
    }

    /**
     * The WorkflowRunActionRepetitionsInner object to access its operations.
     */
    private WorkflowRunActionRepetitionsInner workflowRunActionRepetitions;

    /**
     * Gets the WorkflowRunActionRepetitionsInner object to access its operations.
     * @return the WorkflowRunActionRepetitionsInner object.
     */
    public WorkflowRunActionRepetitionsInner workflowRunActionRepetitions() {
        return this.workflowRunActionRepetitions;
    }

    /**
     * The WorkflowRunActionScopeRepetitionsInner object to access its operations.
     */
    private WorkflowRunActionScopeRepetitionsInner workflowRunActionScopeRepetitions;

    /**
     * Gets the WorkflowRunActionScopeRepetitionsInner object to access its operations.
     * @return the WorkflowRunActionScopeRepetitionsInner object.
     */
    public WorkflowRunActionScopeRepetitionsInner workflowRunActionScopeRepetitions() {
        return this.workflowRunActionScopeRepetitions;
    }

    /**
     * The WorkflowRunOperationsInner object to access its operations.
     */
    private WorkflowRunOperationsInner workflowRunOperations;

    /**
     * Gets the WorkflowRunOperationsInner object to access its operations.
     * @return the WorkflowRunOperationsInner object.
     */
    public WorkflowRunOperationsInner workflowRunOperations() {
        return this.workflowRunOperations;
    }

    /**
     * The IntegrationAccountsInner object to access its operations.
     */
    private IntegrationAccountsInner integrationAccounts;

    /**
     * Gets the IntegrationAccountsInner object to access its operations.
     * @return the IntegrationAccountsInner object.
     */
    public IntegrationAccountsInner integrationAccounts() {
        return this.integrationAccounts;
    }

    /**
     * The IntegrationAccountAssembliesInner object to access its operations.
     */
    private IntegrationAccountAssembliesInner integrationAccountAssemblies;

    /**
     * Gets the IntegrationAccountAssembliesInner object to access its operations.
     * @return the IntegrationAccountAssembliesInner object.
     */
    public IntegrationAccountAssembliesInner integrationAccountAssemblies() {
        return this.integrationAccountAssemblies;
    }

    /**
     * The IntegrationAccountBatchConfigurationsInner object to access its operations.
     */
    private IntegrationAccountBatchConfigurationsInner integrationAccountBatchConfigurations;

    /**
     * Gets the IntegrationAccountBatchConfigurationsInner object to access its operations.
     * @return the IntegrationAccountBatchConfigurationsInner object.
     */
    public IntegrationAccountBatchConfigurationsInner integrationAccountBatchConfigurations() {
        return this.integrationAccountBatchConfigurations;
    }

    /**
     * The IntegrationAccountSchemasInner object to access its operations.
     */
    private IntegrationAccountSchemasInner integrationAccountSchemas;

    /**
     * Gets the IntegrationAccountSchemasInner object to access its operations.
     * @return the IntegrationAccountSchemasInner object.
     */
    public IntegrationAccountSchemasInner integrationAccountSchemas() {
        return this.integrationAccountSchemas;
    }

    /**
     * The IntegrationAccountMapsInner object to access its operations.
     */
    private IntegrationAccountMapsInner integrationAccountMaps;

    /**
     * Gets the IntegrationAccountMapsInner object to access its operations.
     * @return the IntegrationAccountMapsInner object.
     */
    public IntegrationAccountMapsInner integrationAccountMaps() {
        return this.integrationAccountMaps;
    }

    /**
     * The IntegrationAccountPartnersInner object to access its operations.
     */
    private IntegrationAccountPartnersInner integrationAccountPartners;

    /**
     * Gets the IntegrationAccountPartnersInner object to access its operations.
     * @return the IntegrationAccountPartnersInner object.
     */
    public IntegrationAccountPartnersInner integrationAccountPartners() {
        return this.integrationAccountPartners;
    }

    /**
     * The IntegrationAccountAgreementsInner object to access its operations.
     */
    private IntegrationAccountAgreementsInner integrationAccountAgreements;

    /**
     * Gets the IntegrationAccountAgreementsInner object to access its operations.
     * @return the IntegrationAccountAgreementsInner object.
     */
    public IntegrationAccountAgreementsInner integrationAccountAgreements() {
        return this.integrationAccountAgreements;
    }

    /**
     * The IntegrationAccountCertificatesInner object to access its operations.
     */
    private IntegrationAccountCertificatesInner integrationAccountCertificates;

    /**
     * Gets the IntegrationAccountCertificatesInner object to access its operations.
     * @return the IntegrationAccountCertificatesInner object.
     */
    public IntegrationAccountCertificatesInner integrationAccountCertificates() {
        return this.integrationAccountCertificates;
    }

    /**
     * The IntegrationAccountSessionsInner object to access its operations.
     */
    private IntegrationAccountSessionsInner integrationAccountSessions;

    /**
     * Gets the IntegrationAccountSessionsInner object to access its operations.
     * @return the IntegrationAccountSessionsInner object.
     */
    public IntegrationAccountSessionsInner integrationAccountSessions() {
        return this.integrationAccountSessions;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * Initializes an instance of LogicManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public LogicManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of LogicManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public LogicManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of LogicManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public LogicManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2018-07-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.workflows = new WorkflowsInner(restClient().retrofit(), this);
        this.workflowVersions = new WorkflowVersionsInner(restClient().retrofit(), this);
        this.workflowTriggers = new WorkflowTriggersInner(restClient().retrofit(), this);
        this.workflowVersionTriggers = new WorkflowVersionTriggersInner(restClient().retrofit(), this);
        this.workflowTriggerHistories = new WorkflowTriggerHistoriesInner(restClient().retrofit(), this);
        this.workflowRuns = new WorkflowRunsInner(restClient().retrofit(), this);
        this.workflowRunActions = new WorkflowRunActionsInner(restClient().retrofit(), this);
        this.workflowRunActionRepetitions = new WorkflowRunActionRepetitionsInner(restClient().retrofit(), this);
        this.workflowRunActionScopeRepetitions = new WorkflowRunActionScopeRepetitionsInner(restClient().retrofit(), this);
        this.workflowRunOperations = new WorkflowRunOperationsInner(restClient().retrofit(), this);
        this.integrationAccounts = new IntegrationAccountsInner(restClient().retrofit(), this);
        this.integrationAccountAssemblies = new IntegrationAccountAssembliesInner(restClient().retrofit(), this);
        this.integrationAccountBatchConfigurations = new IntegrationAccountBatchConfigurationsInner(restClient().retrofit(), this);
        this.integrationAccountSchemas = new IntegrationAccountSchemasInner(restClient().retrofit(), this);
        this.integrationAccountMaps = new IntegrationAccountMapsInner(restClient().retrofit(), this);
        this.integrationAccountPartners = new IntegrationAccountPartnersInner(restClient().retrofit(), this);
        this.integrationAccountAgreements = new IntegrationAccountAgreementsInner(restClient().retrofit(), this);
        this.integrationAccountCertificates = new IntegrationAccountCertificatesInner(restClient().retrofit(), this);
        this.integrationAccountSessions = new IntegrationAccountSessionsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "LogicManagementClient", "2018-07-01-preview");
    }
}