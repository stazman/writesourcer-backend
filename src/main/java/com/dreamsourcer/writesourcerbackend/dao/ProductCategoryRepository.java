package com.dreamsourcer.writesourcerbackend.dao;

import com.dreamsourcer.writesourcerbackend.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.LongSummaryStatistics;

@RepositoryRestResource(collectionResourceRel="productCategory", path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {


}
