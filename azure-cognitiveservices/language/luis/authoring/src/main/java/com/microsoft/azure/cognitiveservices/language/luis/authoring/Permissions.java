/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring;

import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.AddPermissionsOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.DeletePermissionsOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.UpdatePermissionsOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.OperationStatus;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.UserAccessList;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Permissions.
 */
public interface Permissions {

    /**
     * Gets the list of user emails that have permissions to access your application.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UserAccessList object if successful.
     */
    UserAccessList list(UUID appId);

    /**
     * Gets the list of user emails that have permissions to access your application.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UserAccessList object
     */
    Observable<UserAccessList> listAsync(UUID appId);


    /**
     * Adds a user to the allowed list of users to access this LUIS application. Users are added using their email
     *   address.
     *
     * @param appId The application ID.
     * @param addOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    OperationStatus add(UUID appId, AddPermissionsOptionalParameter addOptionalParameter);

    /**
     * Adds a user to the allowed list of users to access this LUIS application. Users are added using their email
     *   address.
     *
     * @param appId The application ID.
     * @param addOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    Observable<OperationStatus> addAsync(UUID appId, AddPermissionsOptionalParameter addOptionalParameter);

    /**
     * Removes a user from the allowed list of users to access this LUIS application. Users are removed using their
     *   email address.
     *
     * @param appId The application ID.
     * @param deleteOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    OperationStatus delete(UUID appId, DeletePermissionsOptionalParameter deleteOptionalParameter);

    /**
     * Removes a user from the allowed list of users to access this LUIS application. Users are removed using their
     *   email address.
     *
     * @param appId The application ID.
     * @param deleteOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    Observable<OperationStatus> deleteAsync(UUID appId, DeletePermissionsOptionalParameter deleteOptionalParameter);

    /**
     * Replaces the current users access list with the one sent in the body. If an empty list is sent, all access
     *   to other users will be removed.
     *
     * @param appId The application ID.
     * @param updateOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    OperationStatus update(UUID appId, UpdatePermissionsOptionalParameter updateOptionalParameter);

    /**
     * Replaces the current users access list with the one sent in the body. If an empty list is sent, all access
     *   to other users will be removed.
     *
     * @param appId The application ID.
     * @param updateOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    Observable<OperationStatus> updateAsync(UUID appId, UpdatePermissionsOptionalParameter updateOptionalParameter);

}