/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.dataplane.monitor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SystemReflectionCustomAttributeData model.
 */
public class SystemReflectionCustomAttributeData {
    /**
     * The attributeType property.
     */
    @JsonProperty(value = "AttributeType")
    private SystemType attributeType;

    /**
     * The constructor property.
     */
    @JsonProperty(value = "Constructor")
    private SystemReflectionConstructorInfo constructor;

    /**
     * The constructorArguments property.
     */
    @JsonProperty(value = "ConstructorArguments")
    private List<SystemReflectionCustomAttributeTypedArgument> constructorArguments;

    /**
     * The namedArguments property.
     */
    @JsonProperty(value = "NamedArguments")
    private List<SystemReflectionCustomAttributeNamedArgument> namedArguments;

    /**
     * Get the attributeType value.
     *
     * @return the attributeType value
     */
    public SystemType attributeType() {
        return this.attributeType;
    }

    /**
     * Set the attributeType value.
     *
     * @param attributeType the attributeType value to set
     * @return the SystemReflectionCustomAttributeData object itself.
     */
    public SystemReflectionCustomAttributeData withAttributeType(SystemType attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * Get the constructor value.
     *
     * @return the constructor value
     */
    public SystemReflectionConstructorInfo constructor() {
        return this.constructor;
    }

    /**
     * Set the constructor value.
     *
     * @param constructor the constructor value to set
     * @return the SystemReflectionCustomAttributeData object itself.
     */
    public SystemReflectionCustomAttributeData withConstructor(SystemReflectionConstructorInfo constructor) {
        this.constructor = constructor;
        return this;
    }

    /**
     * Get the constructorArguments value.
     *
     * @return the constructorArguments value
     */
    public List<SystemReflectionCustomAttributeTypedArgument> constructorArguments() {
        return this.constructorArguments;
    }

    /**
     * Set the constructorArguments value.
     *
     * @param constructorArguments the constructorArguments value to set
     * @return the SystemReflectionCustomAttributeData object itself.
     */
    public SystemReflectionCustomAttributeData withConstructorArguments(List<SystemReflectionCustomAttributeTypedArgument> constructorArguments) {
        this.constructorArguments = constructorArguments;
        return this;
    }

    /**
     * Get the namedArguments value.
     *
     * @return the namedArguments value
     */
    public List<SystemReflectionCustomAttributeNamedArgument> namedArguments() {
        return this.namedArguments;
    }

    /**
     * Set the namedArguments value.
     *
     * @param namedArguments the namedArguments value to set
     * @return the SystemReflectionCustomAttributeData object itself.
     */
    public SystemReflectionCustomAttributeData withNamedArguments(List<SystemReflectionCustomAttributeNamedArgument> namedArguments) {
        this.namedArguments = namedArguments;
        return this;
    }

}