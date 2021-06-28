package com.Jdbc.Jdbc.repository;


// import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.Jdbc.Jdbc.model.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account,Integer>{
    
    public Account findByUserId(Integer userId);
    public List<Account> findByCreateDtmGreaterThan(Timestamp createDtm);
    public List<Account> findByCreateDtmLessThan(Timestamp createDtm);
    public List<Account> findByCreateDtmGreaterThan(Date createDtm);

   
    // public List<Account> findDateLessThanLimit(Timestamp createDtm);

    // @Query("SELECT * FROM account WHERE create_dtm > '?1'  ORDER BY create_dtm ASC LIMIT 1;")
    // public Account findByDateGtLim1(Timestamp createDtm);

    


    
}
