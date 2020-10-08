package com.github.gkttk.sixth.bookdao.dao.specification.search.factory;

import com.github.gkttk.sixth.bookdao.dao.enums.Criteria;
import com.github.gkttk.sixth.bookdao.dao.specification.search.*;
import com.github.gkttk.sixth.bookdao.exception.SpecificationFactoryException;

/**
 * Factory for AbstractSearchSpecification.
 */
public class SearchSpecificationFactory {

    public AbstractSearchSpecification createSpecification(Criteria criteria) throws SpecificationFactoryException {
        switch (criteria) {
            case TITLE: {
                return new TitleSearchSpecification();
            }
            case AUTHOR: {
                return new AuthorSearchSpecification();
            }
            case YEAR: {
                return new YearSearchSpecification();
            }
            case GENRE: {
                return new GenreSearchSpecification();
            }
            case PAGES: {
                return new PagesSearchSpecification();
            }
            default: {
                throw new SpecificationFactoryException("No such specification in SearchSpecificationFactory");
            }
        }
    }
}
