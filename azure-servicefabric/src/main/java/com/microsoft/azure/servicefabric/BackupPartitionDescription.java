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
 * Describes the parameters for triggering partition's backup.
 */
public class BackupPartitionDescription {
    /**
     * Specifies the details of the backup storage where to save the backup.
     */
    @JsonProperty(value = "BackupStorage")
    private BackupStorageDescription backupStorage;

    /**
     * Get specifies the details of the backup storage where to save the backup.
     *
     * @return the backupStorage value
     */
    public BackupStorageDescription backupStorage() {
        return this.backupStorage;
    }

    /**
     * Set specifies the details of the backup storage where to save the backup.
     *
     * @param backupStorage the backupStorage value to set
     * @return the BackupPartitionDescription object itself.
     */
    public BackupPartitionDescription withBackupStorage(BackupStorageDescription backupStorage) {
        this.backupStorage = backupStorage;
        return this;
    }

}