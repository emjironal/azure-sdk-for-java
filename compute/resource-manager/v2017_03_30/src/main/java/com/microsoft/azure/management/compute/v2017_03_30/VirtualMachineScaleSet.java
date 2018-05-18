/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2017_03_30.implementation.ComputeManager;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_03_30.implementation.VirtualMachineScaleSetInner;

/**
 * Type representing VirtualMachineScaleSet.
 */
public interface VirtualMachineScaleSet extends HasInner<VirtualMachineScaleSetInner>, Resource, GroupableResourceCore<ComputeManager, VirtualMachineScaleSetInner>, HasResourceGroup, Refreshable<VirtualMachineScaleSet>, Updatable<VirtualMachineScaleSet.Update>, HasManager<ComputeManager> {
    /**
     * @return the identity value.
     */
    VirtualMachineScaleSetIdentity identity();

    /**
     * @return the overprovision value.
     */
    Boolean overprovision();

    /**
     * @return the plan value.
     */
    Plan plan();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the singlePlacementGroup value.
     */
    Boolean singlePlacementGroup();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the uniqueId value.
     */
    String uniqueId();

    /**
     * @return the upgradePolicy value.
     */
    UpgradePolicy upgradePolicy();

    /**
     * @return the virtualMachineProfile value.
     */
    VirtualMachineScaleSetVMProfile virtualMachineProfile();

    /**
     * @return the zones value.
     */
    List<String> zones();

    /**
     * The entirety of the VirtualMachineScaleSet definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualMachineScaleSet definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualMachineScaleSet definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the VirtualMachineScaleSet definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the virtualmachinescaleset update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             */
            WithCreate withIdentity(VirtualMachineScaleSetIdentity identity);
        }

        /**
         * The stage of the virtualmachinescaleset update allowing to specify Overprovision.
         */
        interface WithOverprovision {
            /**
             * Specifies overprovision.
             */
            WithCreate withOverprovision(Boolean overprovision);
        }

        /**
         * The stage of the virtualmachinescaleset update allowing to specify Plan.
         */
        interface WithPlan {
            /**
             * Specifies plan.
             */
            WithCreate withPlan(Plan plan);
        }

        /**
         * The stage of the virtualmachinescaleset update allowing to specify SinglePlacementGroup.
         */
        interface WithSinglePlacementGroup {
            /**
             * Specifies singlePlacementGroup.
             */
            WithCreate withSinglePlacementGroup(Boolean singlePlacementGroup);
        }

        /**
         * The stage of the virtualmachinescaleset update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the virtualmachinescaleset update allowing to specify UpgradePolicy.
         */
        interface WithUpgradePolicy {
            /**
             * Specifies upgradePolicy.
             */
            WithCreate withUpgradePolicy(UpgradePolicy upgradePolicy);
        }

        /**
         * The stage of the virtualmachinescaleset update allowing to specify VirtualMachineProfile.
         */
        interface WithVirtualMachineProfile {
            /**
             * Specifies virtualMachineProfile.
             */
            WithCreate withVirtualMachineProfile(VirtualMachineScaleSetVMProfile virtualMachineProfile);
        }

        /**
         * The stage of the virtualmachinescaleset update allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             */
            WithCreate withZones(List<String> zones);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualMachineScaleSet>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithIdentity, DefinitionStages.WithOverprovision, DefinitionStages.WithPlan, DefinitionStages.WithSinglePlacementGroup, DefinitionStages.WithSku, DefinitionStages.WithUpgradePolicy, DefinitionStages.WithVirtualMachineProfile, DefinitionStages.WithZones {
        }
    }
    /**
     * The template for a VirtualMachineScaleSet update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualMachineScaleSet>, Resource.UpdateWithTags<Update>, UpdateStages.WithIdentity, UpdateStages.WithOverprovision, UpdateStages.WithPlan, UpdateStages.WithSinglePlacementGroup, UpdateStages.WithSku, UpdateStages.WithUpgradePolicy, UpdateStages.WithVirtualMachineProfile {
    }

    /**
     * Grouping of VirtualMachineScaleSet update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualmachinescaleset {0} allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             */
            Update withIdentity(VirtualMachineScaleSetIdentity identity);
        }

        /**
         * The stage of the virtualmachinescaleset {0} allowing to specify Overprovision.
         */
        interface WithOverprovision {
            /**
             * Specifies overprovision.
             */
            Update withOverprovision(Boolean overprovision);
        }

        /**
         * The stage of the virtualmachinescaleset {0} allowing to specify Plan.
         */
        interface WithPlan {
            /**
             * Specifies plan.
             */
            Update withPlan(Plan plan);
        }

        /**
         * The stage of the virtualmachinescaleset {0} allowing to specify SinglePlacementGroup.
         */
        interface WithSinglePlacementGroup {
            /**
             * Specifies singlePlacementGroup.
             */
            Update withSinglePlacementGroup(Boolean singlePlacementGroup);
        }

        /**
         * The stage of the virtualmachinescaleset {0} allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the virtualmachinescaleset {0} allowing to specify UpgradePolicy.
         */
        interface WithUpgradePolicy {
            /**
             * Specifies upgradePolicy.
             */
            Update withUpgradePolicy(UpgradePolicy upgradePolicy);
        }

        /**
         * The stage of the virtualmachinescaleset {0} allowing to specify VirtualMachineProfile.
         */
        interface WithVirtualMachineProfile {
            /**
             * Specifies virtualMachineProfile.
             */
            Update withVirtualMachineProfile(VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile);
        }

    }
}
