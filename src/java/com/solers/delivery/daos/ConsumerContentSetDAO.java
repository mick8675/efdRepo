package com.solers.delivery.daos;

import java.util.List;

import com.solers.util.dao.GenericDAO;


public interface ConsumerContentSetDAO extends GenericDAO<com.solers.delivery.domain.ConsumerContentSet, Long> 
{

    String GET_CONSUMER_BY_NAME = "getConsumerByName";
    String GET_CONSUMER_SETS = "getAllConsumers";

    /**
     * Query interface to return a single consumer content set by its name.
     * @param name - The logical name of the content set.
     * @return - A single consumer content set whose logical name matches the parameter 'name'.
     */
    com.solers.delivery.domain.ConsumerContentSet getConsumerByName(String name);

    /**
     * Query interface to return a list of all consumer content sets.
     * @return - A complete list of consumer content sets.
     */
    List<com.solers.delivery.domain.ConsumerContentSet> getConsumerSets();

}
