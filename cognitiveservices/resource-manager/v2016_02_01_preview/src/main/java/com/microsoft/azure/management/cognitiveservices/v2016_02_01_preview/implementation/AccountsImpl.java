/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.Accounts;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.CognitiveServicesAccountKeys;
import com.microsoft.azure.arm.utils.PagedListConverter;
import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.CognitiveServicesAccount;
import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.Skus;

class AccountsImpl extends WrapperImpl<CognitiveServicesAccountsInner> implements Accounts {
    private PagedListConverter<CognitiveServicesAccountInner, CognitiveServicesAccount> converter;
    private final CognitiveServicesManager manager;

    AccountsImpl(CognitiveServicesManager manager) {
        super(manager.inner().cognitiveServicesAccounts());
        this.manager = manager;
        this.converter = new PagedListConverter<CognitiveServicesAccountInner, CognitiveServicesAccount>() {
            @Override
            public Observable<CognitiveServicesAccount> typeConvertAsync(CognitiveServicesAccountInner inner) {
                return Observable.just((CognitiveServicesAccount) wrapModel(inner));
            }
        };
    }

    @Override
    public Skus skus() {
        Skus accessor = this.manager().skus();
        return accessor;
    }

    public CognitiveServicesManager manager() {
        return this.manager;
    }

    @Override
    public CognitiveServicesAccountImpl define(String name) {
        return wrapModel(name);
    }

    private CognitiveServicesAccountImpl wrapModel(CognitiveServicesAccountInner inner) {
        return  new CognitiveServicesAccountImpl(inner, manager());
    }

    private CognitiveServicesAccountImpl wrapModel(String name) {
        return new CognitiveServicesAccountImpl(name, this.manager());
    }

    @Override
    public Observable<CognitiveServicesAccountKeys> listKeysAsync(String resourceGroupName, String accountName) {
        CognitiveServicesAccountsInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, accountName)
        .map(new Func1<CognitiveServicesAccountKeysInner, CognitiveServicesAccountKeys>() {
            @Override
            public CognitiveServicesAccountKeys call(CognitiveServicesAccountKeysInner inner) {
                return new CognitiveServicesAccountKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CognitiveServicesAccountKeys> regenerateKeyAsync(String resourceGroupName, String accountName) {
        CognitiveServicesAccountsInner client = this.inner();
        return client.regenerateKeyAsync(resourceGroupName, accountName)
        .map(new Func1<CognitiveServicesAccountKeysInner, CognitiveServicesAccountKeys>() {
            @Override
            public CognitiveServicesAccountKeys call(CognitiveServicesAccountKeysInner inner) {
                return new CognitiveServicesAccountKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public PagedList<CognitiveServicesAccount> list() {
        CognitiveServicesAccountsInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<CognitiveServicesAccount> listAsync() {
        CognitiveServicesAccountsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<CognitiveServicesAccountInner>, Observable<CognitiveServicesAccountInner>>() {
            @Override
            public Observable<CognitiveServicesAccountInner> call(Page<CognitiveServicesAccountInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<CognitiveServicesAccountInner, CognitiveServicesAccount>() {
            @Override
            public CognitiveServicesAccount call(CognitiveServicesAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<CognitiveServicesAccount> listByResourceGroup(String resourceGroupName) {
        CognitiveServicesAccountsInner client = this.inner();
        return converter.convert(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<CognitiveServicesAccount> listByResourceGroupAsync(String resourceGroupName) {
        CognitiveServicesAccountsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<CognitiveServicesAccountInner>, Observable<CognitiveServicesAccountInner>>() {
            @Override
            public Observable<CognitiveServicesAccountInner> call(Page<CognitiveServicesAccountInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<CognitiveServicesAccountInner, CognitiveServicesAccount>() {
            @Override
            public CognitiveServicesAccount call(CognitiveServicesAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    private Observable<CognitiveServicesAccountInner> getInnerAsync(String resourceGroupName, String name) {
        CognitiveServicesAccountsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    public CognitiveServicesAccount getByResourceGroup(String resourceGroupName, String name) {
        return getByResourceGroupAsync(resourceGroupName, name).toBlocking().last();
    }

    @Override
    public Observable<CognitiveServicesAccount> getByResourceGroupAsync(String resourceGroupName, String name) {
        return this.getInnerAsync(resourceGroupName, name).map(new Func1<CognitiveServicesAccountInner, CognitiveServicesAccount> () {
            @Override
            public CognitiveServicesAccount call(CognitiveServicesAccountInner innerT) {
                return wrapModel(innerT);
            }
        });
    }

    @Override
    public ServiceFuture<CognitiveServicesAccount> getByResourceGroupAsync(String resourceGroupName, String name, ServiceCallback<CognitiveServicesAccount> callback) {
        return ServiceFuture.fromBody(getByResourceGroupAsync(resourceGroupName, name), callback);
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByResourceGroup(String resourceGroupName, String name) {
        this.deleteByResourceGroupAsync(resourceGroupName, name).await();
    }

    @Override
    public Completable deleteByResourceGroupAsync(String resourceGroupName, String name) {
        return this.inner().deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public ServiceFuture<Void> deleteByResourceGroupAsync(String resourceGroupName, String name, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(deleteByResourceGroupAsync(resourceGroupName, name), serviceCallback);
    }

}
