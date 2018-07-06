/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_05_31_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2018_05_31_preview.implementation.EligibleOffersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing EligibleOffers.
 */
public interface EligibleOffers extends HasInner<EligibleOffersInner> {
    /**
     * Lists all eligible offers for specified billing account id.
     *
     * @param billingAccountId billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EligibleOfferListResult> listByBillingAccountIdAsync(String billingAccountId);

    /**
     * Get the eligible offer by id.
     *
     * @param billingAccountId billing Account Id.
     * @param eligibleOfferId Eligible Offer Id.
     * @param projectId Project Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EligibleOffer> getByIdAsync(String billingAccountId, String eligibleOfferId, String projectId);

}