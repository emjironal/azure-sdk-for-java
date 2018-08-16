/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about which portion of the file to upload.
 */
public class UploadChunkRange {
    /**
     * The start position of the portion of the file. It's represented by the
     * number of bytes.
     */
    @JsonProperty(value = "StartPosition")
    private String startPosition;

    /**
     * The end position of the portion of the file. It's represented by the
     * number of bytes.
     */
    @JsonProperty(value = "EndPosition")
    private String endPosition;

    /**
     * Get the start position of the portion of the file. It's represented by the number of bytes.
     *
     * @return the startPosition value
     */
    public String startPosition() {
        return this.startPosition;
    }

    /**
     * Set the start position of the portion of the file. It's represented by the number of bytes.
     *
     * @param startPosition the startPosition value to set
     * @return the UploadChunkRange object itself.
     */
    public UploadChunkRange withStartPosition(String startPosition) {
        this.startPosition = startPosition;
        return this;
    }

    /**
     * Get the end position of the portion of the file. It's represented by the number of bytes.
     *
     * @return the endPosition value
     */
    public String endPosition() {
        return this.endPosition;
    }

    /**
     * Set the end position of the portion of the file. It's represented by the number of bytes.
     *
     * @param endPosition the endPosition value to set
     * @return the UploadChunkRange object itself.
     */
    public UploadChunkRange withEndPosition(String endPosition) {
        this.endPosition = endPosition;
        return this;
    }

}