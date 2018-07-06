/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_05_31_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Current entity level details.
 */
public class Enrollment {
    /**
     * Enrollment Start Date.
     */
    @JsonProperty(value = "startDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startDate;

    /**
     * Enrollment End Date.
     */
    @JsonProperty(value = "endDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endDate;

    /**
     * The currency associated with enrollment.
     */
    @JsonProperty(value = "currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /**
     * The channel for Enrollment.
     */
    @JsonProperty(value = "channel", access = JsonProperty.Access.WRITE_ONLY)
    private String channel;

    /**
     * The attributes associated with legacy enrollment.
     */
    @JsonProperty(value = "policies", access = JsonProperty.Access.WRITE_ONLY)
    private EnrollmentPolicies policies;

    /**
     * The language for Enrollment.
     */
    @JsonProperty(value = "language", access = JsonProperty.Access.WRITE_ONLY)
    private String language;

    /**
     * The countryCode for Enrollment.
     */
    @JsonProperty(value = "countryCode", access = JsonProperty.Access.WRITE_ONLY)
    private String countryCode;

    /**
     * Enrollment status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Enrollment billing cycle.
     */
    @JsonProperty(value = "billingCylce", access = JsonProperty.Access.WRITE_ONLY)
    private String billingCylce;

    /**
     * Get enrollment Start Date.
     *
     * @return the startDate value
     */
    public DateTime startDate() {
        return this.startDate;
    }

    /**
     * Get enrollment End Date.
     *
     * @return the endDate value
     */
    public DateTime endDate() {
        return this.endDate;
    }

    /**
     * Get the currency associated with enrollment.
     *
     * @return the currency value
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the channel for Enrollment.
     *
     * @return the channel value
     */
    public String channel() {
        return this.channel;
    }

    /**
     * Get the attributes associated with legacy enrollment.
     *
     * @return the policies value
     */
    public EnrollmentPolicies policies() {
        return this.policies;
    }

    /**
     * Get the language for Enrollment.
     *
     * @return the language value
     */
    public String language() {
        return this.language;
    }

    /**
     * Get the countryCode for Enrollment.
     *
     * @return the countryCode value
     */
    public String countryCode() {
        return this.countryCode;
    }

    /**
     * Get enrollment status.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get enrollment billing cycle.
     *
     * @return the billingCylce value
     */
    public String billingCylce() {
        return this.billingCylce;
    }

}