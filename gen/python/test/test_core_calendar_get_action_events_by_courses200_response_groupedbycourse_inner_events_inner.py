# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_calendar_get_action_events_by_courses200_response_groupedbycourse_inner_events_inner import CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner

class TestCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner(unittest.TestCase):
    """CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner:
        """Test CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner`
        """
        model = CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner()
        if include_optional:
            return CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner(
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
                location = '',
                modulename = '',
                name = '',
                normalisedeventtype = '',
                normalisedeventtypetext = '',
                overdue = True,
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
                visible = 56
            )
        else:
            return CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner(
        )
        """

    def testCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner(self):
        """Test CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
