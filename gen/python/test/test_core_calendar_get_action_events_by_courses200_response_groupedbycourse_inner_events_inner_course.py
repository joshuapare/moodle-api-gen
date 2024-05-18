# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_calendar_get_action_events_by_courses200_response_groupedbycourse_inner_events_inner_course import CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse

class TestCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse(unittest.TestCase):
    """CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse:
        """Test CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse`
        """
        model = CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse()
        if include_optional:
            return CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse(
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
                visible = True
            )
        else:
            return CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse(
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
                shortname = '',
                showactivitydates = True,
                showcompletionconditions = True,
                showshortname = True,
                startdate = 56,
                summary = '',
                summaryformat = 56,
                viewurl = '',
                visible = True,
        )
        """

    def testCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse(self):
        """Test CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()