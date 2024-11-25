package com.dhungelkrishna.bankapp.repository;

import com.dhungelkrishna.bankapp.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    Optional<Account> findByUsername(String username);
}


// ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'securityConfig': Unsatisfied dependency expressed through field 'accountService': Error creating bean with name 'accountService': Unsatisfied dependency expressed through field 'accountRepository': Error creating bean with name 'accountRepository' defined in com.dhungelkrishna.bankapp.repository.AccountRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Could not create query for public abstract java.util.Optional com.dhungelkrishna.bankapp.repository.AccountRepository.findByUsernaame(java.lang.String); Reason: Failed to create query for method public abstract java.util.Optional com.dhungelkrishna.bankapp.repository.AccountRepository.findByUsernaame(java.lang.String); No property 'usernaame' found for type 'Account'; Did you mean 'username'