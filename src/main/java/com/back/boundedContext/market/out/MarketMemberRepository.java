package com.back.boundedContext.market.out;

import com.back.boundedContext.market.domain.MarketMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MarketMemberRepository extends JpaRepository<MarketMember, Integer> {
     Optional<MarketMember> findByUsername(String username);
}
