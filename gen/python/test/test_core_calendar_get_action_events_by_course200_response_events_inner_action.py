# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_calendar_get_action_events_by_course200_response_events_inner_action import CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction

class TestCoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction(unittest.TestCase):
    """CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction:
        """Test CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction`
        """
        model = CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction()
        if include_optional:
            return CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction(
                actionable = True,
                itemcount = 56,
                name = 'null',
                showitemcount = True,
                url = 'null'
            )
        else:
            return CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction(
                actionable = True,
                itemcount = 56,
                name = 'null',
                showitemcount = True,
                url = 'null',
        )
        """

    def testCoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction(self):
        """Test CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()