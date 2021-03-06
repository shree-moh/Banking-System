package com.sriman.springbootbankaccount.service;

import com.sriman.springbootbankaccount.domain.AccountTransaction;
import com.sriman.springbootbankaccount.domain.TransactionType;
import com.sriman.springbootbankaccount.util.AccountUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;


@RunWith(SpringRunner.class)
@DataJpaTest
class TransactionsServiceTests {

    @Autowired
    TransactionsService transactionsService;
    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testFindByDateBetweenAndType() {
        this.entityManager.persist(new AccountTransaction(TransactionType.WITHDRAWAL.getId(), 1000, new Date()));
        List<AccountTransaction> transactions = transactionsService.findByDateBetweenAndType(AccountUtils.getStartOfDay(new Date()), AccountUtils.getEndOfDay(new Date()), TransactionType.WITHDRAWAL.getId());
//        assertThat(transactions.get(0)).isNotNull();
//        assertThat(transactions.get(0).getType()).isEqualTo(TransactionType.WITHDRAWAL.getId());
//        assertThat(transactions.get(0).getAmount()).isEqualTo(1000);
//        assertThat(transactions.get(0).getDate()).isBetween(AccountUtils.getStartOfDay(new Date()), AccountUtils.getEndOfDay(new Date()));
    }

}