package co.za.codecol.emusic.repository;

import co.za.codecol.emusic.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findOneByEmail(String email);
}