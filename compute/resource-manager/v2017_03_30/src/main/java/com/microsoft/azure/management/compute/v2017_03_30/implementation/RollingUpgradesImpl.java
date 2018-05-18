/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2017_03_30.RollingUpgrades;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.compute.v2017_03_30.OperationStatusResponse;
import com.microsoft.azure.management.compute.v2017_03_30.RollingUpgradeStatusInfo;

class RollingUpgradesImpl extends WrapperImpl<VirtualMachineScaleSetRollingUpgradesInner> implements RollingUpgrades {
    private final ComputeManager manager;

    RollingUpgradesImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineScaleSetRollingUpgrades());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<OperationStatusResponse> cancelAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetRollingUpgradesInner client = this.inner();
        return client.cancelAsync(resourceGroupName, vmScaleSetName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RollingUpgradeStatusInfo> getLatestAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetRollingUpgradesInner client = this.inner();
        return client.getLatestAsync(resourceGroupName, vmScaleSetName)
        .map(new Func1<RollingUpgradeStatusInfoInner, RollingUpgradeStatusInfo>() {
            @Override
            public RollingUpgradeStatusInfo call(RollingUpgradeStatusInfoInner inner) {
                return new RollingUpgradeStatusInfoImpl(inner, manager());
            }
        });
    }

}
