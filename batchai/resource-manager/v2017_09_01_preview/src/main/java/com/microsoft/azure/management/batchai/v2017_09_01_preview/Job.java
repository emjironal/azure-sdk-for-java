/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.implementation.BatchAIManager;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.implementation.JobInner;

/**
 * Type representing Job.
 */
public interface Job extends HasInner<JobInner>, Resource, GroupableResourceCore<BatchAIManager, JobInner>, HasResourceGroup, Refreshable<Job>, Updatable<Job.Update>, HasManager<BatchAIManager> {
    /**
     * @return the caffeSettings value.
     */
    CaffeSettings caffeSettings();

    /**
     * @return the chainerSettings value.
     */
    ChainerSettings chainerSettings();

    /**
     * @return the cluster value.
     */
    ResourceId cluster();

    /**
     * @return the cntkSettings value.
     */
    CNTKsettings cntkSettings();

    /**
     * @return the constraints value.
     */
    JobPropertiesConstraints constraints();

    /**
     * @return the containerSettings value.
     */
    ContainerSettings containerSettings();

    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the customToolkitSettings value.
     */
    CustomToolkitSettings customToolkitSettings();

    /**
     * @return the environmentVariables value.
     */
    List<EnvironmentSetting> environmentVariables();

    /**
     * @return the executionInfo value.
     */
    JobPropertiesExecutionInfo executionInfo();

    /**
     * @return the executionState value.
     */
    ExecutionState executionState();

    /**
     * @return the executionStateTransitionTime value.
     */
    DateTime executionStateTransitionTime();

    /**
     * @return the experimentName value.
     */
    String experimentName();

    /**
     * @return the inputDirectories value.
     */
    List<InputDirectory> inputDirectories();

    /**
     * @return the jobPreparation value.
     */
    JobPreparation jobPreparation();

    /**
     * @return the nodeCount value.
     */
    Integer nodeCount();

    /**
     * @return the outputDirectories value.
     */
    List<OutputDirectory> outputDirectories();

    /**
     * @return the priority value.
     */
    Integer priority();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the provisioningStateTransitionTime value.
     */
    DateTime provisioningStateTransitionTime();

    /**
     * @return the stdOutErrPathPrefix value.
     */
    String stdOutErrPathPrefix();

    /**
     * @return the tensorFlowSettings value.
     */
    TensorFlowSettings tensorFlowSettings();

    /**
     * @return the toolType value.
     */
    ToolType toolType();

    /**
     * The entirety of the Job definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCluster, DefinitionStages.WithNodeCount, DefinitionStages.WithStdOutErrPathPrefix, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Job definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Job definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Job definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCluster> {
        }

        /**
         * The stage of the job definition allowing to specify Cluster.
         */
        interface WithCluster {
           /**
            * Specifies cluster.
            */
            WithNodeCount withCluster(ResourceId cluster);
        }

        /**
         * The stage of the job definition allowing to specify NodeCount.
         */
        interface WithNodeCount {
           /**
            * Specifies nodeCount.
            */
            WithStdOutErrPathPrefix withNodeCount(int nodeCount);
        }

        /**
         * The stage of the job definition allowing to specify StdOutErrPathPrefix.
         */
        interface WithStdOutErrPathPrefix {
           /**
            * Specifies stdOutErrPathPrefix.
            */
            WithCreate withStdOutErrPathPrefix(String stdOutErrPathPrefix);
        }

        /**
         * The stage of the job update allowing to specify Caffe2Settings.
         */
        interface WithCaffe2Settings {
            /**
             * Specifies caffe2Settings.
             */
            WithCreate withCaffe2Settings(Caffe2Settings caffe2Settings);
        }

        /**
         * The stage of the job update allowing to specify CaffeSettings.
         */
        interface WithCaffeSettings {
            /**
             * Specifies caffeSettings.
             */
            WithCreate withCaffeSettings(CaffeSettings caffeSettings);
        }

        /**
         * The stage of the job update allowing to specify ChainerSettings.
         */
        interface WithChainerSettings {
            /**
             * Specifies chainerSettings.
             */
            WithCreate withChainerSettings(ChainerSettings chainerSettings);
        }

        /**
         * The stage of the job update allowing to specify CntkSettings.
         */
        interface WithCntkSettings {
            /**
             * Specifies cntkSettings.
             */
            WithCreate withCntkSettings(CNTKsettings cntkSettings);
        }

        /**
         * The stage of the job update allowing to specify Constraints.
         */
        interface WithConstraints {
            /**
             * Specifies constraints.
             */
            WithCreate withConstraints(JobBasePropertiesConstraints constraints);
        }

        /**
         * The stage of the job update allowing to specify ContainerSettings.
         */
        interface WithContainerSettings {
            /**
             * Specifies containerSettings.
             */
            WithCreate withContainerSettings(ContainerSettings containerSettings);
        }

        /**
         * The stage of the job update allowing to specify CustomToolkitSettings.
         */
        interface WithCustomToolkitSettings {
            /**
             * Specifies customToolkitSettings.
             */
            WithCreate withCustomToolkitSettings(CustomToolkitSettings customToolkitSettings);
        }

        /**
         * The stage of the job update allowing to specify EnvironmentVariables.
         */
        interface WithEnvironmentVariables {
            /**
             * Specifies environmentVariables.
             */
            WithCreate withEnvironmentVariables(List<EnvironmentSetting> environmentVariables);
        }

        /**
         * The stage of the job update allowing to specify ExperimentName.
         */
        interface WithExperimentName {
            /**
             * Specifies experimentName.
             */
            WithCreate withExperimentName(String experimentName);
        }

        /**
         * The stage of the job update allowing to specify InputDirectories.
         */
        interface WithInputDirectories {
            /**
             * Specifies inputDirectories.
             */
            WithCreate withInputDirectories(List<InputDirectory> inputDirectories);
        }

        /**
         * The stage of the job update allowing to specify JobPreparation.
         */
        interface WithJobPreparation {
            /**
             * Specifies jobPreparation.
             */
            WithCreate withJobPreparation(JobPreparation jobPreparation);
        }

        /**
         * The stage of the job update allowing to specify OutputDirectories.
         */
        interface WithOutputDirectories {
            /**
             * Specifies outputDirectories.
             */
            WithCreate withOutputDirectories(List<OutputDirectory> outputDirectories);
        }

        /**
         * The stage of the job update allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             */
            WithCreate withPriority(Integer priority);
        }

        /**
         * The stage of the job update allowing to specify TensorFlowSettings.
         */
        interface WithTensorFlowSettings {
            /**
             * Specifies tensorFlowSettings.
             */
            WithCreate withTensorFlowSettings(TensorFlowSettings tensorFlowSettings);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Job>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithCaffe2Settings, DefinitionStages.WithCaffeSettings, DefinitionStages.WithChainerSettings, DefinitionStages.WithCntkSettings, DefinitionStages.WithConstraints, DefinitionStages.WithContainerSettings, DefinitionStages.WithCustomToolkitSettings, DefinitionStages.WithEnvironmentVariables, DefinitionStages.WithExperimentName, DefinitionStages.WithInputDirectories, DefinitionStages.WithJobPreparation, DefinitionStages.WithOutputDirectories, DefinitionStages.WithPriority, DefinitionStages.WithTensorFlowSettings {
        }
    }
    /**
     * The template for a Job update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Job>, Resource.UpdateWithTags<Update>, UpdateStages.WithCaffe2Settings, UpdateStages.WithCaffeSettings, UpdateStages.WithChainerSettings, UpdateStages.WithCntkSettings, UpdateStages.WithConstraints, UpdateStages.WithContainerSettings, UpdateStages.WithCustomToolkitSettings, UpdateStages.WithEnvironmentVariables, UpdateStages.WithExperimentName, UpdateStages.WithInputDirectories, UpdateStages.WithJobPreparation, UpdateStages.WithOutputDirectories, UpdateStages.WithPriority, UpdateStages.WithTensorFlowSettings {
    }

    /**
     * Grouping of Job update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the job {0} allowing to specify Caffe2Settings.
         */
        interface WithCaffe2Settings {
            /**
             * Specifies caffe2Settings.
             */
            Update withCaffe2Settings(Caffe2Settings caffe2Settings);
        }

        /**
         * The stage of the job {0} allowing to specify CaffeSettings.
         */
        interface WithCaffeSettings {
            /**
             * Specifies caffeSettings.
             */
            Update withCaffeSettings(CaffeSettings caffeSettings);
        }

        /**
         * The stage of the job {0} allowing to specify ChainerSettings.
         */
        interface WithChainerSettings {
            /**
             * Specifies chainerSettings.
             */
            Update withChainerSettings(ChainerSettings chainerSettings);
        }

        /**
         * The stage of the job {0} allowing to specify CntkSettings.
         */
        interface WithCntkSettings {
            /**
             * Specifies cntkSettings.
             */
            Update withCntkSettings(CNTKsettings cntkSettings);
        }

        /**
         * The stage of the job {0} allowing to specify Constraints.
         */
        interface WithConstraints {
            /**
             * Specifies constraints.
             */
            Update withConstraints(JobBasePropertiesConstraints constraints);
        }

        /**
         * The stage of the job {0} allowing to specify ContainerSettings.
         */
        interface WithContainerSettings {
            /**
             * Specifies containerSettings.
             */
            Update withContainerSettings(ContainerSettings containerSettings);
        }

        /**
         * The stage of the job {0} allowing to specify CustomToolkitSettings.
         */
        interface WithCustomToolkitSettings {
            /**
             * Specifies customToolkitSettings.
             */
            Update withCustomToolkitSettings(CustomToolkitSettings customToolkitSettings);
        }

        /**
         * The stage of the job {0} allowing to specify EnvironmentVariables.
         */
        interface WithEnvironmentVariables {
            /**
             * Specifies environmentVariables.
             */
            Update withEnvironmentVariables(List<EnvironmentSetting> environmentVariables);
        }

        /**
         * The stage of the job {0} allowing to specify ExperimentName.
         */
        interface WithExperimentName {
            /**
             * Specifies experimentName.
             */
            Update withExperimentName(String experimentName);
        }

        /**
         * The stage of the job {0} allowing to specify InputDirectories.
         */
        interface WithInputDirectories {
            /**
             * Specifies inputDirectories.
             */
            Update withInputDirectories(List<InputDirectory> inputDirectories);
        }

        /**
         * The stage of the job {0} allowing to specify JobPreparation.
         */
        interface WithJobPreparation {
            /**
             * Specifies jobPreparation.
             */
            Update withJobPreparation(JobPreparation jobPreparation);
        }

        /**
         * The stage of the job {0} allowing to specify OutputDirectories.
         */
        interface WithOutputDirectories {
            /**
             * Specifies outputDirectories.
             */
            Update withOutputDirectories(List<OutputDirectory> outputDirectories);
        }

        /**
         * The stage of the job {0} allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             */
            Update withPriority(Integer priority);
        }

        /**
         * The stage of the job {0} allowing to specify TensorFlowSettings.
         */
        interface WithTensorFlowSettings {
            /**
             * Specifies tensorFlowSettings.
             */
            Update withTensorFlowSettings(TensorFlowSettings tensorFlowSettings);
        }

    }
}
