# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_course_get_user_administration_options200_response_courses_inner import CoreCourseGetUserAdministrationOptions200ResponseCoursesInner

class TestCoreCourseGetUserAdministrationOptions200ResponseCoursesInner(unittest.TestCase):
    """CoreCourseGetUserAdministrationOptions200ResponseCoursesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCourseGetUserAdministrationOptions200ResponseCoursesInner:
        """Test CoreCourseGetUserAdministrationOptions200ResponseCoursesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCourseGetUserAdministrationOptions200ResponseCoursesInner`
        """
        model = CoreCourseGetUserAdministrationOptions200ResponseCoursesInner()
        if include_optional:
            return CoreCourseGetUserAdministrationOptions200ResponseCoursesInner(
                id = 56,
                options = [
                    openapi_client.models.core_course_get_user_administration_options_200_response_courses_inner_options_inner.core_course_get_user_administration_options_200_response_courses_inner_options_inner(
                        available = True, 
                        name = 'null', )
                    ]
            )
        else:
            return CoreCourseGetUserAdministrationOptions200ResponseCoursesInner(
        )
        """

    def testCoreCourseGetUserAdministrationOptions200ResponseCoursesInner(self):
        """Test CoreCourseGetUserAdministrationOptions200ResponseCoursesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()