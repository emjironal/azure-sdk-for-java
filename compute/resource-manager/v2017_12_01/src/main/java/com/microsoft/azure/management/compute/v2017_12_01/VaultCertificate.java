/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a single certificate reference in a Key Vault, and where the
 * certificate should reside on the VM.
 */
public class VaultCertificate {
    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as
     * a secret. For adding a secret to the Key Vault, see [Add a key or secret
     * to the key
     * vault](https://docs.microsoft.com/azure/key-vault/key-vault-get-started/#add).
     * In this case, your certificate needs to be It is the Base64 encoding of
     * the following JSON Object which is encoded in UTF-8:
     * &lt;br&gt;&lt;br&gt; {&lt;br&gt;
     * "data":"&lt;Base64-encoded-certificate&gt;",&lt;br&gt;
     * "dataType":"pfx",&lt;br&gt;
     * "password":"&lt;pfx-file-password&gt;"&lt;br&gt;}.
     */
    @JsonProperty(value = "certificateUrl")
    private String certificateUrl;

    /**
     * For Windows VMs, specifies the certificate store on the Virtual Machine
     * to which the certificate should be added. The specified certificate
     * store is implicitly in the LocalMachine account. &lt;br&gt;&lt;br&gt;For
     * Linux VMs, the certificate file is placed under the /var/lib/waagent
     * directory, with the file name &lt;UppercaseThumbprint&gt;.crt for the
     * X509 certificate file and &lt;UppercaseThumbpring&gt;.prv for private
     * key. Both of these files are .pem formatted.
     */
    @JsonProperty(value = "certificateStore")
    private String certificateStore;

    /**
     * Get the certificateUrl value.
     *
     * @return the certificateUrl value
     */
    public String certificateUrl() {
        return this.certificateUrl;
    }

    /**
     * Set the certificateUrl value.
     *
     * @param certificateUrl the certificateUrl value to set
     * @return the VaultCertificate object itself.
     */
    public VaultCertificate withCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }

    /**
     * Get the certificateStore value.
     *
     * @return the certificateStore value
     */
    public String certificateStore() {
        return this.certificateStore;
    }

    /**
     * Set the certificateStore value.
     *
     * @param certificateStore the certificateStore value to set
     * @return the VaultCertificate object itself.
     */
    public VaultCertificate withCertificateStore(String certificateStore) {
        this.certificateStore = certificateStore;
        return this;
    }

}
