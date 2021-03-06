/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2016_12_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The policy assignment.
 */
@JsonFlatten
public class PolicyAssignmentInner extends ProxyResource {
    /**
     * The display name of the policy assignment.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * The ID of the policy definition.
     */
    @JsonProperty(value = "properties.policyDefinitionId")
    private String policyDefinitionId;

    /**
     * The scope for the policy assignment.
     */
    @JsonProperty(value = "properties.scope")
    private String scopeProperty;

    /**
     * Required if a parameter is used in policy rule.
     */
    @JsonProperty(value = "properties.parameters")
    private Object parameters;

    /**
     * This message will be part of response in case of policy violation.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Get the display name of the policy assignment.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the policy assignment.
     *
     * @param displayName the displayName value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the ID of the policy definition.
     *
     * @return the policyDefinitionId value
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Set the ID of the policy definition.
     *
     * @param policyDefinitionId the policyDefinitionId value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * Get the scope for the policy assignment.
     *
     * @return the scopeProperty value
     */
    public String scopeProperty() {
        return this.scopeProperty;
    }

    /**
     * Set the scope for the policy assignment.
     *
     * @param scopeProperty the scopeProperty value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withScopeProperty(String scopeProperty) {
        this.scopeProperty = scopeProperty;
        return this;
    }

    /**
     * Get required if a parameter is used in policy rule.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set required if a parameter is used in policy rule.
     *
     * @param parameters the parameters value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get this message will be part of response in case of policy violation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set this message will be part of response in case of policy violation.
     *
     * @param description the description value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withDescription(String description) {
        this.description = description;
        return this;
    }

}
