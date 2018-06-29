/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for list operation.
 */
public class ClustersListOptions {
    /**
     * An OData $filter clause.. Used to filter results that are returned in
     * the GET respnose.
     */
    @JsonProperty(value = "")
    private String filter;

    /**
     * An OData $select clause. Used to select the properties to be returned in
     * the GET respnose.
     */
    @JsonProperty(value = "")
    private String select;

    /**
     * The maximum number of items to return in the response. A maximum of 1000
     * files can be returned.
     */
    @JsonProperty(value = "")
    private Integer maxResults;

    /**
     * Get an OData $filter clause.. Used to filter results that are returned in the GET respnose.
     *
     * @return the filter value
     */
    public String filter() {
        return this.filter;
    }

    /**
     * Set an OData $filter clause.. Used to filter results that are returned in the GET respnose.
     *
     * @param filter the filter value to set
     * @return the ClustersListOptions object itself.
     */
    public ClustersListOptions withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get an OData $select clause. Used to select the properties to be returned in the GET respnose.
     *
     * @return the select value
     */
    public String select() {
        return this.select;
    }

    /**
     * Set an OData $select clause. Used to select the properties to be returned in the GET respnose.
     *
     * @param select the select value to set
     * @return the ClustersListOptions object itself.
     */
    public ClustersListOptions withSelect(String select) {
        this.select = select;
        return this;
    }

    /**
     * Get the maximum number of items to return in the response. A maximum of 1000 files can be returned.
     *
     * @return the maxResults value
     */
    public Integer maxResults() {
        return this.maxResults;
    }

    /**
     * Set the maximum number of items to return in the response. A maximum of 1000 files can be returned.
     *
     * @param maxResults the maxResults value to set
     * @return the ClustersListOptions object itself.
     */
    public ClustersListOptions withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

}
