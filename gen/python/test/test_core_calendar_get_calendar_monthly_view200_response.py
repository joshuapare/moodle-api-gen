# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_calendar_get_calendar_monthly_view200_response import CoreCalendarGetCalendarMonthlyView200Response

class TestCoreCalendarGetCalendarMonthlyView200Response(unittest.TestCase):
    """CoreCalendarGetCalendarMonthlyView200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCalendarGetCalendarMonthlyView200Response:
        """Test CoreCalendarGetCalendarMonthlyView200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCalendarGetCalendarMonthlyView200Response`
        """
        model = CoreCalendarGetCalendarMonthlyView200Response()
        if include_optional:
            return CoreCalendarGetCalendarMonthlyView200Response(
                calendarinstanceid = 56,
                categoryid = 56,
                courseid = 56,
                var_date = openapi_client.models.core_calendar_get_calendar_day_view_200_response_nextperiod.core_calendar_get_calendar_day_view_200_response_nextperiod(
                    hours = 56, 
                    mday = 56, 
                    minutes = 56, 
                    mon = 56, 
                    month = '', 
                    seconds = 56, 
                    timestamp = 56, 
                    wday = 56, 
                    weekday = '', 
                    yday = 56, 
                    year = 56, ),
                daynames = [
                    openapi_client.models.core_calendar_get_calendar_monthly_view_200_response_daynames_inner.core_calendar_get_calendar_monthly_view_200_response_daynames_inner(
                        dayno = 56, 
                        fullname = '', 
                        shortname = '', )
                    ],
                defaulteventcontext = 56,
                filter_selector = '',
                includenavigation = True,
                initialeventsloaded = True,
                larrow = '',
                nextperiod = openapi_client.models.core_calendar_get_calendar_day_view_200_response_nextperiod.core_calendar_get_calendar_day_view_200_response_nextperiod(
                    hours = 56, 
                    mday = 56, 
                    minutes = 56, 
                    mon = 56, 
                    month = '', 
                    seconds = 56, 
                    timestamp = 56, 
                    wday = 56, 
                    weekday = '', 
                    yday = 56, 
                    year = 56, ),
                nextperiodlink = '',
                nextperiodname = '',
                periodname = '',
                previousperiod = openapi_client.models.core_calendar_get_calendar_day_view_200_response_nextperiod.core_calendar_get_calendar_day_view_200_response_nextperiod(
                    hours = 56, 
                    mday = 56, 
                    minutes = 56, 
                    mon = 56, 
                    month = '', 
                    seconds = 56, 
                    timestamp = 56, 
                    wday = 56, 
                    weekday = '', 
                    yday = 56, 
                    year = 56, ),
                previousperiodlink = '',
                previousperiodname = '',
                rarrow = '',
                showviewselector = True,
                url = '',
                view = 'null',
                viewinginblock = True,
                viewingmonth = True,
                weeks = [
                    openapi_client.models.core_calendar_get_calendar_monthly_view_200_response_weeks_inner.core_calendar_get_calendar_monthly_view_200_response_weeks_inner(
                        days = [
                            openapi_client.models.core_calendar_get_calendar_monthly_view_200_response_weeks_inner_days_inner.core_calendar_get_calendar_monthly_view_200_response_weeks_inner_days_inner(
                                calendareventtypes = [
                                    None
                                    ], 
                                daytitle = 'null', 
                                events = [
                                    openapi_client.models.core_calendar_get_calendar_monthly_view_200_response_weeks_inner_days_inner_events_inner.core_calendar_get_calendar_monthly_view_200_response_weeks_inner_days_inner_events_inner(
                                        action = openapi_client.models.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_action.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_action(
                                            actionable = True, 
                                            itemcount = 56, 
                                            name = '', 
                                            showitemcount = True, 
                                            url = '', ), 
                                        activityname = '', 
                                        activitystr = '', 
                                        candelete = True, 
                                        canedit = True, 
                                        category = openapi_client.models.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_category.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_category(
                                            coursecount = 56, 
                                            depth = 56, 
                                            description = '', 
                                            id = 56, 
                                            idnumber = '', 
                                            name = '', 
                                            nestedname = '', 
                                            parent = 56, 
                                            timemodified = 56, 
                                            url = '', 
                                            visible = 56, ), 
                                        categoryid = 56, 
                                        component = '', 
                                        course = openapi_client.models.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_course.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_course(
                                            coursecategory = '', 
                                            courseimage = '', 
                                            enddate = 56, 
                                            fullname = '', 
                                            fullnamedisplay = '', 
                                            hasprogress = True, 
                                            hidden = True, 
                                            id = 56, 
                                            idnumber = '', 
                                            isfavourite = True, 
                                            pdfexportfont = '', 
                                            progress = 56, 
                                            shortname = '', 
                                            showactivitydates = True, 
                                            showcompletionconditions = True, 
                                            showshortname = True, 
                                            startdate = 56, 
                                            summary = '', 
                                            summaryformat = 56, 
                                            timeaccess = 56, 
                                            viewurl = '', 
                                            visible = True, ), 
                                        deleteurl = '', 
                                        description = '', 
                                        descriptionformat = 56, 
                                        draggable = True, 
                                        editurl = '', 
                                        eventcount = 56, 
                                        eventtype = '', 
                                        formattedlocation = '', 
                                        formattedtime = '', 
                                        groupid = 56, 
                                        groupname = '', 
                                        icon = openapi_client.models.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_icon.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_icon(
                                            alttext = '', 
                                            component = '', 
                                            iconclass = '', 
                                            iconurl = '', 
                                            key = '', ), 
                                        id = 56, 
                                        instance = 56, 
                                        isactionevent = True, 
                                        iscategoryevent = True, 
                                        iscourseevent = True, 
                                        islastday = True, 
                                        location = '', 
                                        maxdayerror = '', 
                                        maxdaytimestamp = 56, 
                                        mindayerror = '', 
                                        mindaytimestamp = 56, 
                                        modulename = '', 
                                        name = '', 
                                        normalisedeventtype = '', 
                                        normalisedeventtypetext = '', 
                                        overdue = True, 
                                        popupname = '', 
                                        purpose = '', 
                                        repeatid = 56, 
                                        subscription = openapi_client.models.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_subscription.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_subscription(
                                            displayeventsource = True, 
                                            subscriptionname = '', 
                                            subscriptionurl = '', ), 
                                        timeduration = 56, 
                                        timemodified = 56, 
                                        timesort = 56, 
                                        timestart = 56, 
                                        timeusermidnight = 56, 
                                        url = '', 
                                        userid = 56, 
                                        viewurl = '', 
                                        visible = 56, )
                                    ], 
                                hasevents = True, 
                                haslastdayofevent = True, 
                                hours = 56, 
                                istoday = True, 
                                isweekend = True, 
                                mday = 56, 
                                minutes = 56, 
                                neweventtimestamp = 56, 
                                nextperiod = 56, 
                                popovertitle = '', 
                                previousperiod = 56, 
                                seconds = 56, 
                                timestamp = 56, 
                                viewdaylink = 'null', 
                                viewdaylinktitle = 'null', 
                                wday = 56, 
                                yday = 56, 
                                year = 56, )
                            ], 
                        postpadding = [
                            None
                            ], 
                        prepadding = [
                            None
                            ], )
                    ]
            )
        else:
            return CoreCalendarGetCalendarMonthlyView200Response(
                calendarinstanceid = 56,
                courseid = 56,
                var_date = openapi_client.models.core_calendar_get_calendar_day_view_200_response_nextperiod.core_calendar_get_calendar_day_view_200_response_nextperiod(
                    hours = 56, 
                    mday = 56, 
                    minutes = 56, 
                    mon = 56, 
                    month = '', 
                    seconds = 56, 
                    timestamp = 56, 
                    wday = 56, 
                    weekday = '', 
                    yday = 56, 
                    year = 56, ),
                daynames = [
                    openapi_client.models.core_calendar_get_calendar_monthly_view_200_response_daynames_inner.core_calendar_get_calendar_monthly_view_200_response_daynames_inner(
                        dayno = 56, 
                        fullname = '', 
                        shortname = '', )
                    ],
                defaulteventcontext = 56,
                includenavigation = True,
                initialeventsloaded = True,
                larrow = '',
                nextperiod = openapi_client.models.core_calendar_get_calendar_day_view_200_response_nextperiod.core_calendar_get_calendar_day_view_200_response_nextperiod(
                    hours = 56, 
                    mday = 56, 
                    minutes = 56, 
                    mon = 56, 
                    month = '', 
                    seconds = 56, 
                    timestamp = 56, 
                    wday = 56, 
                    weekday = '', 
                    yday = 56, 
                    year = 56, ),
                nextperiodlink = '',
                nextperiodname = '',
                periodname = '',
                previousperiod = openapi_client.models.core_calendar_get_calendar_day_view_200_response_nextperiod.core_calendar_get_calendar_day_view_200_response_nextperiod(
                    hours = 56, 
                    mday = 56, 
                    minutes = 56, 
                    mon = 56, 
                    month = '', 
                    seconds = 56, 
                    timestamp = 56, 
                    wday = 56, 
                    weekday = '', 
                    yday = 56, 
                    year = 56, ),
                previousperiodlink = '',
                previousperiodname = '',
                rarrow = '',
                showviewselector = True,
                url = '',
                view = 'null',
                viewinginblock = True,
                viewingmonth = True,
                weeks = [
                    openapi_client.models.core_calendar_get_calendar_monthly_view_200_response_weeks_inner.core_calendar_get_calendar_monthly_view_200_response_weeks_inner(
                        days = [
                            openapi_client.models.core_calendar_get_calendar_monthly_view_200_response_weeks_inner_days_inner.core_calendar_get_calendar_monthly_view_200_response_weeks_inner_days_inner(
                                calendareventtypes = [
                                    None
                                    ], 
                                daytitle = 'null', 
                                events = [
                                    openapi_client.models.core_calendar_get_calendar_monthly_view_200_response_weeks_inner_days_inner_events_inner.core_calendar_get_calendar_monthly_view_200_response_weeks_inner_days_inner_events_inner(
                                        action = openapi_client.models.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_action.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_action(
                                            actionable = True, 
                                            itemcount = 56, 
                                            name = '', 
                                            showitemcount = True, 
                                            url = '', ), 
                                        activityname = '', 
                                        activitystr = '', 
                                        candelete = True, 
                                        canedit = True, 
                                        category = openapi_client.models.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_category.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_category(
                                            coursecount = 56, 
                                            depth = 56, 
                                            description = '', 
                                            id = 56, 
                                            idnumber = '', 
                                            name = '', 
                                            nestedname = '', 
                                            parent = 56, 
                                            timemodified = 56, 
                                            url = '', 
                                            visible = 56, ), 
                                        categoryid = 56, 
                                        component = '', 
                                        course = openapi_client.models.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_course.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_course(
                                            coursecategory = '', 
                                            courseimage = '', 
                                            enddate = 56, 
                                            fullname = '', 
                                            fullnamedisplay = '', 
                                            hasprogress = True, 
                                            hidden = True, 
                                            id = 56, 
                                            idnumber = '', 
                                            isfavourite = True, 
                                            pdfexportfont = '', 
                                            progress = 56, 
                                            shortname = '', 
                                            showactivitydates = True, 
                                            showcompletionconditions = True, 
                                            showshortname = True, 
                                            startdate = 56, 
                                            summary = '', 
                                            summaryformat = 56, 
                                            timeaccess = 56, 
                                            viewurl = '', 
                                            visible = True, ), 
                                        deleteurl = '', 
                                        description = '', 
                                        descriptionformat = 56, 
                                        draggable = True, 
                                        editurl = '', 
                                        eventcount = 56, 
                                        eventtype = '', 
                                        formattedlocation = '', 
                                        formattedtime = '', 
                                        groupid = 56, 
                                        groupname = '', 
                                        icon = openapi_client.models.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_icon.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_icon(
                                            alttext = '', 
                                            component = '', 
                                            iconclass = '', 
                                            iconurl = '', 
                                            key = '', ), 
                                        id = 56, 
                                        instance = 56, 
                                        isactionevent = True, 
                                        iscategoryevent = True, 
                                        iscourseevent = True, 
                                        islastday = True, 
                                        location = '', 
                                        maxdayerror = '', 
                                        maxdaytimestamp = 56, 
                                        mindayerror = '', 
                                        mindaytimestamp = 56, 
                                        modulename = '', 
                                        name = '', 
                                        normalisedeventtype = '', 
                                        normalisedeventtypetext = '', 
                                        overdue = True, 
                                        popupname = '', 
                                        purpose = '', 
                                        repeatid = 56, 
                                        subscription = openapi_client.models.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_subscription.core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_subscription(
                                            displayeventsource = True, 
                                            subscriptionname = '', 
                                            subscriptionurl = '', ), 
                                        timeduration = 56, 
                                        timemodified = 56, 
                                        timesort = 56, 
                                        timestart = 56, 
                                        timeusermidnight = 56, 
                                        url = '', 
                                        userid = 56, 
                                        viewurl = '', 
                                        visible = 56, )
                                    ], 
                                hasevents = True, 
                                haslastdayofevent = True, 
                                hours = 56, 
                                istoday = True, 
                                isweekend = True, 
                                mday = 56, 
                                minutes = 56, 
                                neweventtimestamp = 56, 
                                nextperiod = 56, 
                                popovertitle = '', 
                                previousperiod = 56, 
                                seconds = 56, 
                                timestamp = 56, 
                                viewdaylink = 'null', 
                                viewdaylinktitle = 'null', 
                                wday = 56, 
                                yday = 56, 
                                year = 56, )
                            ], 
                        postpadding = [
                            None
                            ], 
                        prepadding = [
                            None
                            ], )
                    ],
        )
        """

    def testCoreCalendarGetCalendarMonthlyView200Response(self):
        """Test CoreCalendarGetCalendarMonthlyView200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()