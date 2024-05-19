# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_course_check_updates_request import CoreCourseCheckUpdatesRequest

class TestCoreCourseCheckUpdatesRequest(unittest.TestCase):
    """CoreCourseCheckUpdatesRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCourseCheckUpdatesRequest:
        """Test CoreCourseCheckUpdatesRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCourseCheckUpdatesRequest`
        """
        model = CoreCourseCheckUpdatesRequest()
        if include_optional:
            return CoreCourseCheckUpdatesRequest(
                courseid = 56,
                filter = [
                    None
                    ],
                tocheck = [
                    openapi_client.models.core_course_check_updates_request_tocheck_inner.core_course_check_updates_request_tocheck_inner(
                        contextlevel = 'null', 
                        id = 56, 
                        since = 56, )
                    ]
            )
        else:
            return CoreCourseCheckUpdatesRequest(
                courseid = 56,
                tocheck = [
                    openapi_client.models.core_course_check_updates_request_tocheck_inner.core_course_check_updates_request_tocheck_inner(
                        contextlevel = 'null', 
                        id = 56, 
                        since = 56, )
                    ],
        )
        """

    def testCoreCourseCheckUpdatesRequest(self):
        """Test CoreCourseCheckUpdatesRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
