package com.github.gkttk.sixth.bookdao.dao.specification.sort.factory;

import com.github.gkttk.sixth.bookdao.dao.enums.Criteria;
import com.github.gkttk.sixth.bookdao.dao.specification.sort.*;
import com.github.gkttk.sixth.bookdao.exception.SpecificationFactoryException;

/**
 * Factory for AbstractSortSpecification.
 */
public class SortSpecificationFactory {

    public AbstractSortSpecification createSpecification(Criteria criteria) throws SpecificationFactoryException {
        switch (criteria) {
            case TITLE: {
                return new TitleSortSpecification();
            }
            case AUTHOR: {
                return new AuthorSortSpecification();
            }
            case YEAR: {
                return new YearSortSpecification();
            }
            case GENRE: {
                return new GenreSortSpecification();
            }
            case PAGES: {
                return new PagesSortSpecification();
            }
            default: {
                throw new SpecificationFactoryException("No such specification in SortSpecificationFactory");
            }
        }
    }
}
