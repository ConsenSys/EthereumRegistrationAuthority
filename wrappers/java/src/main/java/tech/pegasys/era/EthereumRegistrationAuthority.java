/*
 * Copyright 2019 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package tech.pegasys.era;

import tech.pegasys.era.internal.AutoGeneratedEra;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;

import java.math.BigInteger;

/**
 * ERA Java Wrapper Class.
 */
public class EthereumRegistrationAuthority {

    /* The actual ERA Wrapper. */
    private AutoGeneratedEra eraAutoGenWrapperReal;

    /**
     * Constructor.
     * @param eraAutoGenWrapper - The Remote Call to the ERA Wrapper.
     */
    public EthereumRegistrationAuthority(RemoteCall<AutoGeneratedEra> eraAutoGenWrapper) throws Exception {
        eraAutoGenWrapperReal = eraAutoGenWrapper.send();
    }

    /**
     * Constructor.
     * @param eraAutoGenWrapperReal - The actual ERA Wrapper.
     */
    public EthereumRegistrationAuthority(AutoGeneratedEra eraAutoGenWrapperReal) {
        this.eraAutoGenWrapperReal = eraAutoGenWrapperReal;
    }

    /**
     * Get the contract address of the Era.
     * @return - The contract address.
     */
    public String getContractAddress() {
        return eraAutoGenWrapperReal.getContractAddress();
    }

    public TransactionReceipt addUpdateDomain(String domainName, String domainAuthorityContractAddress,
                                              String domainInfoContractAddress, String domainOwnerAddress) throws Exception {
        BigInteger domainHash = EraUtils.convertDomainToDomainHash(domainName);
        return eraAutoGenWrapperReal.addUpdateDomain(domainHash, domainAuthorityContractAddress,
                domainInfoContractAddress, domainOwnerAddress).send();
    }

    public TransactionReceipt removeDomain(String domainName) throws Exception {
        BigInteger domainHash = EraUtils.convertDomainToDomainHash(domainName);
        return eraAutoGenWrapperReal.removeDomain(domainHash).send();
    }

    public Boolean hasDomain(String domainName) throws Exception {
        BigInteger domainHash = EraUtils.convertDomainToDomainHash(domainName);
        return eraAutoGenWrapperReal.hasDomain(domainHash).send();
    }

    public String getAuthority(String domainName) throws Exception {
        BigInteger domainHash = EraUtils.convertDomainToDomainHash(domainName);
        return eraAutoGenWrapperReal.getAuthority(domainHash).send();
    }

    public String getDomainInfo(String domainName) throws Exception {
        BigInteger domainHash = EraUtils.convertDomainToDomainHash(domainName);
        return eraAutoGenWrapperReal.getDomainInfo(domainHash).send();
    }

    public String getDomainOwner(String domainName) throws Exception {
        BigInteger domainHash = EraUtils.convertDomainToDomainHash(domainName);
        return eraAutoGenWrapperReal.getDomainOwner(domainHash).send();
    }

    public BigInteger getVersion() throws Exception {
        return eraAutoGenWrapperReal.getVersion().send();
    }
}
