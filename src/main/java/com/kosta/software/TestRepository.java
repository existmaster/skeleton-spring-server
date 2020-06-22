package com.kosta.software;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TestRepository extends PagingAndSortingRepository<Test, Long> {
}
