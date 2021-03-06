/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cemeterylistingsweb.services;

import com.cemeterylistingsweb.domain.PublishedDeceasedListing;
import com.cemeterylistingsweb.domain.Subscriber;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Ryno
 */
public interface ViewListingBySubscriberService extends Services<Subscriber, Long>{
    public List<PublishedDeceasedListing> findListingBySubscriber(Date subDate, Date validDate);
    public List<PublishedDeceasedListing> findListingBySubscriber(Long subID);
}
