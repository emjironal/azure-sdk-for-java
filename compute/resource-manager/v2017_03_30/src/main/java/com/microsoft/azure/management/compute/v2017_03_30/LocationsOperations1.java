/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.microsoft.azure.management.compute.v2017_03_30.implementation.UsagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LocationsOperations1.
 */
public interface LocationsOperations1 extends HasInner<UsagesInner> {

    /**
     * @return Entry point to manage Location Usage.
     */
    Usages usages();
}
