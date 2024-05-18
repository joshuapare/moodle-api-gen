# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_course_get_updates_since200_response_instances_inner import CoreCourseGetUpdatesSince200ResponseInstancesInner

class TestCoreCourseGetUpdatesSince200ResponseInstancesInner(unittest.TestCase):
    """CoreCourseGetUpdatesSince200ResponseInstancesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCourseGetUpdatesSince200ResponseInstancesInner:
        """Test CoreCourseGetUpdatesSince200ResponseInstancesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCourseGetUpdatesSince200ResponseInstancesInner`
        """
        model = CoreCourseGetUpdatesSince200ResponseInstancesInner()
        if include_optional:
            return CoreCourseGetUpdatesSince200ResponseInstancesInner(
                contextlevel = '',
                id = 56,
                updates = [
                    openapi_client.models.core_course_get_updates_since_200_response_instances_inner_updates_inner.core_course_get_updates_since_200_response_instances_inner_updates_inner(
                        itemids = [
                            None
                            ], 
                        name = '', 
                        timeupdated = 56, )
                    ]
            )
        else:
            return CoreCourseGetUpdatesSince200ResponseInstancesInner(
        )
        """

    def testCoreCourseGetUpdatesSince200ResponseInstancesInner(self):
        """Test CoreCourseGetUpdatesSince200ResponseInstancesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
