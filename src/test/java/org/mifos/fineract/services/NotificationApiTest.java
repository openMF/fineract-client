package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for NotificationApi
 */
public class NotificationApiTest {

    private NotificationApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(NotificationApi.class);
    }

    /**
     *
     */
    @Test
    public void getAllNotificationsTest() {
        String orderBy = null;
        Integer limit = null;
        Integer offset = null;
        String sortOrder = null;
        Boolean isRead = null;
        // String response = api.getAllNotifications(orderBy, limit, offset, sortOrder, isRead);

        // TODO: test validations
    }
    /**
     *
     */
    @Test
    public void updateTest() {
        // api.update();

        // TODO: test validations
    }
}
