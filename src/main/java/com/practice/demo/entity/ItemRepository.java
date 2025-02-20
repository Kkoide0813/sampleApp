package com.practice.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 商品リポジトリ。 DBとデータのやり取りを担う箇所。Serviceから呼び出される。
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {}
